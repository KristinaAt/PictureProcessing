package Filters;

import java.awt.image.BufferedImage;

public class BlendFilter {
  public static BufferedImage BlendFilter(BufferedImage imgOne, BufferedImage imgTwo) {
    int minWidth = Math.min(imgOne.getWidth(), imgTwo.getWidth());
    int minHeight = Math.min(imgOne.getHeight(), imgTwo.getHeight());
    BufferedImage blendedImg = new BufferedImage(minWidth, minHeight, BufferedImage.TYPE_INT_RGB);
    for (int i = 0; i < minWidth; i++) {
      for (int j = 0; j < minHeight; j++) {
        int avgR = (Utils.getR(i, j, imgOne) + Utils.getR(i, j, imgTwo)) / 2;
        int avgG = (Utils.getG(i, j, imgOne) + Utils.getG(i, j, imgTwo)) / 2;
        int avgB = (Utils.getB(i, j, imgOne) + Utils.getB(i, j, imgTwo)) / 2;
        Utils.setRGB(i, j, avgR, avgG, avgB, blendedImg);
      }
    }
    return blendedImg;
  }
}
