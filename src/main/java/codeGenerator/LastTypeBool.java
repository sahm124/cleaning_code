package codeGenerator;

import scanner.token.Token;

public class LastTypeBool implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.lastTypeBool();
    }
}
