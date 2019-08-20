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
    BufferedImage originalImg = null;
    File inputFile = null;

    try {
      inputFile = new File(filePath);
    } catch (Exception e) {
      System.out.println("Error occurred!");
    }

    try {
      originalImg = ImageIO.read(inputFile);
    } catch (Exception e) {
      System.out.println("Could not read image!");
    }

    return originalImg;
  }

  /* A function which takes an image and a filepath to the output file
     and saves the image to the file as a .jpg file. Handles errors
   */
  public static void SaveImage(BufferedImage img, String filePath) {
    File outputFile = null;

    try {
      outputFile = new File(filePath);
    } catch (Exception e) {
      System.out.println("Couldn't find destination file");
    }

    try {
      ImageIO.write(img, "jpg", outputFile);
    } catch (Exception e) {
      System.out.println("Could not write image!");
    }
  }
}