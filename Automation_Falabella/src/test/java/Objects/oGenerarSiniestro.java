package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class oGenerarSiniestro {

	
	
	public static WebElement getBTN_ACEPTARLO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//Input[@name='SecuritySubmit']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_OPERACION_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//div[text()='Operaci¿n']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_SINIESTROS_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//div[text()='Siniestros']" );
		return element;
	}
	
	
	
	
	
	public static WebElement getBTN_CREACIONSINIESTRO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//div[text()='Creaci¿n de Siniestro']");
		return element;
	}
	
	
	
	

	public static WebElement getTXT_NUMEROPOLIZA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='NumeroPoliza']");
		return element;
	}
	
	
	
	

	public static WebElement getBTN_BUSCAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Buscar']");
		return element;
	}
	
	
	
	public static WebElement getBTN_RATIOSELECTPOLIZA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='idpolicy']");
		return element;
	}
	
	
	
	
	public static WebElement getTXT_FECHAOCURRENCIA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='dateoperationvalueShow']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_OBJETOAFECTADO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Selección de objeto afectado']");
		return element;
	}
	
	
	
	public static WebElement getBTN_RATIOUNIDADRIESGO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='riskUnitID0']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_ENVIAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='submitField']");
		return element;
	}
	
	
	

	public static WebElement getBTN_SELECCIONEVENTO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Selección del evento']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_RATIOSTOSVIDAINVERSION_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='eventClaim']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_ENVIAR2_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Enviar']");
		return element;
	}
	
	
	
	
	
	public static WebElement getBTN_ACEPTAR1_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Aceptar']");
		return element;
	}
	
	
	

	public static WebElement getTXT_FECHANOTIFICACION_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='FechaNotificacionShow']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_SELECCIONAR_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//a[@id='CausasSiniestroSelectLink']");
		return element;
	}
	
	
	
	
	
	public static WebElement getBTN_CAUSASINIESTRO_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "/html/body/table/tbody/tr[22]/td/a");
		return element;
	}
	
	
	
	
	

	public static WebElement getBTN_ACEPTAR2_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "(//input[@value='Aceptar'])[2]");
		return element;
	}
	
	
	
	
	

	public static WebElement getBTN_AGREGARCOBERTURA_IN() throws Exception {
		WebElement element=null;
		element=   Controlador.IdentificadoresElement("xpath", "(//input[@name='addCov'])[1]");
		return element;
	}
	
	
	
	public static WebElement getTXT_RESERVALIMITADA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='reserveLimit']");
		return element;
	}
	
	
	
	
	public static WebElement getTXT_PAGOMAXIMO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='maxBenefitAmount1']");
		return element;
	}
	
	
	
	public static WebElement getLIMITE_RESERVA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//*[@id=\"contenedor\"]/div[2]/div[2]/form/center/table/tbody[2]/tr[1]/td[2]/font");
		return element;
	}
	
	
	

	public static WebElement getBTN_ENVIAR3_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='btnOk']");
		return element;
	}
	
	
	
	
	
	

	public static WebElement getAREA_COBERTURA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//select[@id='coverageSelect']/option");
		return element;
	}
	
	
	
	
	
	
	
	
	public static WebElement getBTN_FALLECIMIENTO_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//*[@id='coverageSelect']/option");
		return element;
	}
	
	
	
	public static WebElement getBTN_PAGOS_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@id=\"idb_0402006_structure_09\"]");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_TERCEROSPOLIZA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Terceros Póliza']");
		return element;
	}
	
	
	
	

	public static WebElement getCHECK_TERCEROS_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='thirdPartyID0']");
		return element;
	}
	
	
	
	
	
	public static WebElement getBTN_EDITAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//*[@id=\'paymentTable\']/tbody/tr/td[1]/input[2]");
		return element;
	}
	
	
	

	public static WebElement getTXT_MONTOSINIESTRO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@id='amount1']");
		return element;
	}
	
	
	
	
	public static WebElement getTXT_MONTORESTANTERESERVA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//td//span[@id='remainingReserveAmount']");
		return element;
	}
	
	
	
	
	public static WebElement getPORCENTAJE_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='participation']");
		return element;
	}
	
	
	


	
	public static WebElement getBTN_RATIOPAGOS_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='paymentCheck']");
		return element;
	}
	
	
	
	
	
	public static WebElement getBTN_TOTALIZAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Totalizar']");
		return element;
	}
	
	
	
	
	
	public static WebElement getCHECK_TOTALIZAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//*[@id=\'contenedor\']/div[2]/div[2]/center/form/table/tbody/tr[4]/td[1]/input");
		return element;
	}
	
	
															
	
	public static WebElement getMENLIQUIDACION_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//*[@id='contenedor']/div[2]/div[2]/table[1]/tbody/tr[2]/td");
		return element;
	}
	
	
	
	

	public static WebElement getPRUEBA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//*[@id='tableResults']/tbody/tr/td[1]/input");
		return element;
	}
	
	
	public static WebElement getBTN_CERRAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Cerrar']");
		return element;
	}
	
	
	
	public static WebElement getTXT_FECHAOPERACION_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='FechaOperacionShow'] ");
		return element;
	}

	
	 
	public static WebElement getBTN_ACEPTARCERRAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//*[@id='contenedor']/div[2]/div[2]/div[4]/input");
		return element;
	}
	
	
	
	public static WebElement getBTN_IRARECLAMO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Ir al Reclamo']");
		return element;
	}
	
	
	
	
	
	public static WebElement getMENCIERRE_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//*[@id='contenedor']/div[2]/div[2]/div[1]/center/table/tbody/tr[6]/td[2]/span/a");
		return element;
	}
															
	
	

	
