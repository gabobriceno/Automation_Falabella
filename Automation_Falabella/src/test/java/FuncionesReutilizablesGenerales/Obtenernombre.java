package FuncionesReutilizablesGenerales;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Obtenernombre {
	
	public static String obtenerNombre() {
		
		File uploadDirectory = new File("C:\\Users\\gabriel.briceno\\Downloads");
		
		    File[] downloadedFiles = uploadDirectory.listFiles();

		    Arrays.sort(downloadedFiles, new Comparator<File>() {
		        @Override
		        public int compare(File fileOne, File fileTwo) {
		            return Long.valueOf(fileOne.lastModified()).compareTo(fileTwo.lastModified());
		        }
		    });
		    
		    int tam_array = downloadedFiles.length;
		    return downloadedFiles[tam_array-1].getName();
	}
	

}

//
//file.getName()
//
//
//
//
//public boolean isFileDownloaded(String downloadPath, String fileName) {
//	  File dir = new File(downloadPath);
//	  File[] dirContents = dir.listFiles();
//
//	  for (int i = 0; i < dirContents.length; i++) {
//	      if (dirContents[i].getName().equals(fileName)) {
//	          // File has been found, it can now be deleted:
//	          dirContents[i].delete();
//	          return true;
//	      }
//	          }
//	      return false;
//	  }
//
//

