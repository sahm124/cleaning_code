package codeGenerator;

import scanner.token.Token;

public class Save implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.save();
    }
}