//*****************Listas de Seleccion Multiple
	

	public static Select getCMB_TIPODEPAGO() throws Exception {
		Select element=null;
		element=  Controlador.IdentificadoresCombobox("xpath", "//select[@name='TipoDePago']");
		return element;
	}
	
	
	
	
	

	public static Select getCMB_OFICINA() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "//select[@name='Oficina']");
		return element;
	}
	
	
	
	
	

	public static Select getCMB_COBERTURAAFECTADA() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "//select[@name='coverageID']");
		return element;
	}
	
	
	
	
	

	public static Select getCMB_ACCIONES() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "//select[@name='actions']");
		return element;
	}
	
	
	
	public static Select getCMB_MOTIVOCIERRE() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "//select[@name='MotivoCierre']");
		return element;
	}

	
	
}
	
		
//		if (objects.equals("BTN_ACEPTARLO_IN")) {
//			WebElement btn_aceptarlo_in = Controlador.IdentificadoresElement("xpath", "//Input[@name='SecuritySubmit']");
//			obj=btn_aceptarlo_in;
//		}
		
		
		
//		
//		else if (objects.equals("BTN_OPERACION_IN")) {
//			WebElement btn_operacion_in = Controlador.IdentificadoresElement("xpath", "//div[text()='Operaci¿n']");
//			obj=btn_operacion_in;
//		}
//		
		 
//		
//		else if (objects.equals("BTN_SINIESTROS_IN")) {
//			WebElement btn_siniestros_in = Controlador.IdentificadoresElement("xpath", "//div[text()='Siniestros']");
//			obj=btn_siniestros_in;
//		}


		
//		 
//		else if (objects.equals("BTN_CREACIONSINIESTRO_IN")) {
//			WebElement btn_creacionsiniestro_in = Controlador.IdentificadoresElement("xpath", "//div[text()='Creaci¿n de Siniestro']");
//			obj=btn_creacionsiniestro_in;
//		}
//		
//		

		 
	
	
	
	
	
//	
//		else if(objects.equals("TXT_NUMEROPOLIZA_IN")) {
//				WebElement txt_numeropoliza_in = Controlador.IdentificadoresElement("xpath", "//input[@name='NumeroPoliza']");
//				obj=txt_numeropoliza_in;
//			}
//					
//		 
//		 
//		
//		 
//		else if (objects.equals("BTN_BUSCAR_IN")) {
//				WebElement btn_buscar_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Buscar']");
//				obj=btn_buscar_in;
//			}
//			
//		
		 
//
//		else if (objects.equals("BTN_RATIOSELECTPOLIZA_IN")) {
//				WebElement btn_ratioselectpoliza_in = Controlador.IdentificadoresElement("xpath", "//input[@name='idpolicy']");
//				obj=btn_ratioselectpoliza_in;
//			}
//			
//		
//		 
//		// "//input[@name='idpolicy']"
//		else if(objects.equals("TXT_FECHAOCURRENCIA_IN")) {
//			WebElement txt_fechaocurrencia_in = Controlador.IdentificadoresElement("xpath", "//input[@name='dateoperationvalueShow']");
//			obj=txt_fechaocurrencia_in;
//		}
//			
//		 
		 
//		 
//		else if (objects.equals("BTN_OBJETOAFECTADO_IN")) {
//				WebElement btn_objetoafectado_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Selección de objeto afectado']");
//				obj=btn_objetoafectado_in;
//			}
//		 
//		
//		
//		else if (objects.equals("BTN_RATIOUNIDADRIESGO_IN")) {
//			WebElement btn_ratiounidadriesgo_in = Controlador.IdentificadoresElement("xpath", "//input[@name='riskUnitID0']");
//			obj=btn_ratiounidadriesgo_in;
//		}
//		
//		 
//		 
		 
