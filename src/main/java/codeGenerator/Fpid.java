package codeGenerator;

import scanner.token.Token;

public class Fpid implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.fpid();
    }
}
