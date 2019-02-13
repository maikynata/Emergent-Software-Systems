package img;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgResize {

	public static void main(String[] args) {
		for(String arq : args){
		    File jpgOriginal = new File(arq);
			File jpgResized = new File("resized.png");
			resizeImage(jpgOriginal, jpgResized, 200, 200, "png");
		}
	}
	
	private static void resizeImage(File originalImage, File resizedImage, int width, int height, String format) {
		try{
			BufferedImage original = ImageIO.read(originalImage);
			BufferedImage resized = new BufferedImage(width, height, original.getType());
			Graphics2D g2 = resized.createGraphics();
			g2.drawImage(original,  0, 0, width, height, null);
			g2.dispose();
			ImageIO.write(resized, format, resizedImage);
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
