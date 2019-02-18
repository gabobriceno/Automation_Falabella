package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.safari.*;
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	static XSSFWorkbook wb;
	
	static XSSFSheet sheet1;
	static String ExcelURL="D:\\Data\\LoginTest.xlsx";
	//static String ExcelURL1="D:\\Data\\LoginTest1.xlsx";
	
	static String ExcelURL1="D:\\Automation_Falabella\\Datos\\RegistrarValorCuota.xlsx";
	static String ExcelURL2="D:\\Automation_Falabella\\Datos\\GenerarPrestamoAprobado.xlsx";
	static String ExcelURL3="D:\\Automation_Falabella\\Datos\\GenerarRescateAprobado.xlsx";
	static String ExcelURL4="D:\\Automation_Falabella\\Datos\\GenerarRetiroAprobado.xlsx";
	static String ExcelURL5="D:\\Automation_Falabella\\Datos\\GenerarSiniestro.xlsx";
	
	@SuppressWarnings("deprecation")
	public static void AbrirNavegador(String Str_navegador) throws Exception
	{
		try {
			switch (Str_navegador.toLowerCase()) {
			
			case "safari":
				Variables.driver = new SafariDriver();			              
			break;
					
			case "chrome":	
				System.setProperty("webdriver.chrome.driver", "D:\\Automation_Falabella\\Drivers\\chromedriver.exe ");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");		
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);							  
				Thread.sleep(500);  // Let the user actually see something!
				Variables.driver = new ChromeDriver(capabilities);
			break;
					
			case "firefox":					
				System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
				Variables.driver = new FirefoxDriver();	
				Variables.driver.manage().window().maximize();          
			break;
		
			}	
		}catch(Exception e){
			System.out.println("Ocurrio un problema al abrir el navegador: " + e.getMessage());
			e.printStackTrace();
		}
							
	}
	
	public static void CerrarNavegador() throws IOException
    {
		 Variables.driver.close();
		 Variables.driver.quit();
    }
	
	public static void ConexionBD(String Str_TipoBasedeDatos, String Str_Servidor, String Str_DataBase, String Str_Usuario, String Str_Password) throws Exception
	{
		Variables.ejecucion=Str_Servidor;
		switch (Str_TipoBasedeDatos)
	    {
//		    case "mysql":
//		    	String Str_Url = Str_Servidor + Str_DataBase;
//		    	MysqlDataSource mysqlDS = null;
//		    	mysqlDS = new MysqlDataSource ();
//				mysqlDS.setURL(Str_Url);
//				mysqlDS.setUser(Str_Usuario);
//				mysqlDS.setPassword(Str_Password);
//		    	try {
//		    		Variables.Cnn = mysqlDS.getConnection();
//		    	} catch (SQLException e) {
//		    		e.printStackTrace();
//		    		DesconectarBD();
//		    		JOptionPane.showMessageDialog(null, "MYSQL: La conexión a la BD del robot ha fallado!");
//		    		System.exit(0);			    		
//		    	}
//		    break;
		    
		    case "excel":
		        if(Variables.ejecucion.equals("1")) {
		        	String Exc_Url = ExcelURL1;
			    	try {
						File src= new File(Exc_Url);
						FileInputStream fis= new FileInputStream(src);
						wb=new XSSFWorkbook(fis);
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
						System.exit(0);	
					}
		        }
		        else if(Variables.ejecucion.equals("2")) {
		        	String Exc_Url = ExcelURL2;
			    	try {
						File src= new File(Exc_Url);
						FileInputStream fis= new FileInputStream(src);
						wb=new XSSFWorkbook(fis);
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
						System.exit(0);	
					}
		        }
		        else if(Variables.ejecucion.equals("3")) {
		        	String Exc_Url = ExcelURL3;
			    	try {
						File src= new File(Exc_Url);
						FileInputStream fis= new FileInputStream(src);
						wb=new XSSFWorkbook(fis);
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
						System.exit(0);	
					}
		        }
		        else if(Variables.ejecucion.equals("4")) {
		        	String Exc_Url = ExcelURL4;
			    	try {
						File src= new File(Exc_Url);
						FileInputStream fis= new FileInputStream(src);
						wb=new XSSFWorkbook(fis);
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
						System.exit(0);	
					}
		        }
		        else if(Variables.ejecucion.equals("5")) {
		        	String Exc_Url = ExcelURL5;
			    	try {
						File src= new File(Exc_Url);
						FileInputStream fis= new FileInputStream(src);
						wb=new XSSFWorkbook(fis);
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
						System.exit(0);	
					}
		        }
		    	break;
		    }
	}
	
	public static Integer contadorInf() {
		int rowcount = 0;
		
			sheet1=wb.getSheetAt(0);
			rowcount=sheet1.getLastRowNum();
		
			
			
		return rowcount;
		
	}
	
	//Obtener la data de una celda específica del Excel
	public static String getData(int i, int j, String ejec) {
		String data=null;
		
			sheet1=wb.getSheetAt(0);
			data=sheet1.getRow(i).getCell(j).getStringCellValue();
			
		return data;
	}
	
	
	
	//Escribir o actualizar en una celda del Excel
	public static void ExcelOutput(String estado, int j) throws Exception{
		File src;
		FileInputStream fis;
		FileOutputStream fos;
		
		switch (Variables.ejecucion) {
		
		
		case "1":
			src= new File(ExcelURL1);
			fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);

			sheet1.getRow(Variables.i).createCell(j).setCellValue(estado);
			fos= new FileOutputStream(src);
			
			wb.write(fos);
			break;
		
		case "2":
			src= new File(ExcelURL2);
			fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);

			sheet1.getRow(Variables.i).createCell(j).setCellValue(estado);
			fos= new FileOutputStream(src);
			
			wb.write(fos);
			break;
			
		case "3":
			src= new File(ExcelURL3);
			fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);

			sheet1.getRow(Variables.i).createCell(j).setCellValue(estado);
			fos= new FileOutputStream(src);
			
			wb.write(fos);
			break;
			
		case "4":
			src= new File(ExcelURL4);
			fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);

			sheet1.getRow(Variables.i).createCell(j).setCellValue(estado);
			fos= new FileOutputStream(src);
			
			wb.write(fos);
			break;
		case "5":
			src= new File(ExcelURL5);
			fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);

			sheet1.getRow(Variables.i).createCell(j).setCellValue(estado);
			fos= new FileOutputStream(src);
			
			wb.write(fos);
			break;	
			
		default:
			System.out.println("D�gitos incorrectos.");
			break;
		}	
		
		}
	
	public static void ExcelAntoher(Date date) throws Exception{
		String fecha;
		String hora;
		File src;
		FileInputStream fis;
		FileOutputStream fos;
		
		switch (Variables.ejecucion) {
			
		case "1":
			fecha=Framework.Fecha(date);
			hora=Framework.Hora(date);
			src = new File(ExcelURL1);
			fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
			fos= new FileOutputStream(new File("D:\\Data\\data\\Resultado de ejecucion - "+fecha+" "+hora+".xlsx"));
			wb.write(fos);
			break;
		case "2":
			fecha=Framework.Fecha(date);
			hora=Framework.Hora(date);
			src = new File(ExcelURL2);
			fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
			fos= new FileOutputStream(new File("D:\\Data\\data\\Resultado de ejecucion - "+fecha+" "+hora+".xlsx"));
			wb.write(fos);
			break;
		case "3":
			fecha=Framework.Fecha(date);
			hora=Framework.Hora(date);
			src = new File(ExcelURL3);
			fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
			fos= new FileOutputStream(new File("D:\\Data\\data\\Resultado de ejecucion - "+fecha+" "+hora+".xlsx"));
			wb.write(fos);
			break;
		case "4":
			fecha=Framework.Fecha(date);
			hora=Framework.Hora(date);
			src = new File(ExcelURL4);
			fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
			fos= new FileOutputStream(new File("D:\\Data\\data\\Resultado de ejecucion - "+fecha+" "+hora+".xlsx"));
			wb.write(fos);
			break;
		case "5":
			fecha=Framework.Fecha(date);
			hora=Framework.Hora(date);
			src = new File(ExcelURL5);
			fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
			fos= new FileOutputStream(new File("D:\\Data\\data\\Resultado de ejecucion - "+fecha+" "+hora+".xlsx"));
			wb.write(fos);
			break;
		}
	}
	
	//Permite obtener el número de la columna del Excel en el que se encuentra posicionado el elemento
	public static int Columna(String nombre) {
		int columnIndex=0;
		File src;
		FileInputStream fis;
		DataFormatter fmt;
		switch (Variables.ejecucion) {
		
		case "1":
			try {
				src= new File(ExcelURL1);
				fis= new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
				sheet1=wb.getSheetAt(0);
				
				fmt = new DataFormatter();
				for (Row r : sheet1) {
				   for (Cell c : r) {
				       if (nombre.equals(fmt.formatCellValue(c))) {
				          columnIndex = c.getColumnIndex();
				          
				       }
				   }
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}break;
		case "2":
			try {
				src= new File(ExcelURL2);
				fis= new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
				sheet1=wb.getSheetAt(0);
				
				fmt = new DataFormatter();
				for (Row r : sheet1) {
				   for (Cell c : r) {
				       if (nombre.equals(fmt.formatCellValue(c))) {
				          columnIndex = c.getColumnIndex();
				          
				       }
				   }
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}break;
		case "3":
			try {
				src= new File(ExcelURL3);
				fis= new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
				sheet1=wb.getSheetAt(0);
				
				fmt = new DataFormatter();
				for (Row r : sheet1) {
				   for (Cell c : r) {
				       if (nombre.equals(fmt.formatCellValue(c))) {
				          columnIndex = c.getColumnIndex();
				          
				       }
				   }
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}break;
		case "4":
			try {
				src= new File(ExcelURL4);
				fis= new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
				sheet1=wb.getSheetAt(0);
				
				fmt = new DataFormatter();
				for (Row r : sheet1) {
				   for (Cell c : r) {
				       if (nombre.equals(fmt.formatCellValue(c))) {
				          columnIndex = c.getColumnIndex();
				          
				       }
				   }
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}break;
		case "5":
			try {
				src= new File(ExcelURL5);
				fis= new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
				sheet1=wb.getSheetAt(0);
				
				fmt = new DataFormatter();
				for (Row r : sheet1) {
				   for (Cell c : r) {
				       if (nombre.equals(fmt.formatCellValue(c))) {
				          columnIndex = c.getColumnIndex();
				          
				       }
				   }
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}break;
		}
		return columnIndex;
	}
		
	
		

	public static void DesconectarBD()
    {
    	try
    	{	
	    	Variables.Rst_Tabla.close();
          	Variables.Rst_Coordenadas.close();
        	Variables.Rst_Objetos.close();
        	Variables.Cnn.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }  
		
}
