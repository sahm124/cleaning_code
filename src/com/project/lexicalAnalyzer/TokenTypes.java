package com.project.lexicalAnalyzer;

public enum TokenTypes {
    COMMENT,
    MACRO,
    STRING,
    EMPTY_STRING,

    CONST,
    VOLATILE,
    EXTERN,
    STRUCT,
    UNION,
    CLASS,
    TYPEDEF,
    STATIC,
    AUTO,
    REGISTER,
    ID,
    NUMBER,
    TYPES,
    ENUM,
    SIGN,
    RETURN,
    THIS,

    RESERVED_KEYWORD,
    SIZEOF,
    MALLOC,
    NEW,
    DELETE,

    PARENT,
    CONSTRUCTOR,
    DESTRUCTOR,
    METHOD,
    ATTRIBUTE,

    DOUBLE_COLON,
    SEMI_COLON,
    COLON,
    COMMA,
    DOT,
    ELLIPSIS,
    ARROW,
    TILDA,
    DESTRUCT,
    STAR,
    REFERENCE,
    OPERATOR_OR_ASSIGN,

    OPEN_PARENTHESIS,
    CLOSE_PARENTHESIS,
    OPEN_CURLY_BRACKET,
    CLOSE_CURLY_BRACKET,
    OPEN_SQUARE_BRACKET,
    CLOSE_SQUARE_BRACKET,

    IGNORE,
    SEPARATOR,
    TYPE_DETAIL,
    TYPE_SPECIFIER,
    CLASS_TYPE,
    UNKNOWN
}
