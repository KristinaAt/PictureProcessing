import java.awt.image.BufferedImage;

public class ImageFilters {

  public static BufferedImage PixelArtFilter(BufferedImage img){
    int width = img.getWidth();
    int height = img.getHeight();
    int longestDim = Math.max(height, width);
    int sqrSize = longestDim / 150;
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
    int RGB[] = new int[3];
    for(int j = y; j < (y + sqrSize); j++){
      for(int i = x; i < (x + sqrSize); i++){
        if(isValidPixel(i, j, width, height)){
          RGB[0] += Utils.getR(i, j, img);
          RGB[1] += Utils.getG(i, j, img);
          RGB[2] += Utils.getB(i, j, img);
          numberPixels++;
        } else {
          break;
        }
      }
    }

    for(int i = 0; i < 3; i++){
      RGB[i] = (int) Math.floor(RGB[i]/numberPixels);
    }

    for(int j = y; j < (y + sqrSize); j++){
      for(int i = x; i < (x + sqrSize); i++){
        if(isValidPixel(i, j, width, height)){
          Utils.setRGB(i, j, RGB[0], RGB[1], RGB[2], img);
        } else {
          break;
        }
      }
    }
  }

  private static boolean isValidPixel(int x, int y, int width, int height){
    return ((x >= 0) && (x < width) && (y >= 0) && (y < height));
  }
}
