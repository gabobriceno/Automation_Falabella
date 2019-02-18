package Objects;

import java.sql.SQLException;



import Main.Driver;
import Main.Variables;


public class DataDriven {
//	public static String URL;
	//Perteneciente a la clase Login 
	public static String TXT_USERNAME;
	public static String TXT_PASSWORD;
	public static String CMB_INTANCIA;
	public static String CMB_LANGUAGE;
	
	//Perteneciente a la clase RegistrarValorCuota  
	public static String C1;
	public static String C2;
	public static String C3;
	public static String C4;
	public static String C5;
	public static String C6;
	public static String C7;
	public static String C8;
	public static String C9;
	public static String C10;
	
	
	
	
	//Perteneciente a a la clase GenerarPrestamoAprobado
	public static String TXT_NUMEROPOLIZA_IN;
	public static String TXT_MONTOPRESTAMO_IN;
	public static String CMB_FORMADEPAGO;
	public static String CMB_NUMEROCUOTAS;
	public static String CMB_FRECUENCIAPAGOS;
	
	
	//Perteneciente a a la clase GenerarRetiroAprobado
	public static String TXT_MONTORETIRO_IN;
	
	//Perteneciente a la clase GenerarRescateAprobado
	
	
		
	//Pertenecientes a la clase Generar Siniestro
		
	public static String TXT_FECHAOCURRENCIA_IN;
	public static String CMB_TIPODEPAGO;
	public static String CMB_OFICINA; 
	public static String CMB_COBERTURAAFECTADA;
	public static String CMB_ACCIONES;
	public static String TXT_FECHAOPERACION_IN;
	public static String CMB_MOTIVOCIERRE;
	
	
	
//	public static String VC2;
//	public static String VC3;
//	public static String VC4;
//	public static String VC5;
//	public static String VC6;
//	public static String VC7;
//	public static String VC8;
//	public static String VC9;
//	public static String VC10;
	
	
	
