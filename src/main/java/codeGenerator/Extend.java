package codeGenerator;

import scanner.token.Token;

public class Extend implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.extend();
    }
}
