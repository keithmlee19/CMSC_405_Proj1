/*
 * Keith Lee
 * CMSC 405
 * Fall 2024
 */

import java.awt.Color;
import java.awt.image.BufferedImage;

public abstract class Shape2D {
  // Define an abstract class that can be extended by
  // all shapes

  // Constants
  // images are 25x25
  // X Size of Images
  protected static final int IMGSIZEX = 25;
  // Y Size of Images
  protected static final int IMGSIZEY = 25;

  // Member variables
  protected Color foregroundColor;
  protected Color backgroundColor;
  public int[][] shapeArray;

  // Method to apply pixel colors
  public BufferedImage getImage() {
    BufferedImage image = new BufferedImage(IMGSIZEX, IMGSIZEY, BufferedImage.TYPE_INT_RGB);
    for (int x = 0; x < IMGSIZEX; x++) {
      for (int y = 0; y < IMGSIZEY; y++) {
        int pixelColor = shapeArray[x][y];
        // Set Colors based on Binary Image value
        if (pixelColor == 0) {
          pixelColor = backgroundColor.getRGB();
        } else {
          pixelColor = foregroundColor.getRGB();
        }
        image.setRGB(x, y, pixelColor);
      } // End for y.
    } // End for x.
    return image;
  } // End getData method.
}
