package codeGenerator;

import scanner.token.Token;

public class DefVar implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.defVar();
    }
}
