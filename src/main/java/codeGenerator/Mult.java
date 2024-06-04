package codeGenerator;

import scanner.token.Token;

public class Mult implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.mult();
    }
}
