package Filters;

import java.awt.image.BufferedImage;

public class FlipFilter {
  //The function flips an image horizontally
  public static BufferedImage FlipHorizontalFilter(BufferedImage img){
    int width = img.getWidth();
    int height = img.getHeight();
    for(int x = 0; x < (width / 2); x++){
      for(int y = 0; y < height; y++){
        SwapPixels(x, y, (width - x - 1), y, img);
      }
    }
    return img;
  }

  //The function flips an image vertically
  public static BufferedImage FlipVerticalFilter(BufferedImage img){
    int width = img.getWidth();
    int height = img.getHeight();
    for(int y = 0; y < (height/2); y++){
      for(int x = 0; x < width; x++){
        SwapPixels(x, y, x, (height - y - 1), img);
      }
    }
    return img;
  }

  //Swaps two pixels in an image given their coordinates
  private static void SwapPixels(int x1, int y1, int x2, int y2, BufferedImage img){
    int RGBtemp = img.getRGB(x1, y1);
    img.setRGB(x1, y1, img.getRGB(x2, y2));
    img.setRGB(x2, y2, RGBtemp);
  }
}
