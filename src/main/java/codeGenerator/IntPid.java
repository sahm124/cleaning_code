package codeGenerator;

import scanner.token.Token;

public class IntPid implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.intpid(next);
    }
}
