package codeGenerator;

import scanner.token.Token;

public class Arg implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.arg();
    }
}