//		else if (objects.equals("BTN_ENVIAR_IN")) {
//			WebElement btn_enviar_in = Controlador.IdentificadoresElement("xpath", "//input[@name='submitField']");
//			obj=btn_enviar_in;
//		}
//		 
		 
		 
//		 
//		else if (objects.equals("BTN_SELECCIONEVENTO_IN")) {
//			WebElement btn_seleccionevento_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Selección del evento']");
//			obj=btn_seleccionevento_in;
//		}
//		
//		
		 
//		 
//
//		else if (objects.equals("BTN_RATIOSTOSVIDAINVERSION_IN")) {
//			WebElement btn_ratiostosvidainversion_in = Controlador.IdentificadoresElement("xpath", "//input[@name='eventClaim']");
//			obj=btn_ratiostosvidainversion_in;
//		}
//		
//		
		 
//		 
//		 
//		else if (objects.equals("BTN_ENVIAR2_IN")) {
//			WebElement btn_enviar2_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Enviar']");
//			obj=btn_enviar2_in;
//		}
//		 
//		 
		
	
//		 
//		else if (objects.equals("BTN_ACEPTAR_IN")) {
//			WebElement btn_aceptar_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Aceptar']");
//			obj=btn_aceptar_in;
//		}
//		 
//		 
//		 
//		 
//			
//		else if(objects.equals("TXT_FECHANOTIFICACION_IN")) {
//			WebElement txt_fechanotificacion_in = Controlador.IdentificadoresElement("xpath", "//input[@name='FechaNotificacionShow']");
//			obj=txt_fechanotificacion_in;
//		}
//			
		 
		
	
	
//	
//		else if (objects.equals("BTN_SELECCIONAR_IN")) {
//			WebElement btn_seleccionar_in = Controlador.IdentificadoresElement("xpath", "//a[@id='CausasSiniestroSelectLink']");
//			obj=btn_seleccionar_in;
//		}
//		 
//		 
		 
//
//		else if (objects.equals("BTN_CAUSASINIESTRO_IN")) {
//			WebElement btn_causasiniestro_in = Controlador.IdentificadoresElement("xpath", "/html/body/table/tbody/tr[22]/td/a");
//			obj=btn_causasiniestro_in;
//		}
//		 
//		 
		 
		 
		 
		
		 //este xpath hay que mejorarlo
		 
//		else if (objects.equals("BTN_ACEPTAR2_IN")) {
//			WebElement btn_aceptar2_in = Controlador.IdentificadoresElement("xpath", "(//input[@value='Aceptar'])[2]");
//			obj=btn_aceptar2_in;
//		}
//		 
//		 
//		 // este xpath hay que mejorarlo
//		else if (objects.equals("BTN_AGREGARCOBERTURA_IN")) {
//			WebElement btn_agregarcobertura_in = Controlador.IdentificadoresElement("xpath", "(//input[@name='addCov'])[1]");
//			obj=btn_agregarcobertura_in;
//		}
//		 
//		 //////////////
		 
//este valor se toma y se coloca en el campo Pago maximo
		
//		else if(objects.equals("TXT_RESERVALIMITADA_IN")) {
//			WebElement txt_reservalimitada_in = Controlador.IdentificadoresElement("xpath", "//input[@name='reserveLimit']");
//			obj=txt_reservalimitada_in;
//		}
//			
		 

		 
		
		 
//		else if(objects.equals("TXT_PAGOMAXIMO_IN")) {
//			WebElement txt_pagomaximo_in = Controlador.IdentificadoresElement("xpath", "//input[@name='maxBenefitAmount1']");
//			obj=txt_pagomaximo_in;
//		}
//			
//		
		 
		
//		else if (objects.equals("BTN_ENVIAR3_IN")) {
//			WebElement btn_enviar3_in = Controlador.IdentificadoresElement("xpath", "//input[@name='btnOk']");
//			obj=btn_enviar3_in;
//		}
//		 
//		 
//		else if (objects.equals("BTN_ACEPTAR3_IN")) {
//			WebElement btn_aceptar_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Aceptar']");
//			obj=btn_aceptar_in;
//		}
//		 
//		 
//		 
		 
	
//		 
//		else if (objects.equals("BTN_FALLECIMIENTO_IN")) {
//			WebElement btn_fallecimiento_in = Controlador.IdentificadoresElement("xpath", "//*[@id=\'coverageSelect\']/option");
//			obj=btn_fallecimiento_in;
//		}
//		 
//		
		 
		 
//		 //hay que arreglar este xpaht con este formato //input[@value='Pagos']
//		else if (objects.equals("BTN_PAGOS_IN")) {
//			WebElement btn_pagos_in = Controlador.IdentificadoresElement("xpath", "//input[@id=\"idb_0402006_structure_09\"]");
//			obj=btn_pagos_in;
//		}
//		 
//		 
//		
//		 
//		 
//		else if (objects.equals("BTN_TERCEROSPOLIZA_IN")) {
//			WebElement btn_tercerospoliza_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Terceros Póliza']");
//			obj=btn_tercerospoliza_in;
//		}
//		 
//		 
		 
		 
	
	
	