	public static void ConsultaData(String Escenario,int row) throws SQLException
	{
		switch (Escenario.toLowerCase()) {
		

		case "registrarvalorcuota":
//			URL=Driver.getData(row, Driver.Columna("URL"));
			
			//Se obtiene de data que utilizara la clase RegistrarValorCuota
			
			TXT_USERNAME=Driver.getData(row, Driver.Columna("TXT_USERNAME"),Variables.ejecucion);
			TXT_PASSWORD=Driver.getData(row, Driver.Columna("TXT_PASSWORD"),Variables.ejecucion);
			CMB_INTANCIA=Driver.getData(row, Driver.Columna("CMB_INTANCIA"),Variables.ejecucion);
			CMB_LANGUAGE=Driver.getData(row, Driver.Columna("CMB_LANGUAGE"),Variables.ejecucion);
			C1=Driver.getData(row, Driver.Columna("C1"),Variables.ejecucion);
			C2=Driver.getData(row, Driver.Columna("C2"),Variables.ejecucion);
			C3=Driver.getData(row, Driver.Columna("C3"),Variables.ejecucion);
			C4=Driver.getData(row, Driver.Columna("C4"),Variables.ejecucion);
			C5=Driver.getData(row, Driver.Columna("C5"),Variables.ejecucion);
			C6=Driver.getData(row, Driver.Columna("C6"),Variables.ejecucion);
			C7=Driver.getData(row, Driver.Columna("C7"),Variables.ejecucion);
			C8=Driver.getData(row, Driver.Columna("C8"),Variables.ejecucion);
			C9=Driver.getData(row, Driver.Columna("C9"),Variables.ejecucion);
			C10=Driver.getData(row, Driver.Columna("C10"),Variables.ejecucion);
		break;
			
			
			
		
//			
		case "generarprestamoaprobado":	
			TXT_USERNAME=Driver.getData(row, Driver.Columna("TXT_USERNAME"),Variables.ejecucion);
			TXT_PASSWORD=Driver.getData(row, Driver.Columna("TXT_PASSWORD"),Variables.ejecucion);
			CMB_INTANCIA=Driver.getData(row, Driver.Columna("CMB_INTANCIA"),Variables.ejecucion);
			CMB_LANGUAGE=Driver.getData(row, Driver.Columna("CMB_LANGUAGE"),Variables.ejecucion);
			
			TXT_NUMEROPOLIZA_IN=Driver.getData(row, Driver.Columna("TXT_NUMEROPOLIZA_IN"),Variables.ejecucion);
			TXT_MONTOPRESTAMO_IN=Driver.getData(row, Driver.Columna("TXT_MONTOPRESTAMO_IN"),Variables.ejecucion);
			CMB_FORMADEPAGO=Driver.getData(row, Driver.Columna("CMB_FORMADEPAGO"),Variables.ejecucion);
			CMB_NUMEROCUOTAS=Driver.getData(row, Driver.Columna("CMB_NUMEROCUOTAS"),Variables.ejecucion);
			CMB_FRECUENCIAPAGOS=Driver.getData(row, Driver.Columna("CMB_FRECUENCIAPAGOS"),Variables.ejecucion);
		break;
			
			
			
			
			
		case "generarrescateaprobado":	
			TXT_USERNAME=Driver.getData(row, Driver.Columna("TXT_USERNAME"),Variables.ejecucion);
			TXT_PASSWORD=Driver.getData(row, Driver.Columna("TXT_PASSWORD"),Variables.ejecucion);
			CMB_INTANCIA=Driver.getData(row, Driver.Columna("CMB_INTANCIA"),Variables.ejecucion);
			CMB_LANGUAGE=Driver.getData(row, Driver.Columna("CMB_LANGUAGE"),Variables.ejecucion);
			TXT_NUMEROPOLIZA_IN=Driver.getData(row, Driver.Columna("TXT_NUMEROPOLIZA_IN"),Variables.ejecucion);
			CMB_FORMADEPAGO=Driver.getData(row, Driver.Columna("CMB_FORMADEPAGO"),Variables.ejecucion);
		break; 
			
			
			
		
		case "generarretiroaprobado":
			
			TXT_USERNAME=Driver.getData(row, Driver.Columna("TXT_USERNAME"),Variables.ejecucion);
			TXT_PASSWORD=Driver.getData(row, Driver.Columna("TXT_PASSWORD"),Variables.ejecucion);
			CMB_INTANCIA=Driver.getData(row, Driver.Columna("CMB_INTANCIA"),Variables.ejecucion);
			CMB_LANGUAGE=Driver.getData(row, Driver.Columna("CMB_LANGUAGE"),Variables.ejecucion);
			TXT_NUMEROPOLIZA_IN=Driver.getData(row, Driver.Columna("TXT_NUMEROPOLIZA_IN"),Variables.ejecucion);
			TXT_MONTORETIRO_IN=Driver.getData(row, Driver.Columna("TXT_MONTORETIRO_IN"),Variables.ejecucion);
			CMB_FORMADEPAGO=Driver.getData(row, Driver.Columna("CMB_FORMADEPAGO"),Variables.ejecucion);
		break; 
			
			
		
			
		case "generarsiniestro":
			
			TXT_USERNAME=Driver.getData(row, Driver.Columna("TXT_USERNAME"),Variables.ejecucion);
			TXT_PASSWORD=Driver.getData(row, Driver.Columna("TXT_PASSWORD"),Variables.ejecucion);
			CMB_INTANCIA=Driver.getData(row, Driver.Columna("CMB_INTANCIA"),Variables.ejecucion);
			CMB_LANGUAGE=Driver.getData(row, Driver.Columna("CMB_LANGUAGE"),Variables.ejecucion);
			
			TXT_NUMEROPOLIZA_IN=Driver.getData(row, Driver.Columna("TXT_NUMEROPOLIZA_IN"),Variables.ejecucion);
			TXT_FECHAOCURRENCIA_IN=Driver.getData(row, Driver.Columna("TXT_FECHAOCURRENCIA_IN"),Variables.ejecucion);
			CMB_TIPODEPAGO=Driver.getData(row, Driver.Columna("CMB_TIPODEPAGO"),Variables.ejecucion);
			CMB_OFICINA=Driver.getData(row, Driver.Columna("CMB_OFICINA"),Variables.ejecucion);
			CMB_COBERTURAAFECTADA=Driver.getData(row, Driver.Columna("CMB_COBERTURAAFECTADA"),Variables.ejecucion);
			CMB_ACCIONES=Driver.getData(row, Driver.Columna("CMB_ACCIONES"),Variables.ejecucion);
			TXT_FECHAOPERACION_IN=Driver.getData(row, Driver.Columna("TXT_FECHAOPERACION_IN"), Variables.ejecucion);
			CMB_MOTIVOCIERRE=Driver.getData(row, Driver.Columna("CMB_MOTIVOCIERRE"),Variables.ejecucion);
			
			break; 
					
			
			
			
			
	
			
			
//			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--start-maximized");		
//			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//			capabilities.setCapability(ChromeOptions.CAPABILITY, options);							  
//			Thread.sleep(500);  // Let the user actually see something!
//			Variables.driver = ne
//			
//			
			
			
	
		
	}
	
	
	}

}
	

