package model.DAO;

import java.io.*;
import java.util.*;
import Controller.AutosControlador;
import model.Autos;
import view.Validaciones;

public class MantenimientosDAO {

	  private static final String directorio = "C:\\\\Users\\\\Flor\\\\git\\\\GUIA9-EJ1\\\\src\\\\resources\\";

	  public static ArrayList<Autos> bajarModelosTXT(ArrayList<Autos> autos) {

	      try {
	          File archivo = new File( directorio + "Mantenimientos.txt");
	          if (archivo.exists()){
	              Scanner leerArchivoMantenimientos = new Scanner(archivo);
	              ArrayList<String> mantenimientosST = new ArrayList<String>();

	              //Guardar contenido en String
	              while (leerArchivoMantenimientos.hasNext()) {
	                  String lineaActual = leerArchivoMantenimientos.nextLine();
	                  mantenimientosST.add(lineaActual);
	              }

	              // Guardar objetos
	              int i = 0;
	              for (String m : mantenimientosST) {
	            	  
	            	  String [] mantenimientoST = m.split(";");
	            	  
	            	  String patente = mantenimientoST[0];
	            	  
	            	  char codigoModelo = (mantenimientoST[1]).charAt(0);
	            	  
	            	  String fecha = mantenimientoST[2];
	                  Calendar fechaMantenimiento = Calendar.getInstance();
	                  fechaMantenimiento = Validaciones.convertirAFechaCalendar(fecha);
	      
	            	  double costo = Double.parseDouble(mantenimientoST[3]);
	            	  
	            	  if(codigoModelo == 'R') {
	            		  
	            		  //String [] partes = mantenimientoST[4];
	            		  //VER COMO PROCESAR ESTO
	            	  }
	            	  
	            	  Autos auto = AutosControlador.buscarAudiovisual(patente, autos);
	            	  
                      if (auto != null) {
                        
                        auto.setMantenimientos(fechaMantenimiento);
                        //VER COMO PROCESAR UNA COMPOSICION CON HERENCIA
                      }
	              }

	              leerArchivoMantenimientos.close();
	          }

	      } catch (IOException e) {
	          e.printStackTrace();
	      }

	      return autos;
	  }
}
