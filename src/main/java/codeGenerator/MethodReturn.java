package codeGenerator;

import scanner.token.Token;

public class MethodReturn implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.methodReturn();
    }
}
