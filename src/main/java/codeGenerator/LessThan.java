package codeGenerator;

import scanner.token.Token;

public class
LessThan implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.less_than();
    }
}
