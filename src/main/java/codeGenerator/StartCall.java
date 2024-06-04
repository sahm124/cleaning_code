package codeGenerator;

import scanner.token.Token;

public class StartCall implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.startCall();
    }
}
