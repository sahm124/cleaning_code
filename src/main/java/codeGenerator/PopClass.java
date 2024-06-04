package codeGenerator;

import scanner.token.Token;

public class PopClass implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.popClass();
    }
}
