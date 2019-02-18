package Objects;


import org.openqa.selenium.WebElement;


public class oRegistrarValorCuota {
	
	
	public static WebElement getBTN_ACEPTAR_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//Input[@name='SecuritySubmit']");
		return element;
	}

	
	
	public static WebElement getBTN_CONFIGURACION_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//div[text()='Configuraci¿n']");
		return element;
	}

	
	
	public static WebElement getBTN_FONDODEINVERSION_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "(//div[text()='Fondos de Inversi¿n'])[2]");
		return element;
	}

	
	
	public static WebElement getBTN_CONFIGURARVALORCUOTA_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//div[text()='Configurar Valor Cuota']");
		return element;
	}

	
	
	
	public static WebElement getBTN_PRELIMINAR() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//span[text()='Preliminar']");
		return element;
	}

	
	
	public static WebElement getC1() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//tr[1]/td[3]/div/input[@type='text']");
		return element;
	}
	
	
	
	public static WebElement getC2() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//tr[2]/td[3]/div/input[@type='text']");
		return element;
	}
	
	
	
	public static WebElement getC3() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//tr[3]/td[3]/div/input[@type='text']");
		return element;
	}
	
	
	

	public static WebElement getC4() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//tr[4]/td[3]/div/input[@type='text']");
		return element;
	}
	
	
	
	
	public static WebElement getC5() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//tr[5]/td[3]/div/input[@type='text']");
		return element;
	}
	
	
	

	public static WebElement getC6() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//tr[6]/td[3]/div/input[@type='text']");
		return element;
	}
	
	
	
	
	public static WebElement getC7() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//tr[7]/td[3]/div/input[@type='text']");
		return element;
	}
	
	
	
	public static WebElement getC8() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//tr[8]/td[3]/div/input[@type='text']");
		return element;
	}
	
	
	
	
	public static WebElement getC9() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//tr[9]/td[3]/div/input[@type='text']");
		return element;
	}	
	
	
	
	
	public static WebElement getC10() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//tr[10]/td[3]/div/input[@type='text']");
		return element;
	}	
	
	
	
	public static WebElement getBTN_GUARDAR_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//*[@id='WControllervaadinservlet-1750660287']/div/div[2]/div[2]/div/div[2]/div/div[9]/div/div[1]/div/span/span" );
		return element;
	}	
	
	
	

	
	public static WebElement getMEN_ESTATUS_IN() throws Exception {
		WebElement element=null;
		element=  Controlador.IdentificadoresElement("xpath", "//*[@id='WControllervaadinservlet-1750660287-overlays']/div/div/div/p" );
		return element;
	}	
	
	
	
}
	

