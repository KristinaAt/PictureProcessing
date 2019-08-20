import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class OpenSaveImage {

  /* A function to read in an image and create a object
     of type BufferedImage to be used by the picture
     processor. FilePath is a string argument telling us
     where the file is stored.
   */

  public static BufferedImage openImage(String filePath) {
    BufferedImage img;
    BufferedImage originalImg = null;
    File inputFile = null;

    try{
      inputFile = new File(filePath);
    } catch (Exception e){
      System.out.println("Error occurred!");
    }

    try {
      originalImg = ImageIO.read(inputFile);
    } catch (Exception e){
      System.out.println("Could not read image!");
    }

    int width = originalImg.getWidth();
    int height = originalImg.getHeight();
    img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    return img;
  }

}