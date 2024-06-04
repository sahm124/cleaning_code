package codeGenerator;

import scanner.token.Token;

public class Label implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.label();
    }
}
