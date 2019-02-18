package Task;

import FuncionesReutilizablesGenerales.Login;
import FuncionesReutilizablesGenerales.ManageFile;
import FuncionesReutilizablesGenerales.Navegador;
import FuncionesReutilizablesGenerales.Obtenernombre;
import Objects.Controlador;
import Objects.DataDriven;
import Objects.oGenerarRetiroAprobado;




public class tGenerarRetiroAprobado {

	public static void generaRetiro() {

		
		try {
			
			Navegador.url();
			Login.login();
			
		
			if(Controlador.waitsDinamico(oGenerarRetiroAprobado.getBTN_ACEPTAR_IN())==true) {
				Controlador.Scripting("click", "boton aceptar","","",oGenerarRetiroAprobado.getBTN_ACEPTAR_IN(),null);
			}
			
			
			
			Controlador.waits(oGenerarRetiroAprobado.getBTN_OPERACION_IN(),null,"Login correcto","Login incorrecto");
		
			Controlador.Scripting("click", "Boton de Operacion","","",oGenerarRetiroAprobado.getBTN_OPERACION_IN(),null);		
	
			Controlador.mouseHover(oGenerarRetiroAprobado.getBTN_FONDOINVERSION_IN());
	
			Controlador.Scripting("click", "BTN_RETIROS_IN","","",oGenerarRetiroAprobado.getBTN_RETIROS_IN(),null);
			
			Controlador.cambioPestania();

			Controlador.waits(oGenerarRetiroAprobado.getTXT_NUMEROPOLIZA_IN(),null,"Se cargo la pagina de busqueda de poliza.","No se encontro la pagina de busqueda de poliza.");
		
			Controlador.Scripting("escribir", DataDriven.TXT_NUMEROPOLIZA_IN,"TXT_NUMEROPOLIZA_IN", "", oGenerarRetiroAprobado.getTXT_NUMEROPOLIZA_IN(),null);

			Controlador.Scripting("click", "BTN_BUSCAR_IN","","",oGenerarRetiroAprobado.getBTN_BUSCAR_IN(),null);
			
			Controlador.waits(oGenerarRetiroAprobado.getBTN_SOLICITARRETIRO_IN(),null,"Se visualizo la poliza a buscar.","No se encontro la poliza.");
	
			Controlador.Scripting("click", "BTN_RATIOSELECTPOLIZA_IN","","",oGenerarRetiroAprobado.getBTN_RATIOSELECTPOLIZA_IN(),null);
				
			Controlador.Scripting("click", "BTN_SOLICITARRETIRO_IN","","",oGenerarRetiroAprobado.getBTN_SOLICITARRETIRO_IN(),null);
			
			Controlador.waits(oGenerarRetiroAprobado.getBTN_SOLICITAR_IN(),null,"logro cargar los detalles  de la poliza  .","No logro cargar los detalles de la poliza.");
		
			
			
			String montoMinimo=Controlador.obtencionDatos(oGenerarRetiroAprobado.getTXT_MONTOMINIMO(), "value");
			double mMin=Double.parseDouble(montoMinimo);
			System.out.println("Monto mínimo: "+ montoMinimo);
			
			String montoMaximo=Controlador.obtencionDatos(oGenerarRetiroAprobado.getTXT_MONTOMAXIMO(), "value");
			//double mMax=Double.parseDouble(montoMaximo);
			System.out.println("Monto maximo: "+montoMaximo);
			Controlador.Scripting("click", "BTN_SOLICITAR_IN","","",oGenerarRetiroAprobado.getBTN_SOLICITAR_IN(),null);
			
			Controlador.waits(oGenerarRetiroAprobado.getTXT_MONTORETIRO_IN(),null,"Cargo el campo para ingresar el monto retiro .","No cargo el campo para ingresar monto retiro.");

			Controlador.Scripting("escribir", montoMinimo, "retiro monto minimo","", oGenerarRetiroAprobado.getTXT_MONTORETIRO_IN(),null);
			
			Controlador.Scripting("click", "BTN_CONTINUAR_IN","","",oGenerarRetiroAprobado.getBTN_CONTINUAR_IN(),null);

			Controlador.waits(oGenerarRetiroAprobado.getBTN_SI_IN(),null,"Se logro cargar monto mínimo.","No logro cargar aprobacion de retiro. Monto mínimo: "+ montoMinimo+ " Monto maximo: "+montoMaximo);
			
			Controlador.Scripting("click", "BTN_SI_IN","","",oGenerarRetiroAprobado.getBTN_SI_IN(),null);
			
			Controlador.waits(oGenerarRetiroAprobado.getBTN_ACEPTAR2_IN(),null,"Se genera el documento con exito  .","No logro generar el documento .");
			
			
			ManageFile.Openfile(Obtenernombre.obtenerNombre());
			
			Thread.sleep (5000);
			
			Controlador.pantallaReport("Se valido la existencia del PDF");
			ManageFile.Closefile();

		
			Controlador.Scripting("click", "BTN_ACEPTAR2_IN","","",oGenerarRetiroAprobado.getBTN_ACEPTAR2_IN(),null);
			
			Controlador.waits(oGenerarRetiroAprobado.getBTN_RATIOSELECTPOLIZA2_IN(),null,"Se cargo solicitud generada  .","No cargo la solicitud generada .");
		
			Controlador.Scripting("click", "BTN_RATIOSELECTPOLIZA2_IN","","",oGenerarRetiroAprobado.getBTN_RATIOSELECTPOLIZA2_IN(),null);
			
			Controlador.Scripting("click", "BTN_APROBAR_IN","","",oGenerarRetiroAprobado.getBTN_APROBAR_IN(),null);

			Controlador.waits(null,oGenerarRetiroAprobado.getCMB_FORMADEPAGO(),"Cargo correctamente forma de pago  .","Forma de pago fallido.");
			
			Controlador.Scripting("seleccionar",DataDriven.CMB_FORMADEPAGO, "CMB_FORMADEPAGO","", null,oGenerarRetiroAprobado.getCMB_FORMADEPAGO());
		
			Controlador.Scripting("click", "BTN_CONTINUAR_IN","","",oGenerarRetiroAprobado.getBTN_CONTINUAR2_IN(),null);
			
			Controlador.waits(oGenerarRetiroAprobado.getBTN_SI2_IN(),null,"Cargo correctamente  aprobar retiro   .","No cargo aprobar retiro.");
			
			Controlador.Scripting("click", "BTN_SI2_IN","","",oGenerarRetiroAprobado.getBTN_SI2_IN(),null);
			
			Controlador.waits(oGenerarRetiroAprobado.getTXT_APROBADA(),null,"Solicitud de Retiro Aprobada","Solicitud de retiro Fallida");
			
			if (Controlador.obtencionDatos(oGenerarRetiroAprobado.getTXT_APROBADA(), "td").equals("Solicitud Aprobada")) {
				Controlador.waits(oGenerarRetiroAprobado.getTXT_APROBADA(),null,"Retiro Aprobado finalizo exitosamente","No se finalizo el proceso de Retiro Aprobado");
			}

		} catch (Exception e) {
			System.out.println("\nError en el scripting de pasos de registro: " + e.getMessage());
			e.printStackTrace();
			
		}	
			
	}
			
}
