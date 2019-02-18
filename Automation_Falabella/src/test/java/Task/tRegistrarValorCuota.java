package Task;

import FuncionesReutilizablesGenerales.Login;
import FuncionesReutilizablesGenerales.Navegador;
import Objects.Controlador;
import Objects.DataDriven;
import Objects.oRegistrarValorCuota;


public class tRegistrarValorCuota {
	
	public static void registroCuota() {

		
		try {
			
			Navegador.url();
			Login.login();
			
			
			if(Controlador.waitsDinamico(oRegistrarValorCuota.getBTN_ACEPTAR_IN())==true) {
				Controlador.Scripting("click", "boton aceptar","","",oRegistrarValorCuota.getBTN_ACEPTAR_IN(),null);
			}
			
			
			Controlador.waits(oRegistrarValorCuota.getBTN_CONFIGURACION_IN(),null,"Login exitoso","Login fallido");
			
			Controlador.Scripting("click", "boton configuracion","","",oRegistrarValorCuota.getBTN_CONFIGURACION_IN(),null);		
			
			Controlador.mouseHover(oRegistrarValorCuota.getBTN_FONDODEINVERSION_IN());
			
			Controlador.Scripting("click", "boton Valor Cuota","","",oRegistrarValorCuota.getBTN_CONFIGURARVALORCUOTA_IN(),null);
			
			Controlador.cambioPestania();
		
			Controlador.waits(oRegistrarValorCuota.getBTN_PRELIMINAR(),null,"Se cargo la pagina Valor Cuota de manera exitosa.","No se cargo la pagina Valor Cuota.");
			
			Controlador.Scripting("click", "boton preliminar","","",oRegistrarValorCuota.getBTN_PRELIMINAR(),null);

			Controlador.waits(oRegistrarValorCuota.getC1(),null,"Se cargo la pagina de Nuevo Valor Cuota.","No se cargo la pagina Nuevo Valor Cuota.");
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC1());
			
			Controlador.Scripting("escribir", DataDriven.C1, "TXT_ValorCuota1","",oRegistrarValorCuota.getC1(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC2());
			
			Controlador.Scripting("escribir", DataDriven.C2, "TXT_ValorCuota2","",oRegistrarValorCuota.getC2(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC3());
			
			Controlador.Scripting("escribir", DataDriven.C3, "TXT_ValorCuota3","",oRegistrarValorCuota.getC3(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC4());
			
			Controlador.Scripting("escribir", DataDriven.C4, "TXT_ValorCuota4","",oRegistrarValorCuota.getC4(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC5());
			
			Controlador.Scripting("escribir", DataDriven.C5, "TXT_ValorCuota5","",oRegistrarValorCuota.getC5(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC6());
			
			Controlador.Scripting("escribir", DataDriven.C6, "TXT_ValorCuota6","",oRegistrarValorCuota.getC6(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC7());
			
			Controlador.Scripting("escribir", DataDriven.C7, "TXT_ValorCuota7","",oRegistrarValorCuota.getC7(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC8());
			
			Controlador.Scripting("escribir", DataDriven.C8, "TXT_ValorCuota8","",oRegistrarValorCuota.getC8(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC9());
			
			Controlador.Scripting("escribir", DataDriven.C9, "TXT_ValorCuota9","",oRegistrarValorCuota.getC9(),null);
			
			Controlador.borrarDefaultTXTBOX(oRegistrarValorCuota.getC10());
			
			Controlador.Scripting("escribir", DataDriven.C10, "TXT_ValorCuota10","",oRegistrarValorCuota.getC10(),null);
			
			Controlador.Scripting("click", "Boton Guardar","","",oRegistrarValorCuota.getBTN_GUARDAR_IN(),null);
			
			Controlador.waits(oRegistrarValorCuota.getMEN_ESTATUS_IN(),null,"Se pudo Registar mas valores cuota","No se registro ningun valor couta");
		
			
		if (Controlador.obtencionDatos(oRegistrarValorCuota.getMEN_ESTATUS_IN(), "td").equals("Cuota Creada Satisfactoriamente")) {
			Controlador.waits(oRegistrarValorCuota.getMEN_ESTATUS_IN(),null,"Proceso Finalizado Correctamente","No se finalizo el proceso");
		}

			
	    	
		} catch (Exception e) {
			System.out.println("\nError en el scripting de pasos de registro: " + e.getMessage());
			e.printStackTrace();
		}
	}
}




    	