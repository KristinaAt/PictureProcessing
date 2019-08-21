package Filters;

import java.awt.image.BufferedImage;

public class TransparentFilter {

  public static BufferedImage TransparentFilter(BufferedImage img) {

    BufferedImage transparentImage = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
    transparentImage = img;
    return img;
  }

}
