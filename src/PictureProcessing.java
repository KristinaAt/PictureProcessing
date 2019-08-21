import Filters.ColourScaleFilter;
import Filters.GreyscaleFilter;
import Filters.InvertFilter;
import Filters.PixelArtFilter;

import java.awt.image.BufferedImage;

public class PictureProcessing {
  public static void main(String[] args) {

    BufferedImage img = OpenSaveImage.openImage(args[0]);
    img = ColourScaleFilter.BlueScaleFilter(img);
    OpenSaveImage.SaveImage(img, args[1]);
  }
}