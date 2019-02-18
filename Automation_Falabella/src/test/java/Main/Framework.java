package Main;

import java.io.File;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import ErrorsAndEvidences.ExtentReport;
import Task.tFunciones;
import Task.tGenerarPrestamoAprobado;
import Task.tGenerarRescateAprobado;
import Task.tGenerarRetiroAprobado;
import Task.tGenerarSiniestro;
import Task.tRegistrarValorCuota;


public class Framework {
	
	
	public static void Schedule(String tipo,int j)
	{
		
			Variables.blnpendiente = false;
			switch (tipo) {
			case "mysql":
				try
				{	
					java.net.InetAddress InfoSistema = java.net.InetAddress.getLocalHost();
				    Variables.P_Str_NombreMaquina =InfoSistema.getHostName();
				    Variables.P_Entrada_Sistema =new Date();
				    Variables.P_TiempoTotal_Sistema =new Date();
				    
					Variables.Rst_QaPendientes = Variables.Cnn.prepareCall("SELECT * FROM ma_ejecucion A INNER JOIN ma_escenario B ON A.ID_ESCENARIO = B.ID_ESCENARIO WHERE upper(MAQUINA)='" + Variables.P_Str_NombreMaquina.trim().toUpperCase() + "' AND (A.EJECUTAR = 'TRUE' OR A.EVIDENCIA = 'TRUE') ORDER BY DATA_EXEC, HORA_EXEC, ID").executeQuery();
					
					if (Variables.Rst_QaPendientes.next()) {
						if (DateCompare(new Date(),Variables.Rst_QaPendientes.getString("DATA_EXEC") + " " + Variables.Rst_QaPendientes.getString("HORA_EXEC")) == false)
			            {
							Variables.blnpendiente = true;
			            	Variables.dtFechaInicio = new Date();
			            	Variables.P_Bln_IniciaScript = Variables.Rst_QaPendientes.getBoolean("EJECUTAR");
			            	Variables.Cnn.prepareCall( "UPDATE ma_ejecucion SET EJECUTAR = 'FALSE', EVIDENCIA = 'FALSE', EJECUTADO = 'TRUE' WHERE ID = " + Variables.Rst_QaPendientes.getString("ID")).execute();
			            	Variables.P_STR_CASOS_EJECUTAR = CasosSchedule(Variables.Rst_QaPendientes.getString("CASOS"), ",", "-");       
			            	Variables.P_Str_Sistema = Variables.Rst_QaPendientes.getString("NAVEGADOR");
			            	Variables.Str_modulo = Variables.Rst_QaPendientes.getString("CODIGO_MODULO");
			            	Variables.Str_escenario = Variables.Rst_QaPendientes.getString("NOMBRE_ESCENARIO");
			            	Variables.P_Str_IdTabla = Variables.Rst_QaPendientes.getString("ID_ESCENARIO");
			            	Variables.P_Str_Escenario = Variables.Rst_QaPendientes.getString("NOMBRE_ESCENARIO");
			            	Variables.P_Str_Tabla = Variables.Rst_QaPendientes.getString("CODIGO_MODULO") + "_" + Variables.Rst_QaPendientes.getString("NOMBRE_ESCENARIO");
			            	Variables.P_Str_Ciclo = Variables.Rst_QaPendientes.getString("ITERACION");
			            	Variables.P_Str_Nombre_Version = Variables.Rst_QaPendientes.getString("VERSION");
			            	
			            	Variables.Rst_evidencias = Variables.Cnn.prepareCall("SELECT * FROM ma_escenario WHERE CODIGO_MODULO='" + Variables.Rst_QaPendientes.getString("CODIGO_MODULO") + "'").executeQuery();
			            	
			            	if (Variables.Rst_evidencias.next() == true) {
			            	Variables.Ruta_Aplicativo = Variables.Rst_evidencias.getString("RUTA_EVIDENCIAS");
			            	}
			            	
				        }else{
				        	Variables.blnpendiente = false;
				        }
			         }else{
				        	Variables.blnpendiente = false;
				        }
				}catch (Exception ex){
					Variables.blnpendiente = false;
					System.out.println("Error en Schedule: " + ex.getMessage());
					ex.printStackTrace();
				}
				break;

			case "excel":
				try
				{
					java.net.InetAddress InfoSistema = java.net.InetAddress.getLocalHost();
				    Variables.P_Str_NombreMaquina =InfoSistema.getHostName();
				    Variables.P_Entrada_Sistema =new Date();
				    Variables.dtFechaInicio = new Date();
				    Variables.P_TiempoTotal_Sistema =new Date();
				    Variables.P_Bln_IniciaScript =  Boolean.valueOf(Driver.getData(j, Driver.Columna("EJECUTAR"),Variables.ejecucion));
	            	if(Variables.P_Bln_IniciaScript==true) {
	            		if(Variables.inicioReport==0) {
	            			Variables.inicioReport=1;
	            		}else {Variables.inicioReport=2;}
	            		if(DateCompare(new Date(), Driver.getData(j, Driver.Columna("HORA_INICIO_ITERACION"),Variables.ejecucion))==false) {
				    	Variables.blnpendiente = true;
				    	//Actualizar el estado de EjecuciÃ³n a FALSO
		            	Driver.ExcelOutput("FALSE",0); 
		            	Variables.P_Str_Nombre_Version = Driver.getData(j, Driver.Columna("VERSION"),Variables.ejecucion);
		            	Variables.P_Str_Ciclo = String.valueOf(Variables.i);
		            	Variables.P_Str_Iteracion=String.valueOf(Driver.contadorInf());
		            	Variables.P_Str_Sistema=Driver.getData(j, Driver.Columna("NAVEGADOR"),Variables.ejecucion);
		            	Variables.P_Str_Escenario = Driver.getData(j, Driver.Columna("NOMBRE_ESCENARIO"),Variables.ejecucion);
		            	Variables.Str_url=Driver.getData(j, Driver.Columna("URL"),Variables.ejecucion);
		            	Variables.Ruta_Aplicativo = Driver.getData(j, Driver.Columna("RUTA_EVIDENCIA"),Variables.ejecucion);
		            }
		            	else {	
		            		Variables.blnpendiente = false;
		            		Driver.ExcelOutput("0",Driver.Columna("STATUS_CASE"));
		            	}
				    }
	            	    else {	
	            	    	Variables.blnpendiente = false;
	            	    	Driver.ExcelOutput("0",Driver.Columna("STATUS_CASE"));
	            	    }
				}catch (Exception ex){
					Variables.blnpendiente = false;
					System.out.println("Error en Schedule: " + ex.getMessage());
					ex.printStackTrace();
				}
				break;
			}
			
		
			
		
		
	}
	
