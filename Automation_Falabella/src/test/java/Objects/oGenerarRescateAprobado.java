package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class oGenerarRescateAprobado {
	
	
	public static WebElement getBTN_ACEPTAR_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//Input[@name='SecuritySubmit']");
		return element;
	}
	
	public static WebElement getBTN_OPERACION_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//div[text()='Operaci¿n']");
		return element;
	}
	
	public static WebElement getBTN_FONDOINVERSION_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "(//div[text()='Fondos de Inversi¿n'])[1]");
		return element;
	}
	
	public static WebElement getBTN_RESCATES_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//div[text()='Rescates']");
		return element;
	}
	
	public static WebElement getTXT_NUMEROPOLIZA_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@wicketpath='ConsultPolicy_searchForm_policyNumber']");
		return element;
	}
	
	public static WebElement getBTN_BUSCAR_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='searchButton']");
		return element;
	}
	
	public static WebElement getBTN_RATIOSELECTPOLIZA_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='ConsultPolicy:ResultSearchSimplePolicy:groupPolicies']");
		return element;
	}
	
	public static WebElement getBTN_VERRESCATE_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@value='Ver Rescate']");
		return element;
	}
	
	public static WebElement getBTN_SOLICITARRESCATE_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@value='Solicitar']");
		return element;
	}
	
	public static WebElement getBTN_APROBACION_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//Input[@name='yesOption']");
		return element;
	}
	
	
	
	public static WebElement getMENS_PDF_CORRECTO() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//span[text()='El documento se generó exitosamente.']");
		return element;
	}
	

	
	public static WebElement getBTN_ACEPTAR2_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//Input[@value='Aceptar']");
		return element;
	}
	
	public static WebElement getBTN_RATIOSELECTPOLIZA2_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='policyInformationContent:PolicyInformation:PolicyRescueRequestPanel:groupRescueRequests']");
		return element;
	}
	
	public static WebElement getBTN_APROBAR_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//Input[@name='container:approveBtn']");
		return element;
	}
	
	public static WebElement getBTN_CONTINUAR_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@value='Continuar']");
		return element;
	}
	
	public static WebElement getBTN_APROBACION2_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:modal:content:questionForm:yesOption']");
		return element;
	}
	
	public static WebElement getTXT_APROBADA() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//td//span[text()='Solicitud Aprobada']");
		return element;
	}
	
	
	public static Select getCMB_FORMADEPAGO() throws Exception{
		Select element = null;
		element=  Controlador.IdentificadoresCombobox("xpath", "//select[@name='EventSection:content:Form:comboPayment']");
		return element;
	}

}
	


//	
	
	
//	public static WebElement rescateObject(String objects) throws Exception {
//		
//		WebElement obj = null;
//		
//		
//		
//		if (objects.equals("BTN_ACEPTAR_IN")) {
//			WebElement btn_aceptar_in = Controlador.IdentificadoresElement("xpath", "//Input[@name='SecuritySubmit']");
//			obj=btn_aceptar_in;
//		}
//		
//		
//		else if (objects.equals("BTN_OPERACION_IN")) {
//			WebElement btn_operacion_in = Controlador.IdentificadoresElement("xpath", "//div[text()='Operaci¿n']");
//			obj=btn_operacion_in;
//		}
//		
//		
//		else if (objects.equals("BTN_FONDOINVERSION_IN")) {
//			WebElement btn_fondoinversion_in = Controlador.IdentificadoresElement("xpath", "(//div[text()='Fondos de Inversi¿n'])[1]");
//			obj=btn_fondoinversion_in;
//		}
		
		
//		else if (objects.equals("BTN_RESCATES_IN")) {
//			WebElement btn_rescates_in = Controlador.IdentificadoresElement("xpath", "//div[text()='Rescates']");
//			obj=btn_rescates_in;
//		}
//		
//		
//	
//		if(objects.equals("TXT_NUMEROPOLIZA_IN")) {
//			WebElement txt_numeropoliza_in = Controlador.IdentificadoresElement("xpath", "//input[@wicketpath='ConsultPolicy_searchForm_policyNumber']");
//			obj=txt_numeropoliza_in;
//		}
//				
//		
//		
//		else if (objects.equals("BTN_BUSCAR_IN")) {
//			WebElement btn_buscar_in = Controlador.IdentificadoresElement("xpath", "//input[@name='searchButton']");
//			obj=btn_buscar_in;
//		}
//		
//		
//		
//		
//		else if (objects.equals("BTN_RATIOSELECTPOLIZA_IN")) {
//			WebElement btn_ratioselectpoliza_in = Controlador.IdentificadoresElement("xpath", "//input[@name='ConsultPolicy:ResultSearchSimplePolicy:groupPolicies']");
//			obj=btn_ratioselectpoliza_in;
//		}
//		
//		
//		
//		else if (objects.equals("BTN_VERRESCATE_IN")) {
//			WebElement btn_verrescate_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Ver Rescate']");
//			obj=btn_verrescate_in;
//		}
//		
//		
//		
//		else if (objects.equals("BTN_SOLICITARRESCATE_IN")) {
//			WebElement btn_solicitarrescate_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Solicitar']");
//			obj=btn_solicitarrescate_in;
//		}
//		
//		
//
//		else if (objects.equals("BTN_APROBACION_IN")) {
//			WebElement btn_aprobacion_in = Controlador.IdentificadoresElement("xpath", "//Input[@name='yesOption']");
//			obj=btn_aprobacion_in;
//		}
		
		
		
//		else if (objects.equals("BTN_ACEPTAR_IN")) {
//			WebElement btn_aceptar_in = Controlador.IdentificadoresElement("xpath", "//Input[@value='Aceptar']");
//			obj=btn_aceptar_in;
//		}
//		
//		
		
//		else if (objects.equals("BTN_RATIOSELECTPOLIZA2_IN")) {
//			WebElement btn_ratioselectpoliza2_in = Controlador.IdentificadoresElement("xpath", "//input[@name='policyInformationContent:PolicyInformation:PolicyRescueRequestPanel:groupRescueRequests']");
//			obj=btn_ratioselectpoliza2_in;
//		}
//		
//	
		
		
//		else if (objects.equals("BTN_APROBAR_IN")) {
//			WebElement btn_aprobar_in = Controlador.IdentificadoresElement("xpath", "//Input[@name='container:approveBtn']");
//			obj=btn_aprobar_in;
//		}
		
		
		
		
//		else if (objects.equals("BTN_CONTINUAR_IN")) {
//			WebElement btn_continuar_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Continuar']");
//			obj=btn_continuar_in;
//		}
//		
//		
//		
//		else if (objects.equals("BTN_APROBACION2_IN")) {
//			WebElement btn_aprobacion2_in = Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:modal:content:questionForm:yesOption']");
//			obj=btn_aprobacion2_in;
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
//		return obj;
//		
//}	
	
	
	
	
	
	
	
	
//	public static Select registroSelect(String objects) throws Exception {
//		
//		Select combo = null;
//		
//		
//		
//		 if(objects.equals("CMB_FORMADEPAGO")) {
//			Select cmb_formadepago = Controlador.IdentificadoresCombobox("xpath", "//select[@name='EventSection:content:Form:comboPayment']");
//			combo=cmb_formadepago;
//		}
//		
//																									
//		
//		
//		return combo;
//		
//		}	
		






