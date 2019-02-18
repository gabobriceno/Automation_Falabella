package FuncionesReutilizablesGenerales;

import Main.Variables;
import Objects.Controlador;
import Objects.DataDriven;

public class Navegador {
	
	public static void url(){
		
		try {
			
			Controlador.Scripting("navegador", Variables.Str_url,"", "",null,null);
			DataDriven.ConsultaData(Variables.P_Str_Escenario,Variables.i);
			
		} catch (Exception e) {
			
			System.out.println("\nError en el scripting de pasos de registro (Login): " +e.getMessage());
			e.printStackTrace();
			
		}
		
	}
	
	
	
	 

}


