import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.*;


public class ImageCreator {
    public static void main(String[] args) throws IOException { // Durch Input Output braucht man immer einen Exception thrower
          int width = 300;
          int length = 300;

          BufferedImage buffImg = new BufferedImage(width, length, BufferedImage.TYPE_INT_RGB);

          Graphics2D g2d = buffImg.createGraphics();

          g2d.setColor(Color.WHITE);
          g2d.fillRect(0,0, width, length);

          g2d.setColor(Color.BLACK);
          g2d.fillOval(0, 0, width, length);

          g2d.setColor(Color.ORANGE);
          g2d.drawString("Hello There", 55, 125);

          g2d.dispose();

          //Save File
          File file = new File("Image.png");
          ImageIO.write(buffImg,"png",file);

          file = new File("Image.jpg");
          ImageIO.write(buffImg, "jpg", file);

}
}
