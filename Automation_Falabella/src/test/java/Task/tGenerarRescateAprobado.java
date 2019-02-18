package Task;

import FuncionesReutilizablesGenerales.Login;
import FuncionesReutilizablesGenerales.ManageFile;
import FuncionesReutilizablesGenerales.Navegador;
import FuncionesReutilizablesGenerales.Obtenernombre;
import Objects.Controlador;
import Objects.DataDriven;
import Objects.oGenerarRescateAprobado;




public class tGenerarRescateAprobado {
	
	public static void generaRescate() {

		
		try {
			
			Navegador.url();
			Login.login();
			
			
			if(Controlador.waitsDinamico(oGenerarRescateAprobado.getBTN_ACEPTAR_IN())==true) {
				
			Controlador.Scripting("click", "boton aceptar","","",oGenerarRescateAprobado.getBTN_ACEPTAR_IN(),null);
					
				}
			
			
			
			Controlador.waits(oGenerarRescateAprobado.getBTN_OPERACION_IN(),null,"Logeo correcto.","Logeo incorrecto.");
			
			
			Controlador.Scripting("click", "BTN_OPERACION_IN","","",oGenerarRescateAprobado.getBTN_OPERACION_IN(),null);		
				
				
			Controlador.mouseHover(oGenerarRescateAprobado.getBTN_FONDOINVERSION_IN());
			
				
			Controlador.Scripting("click", "BTN_RESCATES_IN","","",oGenerarRescateAprobado.getBTN_RESCATES_IN(),null);

			Controlador.cambioPestania();
			Controlador.waits(oGenerarRescateAprobado.getTXT_NUMEROPOLIZA_IN(),null,"Paso Correcto.","Paso Fallido.");
				
			Controlador.Scripting("escribir", DataDriven.TXT_NUMEROPOLIZA_IN,"TXT_NUMEROPOLIZA_IN", "", oGenerarRescateAprobado.getTXT_NUMEROPOLIZA_IN(),null);
			
			Controlador.Scripting("click", "BTN_BUSCAR_IN","","",oGenerarRescateAprobado.getBTN_BUSCAR_IN(),null);
			
			Controlador.waits(oGenerarRescateAprobado.getBTN_VERRESCATE_IN(),null,"Se visualizo la poliza a buscar.","No se encontro la poliza.");
				
				
			Controlador.Scripting("click", "BTN_RATIOSELECTPOLIZA_IN","","",oGenerarRescateAprobado.getBTN_RATIOSELECTPOLIZA_IN(),null);
				
				
			Controlador.Scripting("click", "BTN_VERRESCATE_IN","","",oGenerarRescateAprobado.getBTN_VERRESCATE_IN(),null);
				
			Controlador.waits(oGenerarRescateAprobado.getBTN_SOLICITARRESCATE_IN(),null,"Paso Correcto.","Paso Incorrecto.");
			Controlador.Scripting("click", "BTN_SOLICITARRESCATE_IN","BTN_SOLICITARRESCATE_IN","",oGenerarRescateAprobado.getBTN_SOLICITARRESCATE_IN(),null);
			Controlador.waits(oGenerarRescateAprobado.getBTN_APROBACION_IN(),null,"Paso Correcto.","Paso Incorrecto.");
			Controlador.Scripting("click", "BTN_APROBACION_IN","","",oGenerarRescateAprobado.getBTN_APROBACION_IN(),null);
			Controlador.waits(oGenerarRescateAprobado.getBTN_ACEPTAR2_IN(),null,"Muestra la ventana de Carga de documento.","No carga ventana de confirmacion de documento.");
			
			
			ManageFile.Openfile(Obtenernombre.obtenerNombre());
			
			Thread.sleep (5000);
			
			Controlador.pantallaReport("Se valido la existencia del PDF");
			ManageFile.Closefile();

		
			
			Controlador.Scripting("click", "BTN_ACEPTAR_IN","","",oGenerarRescateAprobado.getBTN_ACEPTAR2_IN(),null);
			
	
			Controlador.waits(oGenerarRescateAprobado.getBTN_RATIOSELECTPOLIZA2_IN(),null,"Se encontro la poliza a encontrar.","No se encontro la poliza.");
			Controlador.Scripting("click", "BTN_RATIOSELECTPOLIZA2_IN","","",oGenerarRescateAprobado.getBTN_RATIOSELECTPOLIZA2_IN(),null);
				
				
			Controlador.Scripting("click", "BTN_APROBAR_IN","","",oGenerarRescateAprobado.getBTN_APROBAR_IN(),null);
			
				
			Controlador.waits(null,oGenerarRescateAprobado.getCMB_FORMADEPAGO(),"Se muestra el selector de Forma de Pago","No se muestra el selector de Forma de Pago.");
			Controlador.Scripting("seleccionar",DataDriven.CMB_FORMADEPAGO, "CMB_FORMADEPAGO","", null,oGenerarRescateAprobado.getCMB_FORMADEPAGO());
				
							
			Controlador.Scripting("click", "BTN_CONTINUAR_IN","","",oGenerarRescateAprobado.getBTN_CONTINUAR_IN(),null);
				
			Controlador.waits(oGenerarRescateAprobado.getBTN_APROBACION2_IN(),null,"Paso correcto.","Paso fallido.");
			Controlador.Scripting("click", "BTN_APROBACION2_IN","","",oGenerarRescateAprobado.getBTN_APROBACION2_IN(),null);
				
			Controlador.waits(oGenerarRescateAprobado.getTXT_APROBADA(),null,"Solicitud de Rescate Aprobada","Solicitud de Rescate Fallida");
			
			if (Controlador.obtencionDatos(oGenerarRescateAprobado.getTXT_APROBADA(), "td").equals("Solicitud Aprobada")) {
				Controlador.waits(oGenerarRescateAprobado.getTXT_APROBADA(),null,"Rescate Aprobado finalizado exitosamente","No se finalizo el proceso de Retiro Aprobado");
			}

			
			
		} catch (Exception e) {
			System.out.println("\nError en el scripting de pasos de registro: " + e.getMessage());
			e.printStackTrace();
			
		}
	
		
	}

}
