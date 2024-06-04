package codeGenerator;

import scanner.token.Token;

public class Assign implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.assign();
    }
}
