package codeGenerator;

import scanner.token.Token;

public class Not implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.not();
    }
}
