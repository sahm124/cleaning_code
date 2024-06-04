package compiler;

import parser.Parser;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CompilerFacade {
    private Parser parser;

    public CompilerFacade() {
        this.parser = new Parser();
    }

    public void compile(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            parser.startParse(scanner);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
