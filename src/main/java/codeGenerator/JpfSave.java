package codeGenerator;

import scanner.token.Token;

public class JpfSave implements SemanticAction {
    @Override
    public void execute(Token next, CodeGenerator codeGenerator) {
        codeGenerator.jpf_save();
    }
}
