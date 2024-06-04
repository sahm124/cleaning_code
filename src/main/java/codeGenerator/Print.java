package codeGenerator;

import scanner.token.Token;

public class Print implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.print();
    }
}
