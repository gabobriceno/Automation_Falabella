package ErrorsAndEvidences;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;





import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import FuncionesReutilizablesGenerales.PrintScreen;
import Main.Driver;
import Main.Framework;
import Main.Variables;

public class ExtentReport {
	public static String ruta;
	public static ExtentTest logger;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	
	public static void generarHTML() {
		
		Variables.Ruta_Evidencia = Variables.Ruta_Aplicativo + "\\" + Variables.P_Str_Tabla + "\\" + Variables.Vrb_VersionAplicativo + "\\Reporte General\\";
		ruta = Variables.Ruta_Aplicativo;
		File directorio = new File( ruta );
		directorio.mkdirs();
	}
	

	public static void generarEvidencia(int iteracion) {
		
		String hora=null;
		String fecha=null;
		try {
			if(Variables.inicioReport==1) {
				generarHTML();
				fecha=Framework.Fecha(Variables.P_Entrada_Sistema);
				hora=Framework.Hora(Variables.P_Entrada_Sistema);
				reporter = new ExtentHtmlReporter(ruta +"\\Reporte_"+Variables.P_Str_Escenario.toLowerCase()+"_"+fecha+"_"+hora+".html");
				extent = new ExtentReports();
				String sSistemaOperativo = System.getProperty("os.name");
				extent.setSystemInfo("Hostname", Variables.P_Str_NombreMaquina);
				extent.setSystemInfo("Browser", Variables.P_Str_Sistema);
				extent.setSystemInfo("SO", sSistemaOperativo);
			}
			extent.attachReporter(reporter);
			
//			ParametrosOS BROWSER
//			extent.setSystemInfo("OS", OS);
			
			reporter.config().setChartVisibilityOnOpen(true);
			reporter.config().setDocumentTitle("Reporte"+Variables.P_Str_Escenario);
			reporter.config().setReportName("Reporte Generar");
			reporter.config().setTestViewChartLocation(ChartLocation.TOP);
			reporter.config().setTheme(Theme.STANDARD);
			reporter.config().setDocumentTitle("RIMAC Reporte_"+Variables.P_Str_Escenario);
			logger = extent.createTest(Variables.P_Str_Escenario+" - # "+Variables.i);
			logger.assignAuthor(Variables.nombreAutor);
			
			
		} catch (Exception e) {
			System.out.println("Error inesperado generando el resumen: " + e.getMessage());
			return;
		}
		
	}
	
