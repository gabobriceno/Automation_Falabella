package Task;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;


import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ErrorsAndEvidences.ExtentReport;
import Main.Driver;
import Main.Framework;
import Main.Variables;

public class tFunciones {
	
	public static String desc_paso;
	
	public static void Navegador(String Str_entrada) {
		try {
			Variables.driver.get(Str_entrada);
			desc_paso = "Se ingreso a la web: "+Str_entrada;
//			Evidencias.CADENA_PASOS2(desc_paso);
			Variables.boolAction = 1;
		}catch(Exception e) {
			Variables.boolAction = 0;
            System.out.println("Error en Navegador: " + e.getMessage());
            e.printStackTrace();
		}
	}
	
	public static void Escribir(String Str_entrada,String str_elemento, WebElement ele_objeto) throws Exception {
		try {
			Variables.objeto=ele_objeto;
			Framework.highlightElement_on();
			Variables.objeto.sendKeys(Str_entrada);
			desc_paso = "Se escribio el valor: "+Str_entrada;
			
			Variables.boolAction = 1;
			Framework.highlightElement_off();	
			
			
			ExtentReport.tipoLog("normal","PASS", "Se realiz&oacute la escritura de manera correcta en la caja de texto :"+str_elemento);
			Driver.ExcelOutput("1",Driver.Columna("STATUS_CASE"));
		}catch(Exception e) {
			Variables.boolAction = 0;
			ExtentReport.tipoLog("imagen","FAIL", "Step fallido:");
            System.out.println("Error en Escribir: " + e.getMessage());
            Driver.ExcelOutput("2",Driver.Columna("STATUS_CASE"));
            e.printStackTrace();
		}
	}
	
	public static void Click(String Str_entrada_adicional,WebElement ele_objeto) throws Exception {
		try {
			Variables.objeto=ele_objeto;
			System.out.println("Después de variables.objeto=ele_objeto");
			
			//Framework.highlightElement_on();
			System.out.println("Después de ");
			Variables.objeto.click();
			desc_paso = "Se dio click en el Objeto: " + Str_entrada_adicional;
			
			Variables.boolAction = 1;
			//Framework.highlightElement_off();
			ExtentReport.tipoLog("normal","PASS", "Se di&oacute click en '"+ Str_entrada_adicional+"' de manera correcta");
			Driver.ExcelOutput("1",Driver.Columna("STATUS_CASE"));
		}catch(Exception e) {
			Variables.boolAction = 0;
			ExtentReport.tipoLog("imagen" ,"FAIL", "Step fallido con el botón '"+Str_entrada_adicional+"'");
            System.out.println("Error en Click: " + e.getMessage());
            Driver.ExcelOutput("2",Driver.Columna("STATUS_CASE"));
            e.printStackTrace();
		}
	}
	
	public static void Digitar(String Str_entrada, String str_elemento,WebElement ele_objeto) throws Exception {
		try {
			Variables.objeto=ele_objeto;
			Framework.highlightElement_on();
			Variables.objeto.click();
			String[] dato= Str_entrada.split("");
		    for(int i = 0 ; i < dato.length ; i++){
		    	Variables.objeto.sendKeys(dato[i]);
		    }
		    desc_paso = "Se digito el valor: "+Str_entrada;
//		    77
		    //Ver
//		    ExtentReport.CADENA_PASOS2(desc_paso);
		    ExtentReport.tipoLog("normal","PASS", "Se digit&oacute el texto en el objeto: "+str_elemento);
		    Driver.ExcelOutput("1",Driver.Columna("STATUS_CASE"));
			Variables.boolAction = 1;
			Framework.highlightElement_off();
		}catch (Exception e) {
			Variables.boolAction = 0;
			ExtentReport.tipoLog("imagen","FAIL", "Step fallido:");
            System.out.println("Error en Digitar: " + e.getMessage());
            Driver.ExcelOutput("2",Driver.Columna("STATUS_CASE"));
            e.printStackTrace();
		}
	}
	
