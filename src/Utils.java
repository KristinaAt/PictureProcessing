import java.awt.image.BufferedImage;

public class Utils {

  public static void setARGB(int x, int y, int A, int R, int G, int B, BufferedImage img){
    int ARGB = (A << 24) | (R << 16) | (G << 8) | B;
    img.setRGB(x, y, ARGB);
  }

  public static void setA(int x, int y, int A, BufferedImage img){
    int ARGB = (A << 24) | img.getRGB(x, y);
    img.setRGB(x, y, ARGB);
  }

  public static void setR(int x, int y, int B, BufferedImage img){
    int ARGB = (B << 16) | img.getRGB(x, y);
    img.setRGB(x, y, ARGB);
  }

  public static void setG(int x, int y, int C, BufferedImage img){
    int ARGB = (C << 8) | img.getRGB(x, y);
    img.setRGB(x, y, ARGB);
  }

  public static void setB(int x, int y, int B, BufferedImage img){
    int ARGB = (B << 16) | img.getRGB(x, y);
    img.setRGB(x, y, ARGB);
  }

  public static int getA(int x, int y, BufferedImage img){
    int ARGB = img.getRGB(x, y);
    return (ARGB >> 24);
  }

  public static int getR(int x, int y, BufferedImage img){
    int ARGB = img.getRGB(x, y);
    return ((ARGB >> 16) | 0xff);
  }

  public static int getG(int x, int y, BufferedImage img){
    int ARGB = img.getRGB(x, y);
    return ((ARGB >> 8) | 0xff);
  }

  public static int getB(int x, int y, BufferedImage img){
    int ARGB = img.getRGB(x, y);
    return (ARGB | 0xff);
  }
}
