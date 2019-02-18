package Task;



import org.openqa.selenium.NoAlertPresentException;
import FuncionesReutilizablesGenerales.Login;
import FuncionesReutilizablesGenerales.Navegador;
import Main.Variables;
import Objects.Controlador;
import Objects.DataDriven;
import Objects.oGenerarSiniestro;





public class tGenerarSiniestro {
	
	public static void generaSiniestro() {

		
		try {
			
				Navegador.url();
				Login.login();
				
					
				if(Controlador.waitsDinamico(oGenerarSiniestro.getBTN_ACEPTARLO_IN())==true) {
				Controlador.Scripting("click", "boton aceptar","","",oGenerarSiniestro.getBTN_ACEPTARLO_IN(),null);
				
				}
				
				Controlador.waits(oGenerarSiniestro.getBTN_OPERACION_IN(),null,"Login correcto","Login incorrecto");
				
				Controlador.Scripting("click", "boton operacion","","",oGenerarSiniestro.getBTN_OPERACION_IN(),null);	
				
				
				Controlador.mouseHover(oGenerarSiniestro.getBTN_SINIESTROS_IN());
				
				Controlador.Scripting("click", " boton creacion de siniestro","","",oGenerarSiniestro.getBTN_CREACIONSINIESTRO_IN(),null);
			
				Controlador.cambioPestania();
				
				Controlador.waits(oGenerarSiniestro.getTXT_NUMEROPOLIZA_IN(),null,"Se cargo la pagina de busqueda de poliza de manera exitosa.","No se cargo la pagina de busqueda de poliza.");
				
				Controlador.Scripting("escribir", DataDriven.TXT_NUMEROPOLIZA_IN,"TXT_NUMEROPOLIZA_IN", "", oGenerarSiniestro.getTXT_NUMEROPOLIZA_IN(),null);
				
				Controlador.Scripting("click", "BTN_BUSCAR_IN","","",oGenerarSiniestro.getBTN_BUSCAR_IN(),null);
	
				Variables.driver.switchTo().frame("frameData");
				
				Controlador.waits(oGenerarSiniestro.getBTN_RATIOSELECTPOLIZA_IN(),null,"Se cargo la pagina para ingresar la fecha de ocurrencia del siniestro. ","No se cargo la pagina para ingresar la fecha de ocurrencia del siniestro.");
				
				Controlador.Scripting("click", "BTN_RATIOSELECTPOLIZA_IN","","",oGenerarSiniestro.getBTN_RATIOSELECTPOLIZA_IN(),null);
				
				Variables.driver.switchTo().defaultContent();
				
				Controlador.Scripting("escribir", DataDriven.TXT_FECHAOCURRENCIA_IN,"TXT_FECHAOCURRENCIA_IN", "", oGenerarSiniestro.getTXT_FECHAOCURRENCIA_IN(),null);
				
				Controlador.Scripting("click", "BTN_OBJETOAFECTADO_IN","","",oGenerarSiniestro.getBTN_OBJETOAFECTADO_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getBTN_RATIOUNIDADRIESGO_IN(),null,"Se cargo la pagina de Seleccion de las unidades de riesgo para el reclamo. ","No se cargo la pagina de Seleccion de las unidades de riesgo para el reclamo.");
				
				Controlador.Scripting("click", "BTN_RATIOUNIDADRIESGO_IN","","",oGenerarSiniestro.getBTN_RATIOUNIDADRIESGO_IN(),null);
				
				Controlador.Scripting("click", "BTN_ENVIAR_IN","","",oGenerarSiniestro.getBTN_ENVIAR_IN(),null);
	
				Controlador.waits(oGenerarSiniestro.getBTN_SELECCIONEVENTO_IN(),null,"Se cargo la pagina para ingresar la fecha de ocurrencia del siniestro. ","No se cargo la pagina para ingresar la fecha de ocurrencia del siniestro.");
				
				Controlador.Scripting("click", "BTN_SELECCIONEVENTO_IN","","",oGenerarSiniestro.getBTN_SELECCIONEVENTO_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getBTN_RATIOSTOSVIDAINVERSION_IN(),null,"Se cargo la pagina Eventos de la Poliza . ","No se cargo la pagina Eventos de la Poliza.");
				
				Controlador.Scripting("click", "BTN_RATIOSTOSVIDAINVERSION_IN","","",oGenerarSiniestro.getBTN_RATIOSTOSVIDAINVERSION_IN(),null);
				
				Controlador.Scripting("click", "BTN_ENVIAR2_IN","","",oGenerarSiniestro.getBTN_ENVIAR2_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getTXT_FECHAOCURRENCIA_IN(),null,"Se cargo la pagina para ingresar la fecha de ocurrencia del siniestro. ","No se cargo la pagina para ingresar la fecha de ocurrencia del siniestro.");
				
				Controlador.Scripting("click", "BTN_ACEPTAR1_IN","","",oGenerarSiniestro.getBTN_ACEPTAR1_IN(),null);
				
				Variables.driver.switchTo().frame("plantilla");
				
				Controlador.waits(oGenerarSiniestro.getTXT_FECHANOTIFICACION_IN(),null,"Se cargo la pantalla  Eventos de la Poliza. ","No se cargo la pagina Eventos de la Poliza");
				
				Controlador.Scripting("escribir", DataDriven.TXT_FECHAOCURRENCIA_IN,"TXT_FECHANOTIFICACION_IN", "", oGenerarSiniestro.getTXT_FECHANOTIFICACION_IN(),null);
				
				String winHandleBefore = Variables.driver.getWindowHandle();
				
				Controlador.Scripting("click", "BTN_SELECCIONAR_IN","","",oGenerarSiniestro.getBTN_SELECCIONAR_IN(),null);
				
				
				for(String winHandle : Variables.driver.getWindowHandles()){
				    Variables.driver.switchTo().window(winHandle);
				    System.out.println("Ventana nro: "+ winHandle);
				}
				

				Controlador.waits(oGenerarSiniestro.getBTN_CAUSASINIESTRO_IN(),null,"Se cargo la ventana para selecionar el tipo de siniestro. ","No se cargo la ventana para seleccionar el tipo de siniestro.");
				
				Controlador.Scripting("click", "BTN_CAUSASINIESTRO_IN","","",oGenerarSiniestro.getBTN_CAUSASINIESTRO_IN(),null);
				
				Variables.driver.switchTo().window(winHandleBefore);
				
				Variables.driver.switchTo().frame("plantilla");
				
				Controlador.Scripting("seleccionar",DataDriven.CMB_TIPODEPAGO, "CMB_TIPODEPAGO","", null,oGenerarSiniestro.getCMB_TIPODEPAGO());
				
				Controlador.Scripting("seleccionar",DataDriven.CMB_OFICINA, "CMB_OFICINA","", null,oGenerarSiniestro.getCMB_OFICINA());
				
				Variables.driver.switchTo().defaultContent();
				
				Controlador.Scripting("click", "BTN_ACEPTAR2_IN","","",oGenerarSiniestro.getBTN_ACEPTAR2_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getBTN_AGREGARCOBERTURA_IN(),null,"Se habilita el area de agregar cobertura . ","No se habilita el area de agregar cobertura ");
				
				Controlador.Scripting("click", "BTN_AGREGARCOBERTURA_IN","","",oGenerarSiniestro.getBTN_AGREGARCOBERTURA_IN(),null);
				
				Controlador.waits(null,oGenerarSiniestro.getCMB_COBERTURAAFECTADA(),"Se habilita el area de agregar cobertura afectada . ","No se habilita el area de agregar cobertura afectada ");
				
				
				Controlador.Scripting("seleccionar",DataDriven.CMB_COBERTURAAFECTADA, "CMB_COBERTURAAFECTADA","", null,oGenerarSiniestro.getCMB_COBERTURAAFECTADA());
				
				Controlador.waits(oGenerarSiniestro.getTXT_PAGOMAXIMO_IN(),null,"Carga la pestaña Reserva para introducir el Pago Maximo .","No carga la pestaña de  Reserva para introducir el Pago Maximo");
				
				
				
				//Función para capturar el pago
				String pagomaximo = Controlador.limiteReserva(Controlador.obtencionDatos(oGenerarSiniestro.getLIMITE_RESERVA_IN(),"td"));
				System.out.println("Pago máximo: "+ pagomaximo);
				
				//Formateo de campo por default
				Controlador.borrarDefaultTXTBOX(oGenerarSiniestro.getTXT_PAGOMAXIMO_IN());
				Controlador.Scripting("escribir",pagomaximo,"TXT_PAGOMAXIMO_IN", "", oGenerarSiniestro.getTXT_PAGOMAXIMO_IN(),null);
				winHandleBefore = Variables.driver.getWindowHandle();
				
				Controlador.Scripting("click", "BTN_ENVIAR3_IN","","",oGenerarSiniestro.getBTN_ENVIAR3_IN(),null);
				
				 try{ //Si el popup existe 
				        Variables.driver.switchTo().alert(); 
				        Variables.driver.switchTo().alert().accept();
				        System.out.println("Existe el popup");
				 }catch (NoAlertPresentException Ex){//Si no existe el popup estamos asumiendo que sólo aparecerá una ventana 
				         System.out.println("No existe el popup");
				         
						 for(String winHandle : Variables.driver.getWindowHandles()){
							 Variables.driver.switchTo().window(winHandle);
							 System.out.println("Ventana nro: "+ winHandle);
						 }
						 Controlador.Scripting("click", "BTN_ACEPTAR1_IN","","",oGenerarSiniestro.getBTN_ACEPTAR1_IN(),null);
						 Variables.driver.switchTo().window(winHandleBefore);
						 
						 try {
							 	Variables.driver.switchTo().alert(); 
						        Variables.driver.switchTo().alert().accept();
						        System.out.println("Existe el popup");
						 }catch(NoAlertPresentException E) {
							 System.out.println("No existe el popup");
							 
						 }
				 }
				
				
				Controlador.waits(oGenerarSiniestro.getAREA_COBERTURA_IN(),null,"Activa la opcion de cobertura elegida en el Area Cobertura .","No carga opcion de cobertura elegida en el Area Cobertura");
				
				Controlador.Scripting("click", "BTN_FALLECIMIENTO_IN","","",oGenerarSiniestro.getBTN_FALLECIMIENTO_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getBTN_PAGOS_IN(),null,"Activa la opcion de pagos en el area de cobertura.","No activa la opcion de pagos");
				
				Controlador.Scripting("click", "BTN_PAGOS_IN","","",oGenerarSiniestro.getBTN_PAGOS_IN(),null);
				
				
				Controlador.waits(oGenerarSiniestro.getBTN_TERCEROSPOLIZA_IN(),null,"Activa la opcion de seleccionar terceros.","No activa seleccionar terceros");
				
				Controlador.Scripting("click", "BTN_TERCEROSPOLIZA_IN","","",oGenerarSiniestro.getBTN_TERCEROSPOLIZA_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getCHECK_TERCEROS_IN(),null,"Activa la vista de Generar pago a terceros.","No activa la vista de generar pagos a terceros");
				
				Controlador.Scripting("click", "CHECK_TERCEROS_IN","","",oGenerarSiniestro.getCHECK_TERCEROS_IN(),null);
				
				Controlador.Scripting("click", "BTN_ENVIAR2_IN","","",oGenerarSiniestro.getBTN_ENVIAR2_IN(),null);
			
				Controlador.waits(oGenerarSiniestro.getBTN_EDITAR_IN(),null,"Carga la ventana con los datos del beneficiario.","No carga la ventana con los datos del beneficiario");
				
				Controlador.Scripting("click", "BTN_EDITAR_IN","","",oGenerarSiniestro.getBTN_EDITAR_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getTXT_MONTOSINIESTRO_IN(),null,"Carga la ventana para ingresar el monto del siniestro.","No carga la ventana para ingresar el monto del siniestro");
				
				String montosiniestro = Controlador.obtencionDatos(oGenerarSiniestro.getTXT_MONTORESTANTERESERVA_IN(),"td");
				
				Controlador.borrarDefaultTXTBOX(oGenerarSiniestro.getTXT_MONTOSINIESTRO_IN());
				System.out.println("Borra el campo primero");
				Controlador.Scripting("escribir",montosiniestro,"TXT_MONTOSINIESTRO_IN", "", oGenerarSiniestro.getTXT_MONTOSINIESTRO_IN(),null);
				Thread.sleep(3000);
				
				System.out.println("	ingresa el monto");
				
				Controlador.Scripting("click", "BTN_ENVIAR2_IN","","",oGenerarSiniestro.getBTN_ENVIAR2_IN(),null);
				
				System.out.println("ejecuto el click del boton");
				
				
				Controlador.waits(oGenerarSiniestro.getPORCENTAJE_IN(),null,"Carga las acciones para aplicarle al siniestro.","No carga las acciones para aplicar al siniestro");
			
				
				System.out.println("se ejecuta el Thread");
				
				
				//	Controlador.waits("xpath", "//input[@value='Enviar']","Envia los montos cargados .","No envia los montos cargados");
				
				String porcentaje=Controlador.obtencionDatos(oGenerarSiniestro.getPORCENTAJE_IN(), "value");
				System.out.println("reconoce el porcentaje ");
				double pPorcent=Double.parseDouble(porcentaje);
				
				
				if (pPorcent>0) {
					Thread.sleep(3000);
					Controlador.Scripting("click", "BTN_ENVIAR6_IN","","",oGenerarSiniestro.getBTN_ENVIAR2_IN(),null);
				}
				
				
				Controlador.waits(oGenerarSiniestro.getBTN_RATIOPAGOS_IN(),null,"Carga las acciones para aplicarle al siniestro.","No carga las acciones para aplicar al siniestro");
				Controlador.Scripting("click", "BTN_RATIOPAGOS_IN","","",oGenerarSiniestro.getBTN_RATIOPAGOS_IN(),null);
				
				
				Controlador.Scripting("seleccionar",DataDriven.CMB_ACCIONES, "CMB_ACCIONES","", null,oGenerarSiniestro.getCMB_ACCIONES());
				
				//pop up
				Variables.driver.switchTo().alert().accept();
				
				
				
				
			//	Controlador.waits(oGenerarSiniestro.getPRUEBA_IN(),null,"Genera el documento del Siniestro.","No genera el documento del siniestro");
				
				
				
				
				Controlador.waits(oGenerarSiniestro.getBTN_TOTALIZAR_IN(),null,"Genera el documento del Siniestro.","No genera el documento del siniestro");
				
				Controlador.Scripting("click", "BTN_TOTALIZAR_IN","","",oGenerarSiniestro.getBTN_TOTALIZAR_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getCHECK_TOTALIZAR_IN(),null,"Carga exitosamente la seccion de liquidacion de Siniestros .","Fallo la carga de la seccion de liquidacion de Siniestros");
				
				Controlador.Scripting("click", "CHECK_TOTALIZAR_IN","","",oGenerarSiniestro.getCHECK_TOTALIZAR_IN(),null);
				
				Controlador.Scripting("click", "BTN_ENVIAR6_IN","","",oGenerarSiniestro.getBTN_ENVIAR2_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getMENLIQUIDACION_IN(),null,"","");
				
			if (Controlador.obtencionDatos(oGenerarSiniestro.getMENLIQUIDACION_IN(), "td").equals("La liquidación de los pagos fue realizada en forma exitosa")) {
				Controlador.waits(oGenerarSiniestro.getMENLIQUIDACION_IN(),null,"Proceso de Pago de Siniestro ha  Finalizado exitosamente ","No se finalizo el proceso de Pago de siniestro");
				
			}
			
			
				Controlador.waits(oGenerarSiniestro.getBTN_CERRAR_IN(),null,"Se procede a cerrar el Siniestro.","No aparece la opcion para cerrar el Siniestro");
				
				Controlador.Scripting("click", "BTN_CERRAR_IN","","",oGenerarSiniestro.getBTN_CERRAR_IN(),null);
			
				
				Variables.driver.switchTo().frame("plantilla");
				
				Controlador.waits(oGenerarSiniestro.getTXT_FECHAOPERACION_IN(),null,"Carga exitosamente la seccion de Cierre de Siniestro .","Fallo la carga de la seccion de Cierre de Siniestro");
				Controlador.Scripting("escribir", DataDriven.TXT_FECHAOPERACION_IN,"TXT_FECHAOPERACION_IN", "", oGenerarSiniestro.getTXT_FECHAOPERACION_IN(),null);
				Controlador.Scripting("seleccionar",DataDriven.CMB_MOTIVOCIERRE, "CMB_MOTIVOCIERRE","", null,oGenerarSiniestro.getCMB_MOTIVOCIERRE());
				
				Variables.driver.switchTo().defaultContent();
				
				Controlador.waits(oGenerarSiniestro.getBTN_ACEPTARCERRAR_IN(),null,"","");
				Controlador.Scripting("click", "BTN_ACEPTARCERRAR_IN","","",oGenerarSiniestro.getBTN_ACEPTARCERRAR_IN(),null);
				
				//pop up
				Variables.driver.switchTo().alert().accept();
				
				Controlador.waits(oGenerarSiniestro.getBTN_IRARECLAMO_IN(),null,"Se carga la pagina que indica el Estatus Actualizado Exitosamente ","No carga la pagina de Estatus Actualizado Exitosamente");
				
				Controlador.Scripting("click", "BTN_IRARECLAMO_IN","","",oGenerarSiniestro.getBTN_IRARECLAMO_IN(),null);
				
				Controlador.waits(oGenerarSiniestro.getMENCIERRE_IN(),null,"","");
				
			if (Controlador.obtencionDatos(oGenerarSiniestro.getMENCIERRE_IN(), "a").equals("Cerrado")) {
				Controlador.waits(oGenerarSiniestro.getMENCIERRE_IN(),null,"Proceso de Generacion de Siniestro Finalizado exitosamente ","No se finalizo el proceso de generacion de siniestro");
					
				}
				
				
				
		} catch (Exception e) {
			System.out.println("\nError en el scripting de pasos de registro: " + e.getMessage());
			e.printStackTrace();
		}	
	}	
}
