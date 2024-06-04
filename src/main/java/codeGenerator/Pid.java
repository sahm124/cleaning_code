package codeGenerator;

import scanner.token.Token;

public class Pid implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.pid(next);
    }
}
