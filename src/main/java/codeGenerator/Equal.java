package codeGenerator;

import scanner.token.Token;

public class Equal implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.equal();
    }
}
