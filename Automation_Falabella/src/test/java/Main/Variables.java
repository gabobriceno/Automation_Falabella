package Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Variables {

	//Variables para webdriver
	public static WebDriver driver;
	public static Actions actions;
	public static Action action;
	public static WebElement objeto;
	public static Select objeto_Select;
	public static WebElement objPerform;
    public static String OriginStyle = "";
	
	//Conexion a Base de Datos
    public static String Tipo_Aplicativo= null;
    public static String Str_Conexion= null;
    public static Connection Cnn = null;
    public static ResultSet Rst_Tabla = null;
    public static ResultSet Rst_Tabla1 = null;
    public static ResultSet Rst_Coordenadas = null;
    public static ResultSet Rst_Objetos = null;
    public static ResultSet Rst_QaPendientes = null;
    public static ResultSet Rst_evidencias = null;
    
    
    
    public static String Str_modulo=null;
    public static String Str_escenario=null;
    public static String Str_url=null;
    
    //Datos del Excel
    public static String login=null;
    public static Integer largo=0;
    public static Integer i=0;
    public static String ejecucion=null;
    
    //Datos del ExtentReport
    public static ExtentTest log=null;
    public static int inicioReport=0;
    public static String nombreAutor=null;
    
    //Datos para obtener el tipo e identificador
    public static String identificador=null;
    public static String tipoidentificacion=null;
    
    //Datos de la maquina
    public static String P_Str_NombreMaquina= null;
    public static Date dtFechaInicio= null;
    
    //Variable de Sistema
    public static String P_Str_IdEvidencia = null;
    public static String P_Str_Datos_Recursivo = null;
    public static String strTablaAnterior = null;
    public static String recursivo = null;
    public static Boolean blnpendiente=false;
    public static Date P_Entrada_Sistema= null;
    public static Date P_TiempoTotal_Sistema= null;
    public static Boolean P_Bln_IniciaScript= false;
    public static String P_STR_CASOS_EJECUTAR = null;
    public static String P_Str_Sistema= null;
    public static String P_Str_IdTabla= null;
    public static String P_Str_Tabla= null;
    public static String P_Str_Escenario= null;
    public static String P_Str_Ciclo= null;
    public static String P_Str_Iteracion= null;
    public static String P_Str_Nombre_Version= null;
    public static String Ruta_Evidencia= null;
    public static String Ruta_Aplicativo= null;
    public static String Vrb_VersionAplicativo= null;
    public static String P_Str_Datos= null;
    public static String P_Str_Script= null;
    public static Connection p_cnn = null;
    public static ResultSet Rst_Log = null;
    public static int P_Tipo_Log= 0;
    public static String Str_Navegador= null;
    public static String Descripcion_Acierto_Error= null;
    public static String P_Str_Desc_Acc_Ant= null;
    public static String P_Str_Desc_Err_Ant= null;
    public static int MSG_Informacion =3;
    public static int MSG_valido =1;
    public static int MSG_Error =2;
    public static int boolAction=0; 
	public static String StrComplementoDescripcion= "";
    public static ResultSet Rst_CasosEjecutados = null; 
    public static ResultSet Rst_Evidencia = null;
    public static String P_Vrb_Browser= null;
    public static String P_Str_Descripcion= null;
	public static int contSegCaso=0;
	public static int contSegFuncionalidad=0;
    public static int P_Int_TiempoTotalEjecucionOrg= 0; 
    public static int P_Int_TiempoTotalEjecucionDst= 0; 
    public static String P_Str_Tester= null;
    public static String P_Str_Arquitecto= null;
    public static int contador=1;
//    public static StringBuilder cadena_pasos = new StringBuilder();
}
