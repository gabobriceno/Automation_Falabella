package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class oGenerarPrestamoAprobado {
	
	
	
	
	public static WebElement getBTN_ACEPTAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//Input[@name='SecuritySubmit']");
		return element;
	}
	
	
	public static WebElement getBTN_OPERACION_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//div[text()='Operaci¿n']");
		return element;
	}
	
	
	
	public static WebElement getBTN_FONDOINVERSION_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "(//div[text()='Fondos de Inversi¿n'])[1]");
		return element;
	}
	
	
	
	public static WebElement getBTN_MOSTRARPRESTAMOS_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//div[text()='Mostrar Pr¿stamos']");
		return element;
	}
	
	
	public static WebElement getTXT_NUMEROPOLIZA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='policyNumber']");
		return element;
	}
	
	public static WebElement getBTN_BUSCAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Buscar']");
		return element;
	}
	
	
	
	public static WebElement getBTN_RATIOSELECTPOLIZA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='ConsultPolicy:ResultSearchSimplePolicy:groupPolicies']");
		return element;
	}
	
	
	public static WebElement getBTN_SOLICITARPRESTAMO_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//input[@name='container:CheckingAccountLoanButton']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_SOLICITARPRESTAMO2_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@value='Solicitar']");
		return element;
	}
	
	
	

	public static WebElement getMONTO_MINIMO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='minimumLoanAmount']");
		return element;
	}
	
	
	
	public static WebElement getMONTO_MAXIMO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='maximumLoanAmount']");
		return element;
	}
	
	

	public static WebElement getTXT_MONTOPRESTAMO_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:amount']");
		return element;
	}
	
	
	public static WebElement getBTN_CONTINUAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:confirmButton']");
		return element;
	}
	
	
	
	public static WebElement getBTN_SI_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='EventSection:content:Form:modal:content:questionForm:yesOption']");
		return element;
	}
	
	
	
	public static WebElement getMENS_PDF_CORRECTO() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//span[text()='El documento se generó exitosamente.']");
		return element;
	}
	
	
	
	
	public static WebElement getBTN_ACEPTAR_IN2() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='ErrorDialog:content:questionForm:confirmButton']");
		return element;
	}
	
	
	
	public static WebElement getBTN_RATIOSELECTPOLIZA2_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='policyInformationContent:PolicyInformation:policyLoanRequestPanel:groupPoliciesLoan']");
		return element;
	}
	
	
	

	public static WebElement getBTN_APROBAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='container:approveBtn']");
		return element;
	}
	
	
	public static Select getCMB_FORMADEPAGO() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "//select[@name='EventSection:content:Form:comboPayment']");
		return element;
	}
	
	
	public static Select getCMB_NUMEROCUOTAS() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "//select[@name='EventSection:content:Form:feeNumberComboBox']");
		return element;
	}
	
	
	public static Select getCMB_FRECUENCIAPAGOS() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "//select[@name='EventSection:content:Form:frecuencyPaymentComboBox']");
		return element;
		
		}
	
	
	
	
	public static WebElement getTXT_APROBADA() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath","//td//span[text()='Solicitud Aprobada']");
		return element;
		}
	
	}	





//td//span[text()='Solicitud Aprobada']
	