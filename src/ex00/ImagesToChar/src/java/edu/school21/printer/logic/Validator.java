package src.java.edu.school21.printer.logic;

public class Validator {

    public static Boolean Validation(String argc[]) {
        if (argc.length != 3 || argc[0].length() != 1 || argc[1].length() != 1) {
            System.out.println("Invalid arguments");
            System.out.println("Use: java ex00.ImagesToChar.src.java.edu.school21.printer.app.App <White symbol> <Black symbol> <path to bmp.file>");
            System.out.println("For symbols only 1 char");
            return false;
        }
        return true;
    }

}