	public static void IniciarRobot(String opcion ,String Ciclo_Funcional , String Version_Aplicativo)
    {
		String casos_ejecutar  = "";
		ExtentReport.generarEvidencia(Driver.contadorInf());
		switch(opcion) {
		case "excel":
			try
	    	{
	    		Variables.P_Str_Ciclo = Ciclo_Funcional;                                         
	    		Variables.Vrb_VersionAplicativo = Version_Aplicativo;  
	    	
	            Variables.largo = Driver.contadorInf();

				
//		    	while (Variables.i>Variables.largo) 
//		        {  		
		        	Variables.P_Entrada_Sistema = new Date();
		        	Variables.P_Str_Tabla = "Test_LOGIN";
		        	
		        	Variables.Ruta_Evidencia = Variables.Ruta_Aplicativo + "\\" + Variables.P_Str_Tabla + "\\" + Variables.Vrb_VersionAplicativo + "\\" + Variables.P_Str_Ciclo + "\\";
					ExtentReport.RutaEvidencia(Variables.Ruta_Evidencia);
					EliminarEvidencia(opcion);
		         	
		            	Variables.P_Tipo_Log = 0;            	

		            		Driver.AbrirNavegador(Variables.P_Str_Sistema);
		            			switch(Variables.P_Str_Escenario.toLowerCase()){
			            		
								case "all":
									if(Variables.ejecucion.equals("ALL")) {
									
										tRegistrarValorCuota.registroCuota();
										tGenerarPrestamoAprobado.generaPrestamo();
										tGenerarRescateAprobado.generaRescate();
										tGenerarRetiroAprobado.generaRetiro();
										tGenerarSiniestro.generaSiniestro();
									}
									break;	
									
									
									case "registrarvalorcuota":
										if(Variables.ejecucion.equals("1")) {
										tRegistrarValorCuota.registroCuota();}
									break;
										
									
									case "generarprestamoaprobado":
										if(Variables.ejecucion.equals("2")) {
										tGenerarPrestamoAprobado.generaPrestamo();}
									break;
										
									
									case "generarrescateaprobado":
										if(Variables.ejecucion.equals("3")) {
										tGenerarRescateAprobado.generaRescate();}
									break;
									
									
									case "generarretiroaprobado":
										if(Variables.ejecucion.equals("4")) {
										tGenerarRetiroAprobado.generaRetiro();}
									break;
									
									
									case "generarsiniestro":
										if(Variables.ejecucion.equals("5")) {
										tGenerarSiniestro.generaSiniestro();}
									
									break;
								default:
									System.out.println("No existe ningun escenario en los registros, verifique que fue declarado correctamente");
									break;
			            		}        	
		            			
		                	tFunciones.CapturaPantalla();
//		            		Evidencias.ValidaOrientacion(Variables.boolAction);
//		            		Evidencias.IngresoDatosLog();
		                	ExtentReport.ActualizarRegistroUtilizado(opcion);
		                	Driver.CerrarNavegador();	          
//		        }	
	    	}catch (Exception ex){
	    		System.out.println("Error al iniciar el robot: " + ex.getMessage());
	    	}break;
	    	
		case "mysql":
			try
	    	{
	    		Variables.P_Str_Ciclo = Ciclo_Funcional;                                         
	    		Variables.Vrb_VersionAplicativo = Version_Aplicativo;  
	    	
	    		if (!Variables.P_STR_CASOS_EJECUTAR.equals("")){
	    			casos_ejecutar = " AND NRO_CASO IN (" + Variables.P_STR_CASOS_EJECUTAR + ") ";
	    		}

	    		Variables.P_Str_Datos = Variables.P_Str_Tabla.toLowerCase() + "_d";                                   
	    		System.out.println("SELECT * FROM " + Variables.P_Str_Datos + " where UPPER(ESTADO_CASO) ='ACTIVO' " + casos_ejecutar + " ORDER BY NRO_CASO");
	            Variables.Rst_Tabla = Variables.Cnn.prepareStatement("SELECT * FROM " + Variables.P_Str_Datos + " where UPPER(ESTADO_CASO) ='ACTIVO' " + casos_ejecutar + " ORDER BY NRO_CASO").executeQuery();
	        	Variables.Rst_Log =Variables.Cnn.prepareStatement("SELECT ID_ESCENARIO, ID, ITERACION FROM ma_ejecucion WHERE ID_ESCENARIO = '" + Variables.P_Str_IdTabla + "'").executeQuery();
				
		    	while ( Variables.Rst_Tabla.next()) 
		        {  		
		        	Variables.P_Entrada_Sistema = new Date();
		        	Variables.Ruta_Evidencia = Variables.Ruta_Aplicativo + "\\" + Variables.P_Str_Tabla + "\\" + Variables.Vrb_VersionAplicativo + "\\" + Variables.P_Str_Ciclo + "\\";
					ExtentReport.RutaEvidencia(Variables.Ruta_Evidencia);
					EliminarEvidencia(opcion);
		         	
		            	Variables.P_Tipo_Log = 0;            	

		            		Driver.AbrirNavegador(Variables.P_Str_Sistema);
		            			switch(Variables.P_Str_Escenario.toLowerCase()){
			            		
//			            		case "registro":
//									Pantallas.registro();;
//									break;
//								case "reserva_vuelo":
//									Pantallas.reserva_vuelo();;
//									break;
								case "login":
									tRegistrarValorCuota.registroCuota();
//									GenerarPrestamoAprobado.auditoriaPedido();
//									
									break;
								default:
									System.out.println("No existe ningun escenario en los registros, verifique que fue declarado correctamente");
			            		}        	
		            			
		                	tFunciones.CapturaPantalla();
//		            		Evidencias.ValidaOrientacion(Variables.boolAction);
//		            		Evidencias.IngresoDatosLog();
		                	ExtentReport.ActualizarRegistroUtilizado(opcion);
		                	Driver.CerrarNavegador();	          
		        }	
	    	}catch (Exception ex){
	    		System.out.println("Error al iniciar el robot: " + ex.getMessage());
	    	}break;
		}
    	
	 }
	
