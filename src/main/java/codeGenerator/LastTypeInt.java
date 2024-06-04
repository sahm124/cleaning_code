package codeGenerator;

import scanner.token.Token;

public class LastTypeInt implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.lastTypeInt();
    }
}
