package Main;

import javax.swing.JOptionPane;





public class App 
{

    public static void main(String[] args) throws Exception
    {

    	int dialogo = JOptionPane.showConfirmDialog( null,"Esta por dar inicio al Robot de Pruebas. Desea continuar?","ROBOT",JOptionPane.YES_NO_OPTION);
    	
    	
    	while(true) {
    		if (dialogo == 0){
    			Variables.nombreAutor=JOptionPane.showInputDialog("Ingrese nombre del ejecutor.");
    			String opEjecucion = JOptionPane.showInputDialog("Ingrese una opción a ejecutar (Ingresar exactamente como se detalla en la siguiente lista) \n 1 = Registrar Valor Cuota \n 2 = Generar Prestamo Aprobado \n 3 = Generar Rescate Aprobado \n 4 = Generar Retiro Aprobado \n 5 = Generar Siniestro \n ALL = Todo el flujo").toLowerCase();
    			
    			if(opEjecucion.equals("all")){
    				//Para la ejecución de todos los flujos (Actualmente son 5 flujos)
	    			 for(int j=1;j<6;j++) {
		       			 if(Variables.Cnn == null) 
			       		 {
		       				 
		       				 String opcion=String.valueOf(j);
		       				JOptionPane.showMessageDialog(null, "valor de j: "+opcion);
		       				 Driver.ConexionBD("excel", opcion, "", "", "");
		//	       			 Driver.ConexionBD("mysql", "jdbc:mysql://localhost:3306/", "autofast", "root", "");
			       		 }
		       			 
		       			 JOptionPane.showMessageDialog(null, j +" "+Driver.getData(j, Driver.Columna("NOMBRE_ESCENARIO"),Variables.ejecucion));
		       			 System.out.println("\n---------Iniciando el flujo de '"+Driver.getData(j, Driver.Columna("NOMBRE_ESCENARIO"),Variables.ejecucion)+"'---------\n");
		       			for(int i=1;i<=Driver.contadorInf();i++) {
			       			System.out.println("Iniciando iteracion "+i);
							Variables.i=i;
			       		    Framework.Schedule("excel",i);
			       		
				       		 if(Variables.blnpendiente==true) {
				       			 
				       			Framework.IniciarRobot("excel",Variables.P_Str_Ciclo,Variables.P_Str_Nombre_Version);    			
					       		    		
				       		 }
			       		 }
		       			Driver.ExcelAntoher(Variables.dtFechaInicio);
		       			System.out.println("Proceso Finalizado '"+Variables.P_Str_Escenario+"', Se finaliza las "+Driver.contadorInf()+" iteraciones de manera correcta");
	       			 }
			       		System.exit(0);
   		}else if(opEjecucion.equals("1") || opEjecucion.equals("2") || opEjecucion.equals("3") || opEjecucion.equals("4") || opEjecucion.equals("5")) {
   			if(Variables.Cnn == null) 
	       		 {
	       			 Driver.ConexionBD("excel", opEjecucion, "", "", "");
//	       			 Driver.ConexionBD("mysql", "jdbc:mysql://localhost:3306/", "autofast", "root", "");
	       		 }System.out.println("\n---------Iniciando el flujo de '"+Driver.getData(1, Driver.Columna("NOMBRE_ESCENARIO"),Variables.ejecucion)+"'---------\n");
   			for(int i=1;i<=Driver.contadorInf();i++) {
	       			System.out.println("Iniciando iteracion "+i);
					Variables.i=i;
	       		    Framework.Schedule("excel",i);
	       		
		       		 if(Variables.blnpendiente==true) {
		       			 
		       			Framework.IniciarRobot("excel",Variables.P_Str_Ciclo,Variables.P_Str_Nombre_Version);    			
			       		    		
		       		 }
	       		 }
   			Driver.ExcelAntoher(Variables.dtFechaInicio);
	       		System.out.println("\nProceso Finalizado '"+Variables.P_Str_Escenario+"', Se finaliza las "+Driver.contadorInf()+" iteraciones de manera correcta");
	       		System.exit(0);
   			
   		}else {
   			System.out.println("\nOpciones inválidas...Proceso Cancelado...");
   			System.exit(0);
	       		 }
	       	}else {
   			System.out.println("\nProceso Cancelado...");
   			System.exit(0);
   		}
   	}
    }   
}			
    			
    			
    			
    			
    			
//	       		 if(Variables.Cnn == null) 
//	       		 {
//	       			 Driver.ConexionBD("excel", opEjecucion, "", "", "");
////	       			 Driver.ConexionBD("mysql", "jdbc:mysql://localhost:3306/", "autofast", "root", "");
//	       		 }
//	       		for(int i=1;i<=Driver.contadorInf();i++) {
//	       			System.out.println("Iniciando iteracion "+i);
//					Variables.i=i;
//	       		    Framework.Schedule("excel",i);
//	       		
//		       		 if(Variables.blnpendiente==true) {
//		       			 
//		       			Framework.IniciarRobot("excel",Variables.P_Str_Ciclo,Variables.P_Str_Nombre_Version);    			
//		       		
//		       		 }
//	       		 }
//	       		System.out.println("Proceso Finalizado, Se finaliza las "+Driver.contadorInf()+" iteraciones de manera correcta");
//	       		System.exit(0);
//	       		
//    		}else {
//    			System.out.println("\nProceso Cancelado...");
//    			System.exit(0);
//    		}
//    	}
//    	
//    }
//}
