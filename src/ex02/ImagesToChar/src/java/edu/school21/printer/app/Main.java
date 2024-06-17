package edu.school21.printer.app;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import edu.school21.printer.logic.ImagesColorChanges;

import java.io.IOException;

@Parameters(separators = "=")
public class Main {
    @Parameter(names = "--white")
    private String whiteColor;
    @Parameter(names = "--black")
    private String blackColor;

    public static void main(String... argv) {
        Main main = new Main();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(argv);
        try {
            ImagesColorChanges.changeColorInImages(main.whiteColor, main.blackColor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
