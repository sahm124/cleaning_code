package codeGenerator;

import scanner.token.Token;

public class While implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator._while();
    }
}
