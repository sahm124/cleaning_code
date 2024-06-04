package codeGenerator;

import scanner.token.Token;

public class DefMain implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.defMain();
    }
}
