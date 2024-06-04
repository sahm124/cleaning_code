package codeGenerator;

import scanner.token.Token;

public class Call implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.call();
    }
}
