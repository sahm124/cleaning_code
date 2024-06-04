package codeGenerator;

import scanner.token.Token;
import semantic.symbol.Symbol;
import semantic.symbol.SymbolTable;

public class CodeGenerationFacade {
    private CodeGenerator codeGenerator;
    private SymbolTable symbolTable;
    private Memory memory;

    public CodeGenerationFacade() {
        this.memory = new Memory();
        this.symbolTable = new SymbolTable(memory);
        this.codeGenerator = new CodeGenerator(memory, symbolTable);
    }

    public void executeSemanticFunction(int func, Token next) {
        codeGenerator.semanticFunction(func, next);
    }

    public void printMemory() {
        codeGenerator.printMemory();
    }

    // Additional methods to interact with symbolTable or memory if needed
}
