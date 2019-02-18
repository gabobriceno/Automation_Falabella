package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ologin {
	
	
	
	
	public static WebElement getTXT_USERNAME() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='SecurityLogin']");
		return element;
	}

	public static WebElement getTXT_PASSWORD() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='SecurityPassword']");
		return element;
	}
	
	public static WebElement getBTN_LOG_IN() throws Exception {
		WebElement element=null;
		element= Controlador.IdentificadoresElement("xpath", "//input[@name='SecuritySubmit']");
		return element;
	}
	
	public static Select getCMB_INTANCIA() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "/html/body/table/tbody/tr[4]/td[2]/select");
		return element;
	}
	
	public static Select getCMB_LANGUAGE() throws Exception {
		Select element=null;
		element= Controlador.IdentificadoresCombobox("xpath", "/html/body/table/tbody/tr[5]/td[2]/select");
		return element;
	}
	



}