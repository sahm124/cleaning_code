package codeGenerator;

import scanner.token.Token;

public class Add implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.add();
    }
}