//	
//		else if (objects.equals("CHECK_TERCEROS_IN")) {
//			WebElement check_terceros_in = Controlador.IdentificadoresElement("xpath", "//input[@name='thirdPartyID0']");
//			obj=check_terceros_in;
//		}
//		 
		 
//	
//		else if (objects.equals("BTN_ENVIAR4_IN")) {
//			WebElement btn_enviar4_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Enviar']");
//			obj=btn_enviar4_in;
//		}
//		 
//		
		
//		// mejorar este xphat
//		 
//		else if (objects.equals("BTN_EDITAR_IN")) {
//			WebElement btn_editar_in = Controlador.IdentificadoresElement("xpath", "//*[@id=\'paymentTable\']/tbody/tr/td[1]/input[2]");
//			obj=btn_editar_in;
//		}
//		
		
		 
	
	
//	
//	
//		else if(objects.equals("TXT_MONTOSINIESTRO_IN")) {
//			WebElement txt_montosiniestro_in = Controlador.IdentificadoresElement("xpath", "//input[@id='amount1']");
//			obj=txt_montosiniestro_in;
//		}
//			
//		 
		
		 
//		 
//		else if (objects.equals("BTN_ENVIAR5_IN")) {
//			WebElement btn_enviar5_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Enviar']");
//			obj=btn_enviar5_in;
//		}
//		 
//		 
//		//input[@id='idb_0402006_claimPaymentDetail_01']
//		 
//		 
		
	
	
	
//	
//		else if (objects.equals("BTN_ENVIAR6_IN")) {
//			WebElement btn_enviar6_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Enviar']");
//			obj=btn_enviar6_in;
//		}
//
//		 
		 
		 
		
//		 
//		else if (objects.equals("BTN_RATIOPAGOS_IN")) {
//			WebElement btn_ratiopagos_in = Controlador.IdentificadoresElement("xpath", "//input[@name='paymentCheck']");
//			obj=btn_ratiopagos_in;
//		}
//		 
//		 
//
//		else if (objects.equals("BTN_TOTALIZAR_IN")) {
//			WebElement btn_totalizar_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Totalizar']");
//			obj=btn_totalizar_in;
//		}
//		
//		
		 
		 
//		else if (objects.equals("CHECK_TOTALIZAR_IN")) {
//			WebElement check_totalizar_in = Controlador.IdentificadoresElement("xpath", "//*[@id=\'contenedor\']/div[2]/div[2]/center/form/table/tbody/tr[4]/td[1]/input");
//			obj=check_totalizar_in;
//		}
//		 
//		 
//		else if (objects.equals("BTN_ENVIAR6_IN")) {
//			WebElement btn_enviar6_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Enviar']");
//			obj=btn_enviar6_in;
//		}
//		 
//		 
		 
//		 
//	
//		 
//		 
//		 return obj;
//		
//	}
//
//
//
//
//
//
//
//
//
//
//public static Select registroSelect(String objects) throws Exception {
//	
//	Select combo = null;
//	
//
//
//	 if(objects.equals("CMB_TIPODEPAGO")) {
//		Select cmb_tipodepago = Controlador.IdentificadoresCombobox("xpath", "//select[@name='TipoDePago']");
//		combo=cmb_tipodepago;
//	}
//	
//		
//	
//	 if(objects.equals("CMB_OFICINA")) {
//			Select cmb_oficina = Controlador.IdentificadoresCombobox("xpath", "//select[@name='Oficina']");
//			combo=cmb_oficina;
//		}
//		
//	 
//	
//
//	 if(objects.equals("CMB_COBERTURAAFECTADA")) {
//			Select cmb_coberturaafectada = Controlador.IdentificadoresCombobox("xpath", "//select[@name='coverageID']");
//			combo=cmb_coberturaafectada;
//		}
//		
//	
//	 
//	 if(objects.equals("CMB_ACCIONES")) {
//			Select cmb_acciones = Controlador.IdentificadoresCombobox("xpath", "//select[@name='actions']");
//			combo=cmb_acciones;
//		}
//		
//	 
//	 
//	 
//	
//	 
//	 
//	 
//	 
//	
//
//	 
//	 
//	 
//	
//	return combo;
//	
//	}		
//	




