package codeGenerator;

import scanner.token.Token;

public class Sub implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.sub();
    }
}
