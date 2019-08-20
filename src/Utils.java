import java.awt.image.BufferedImage;

public class Utils {

  public static void setRGB(int x, int y, long R, long G, long B, BufferedImage img){
    long RGB = (R << 16) | (G << 8) | B;
    img.setRGB(x, y, (int) RGB);
  }

  public static void setR(int x, int y, int R, BufferedImage img){
    int RGB = img.getRGB(x, y) & 0x00ffff;
    RGB |= (R << 16);
    img.setRGB(x, y, RGB);
  }

  public static void setG(int x, int y, int G, BufferedImage img){
    int RGB = img.getRGB(x, y) & 0xff00ff;
    RGB |= (G << 8);
    img.setRGB(x, y, RGB);
  }

  public static void setB(int x, int y, int B, BufferedImage img){
    int RGB = img.getRGB(x, y) & 0xffff00;
    RGB |= B;
    img.setRGB(x, y, RGB);
  }

  public static int getR(int x, int y, BufferedImage img){
    int ARGB = img.getRGB(x, y);
    return ((ARGB >> 16) & 0xff);
  }

  public static int getG(int x, int y, BufferedImage img){
    int ARGB = img.getRGB(x, y);
    return ((ARGB >> 8) & 0xff);
  }

  public static int getB(int x, int y, BufferedImage img){
    int ARGB = img.getRGB(x, y);
    return (ARGB & 0xff);
  }
}
