package Task;


import FuncionesReutilizablesGenerales.Login;
import FuncionesReutilizablesGenerales.Navegador;
import FuncionesReutilizablesGenerales.Obtenernombre;
import FuncionesReutilizablesGenerales.ManageFile;
import Objects.Controlador;
import Objects.DataDriven;
import Objects.oGenerarPrestamoAprobado;




public class tGenerarPrestamoAprobado {

	public static void generaPrestamo() {

		try {
			
			Navegador.url();
			Login.login();
			
			
			
			
			if(Controlador.waitsDinamico(oGenerarPrestamoAprobado.getBTN_ACEPTAR_IN())==true) {
				Controlador.Scripting("click", "boton aceptar","","",oGenerarPrestamoAprobado.getBTN_ACEPTAR_IN(),null);
				}
			
			
			Controlador.waits(oGenerarPrestamoAprobado.getBTN_OPERACION_IN(),null,"Login correcto","Login incorrecto");
			
			Controlador.Scripting("click", "Boton de Operacion","","",oGenerarPrestamoAprobado.getBTN_OPERACION_IN(),null);		
			
			Controlador.mouseHover(oGenerarPrestamoAprobado.getBTN_FONDOINVERSION_IN());
			
			Controlador.Scripting("click", "BTN_MOSTRARPRESTAMOS_IN","","",oGenerarPrestamoAprobado.getBTN_MOSTRARPRESTAMOS_IN(),null);
			
			Controlador.cambioPestania();
			
			Controlador.waits(oGenerarPrestamoAprobado.getTXT_NUMEROPOLIZA_IN(),null,"Se cargo la pagina de busqueda de poliza.","No se encontro la pagina de busqueda de poliza.");
			
			Controlador.Scripting("escribir", DataDriven.TXT_NUMEROPOLIZA_IN,"TXT_NUMEROPOLIZA_IN", "", oGenerarPrestamoAprobado.getTXT_NUMEROPOLIZA_IN(),null);
			
		
			
			Controlador.Scripting("click", "BTN_BUSCAR_IN","","",oGenerarPrestamoAprobado.getBTN_BUSCAR_IN(),null);
			
			Controlador.waits(oGenerarPrestamoAprobado.getBTN_RATIOSELECTPOLIZA_IN(),null,"Se carga el resultado de la busqueda .","No se cargo el resultado de la busqueda.");
			
			Controlador.Scripting("click", "BTN_RATIOSELECTPOLIZA_IN","","",oGenerarPrestamoAprobado.getBTN_RATIOSELECTPOLIZA_IN(),null);
			
			Controlador.Scripting("click", "BTN_SOLICITARPRESTAMO_IN","","",oGenerarPrestamoAprobado.getBTN_SOLICITARPRESTAMO_IN(),null);
			
			Controlador.waits(oGenerarPrestamoAprobado.getBTN_SOLICITARPRESTAMO2_IN(),null,"Carga exitosa de la ficha de  Solicitud de Prestamo .","No se cargo la ficha de  Solicitud de Prestamo.");
			
			String montominimo=Controlador.obtencionDatos(oGenerarPrestamoAprobado.getMONTO_MINIMO_IN(), "value");
			System.out.println("montominimo: "+montominimo);
//			double mMin=Double.parseDouble(montominimo);
			
			String montomaximo=Controlador.obtencionDatos(oGenerarPrestamoAprobado.getMONTO_MAXIMO_IN(), "value");
			System.out.println("montominimo: "+montomaximo);
//			double mMax=Double.parseDouble(montomaximo);
			
			Controlador.Scripting("click", "BTN_SOLICITARPRESTAMO2_IN","","",oGenerarPrestamoAprobado.getBTN_SOLICITARPRESTAMO2_IN(),null);
			
			Controlador.waits(oGenerarPrestamoAprobado.getTXT_MONTOPRESTAMO_IN(),null,"Cargo el campo para ingresar el monto prestamo .","No cargo el campo para ingresar monto prestamo.");

			Controlador.Scripting("escribir", montominimo, "retiro monto minimo","", oGenerarPrestamoAprobado.getTXT_MONTOPRESTAMO_IN(),null);
			
			Controlador.Scripting("seleccionar",DataDriven.CMB_FORMADEPAGO, "CMB_FORMADEPAGO","", null,oGenerarPrestamoAprobado.getCMB_FORMADEPAGO());
			
			Controlador.Scripting("seleccionar",DataDriven.CMB_NUMEROCUOTAS, "CMB_NUMEROCUOTAS","", null,oGenerarPrestamoAprobado.getCMB_NUMEROCUOTAS());
			
			Controlador.Scripting("seleccionar",DataDriven.CMB_FRECUENCIAPAGOS, "CMB_FRECUENCIAPAGOS","", null,oGenerarPrestamoAprobado.getCMB_FRECUENCIAPAGOS());
			
			Controlador.Scripting("click", "BTN_CONTINUAR_IN","","",oGenerarPrestamoAprobado.getBTN_CONTINUAR_IN(),null);
			
			Controlador.waits(oGenerarPrestamoAprobado.getBTN_SI_IN(),null,"Carga el aviso si desea solicitar un prestamo  .","El monto mínimo y el máximo son incorrectos. Monto mínimo: "+ montominimo + " Monto máximo: "+ montomaximo);
			
			Controlador.Scripting("click", "BTN_SI_IN","","",oGenerarPrestamoAprobado.getBTN_SI_IN(),null);
			
			Controlador.waits(oGenerarPrestamoAprobado.getBTN_ACEPTAR_IN2(),null,"Muestra la ventana de Carga de documento.","No carga ventana de confirmacion de documento.");						
			
			
			ManageFile.Openfile(Obtenernombre.obtenerNombre());
			
			Thread.sleep (5000);
			
			Controlador.pantallaReport("Se valido la existencia del PDF");
			ManageFile.Closefile();

			
			
			Controlador.Scripting("click", "BTN_ACEPTAR_IN2","","",oGenerarPrestamoAprobado.getBTN_ACEPTAR_IN2(),null);
			
			Controlador.waits(oGenerarPrestamoAprobado.getBTN_RATIOSELECTPOLIZA2_IN(),null,"Paso Correcto","Paso Fallido");

			Controlador.Scripting("click", "BTN_RATIOSELECTPOLIZA2_IN","","",oGenerarPrestamoAprobado.getBTN_RATIOSELECTPOLIZA2_IN(),null);
			
			Controlador.waits(oGenerarPrestamoAprobado.getBTN_APROBAR_IN(),null,"Boton Aprobar","No reconoce el Boton Aprobar");
			
			Controlador.Scripting("click", "BTN_APROBAR_IN","","",oGenerarPrestamoAprobado.getBTN_APROBAR_IN(),null);
			
			Controlador.waits(oGenerarPrestamoAprobado.getTXT_APROBADA(),null,"Solicitud de Prestamo Aprobada","Solicitud de prestamo Fallida");
			
			if (Controlador.obtencionDatos(oGenerarPrestamoAprobado.getTXT_APROBADA(), "td").equals("Solicitud Aprobada")) {
				Controlador.waits(oGenerarPrestamoAprobado.getTXT_APROBADA(),null,"Prestamo Aprobado finalizo exitosamente","No se finalizo el proceso de Prestamo Aprobado");
			}

				
			
		} catch (Exception e) {
			System.out.println("\nError en el scripting de pasos de registro: " + e.getMessage());
			e.printStackTrace();
			
		}
	
	}
	
}

				

			
	