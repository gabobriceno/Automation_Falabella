package FuncionesReutilizablesGenerales;

import Objects.Controlador;
import Objects.DataDriven;
import Objects.ologin;

public class Login {
	
	public static void login() {
		
		try {
			
			
			
			
			Controlador.waits(ologin.getTXT_USERNAME(),null,"Se carg&oacute la p&aacutegina de Logueo de manera correcta.", "No se carg&oacute la pagina de login.");
			
			Controlador.Scripting("escribir", DataDriven.TXT_USERNAME, "TXT_USERNAME", "",ologin.getTXT_USERNAME(),null);
		
			Controlador.Scripting("escribir", DataDriven.TXT_PASSWORD, "TXT_PASSWORD","",ologin.getTXT_PASSWORD(),null);
					
			Controlador.Scripting("seleccionar",DataDriven.CMB_INTANCIA, "CMB_INTANCIA", "",null,ologin.getCMB_INTANCIA());

			Controlador.Scripting("seleccionar",DataDriven.CMB_LANGUAGE, "CMB_LANGUAGE","",null,ologin.getCMB_LANGUAGE());
		
			Controlador.waits(ologin.getBTN_LOG_IN(),null ,"Se ingres&oacute los datos de manera correct .", "Error al ingresar data.");
			Controlador.Scripting("click", "Bot&oacuten de Iniciar Sesi&oacuten","","",ologin.getBTN_LOG_IN(), null);
			
			
		} catch (Exception e) {
			
		System.out.println("\nError en el scripting de pasos de registro (Login): " +e.getMessage());
		e.printStackTrace();
			
		
		}
	}
	

}
