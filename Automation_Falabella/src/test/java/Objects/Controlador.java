package Objects;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ErrorsAndEvidences.ExtentReport;
import Main.Driver;
import Main.Variables;
import Task.tFunciones;

public class Controlador {

	public static String Str_accion_global = "";
	public static String Str_entrada_global = "";
	public static String Str_entrada_adicional_global = "";
	
	public static void Scripting(String Str_accion, String Str_entrada, String Str_entrada_adicional, String str_detalle, WebElement ele_object, Select slc_object) throws Exception
	{
		Str_accion_global = Str_accion;
		Str_entrada_global = Str_entrada;
		Str_entrada_adicional_global = Str_entrada_adicional;

		try {
			switch (Str_accion.toLowerCase()) {
			case "navegador":
				tFunciones.Navegador(Str_entrada);
				break;	
			case "escribir":
				tFunciones.Escribir(Str_entrada,Str_entrada_adicional,ele_object);
				break;	
			case "click":
				tFunciones.Click(Str_entrada,ele_object);
				break;
			case "seleccionar":
				tFunciones.SeleccionarValor(Str_entrada,Str_entrada_adicional, slc_object);
				break;
			case "digitar":
				tFunciones.Digitar(Str_entrada,Str_entrada_adicional,ele_object);
				break;	
			case "escape":	
				tFunciones.TeclaEscape();
				break;	
			case "evidencia":
				tFunciones.CapturaPantalla();
				break;
			case "verificar":
				tFunciones.VerificarTexto(Str_entrada,ele_object);
				break;
			case "navegar":
				tFunciones.Navegar(Str_entrada);
				break;
			case "tiempoespera":
				tFunciones.TiempoEspera(Str_entrada); 
				break;
			case "dialogo":
				tFunciones.DialogoAceptar();
				break;
			case "guardar_valor":
				tFunciones.GuardarValor(Str_entrada_adicional);
				break;
			case "recursivo":
				tFunciones.recursivo(Str_entrada, Str_entrada_adicional);
				break;	
			}
			
		}catch(Exception e){
			System.out.println("No se pudo realizar la accion: " + e.getMessage());
			Variables.boolAction = 0;
			e.printStackTrace();
			Driver.CerrarNavegador();
		}
	}
	
	public static WebElement IdentificadoresElement(String Str_objeto, String Str_identificador) throws Exception
	{
		try {
			Variables.tipoidentificacion=Str_objeto;
			Variables.identificador=Str_identificador;
			switch (Str_objeto) {
			
			case "xpath":
					Variables.objeto = Variables.driver.findElement(By.xpath(Str_identificador));
					
				
			break;
					
			case "name":	
					Variables.objeto = Variables.driver.findElement(By.name(Str_identificador));
				
			break;
					
			case "id":	
					Variables.objeto = Variables.driver.findElement(By.id(Str_identificador));
				
			break;
			
			case "classname":	
					Variables.objeto = Variables.driver.findElement(By.className(Str_identificador));
								
			break;
			
			case "cssselector":	
					Variables.objeto = Variables.driver.findElement(By.cssSelector(Str_identificador));
					
			break;
				
			case "linktext":
				
					Variables.objeto = Variables.driver.findElement(By.linkText(Str_identificador));
					
			break;
			case "partiallinktext":					
				
					Variables.objeto = Variables.driver.findElement(By.partialLinkText(Str_identificador));
					
			break;
		
			case "tagname":					
					Variables.objeto = Variables.driver.findElement(By.tagName(Str_identificador));
					
			break;

			}
			
			
		}catch(Exception e){
			System.out.println("No se encontro el objeto: " + e.getMessage());
		}
		return Variables.objeto;
	}
	
	
	public static Select IdentificadoresCombobox(String Str_objeto,  String Str_identificador) throws Exception
	{
		try {
			Variables.tipoidentificacion=Str_objeto;
			Variables.identificador=Str_identificador;
			
			switch (Str_objeto) {
			
			case "xpath":
					Variables.objeto_Select = new Select(Variables.driver.findElement(By.xpath(Str_identificador)));
				
			break;
					
			case "name":	
					Variables.objeto_Select = new Select(Variables.driver.findElement(By.name(Str_identificador)));
				
			break;
					
			case "id":	
					Variables.objeto_Select = new Select(Variables.driver.findElement(By.id(Str_identificador)));
				
			break;
			
			case "classname":	
					Variables.objeto_Select = new Select(Variables.driver.findElement(By.className(Str_identificador)));
								
			break;
			
			case "cssselector":	
					Variables.objeto_Select = new Select(Variables.driver.findElement(By.cssSelector(Str_identificador)));
				
			break;
				
			case "linktext":
					Variables.objeto_Select = new Select(Variables.driver.findElement(By.linkText(Str_identificador)));
				
			break;
			case "partiallinktext":					
					Variables.objeto_Select = new Select(Variables.driver.findElement(By.partialLinkText(Str_identificador)));
					
			break;
		
			case "tagname":					
					Variables.objeto_Select = new Select(Variables.driver.findElement(By.tagName(Str_identificador)));
					
			break;

			}
			
			
			
		}catch(Exception e){
			System.out.println("No se encontro el objeto: " + e.getMessage());
		}
		return Variables.objeto_Select;
	}
	
