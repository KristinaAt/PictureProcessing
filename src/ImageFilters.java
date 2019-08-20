import java.awt.image.BufferedImage;

public class ImageFilters {

  public static BufferedImage PixelArtFilter(BufferedImage img){
    int width = img.getWidth();
    int height = img.getHeight();
    int longestDim = Math.max(height, width);
    int sqrSize = longestDim / 40;
    for(int i = 0; i < width; i += sqrSize){
      for(int j = 0; j < height; j += sqrSize) {
        SquarePixelator(img, i, j, sqrSize);
      }
    }
    return img;
  }

  private static void SquarePixelator(BufferedImage img, int x, int y, int sqrSize){
    int width = img.getWidth();
    int height = img.getHeight();
    int numberPixels = 0;
    int ARGB[] = new int[4];
    for(int j = y; j < (y + sqrSize); j++){
      for(int i = x; i < (x + sqrSize); i++){
        if(isValidPixel(i, j, width, height)){
          ARGB[0] += Utils.getA(i, j, img);
          ARGB[1] += Utils.getR(i, j, img);
          ARGB[2] += Utils.getG(i, j, img);
          ARGB[3] += Utils.getB(i, j, img);
          numberPixels++;
        } else {
          break;
        }
      }
    }

    for(int i = 0; i < 4; i++){
      ARGB[i] /= numberPixels;
    }

    for(int j = y; j < (y + sqrSize); j++){
      for(int i = x; i < (x + sqrSize); i++){
        if(isValidPixel(i, j, width, height)){
          Utils.setARGB(i, j, ARGB[0], ARGB[1], ARGB[2], ARGB[3], img);
        } else {
          break;
        }
      }
    }
  }

  private static boolean isValidPixel(int x, int y, int width, int height){
    return ((x >= 0) && (x <= width) && (y >= 0) && (y <= height));
  }
}
