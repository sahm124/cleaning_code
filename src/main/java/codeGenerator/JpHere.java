package codeGenerator;

import scanner.token.Token;

public class JpHere implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.jpHere();
    }
}