	public static void SeleccionarValor(String Str_entrada, String str_elemento,Select ele_objeto) throws Exception {
		try {
			Variables.objeto_Select=ele_objeto;
//			highlightElement_on();
			Variables.objeto_Select.selectByVisibleText(Str_entrada);
			desc_paso = "Se selecciono el valor: "+Str_entrada;
//			77
//			ExtentReport.CADENA_PASOS2(desc_paso);
			ExtentReport.tipoLog("normal" ,"PASS", "Se seleccion&oacute la opci&oacuten en la caja de selecci&oacuten: "+str_elemento+", con resultado: "+Str_entrada);
			Driver.ExcelOutput("1",Driver.Columna("STATUS_CASE"));
			Variables.boolAction = 1;
//			highlightElement_off();
		}catch (Exception e) {
			Variables.boolAction = 0;
			ExtentReport.tipoLog("imagen" ,"FAIL", "Step fallido:");
            System.out.println("Error en Seleccionar Valor: " + e.getMessage());
            Driver.ExcelOutput("2",Driver.Columna("STATUS_CASE"));
            e.printStackTrace();
		}
	}
	
	public static void TeclaEscape() {
		try {
			Variables.objeto.sendKeys(Keys.ESCAPE);
			desc_paso = "Se presiono la tecla Escape";
			Variables.boolAction = 1;
		} catch (Exception e) {
			Variables.boolAction = 0;
            System.out.println("Error en Tecla Escape: " + e.getMessage());
            e.printStackTrace();
		}
	}
	
	public static void VerificarTexto(String Str_entrada, WebElement ele_objeto) {
		try {
			Variables.objeto=ele_objeto;
			Framework.highlightElement_on();
			String StrCompara = "";
			
			StrCompara=Variables.objeto.getText();
			int resultado=StrCompara.compareToIgnoreCase(Str_entrada);
			if(resultado==0) {
				desc_paso = "Se verifico correctamente el valor: " + StrCompara + " con el valor del DataDriven: " + Str_entrada;
				Variables.boolAction = 1;
			}else {
				desc_paso = "El valor: " + StrCompara + " no coincide con el valor del DataDriven: " + Str_entrada;
				Variables.boolAction = 0;
			}
			Framework.highlightElement_off();
		} catch (Exception e) {
			Variables.boolAction = 0;
            System.out.println("Error en Verificar Texto: " + e.getMessage());
            e.printStackTrace();
		}
	}
	
	public static void Navegar(String Str_entrada) {
		try {
			Variables.driver.navigate().to(Str_entrada);
			desc_paso = "Se ingreso la siguiente URL: "+ Str_entrada;
			Variables.boolAction = 1;
		} catch (Exception e) {
			Variables.boolAction = 0;
            System.out.println("Error en Navegar: " + e.getMessage());
            e.printStackTrace();
		}
	}
	
	public static void TiempoEspera(String Tiempo) {
		try {
			Thread.sleep (Integer.parseInt(Tiempo)*1000);
//			Variables.driver.manage().timeouts().implicitlyWait(Integer.parseInt(Tiempo),TimeUnit.SECONDS);
		} catch (Exception e) {
            System.out.println("Error en Tiempo de espera: " + e.getMessage());
            e.printStackTrace();
		}	
	}
	
	public static void DialogoAceptar() {
		try {
			Alert alert = Variables.driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			Variables.boolAction = 0;
			System.out.println("Error en Dialogo Aceptar: " + e.getMessage());
            e.printStackTrace();
		}
	}

	public static void GuardarValor(String Str_entrada_adicional) {
		String strValorCapturado = "";
		String strSQLaux = "";
		String casos_ejecutar  = "";	
		try {
			strValorCapturado = Variables.objeto.getText();
			String [] bocking = strValorCapturado.split(" ");
			strSQLaux = "UPDATE " + Variables.P_Str_Datos + " SET " + Str_entrada_adicional + " = '" + bocking[2]
					+ "'  where NRO_CASO =" + Variables.Rst_Tabla.getString("NRO_CASO");
			Variables.Cnn.prepareCall(strSQLaux).execute();
			Variables.boolAction = 1;
			
			if (!Variables.P_STR_CASOS_EJECUTAR.equals("")){
    			casos_ejecutar = " AND NRO_CASO IN (" + Variables.P_STR_CASOS_EJECUTAR + ") ";
    		}
			Variables.Rst_Tabla1 = Variables.Cnn.prepareStatement("SELECT * FROM " + Variables.P_Str_Datos + " where UPPER(ESTADO_CASO) ='ACTIVO' " + casos_ejecutar + " ORDER BY NRO_CASO").executeQuery();
		}catch(Exception e) {
			Variables.boolAction = 0;
            System.out.println("Error en Guardar Valor: " + e.getMessage());
            e.printStackTrace();
		}
	}
	
