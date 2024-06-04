package codeGenerator;

import scanner.token.Token;

public class CheckID implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.checkID();
    }
}