	public static void tipoLog(String tipo,String status, String descripcion) throws IOException {
		switch (tipo.toLowerCase()) {
		case "imagen":
			String temp=Utility.getScreenshot(Variables.driver);
			
			if(status.equals("PASS")) {
				logger.pass(descripcion, MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			}else if(status.equals("FAIL")){
				logger.fail(descripcion, MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
				
			}
			break;
		case "normal":
			if(status.equals("PASS")) {
				logger.pass(descripcion);
			}else if(status.equals("FAIL")){
				logger.fail(descripcion);
				
			}
			break;
		}
		

		
		
//		String temp=Utility.getScreenshot(Variables.driver);
//		
//		if(status.equals("PASS")) {
//			logger.pass(descripcion);
//			logger.pass(descripcion, MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
//		}else if(status.equals("FAIL")){
//			logger.fail(descripcion, MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
//			
//		}
		extent.flush();
	}
	
	public static void tipoLogPDF(String descripcion1) throws AWTException, IOException, InterruptedException{
		String temp1=PrintScreen.capturarPantalla();
		logger.pass(descripcion1, MediaEntityBuilder.createScreenCaptureFromPath(temp1).build());
		extent.flush();
	}
	
	
	public static void RutaEvidencia(String ruta){ 	
		try{			

			File directorio = new File( ruta );
			directorio.mkdirs();

			directorio = new File( ruta + "\\" + "Images");
			directorio.mkdirs();
			
			directorio = new File( ruta + "\\" + "Casos");
			directorio.mkdirs();
			
			directorio = new File( ruta + "\\" + "General");
			directorio.mkdirs();
					
		}catch (Exception e){
			System.out.println("ERROR: No se pudo crear ruta de evidencias");			
		}
	}
	
//	public static void IngresoDatosLog()
//	{
//		// CREA LA RUTA DE EVIDENCIA
//		   Variables.Ruta_Evidencia = Variables.Ruta_Aplicativo + "\\" + Variables.P_Str_Tabla + "\\" + Variables.Vrb_VersionAplicativo + "\\" + Variables.P_Str_Ciclo + "\\";
//		   RutaEvidencia(Variables.Ruta_Evidencia);
//		
//		try
//		{
//			if ((Variables.P_Tipo_Log == 0 || Variables.boolAction == 0) && Variables.P_Tipo_Log < 2)
//	        {
//	        		Variables.P_Tipo_Log = 1;
//	        		Variables.boolAction = 1;
//	        }
//	     			
//		}catch(Exception ex)
//		{
//			System.out.println("Ocurrio un error en IngresoDatosLog: " + ex.getMessage());
//		}
//	}
	
	public static void ActualizarRegistroUtilizado(String opcion)
	{
		switch(opcion) {
		case "mysql":
			try
			{
				Variables.Cnn.prepareCall( "UPDATE " + Variables.P_Str_Datos + " SET UTILIZADO = -1, HORA = '" + Framework.FechaActual(new Date()) + "',TIEMPO_EJECUCION_CASO = " + Framework.DiferenciaFechas(new Date(), Variables.P_Entrada_Sistema) + " WHERE NRO_CASO = " + Variables.Rst_Tabla.getString("NRO_CASO")).execute();
				Variables.contSegCaso=Framework.DiferenciaFechas(new Date(), Variables.P_Entrada_Sistema);
			}catch (Exception ex){
				System.out.println("Error en Actualizar_RegistroUtilizado: " + ex.getMessage());
			}break;
			
		case "excel":
			try
			{	
				SimpleDateFormat sdf = new SimpleDateFormat("00:mm:SS");
				Driver.ExcelOutput(Framework.FechaActual(new Date()), Driver.Columna("HORA_INICIO_ITERACION"));
				Driver.ExcelOutput(String.valueOf(sdf.format(Framework.DiferenciaFechas(new Date(), Variables.P_Entrada_Sistema))), Driver.Columna("TIEMPO_EJECUCION_ITERACION"));
//				TIEMPO_EJECUCION_CASO = " + Framework.DiferenciaFechas(new Date(), Variables.P_Entrada_Sistema) + " WHERE NRO_CASO = " + Variables.Rst_Tabla.getString("NRO_CASO")).execute();
				System.out.println(new Date()+" , "+ Variables.P_Entrada_Sistema+" "+sdf.format(136));
				Variables.contSegCaso=Framework.DiferenciaFechas(new Date(), Variables.P_Entrada_Sistema);
			}catch (Exception ex){
				System.out.println("Error en Actualizar_RegistroUtilizado: " + ex.getMessage());
			}
		}
	}
	
//	public static void ValidaOrientacion(int BlnResultado)
//	{
//		try
//		{
//			if (BlnResultado == 1)
//			{
//				if (Variables.Rst_Tabla.getString("ACIERTO_ERROR").contentEquals("0"))
//					EvidenciaLog(0,"");
//				else
//					EvidenciaLog(1,"");
//			}
//			else
//			{
//				if (Variables.Rst_Tabla.getString("ACIERTO_ERROR").contentEquals("0"))
//					EvidenciaLog(1,"");
//				else
//					EvidenciaLog(0,"");
//			}
//		}catch(Exception ex)
//		{
//			EvidenciaLog(0,"");
//		}
//	}
	
//	public static void EvidenciaLog(int blnResultado, String Descripcion_Adicional )
//	{			
//		try
//		{			 
//			if ((blnResultado == 1))
//			{
//				Variables.Descripcion_Acierto_Error = (Variables.P_Str_Desc_Acc_Ant != null && !Variables.P_Str_Desc_Acc_Ant.equals("")) ? Variables.P_Str_Desc_Acc_Ant : Variables.Rst_Tabla.getString("DESCRIPCION_ACIERTO");
//				Variables.Cnn.prepareCall("Update " + Variables.P_Str_Tabla + "_d set EJECUCION_AC_ERR = 1 where NRO_CASO = " + Variables.Rst_Tabla.getString("NRO_CASO")).execute();
//				Variables.P_Tipo_Log = Variables.MSG_valido;
//				Variables.boolAction = 1;
//				Variables.P_Tipo_Log = 1;
//			}
//			else
//			{
//				Variables.Descripcion_Acierto_Error = ((Variables.P_Str_Desc_Err_Ant != null && !Variables.P_Str_Desc_Err_Ant.equals("")) ? Variables.P_Str_Desc_Err_Ant : Variables.Rst_Tabla.getString("DESCRIPCION_ERROR")) + (Descripcion_Adicional.contentEquals("") ? "" : "-" + Descripcion_Adicional)+" -> "+Variables.StrComplementoDescripcion;
//				Variables.Cnn.prepareCall("Update " + Variables.P_Str_Tabla + "_d set EJECUCION_AC_ERR = 0 where NRO_CASO = " + Variables.Rst_Tabla.getString("NRO_CASO")).execute();
//				Variables.P_Tipo_Log = Variables.MSG_Error;
//				Variables.boolAction = 0;
//				Variables.P_Tipo_Log = 2;
//			}
//		}catch(Exception ex)
//		{
//			System.out.println("Ocurrio un error en EvidenciaLog: " + ex.getMessage());
//		}
//	}
	
	public static void CADENA_PASOS2(String desc_paso) throws SQLException
	{		
		try
		{
			Statement pasos = Variables.Cnn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			if (!desc_paso.contentEquals("") && Variables.contador>1) {
				pasos.executeUpdate("UPDATE " + Variables.P_Str_Datos + "  SET DESIGN_STEPS = CONCAT(DESIGN_STEPS ,'" +Variables.contador+".- "+ desc_paso.replace("'", "''") + "</br>') WHERE NRO_CASO = " + Variables.Rst_Tabla.getString("NRO_CASO"));
				Variables.contador++;	
			}else {
				pasos.executeUpdate("UPDATE " + Variables.P_Str_Datos + "  SET DESIGN_STEPS = '" +Variables.contador+".- " + desc_paso.replace("'", "''") + "</br>' WHERE NRO_CASO = " +Variables.Rst_Tabla.getString("NRO_CASO"));
				Variables.contador++;
			}
		}catch (Exception ex){
			System.out.println("Error en Mdl_Evidenciamiento 1: " + ex.getMessage());
		}
	}
}
