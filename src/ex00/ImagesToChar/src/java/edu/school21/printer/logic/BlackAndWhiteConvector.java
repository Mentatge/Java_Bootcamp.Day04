package src.java.edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BlackAndWhiteConvector {

    public static void converse(Character white, Character black, String filepath) throws IOException {
        BufferedImage image = ImageIO.read(new File(filepath));
        for(int y = 0; y < image.getHeight(); y++) {
            for(int x = 0; x < image.getWidth(); x++) {
                char toPrint = image.getRGB(x, y) == Color.BLACK.getRGB() ? black : white;
                System.out.print(toPrint);
            }
            System.out.println();
        }

            System.out.println();
        }
}
