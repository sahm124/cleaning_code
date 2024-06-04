package codeGenerator;

import scanner.token.Token;

public class DefParam implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.defParam();
    }
}
