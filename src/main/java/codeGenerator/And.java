package codeGenerator;

import scanner.token.Token;

public class And implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.and();
    }
}