	//Waits DinÃ¡micos por tipo
		public static void waits(WebElement Str_identificador, Select slc_identificador, String str_detalle_pass, String str_detalle_fail) throws Exception
		{	
			try {
//				Variables.objeto=Str_identificador;
				WebDriverWait wait= new WebDriverWait(Variables.driver, 60);
				
				switch (Variables.tipoidentificacion) {
				
				case "xpath":
//					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Str_identificador)));
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Variables.identificador)));
				break;
						
				case "name":	
					wait.until(ExpectedConditions.presenceOfElementLocated(By.name(Variables.identificador)));
				break;
						
				case "id":	
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Variables.identificador)));
					
				break;
				
				case "classname":	
					wait.until(ExpectedConditions.presenceOfElementLocated(By.className(Variables.identificador)));
								
				break;
				
				case "cssselector":	
					wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Variables.identificador)));
					
				break;
					
				case "linktext":
					wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(Variables.identificador)));
					
				break;
				case "partiallinktext":	
					wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(Variables.identificador)));
					
				break;
			
				case "tagname":
					wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(Variables.identificador)));
						
				break;
				
				}
//				Variables.objeto.sendKeys("");
				ExtentReport.tipoLog("imagen","PASS", str_detalle_pass);
				
				Driver.ExcelOutput("Exitoso",Driver.Columna("STR_RESULTADO")); 
				Driver.ExcelOutput(str_detalle_pass,Driver.Columna("STR_DETALLE")); 
				Driver.ExcelOutput("1",Driver.Columna("STATUS_CASE"));
				
			}catch(Exception e){
				System.out.println("No se encontro el objeto: " + e.getMessage());
				ExtentReport.tipoLog("imagen","FAIL", str_detalle_fail);
				Driver.ExcelOutput("Fallido",Driver.Columna("STR_RESULTADO")); 
				Driver.ExcelOutput(str_detalle_fail,Driver.Columna("STR_DETALLE")); 
				Driver.ExcelOutput("2",Driver.Columna("STATUS_CASE"));
				Driver.CerrarNavegador();	
			}
		}
		
		
		
		//Experimento
		
		public static void pantallaReport(String Str_detalle ) throws IOException, AWTException, InterruptedException {
			
		ExtentReport.tipoLogPDF(Str_detalle);
			
		}
		
		
		
		
		
		//Waits DinÃ¡micos por tipo
				public static boolean waitsDinamico(WebElement Str_identificador) throws Exception
				{	boolean validate=false;
					try {
						
						WebDriverWait wait= new WebDriverWait(Variables.driver, 5);
						
						switch (Variables.tipoidentificacion) {
						
						case "xpath":
//							wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Str_identificador)));
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Variables.identificador)));
						break;
								
						case "name":	
							wait.until(ExpectedConditions.presenceOfElementLocated(By.name(Variables.identificador)));
						break;
								
						case "id":	
							wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Variables.identificador)));
							
						break;
						
						case "classname":	
							wait.until(ExpectedConditions.presenceOfElementLocated(By.className(Variables.identificador)));
										
						break;
						
						case "cssselector":	
							wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Variables.identificador)));
							
						break;
							
						case "linktext":
							wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(Variables.identificador)));
							
						break;
						case "partiallinktext":	
							wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(Variables.identificador)));
							
						break;
					
						case "tagname":
							wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(Variables.identificador)));
								
						break;
						
						}
						
						
						validate=true;
						
					}catch(Exception e){
						System.out.println("No se encontro el objeto: " + e.getMessage());
						
						validate=false;
					}
					return validate;
				}
	
	public static void invisible(WebElement Str_identificador) throws Exception
	{
		try {
			//El tiempo de wait es en segundos
			WebDriverWait wait = new WebDriverWait(Variables.driver, 60);
			switch (Variables.tipoidentificacion) {
			
			case "xpath":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Variables.identificador)));
				
			break;
					
			case "name":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(Variables.identificador)));
			break;
					
			case "id":	
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(Variables.identificador)));
				
			break;
			
			case "classname":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(Variables.identificador)));
							
			break;
			
			case "cssselector":	
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Variables.identificador)));
				
			break;
				
			case "linktext":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(Variables.identificador)));
				
			break;
			case "partiallinktext":	
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(Variables.identificador)));
				
			break;
		
			case "tagname":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(Variables.identificador)));
					
			break;

			}	
		}catch(Exception e){
			System.out.println("No se encontro el objeto: " + e.getMessage());
		}
	}
	 // 5 seconds timeout
	
	
	//Función para capturar la data de la Web y pegarla al DataTable, respecto a la columna que pertenezca
    public static void guardarDatosDataTable(WebElement Str_identificador, String Str_attribute, String Str_cabeceraDataTable) throws Exception
    {
          try {
                 String a=null;
                 
                 switch (Variables.tipoidentificacion) {
                 
                 case "xpath":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.xpath(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.xpath(Variables.identificador)).getText());
                        }
                        
                 break;
                               
                 case "name": 
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.name(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.name(Variables.identificador)).getText());
                        }
                        
                 break;
                               
                 case "id":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.id(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.id(Variables.identificador)).getText());
                        }
                        
                        
                 break;
                 
                 case "classname":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.className(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.className(Variables.identificador)).getText());
                        }
                        
                                            
                 break;
                 
                 case "cssselector": 
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.cssSelector(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.cssSelector(Variables.identificador)).getText());
                        }
                        
                        
                 break;
                        
                 case "linktext":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.linkText(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.linkText(Variables.identificador)).getText());
                        }
                        
                 break;
                 
                 case "partiallinktext":   
                        if(Str_attribute.equals("value")) {
                             a=Variables.driver.findElement(By.partialLinkText(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.partialLinkText(Variables.identificador)).getText());
                        }
                        
                 break;
          
                 case "tagname":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.tagName(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.tagName(Variables.identificador)).getText());
                        }
                               
                 break;

                 }
                 Driver.ExcelOutput(a, Driver.Columna(Str_cabeceraDataTable));
                 
          }catch(Exception e){
                 System.out.println("No se encontro el objeto: " + e.getMessage());
          }
    }

	
    
    
    
    
    
    
  //Función para capturar la data de la Web y pegarla al DataTable, respecto a la columna que pertenezca
    public static String obtencionDatos(WebElement Str_identificador, String Str_attribute) throws Exception
    {String a=null;
          try {
                 
                 
                 switch (Variables.tipoidentificacion) {
                 
                 case "xpath":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.xpath(Variables.identificador)).getAttribute("value");
                        //}else if(Str_attribute.equals("td")) {
                        }else if(Str_attribute.equals(Str_attribute)) {
                               a = (String) (Variables.driver.findElement(By.xpath(Variables.identificador)).getText());
                        }
                        
                 break;
                               
                 case "name": 
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.name(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.name(Variables.identificador)).getText());
                        }
                        
                 break;
                               
                 case "id":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.id(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.id(Variables.identificador)).getText());
                        }
                        
                        
                 break;
                 
                 case "classname":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.className(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.className(Variables.identificador)).getText());
                        }
                        
                                            
                 break;
                 
                 case "cssselector": 
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.cssSelector(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.cssSelector(Variables.identificador)).getText());
                        }
                        
                        
                 break;
                        
                 case "linktext":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.linkText(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.linkText(Variables.identificador)).getText());
                        }
                        
                 break;
                 
                 case "partiallinktext":   
                        if(Str_attribute.equals("value")) {
                             a=Variables.driver.findElement(By.partialLinkText(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.partialLinkText(Variables.identificador)).getText());
                        }
                        
                 break;
          
                 case "tagname":
                        if(Str_attribute.equals("value")) {
                               a=Variables.driver.findElement(By.tagName(Variables.identificador)).getAttribute("value");
                        }else if(Str_attribute.equals("td")) {
                               a = (String) (Variables.driver.findElement(By.tagName(Variables.identificador)).getText());
                        }
                               
                 break;

                 }
                
                
                 
          }catch(Exception e){
                 System.out.println("No se encontro el objeto: " + e.getMessage());
          }
		return a;
		
    }
    
    
    public static String limiteReserva(String limiteReserva) {
    	String term= null;
    	String[] data = limiteReserva.toString().split(" Y ")[0].split(" ");
	    term = data[0];
	    return term;
    }
    
    
	public static void cerrarPestania() throws Exception
	{
		 Scripting("tiempoespera", "6", "","",null,null);
		
		 String originalHandle = Variables.driver.getWindowHandle();

		    //Do something to open new tabs

		    for(String handle : Variables.driver.getWindowHandles()) {
		        if (!handle.equals(originalHandle)) {
		        	Variables.driver.switchTo().window(handle);
		        	Variables.driver.close();
		        }
		    }

		 Variables.driver.switchTo().window(originalHandle);
		
		
	}
	
	public static void cambioPestania() {
		String originalHandle = Variables.driver.getWindowHandle();
		for(String handle : Variables.driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	        	Variables.driver.switchTo().window(handle);
	        }
	    }
	}
	
	public static void mouseHover(WebElement Str_identificador) throws Exception
	{
		try {
			Actions builder1;
			WebElement ele1;
			switch (Variables.tipoidentificacion) {
			
			case "xpath":
				
				ele1 = Variables.driver.findElement(By.xpath(Variables.identificador));
				builder1 = new Actions(Variables.driver);
				builder1.moveToElement(ele1).perform();
				
			break;
					
			case "name":	
				ele1 = Variables.driver.findElement(By.name(Variables.identificador));
				builder1 = new Actions(Variables.driver);
				builder1.moveToElement(ele1).perform();
			break;
					
			case "id":	
				ele1 = Variables.driver.findElement(By.id(Variables.identificador));
				builder1 = new Actions(Variables.driver);
				builder1.moveToElement(ele1).perform();
				
				
			break;
			
			case "classname":	
				ele1 = Variables.driver.findElement(By.className(Variables.identificador));
				builder1 = new Actions(Variables.driver);
				builder1.moveToElement(ele1).perform();
							
			break;
			
			case "cssselector":	
				ele1 = Variables.driver.findElement(By.cssSelector(Variables.identificador));
				builder1 = new Actions(Variables.driver);
				builder1.moveToElement(ele1).perform();
				
			break;
				
			case "linktext":
				ele1 = Variables.driver.findElement(By.linkText(Variables.identificador));
				builder1 = new Actions(Variables.driver);
				builder1.moveToElement(ele1).perform();
				
			break;
			case "partiallinktext":	
				ele1 = Variables.driver.findElement(By.partialLinkText(Variables.identificador));
				builder1 = new Actions(Variables.driver);
				builder1.moveToElement(ele1).perform();
				
			break;
		
			case "tagname":
				ele1 = Variables.driver.findElement(By.tagName(Variables.identificador));
				builder1 = new Actions(Variables.driver);
				builder1.moveToElement(ele1).perform();
					
			break;

			}
			
		}catch(Exception e){
			System.out.println("No se encontro el objeto: " + e.getMessage());
		}
	}
	
	public static void borrarDefaultTXTBOX(WebElement objeto) throws Exception
	{
		try {
			WebElement toClear = null;

			
			
			toClear = objeto;
			toClear.sendKeys(Keys.CONTROL + "a");
		}catch(Exception e){
			System.out.println("No se encontro el objeto: " + e.getMessage());
		}
	}
	
	
	
	
	

}
