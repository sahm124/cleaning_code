package codeGenerator;

import scanner.token.Token;

public class DefField implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.defField();
    }
}
