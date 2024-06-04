package codeGenerator;

import scanner.token.Token;

public class DefMethod implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.defMethod();
    }
}
