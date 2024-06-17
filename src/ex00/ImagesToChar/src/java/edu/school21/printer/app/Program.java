package src.java.edu.school21.printer.app;

import src.java.edu.school21.printer.logic.Validator;
import src.java.edu.school21.printer.logic.BlackAndWhiteConvector;


public class Program {
    public static void main(String[] args) {
        if (!Validator.Validation(args)) {
            System.exit(1);
        }
        try {
            BlackAndWhiteConvector.converse(args[0].charAt(0), args[1].charAt(0), args[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

