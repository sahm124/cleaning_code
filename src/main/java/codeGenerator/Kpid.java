package codeGenerator;

import scanner.token.Token;

public class Kpid implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.kpid(next);
    }
}
