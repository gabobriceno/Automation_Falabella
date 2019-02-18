package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class oGenerarRetiroAprobado{
	

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
		element=  Controlador.IdentificadoresElement("xpath", "//div[text()='Fondos de Inversi¿n'][1]");
		return element;
	}
	
		
	
	public static WebElement getBTN_RETIROS_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//div[text()='Retiros']");
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
	
	public static WebElement getBTN_SOLICITARRETIRO_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@value='Solicitar Retiros']");
		return element;
	}
	
	public static WebElement getBTN_SOLICITAR_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@value='Solicitar']");
		return element;
	}
	
	public static WebElement getTXT_MONTOMINIMO() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='WithdrawSection:withdrawConsultSection:generalInformationDataTemplate:minimunWithdraw']");
		return element;
	}
	
	public static WebElement getTXT_MONTOMAXIMO() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='WithdrawSection:withdrawConsultSection:generalInformationDataTemplate:maximumWithdraw']");
		return element;
	}
	
	
	public static WebElement getTXT_MONTORETIRO_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:amount']");
		return element;
	}
	
	public static WebElement getBTN_CONTINUAR_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@value='Continuar']");
		return element;
	}
	
	public static WebElement getBTN_SI_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//Input[@name='EventSection:content:Form:modal:content:questionForm:yesOption']");
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
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='WithdrawSection:withdrawConsultSection:withdrawListSection:groupPolicies']");
		return element;
	}
	
	public static WebElement getBTN_APROBAR_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//Input[@name='container:approveBtn']");
		return element;
	}
	
	public static WebElement getBTN_CONTINUAR2_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:printButton']");
		return element;
	}
	
	public static WebElement getBTN_SI2_IN() throws Exception{
		WebElement element = null;
		element=  Controlador.IdentificadoresElement("xpath", "//div/input[@type='submit' and @value='Si']");
		return element;
	}
	
	
	

	public static WebElement getTXT_APROBADA() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//td//span[text()='Solicitud Aprobada']");
		return element;
	}
	
	
	
	public static Select getCMB_FORMADEPAGO() throws Exception{
		Select element = null;
		element=  Controlador.IdentificadoresCombobox("xpath", "//select[@name='EventSection:content:Form:comboPayment']");
		return element;
	}

}	
	
	
	//public static WebElement retiroObject(String objects) throws Exception {
//		
//		WebElement obj = null;
//		if (objects.equals("BTN_ACEPTAR_IN")) {
//			WebElement btn_aceptar_in = Controlador.IdentificadoresElement("xpath", "//Input[@name='SecuritySubmit']");
//			obj=btn_aceptar_in;
//		}
//		else  if (objects.equals("BTN_OPERACION_IN")) {
//			WebElement btn_operacion_in = Controlador.IdentificadoresElement("xpath", "//div[text()='Operaci¿n']");
//			obj=btn_operacion_in;
//		}
//		else if (objects.equals("BTN_FONDOINVERSION_IN")) {
//			WebElement btn_fondoinversion_in = Controlador.IdentificadoresElement("xpath ", "(//div[text()='Fondos de Inversi¿n'])[1]");
//			obj=btn_fondoinversion_in;
//		}
//		else if (objects.equals("BTN_RETIROS_IN")) {
//			WebElement btn_retiros_in = Controlador.IdentificadoresElement("xpath", "//div[text()='Retiros']");
//			obj=btn_retiros_in;
//		}
//		
//		if(objects.equals("TXT_NUMEROPOLIZA_IN")) {
//			WebElement txt_numeropoliza_in = Controlador.IdentificadoresElement("xpath", "//input[@wicketpath='ConsultPolicy_searchForm_policyNumber']");
//			obj=txt_numeropoliza_in;
//		}
//		else if (objects.equals("BTN_BUSCAR_IN")) {
//			WebElement btn_buscar_in = Controlador.IdentificadoresElement("xpath", "//input[@name='searchButton']");
//			obj=btn_buscar_in;
//		}
//		else if (objects.equals("BTN_RATIOSELECTPOLIZA_IN")) {
//			WebElement btn_ratioselectpoliza_in = Controlador.IdentificadoresElement("xpath", "//input[@name='ConsultPolicy:ResultSearchSimplePolicy:groupPolicies']");
//			obj=btn_ratioselectpoliza_in;
//		}
//		
																																									
//		
//		else if (objects.equals("BTN_SOLICITARRETIRO_IN")) {
//			WebElement btn_solicitarretiro_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Solicitar Retiros']");
//			obj=btn_solicitarretiro_in;
//		}
//		else if (objects.equals("BTN_SOLICITAR_IN")) {
//			WebElement btn_solicitar_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Solicitar']");
//			obj=btn_solicitar_in;
//		}
//		
//		if(objects.equals("TXT_MONTORETIRO_IN")) {
//			WebElement txt_montoretiro_in = Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:amount']");
//			obj=txt_montoretiro_in;
//		}
		
//		else if (objects.equals("BTN_CONTINUAR_IN")) {
//			WebElement btn_continuar_in = Controlador.IdentificadoresElement("xpath", "//input[@value='Continuar']");
//			obj=btn_continuar_in;
//		}
//		else if (objects.equals("BTN_SI_IN")) {
//			WebElement btn_si_in = Controlador.IdentificadoresElement("xpath", "//Input[@name='EventSection:content:Form:modal:content:questionForm:yesOption']");
//			obj=btn_si_in;
//		}
//		else if (objects.equals("BTN_ACEPTAR_IN")) {
//			WebElement btn_aceptar_in = Controlador.IdentificadoresElement("xpath", "//Input[@value='Aceptar']");
//			obj=btn_aceptar_in;
//		}
//		else if (objects.equals("BTN_RATIOSELECTPOLIZA2_IN")) {
//			WebElement btn_ratioselectpoliza2_in = Controlador.IdentificadoresElement("xpath", "//input[@name='WithdrawSection:withdrawConsultSection:withdrawListSection:groupPolicies']");
//			obj=btn_ratioselectpoliza2_in;
//		}
//		else if (objects.equals("BTN_APROBAR_IN")) {
//			WebElement btn_aprobar_in = Controlador.IdentificadoresElement("xpath", "//Input[@name='container:approveBtn']");
//			obj=btn_aprobar_in;
//		}
//		else if (objects.equals("BTN_CONTINUAR2_IN")) {
//			WebElement btn_continuar2_in = Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:printButton']");
//			obj=btn_continuar2_in;
//		}
//		else if (objects.equals("BTN_SI2_IN")) {
//			WebElement btn_si2_in = Controlador.IdentificadoresElement("xpath", "//div/input[@type='submit' and @value='Si']");
//			obj=btn_si2_in;
//		}
//		return obj;
		
//}	
	
	
	



	
//	public static Select registroSelect(String objects) throws Exception {
//		
//		Select combo = null;
//		
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
//		





	
	
	
	

