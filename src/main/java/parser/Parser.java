package parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Stack;

import Log.Log;
import codeGenerator.CodeGenerationFacade;
import codeGenerator.CodeGenerator;
import errorHandler.ErrorHandler;
import scanner.lexicalAnalyzer;
import scanner.token.Token;

public class Parser {
    private ArrayList<Rule> rules;
    private Stack<Integer> parsStack;
    private ParseTable parseTable;
    private lexicalAnalyzer lexicalAnalyzer;
    private CodeGenerationFacade codeGenerationFacade;

    public Parser() {
        parsStack = new Stack<>();
        parsStack.push(0);
        try {
            parseTable = new ParseTable(Files.readAllLines(Paths.get("src/main/resources/parseTable")).get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        rules = new ArrayList<>();
        try {
            for (String stringRule : Files.readAllLines(Paths.get("src/main/resources/Rules"))) {
                rules.add(new Rule(stringRule));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        codeGenerationFacade = new CodeGenerationFacade();
    }

    public void startParse(java.util.Scanner sc) {
        initializeLexicalAnalyzer(sc);
        Token lookAhead = lexicalAnalyzer.getNextToken();
        boolean finish = false;

        while (!finish) {
            try {
                Log.print(lookAhead.toString() + "\t" + parsStack.peek());
                Action currentAction = parseTable.getActionTable(parsStack.peek(), lookAhead);
                Log.print(currentAction.toString());

                switch (currentAction.action) {
                    case shift:
                        handleShiftAction(currentAction);
                        lookAhead = lexicalAnalyzer.getNextToken();
                        break;
                    case reduce:
                        handleReduceAction(currentAction, lookAhead);
                        break;
                    case accept:
                        finish = true;
                        break;
                }
                Log.print("");
            } catch (Exception ignored) {
                ignored.printStackTrace();
            }
        }
        if (!ErrorHandler.hasError) codeGenerationFacade.printMemory();
    }

    private void initializeLexicalAnalyzer(java.util.Scanner sc) {
        lexicalAnalyzer = new lexicalAnalyzer(sc);
    }

    private void handleShiftAction(Action currentAction) {
        parsStack.push(currentAction.number);
    }

    private void handleReduceAction(Action currentAction, Token lookAhead) {
        Rule rule = rules.get(currentAction.number);
        for (int i = 0; i < rule.RHS.size(); i++) {
            parsStack.pop();
        }
        Log.print(parsStack.peek() + "\t" + rule.LHS);
        parsStack.push(parseTable.getGotoTable(parsStack.peek(), rule.LHS));
        Log.print(parsStack.peek() + "");
        try {
            codeGenerationFacade.executeSemanticFunction(rule.semanticAction, lookAhead);
        } catch (Exception e) {
            Log.print("Code Generator Error");
        }
    }
}
