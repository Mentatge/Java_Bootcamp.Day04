package edu.school21.printer.logic;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagesColorChanges {
    private static final String IMAGE = "src/resources/it.bmp";

    public static void changeColorInImages(String newWhite, String newBlack) throws IOException {
        BufferedImage image = ImageIO.read(new File(IMAGE));
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                String colorCode = (image.getRGB(x, y) == Color.BLACK.getRGB()) ? newBlack : newWhite;
                ColoredPrinter coloredPrinter = new ColoredPrinter.Builder(1, false)
                        .background(Ansi.BColor.valueOf(colorCode))
                        .build();
                coloredPrinter.print(" ");
            }
            System.out.println();
        }
    }
}
