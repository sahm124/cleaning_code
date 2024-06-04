package codeGenerator;

import scanner.token.Token;

public interface SemanticAction {
    void execute(Token next, CodeGenerator codeGenerator);
}