	// Funciones especiales para el schedule
	public static boolean DateCompare (Date date, String Date2) throws ParseException
	{
        DateFormat datehourFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date a = datehourFormat.parse(datehourFormat.format(date));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dte = sdf.parse(Date2);
        return dte.after(a);
	}
	
	public static String FechaActual(Date fecha) throws ParseException {
		
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formateador.format(fecha);
	}
	
	public static String Fecha(Date fecha) throws ParseException {
		
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		return formateador.format(fecha);
	}
	
	public static String Hora(Date hora) throws ParseException {
		
		SimpleDateFormat formateador = new SimpleDateFormat("HH_mm_ss");
		return formateador.format(hora);
	}
	
	public static int DiferenciaFechas(java.util.Date fecha1, java.util.Date fecha2){
		   java.util.Date fechaMayor = null;
		   java.util.Date fechaMenor = null;
		 
		   if (fecha1.compareTo(fecha2) > 0){
		    fechaMayor = fecha1;
		    fechaMenor = fecha2;
		   }else{
		    fechaMayor = fecha2;
		    fechaMenor = fecha1;
		   }
		 
		   long diferenciaMils = fechaMayor.getTime() - fechaMenor.getTime();
		   long segundos = diferenciaMils / 1000;
		   	 
		   return (int) (segundos);
	}
	
