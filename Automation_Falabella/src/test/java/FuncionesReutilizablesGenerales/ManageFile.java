package FuncionesReutilizablesGenerales;

import java.io.IOException;






public class ManageFile implements Runnable{
	public static String Filename;
	
	public ManageFile (String Filename){
		ManageFile.Filename = Filename;
	}
	
	
	public static void Openfile(String Filename) throws InterruptedException {
	final Runtime rt = Runtime.getRuntime();
	
	try {				
			 
		Process p = rt.exec("cmd /C D:\\Automation_Falabella\\Datos\\openfile.bat \""+Filename+"\""); 
		System.out.println("Despues de abierto");
	
	} catch (final IOException e) {
		System.out.println(e.toString());
		throw new RuntimeException("Failed to run bat file.");
		}
	}






public static void Closefile() throws InterruptedException {

	final Runtime rt = Runtime.getRuntime();
	
	try {				
		Process p = rt.exec("cmd /C D:\\Automation_Falabella\\Datos\\closefile.bat"); 
	} catch (final IOException e) {
	
		System.out.println(e.toString());
		
		throw new RuntimeException("Failed to run bat file.");
			}
		}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Se inició la apertura del archivo "+ Filename);
			Openfile(Filename);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



