package codeGenerator;

import scanner.token.Token;

public class DefClass implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.defClass();
    }
}