	public static String CasosSchedule(String dato, String sep1, String sep2)
	    {
	    	String[] strAuxDato ;
	    	String[] strAuxDatoSep2;
	    	int x, y;
	    	String tmpCasos = "";
	    	String datoResult = "";
	    	
	    	datoResult = dato.trim();
	    	
	    	if (datoResult.length() > 0)
	    	{
	    		strAuxDato = dato.split(sep1);
	    		datoResult = "";
	    		
	    		for(x = 0 ; x < strAuxDato.length ; x++)
	    		{
	    			tmpCasos = "";
	    			
	    			if (strAuxDato[x].indexOf(sep2) != -1 )
	    			{
	    				strAuxDatoSep2 = strAuxDato[x].trim().split(sep2);
	    					    				
	    					if (Integer.parseInt(strAuxDatoSep2[0]) <= Integer.parseInt(strAuxDatoSep2[1]) )
	    					{
	    						
	    						for ( y = Integer.parseInt(strAuxDatoSep2[0]); y <= Integer.parseInt(strAuxDatoSep2[1]); y++)
	    						{
	    								tmpCasos = tmpCasos + "," + Integer.toString(y);
	    						}
	    						
                         	tmpCasos = tmpCasos.substring(1, tmpCasos.length());
	    					}	
                         else
                         {
                         		tmpCasos = "0";
                         }
	    			}
	    			else {
	    				
	    				tmpCasos = strAuxDato[x].trim();
                  }
					datoResult = datoResult +","+ tmpCasos;		
	    		}
	    	}
	    	datoResult = datoResult.substring(1, datoResult.length());
			return datoResult;
		}

	public static void setAttribute(WebElement element, String attributeName, String value) {
		  JavascriptExecutor js = (JavascriptExecutor) Variables.driver;
		  js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, attributeName, value);
		}
	
	public static void highlightElement_on() {
			try{
				//Foco
	        	Variables.objeto.sendKeys("");      	
	        	System.out.println("después del sendkeys");
				//HighLight
				Variables.OriginStyle = Variables.objeto.getAttribute("style");
	        	System.out.println("después del getAtribute");
				setAttribute(Variables.objeto, "style", "color: yellow; border: 3px solid #00FF00; background: #dbff87;");
	        	System.out.println("después del setAtribute");
				Thread.sleep(100);
				  
			}catch(Exception ex){
				System.out.println("Error en highlightElement_on");
			}

		}
		
	public static void highlightElement_off() {
			try{
				    	    
				setAttribute(Variables.objeto, "style", Variables.OriginStyle);	 
				  
			}catch(Exception ex){
				
			}

		}
		
	public static String ObtenerFecha()
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String HoraActual = dateFormat.format(cal.getTime());
		HoraActual = dateFormat.format(cal.getTime());
		return HoraActual;
	}
	
	public static void EliminarEvidencia(String opcion) throws SQLException
	{		
		
		File dir = new File(Variables.Ruta_Evidencia + "\\Images");
		String[] ficheros = dir.list();
		
		for (int x=0;x<ficheros.length;x++){
			if( ficheros[x].compareTo("Thumbs.db")!=0){	
			switch(opcion){
			case "mysql":
		    	if(ficheros[x].substring(0,ficheros[x].indexOf("_")).compareTo(Variables.Rst_Tabla.getString("NRO_CASO"))==0){	    		
		    		
		    		File ficheroDelete = new File(Variables.Ruta_Evidencia + "\\Images\\" + ficheros[x]);
		    		ficheroDelete.delete();
		    	}break;
		    	
			case "excel":
				if(ficheros[x].substring(0,ficheros[x].indexOf("_")).compareTo(String.valueOf(Variables.i))==0){	    		
						    		
					File ficheroDelete = new File(Variables.Ruta_Evidencia + "\\Images\\" + ficheros[x]);
					ficheroDelete.delete();
				}break;
			}
			}
		}		
	}
}