	public static void CapturaPantalla() 
	{	
		
		try {

		    Robot robot = new Robot();  
		    BufferedImage image = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));  
		     
		    ImageIO.write(image, "png", new File(Variables.Ruta_Evidencia + "\\Images\\" + Variables.i +"_"+ Framework.ObtenerFecha().replace("/", "").replace(":", "").replace(" ", "")+".png"));
		    Thread.sleep(1000);
		} catch (Exception e) 
		{
			System.out.println("Error tomando la captura de la pantalla en: " + Variables.Ruta_Evidencia + e.getMessage());
			Variables.boolAction = 0;
		}
	}
	
	public static void recursivo(String Str_Tabla, String Numero_Caso) {
        try {
               Variables.recursivo="recursivo";
               Variables.P_Str_Datos_Recursivo = Variables.P_Str_Datos;
               Variables.strTablaAnterior = Variables.P_Str_Tabla;
               String EscenarioAnterior = Variables.P_Str_Escenario;
               Variables.P_Str_IdEvidencia = Variables.Rst_Tabla.getString("NRO_CASO");
               Variables.P_Str_Desc_Acc_Ant = Variables.Rst_Tabla.getString("DESCRIPCION_ACIERTO");
               Variables.P_Str_Desc_Err_Ant = Variables.Rst_Tabla.getString("DESCRIPCION_ERROR");
               
               if (Numero_Caso.toLowerCase().contains("nro")) {
//                      String nombre_Caso = Numero_Caso.substring(3,Numero_Caso.length());
                      Numero_Caso=Variables.Rst_Tabla.getString(Numero_Caso);
               }
               
               Variables.P_Str_Tabla = Str_Tabla;
               int IdTabla = Integer.parseInt( Variables.P_Str_IdTabla);
               Variables.Rst_Tabla.close();
               Variables.Rst_Tabla = Variables.Cnn.createStatement().executeQuery("SELECT * FROM " + Str_Tabla + "_d WHERE NRO_CASO = " + Numero_Caso + " ORDER BY NRO_CASO");
               Variables.P_Str_Datos = Str_Tabla + "_d";
               String [] escenario= Str_Tabla.split("tsoft_");
               Variables.P_Str_Escenario=escenario[1];
               
               while (Variables.Rst_Tabla.next()){
                    	  switch (Str_Tabla) {
                    	  
							case "tsoft_login":
								tRegistrarValorCuota.registroCuota();
//								GenerarPrestamoAprobado.auditoriaPedido();
								break;
							}
               }
               Variables.Rst_Tabla.close();
               Variables.P_Str_Tabla = Variables.strTablaAnterior;
               Variables.P_Str_Escenario = EscenarioAnterior;

               String[] prt_str_tabla2 = Variables.P_Str_Tabla.split("_");
               String pra_str_tabla2 = "";
               if(prt_str_tabla2.length>2) {
                      for(int i=1;i<prt_str_tabla2.length;i++) {
                             pra_str_tabla2 += prt_str_tabla2[i].toLowerCase()+"_";
                      }
                      pra_str_tabla2=pra_str_tabla2.substring(0,pra_str_tabla2.length()-1);
               }else {
                      pra_str_tabla2 = prt_str_tabla2[1].toLowerCase();
               }
               
               Variables.Rst_Tabla = Variables.Cnn.createStatement().executeQuery("SELECT * FROM " + Variables.P_Str_Tabla +"_d WHERE UTILIZADO <= 0 AND UPPER( ESTADO_CASO) ='ACTIVO' ORDER BY NRO_CASO");
               Variables.Rst_Tabla.first();
               Variables.Rst_Tabla.previous();
               Variables.P_Str_IdTabla = IdTabla+"";
               Variables.P_Str_Datos = Variables.P_Str_Tabla + "_d";
               Variables.Rst_Tabla.next();
               Variables.recursivo="";
               
        }catch (Exception e) {
               Variables.boolAction = 0;
               System.out.println("Error en recursivo: " + e.getMessage());
        }
  }

}
