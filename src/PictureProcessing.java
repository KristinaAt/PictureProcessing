import Filters.*;

import java.awt.image.BufferedImage;

public class PictureProcessing {
  public static void main(String[] args) {

    BufferedImage img1 = OpenSaveImage.openImage(args[0]);
    BufferedImage img2 = OpenSaveImage.openImage(args[1]);
    BufferedImage img = BlendFilter.BlendFilter(img1, img2);
    OpenSaveImage.SaveImage(img, args[2]);
  }
}