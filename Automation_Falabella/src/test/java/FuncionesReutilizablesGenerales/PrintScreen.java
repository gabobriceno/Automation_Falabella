
package FuncionesReutilizablesGenerales;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;


 
public class PrintScreen {
 
	public static String capturarPantalla() throws
           AWTException, IOException, InterruptedException {
    
		BufferedImage captura = new Robot().createScreenCapture(
           new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );
 
     // Guardar Como JPEG
		String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis() + ".jpg";
		File file = new File(path);
     ImageIO.write(captura, "jpg", file);
     System.out.println("Ruta: "+file.getAbsolutePath());
     return path;
  }
}



