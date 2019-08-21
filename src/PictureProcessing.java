import Filters.*;

import java.awt.image.BufferedImage;

public class PictureProcessing {
  public static void main(String[] args) {

    BufferedImage img = OpenSaveImage.openImage(args[0]);
    img = FlipFilter.FlipHorizontalFilter(img);
    OpenSaveImage.SaveImage(img, args[1]);
  }
}