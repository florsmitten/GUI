package model.DAO;

import java.io.*;
import java.util.*;
import model.Autos;
import model.Modelos;
import view.Validaciones;

public class AutosDAO {

  private static final String directorio = "C:\\\\Users\\\\Flor\\\\git\\\\GUIA9-EJ1\\\\src\\\\resources\\";

  public static ArrayList<Autos> bajarAutosTXT(ArrayList<Modelos> modelo) {

      ArrayList<Autos> auto = new ArrayList<Autos>();
      try {
          File archivo = new File( directorio + "Autos.txt");
          if (archivo.exists()){
              Scanner leerArchivoAutos = new Scanner(archivo);
              ArrayList<String> autosST = new ArrayList<String>();

              //Guardar contenido en String
              while (leerArchivoAutos.hasNext()) {
                  String lineaActual = leerArchivoAutos.nextLine();
                  autosST.add(lineaActual);
              }

              // Guardar objetos
              int i = 0;
              for (String s : autosST) {
            	  
            	  auto.get(i).setPatente(s.substring(0,8).toUpperCase());
            	  
            	  String fecha =s.substring(18,26);
                  Calendar fechaPatentamiento = Calendar.getInstance();
                  fechaPatentamiento = Validaciones.convertirAFechaCalendar(fecha);
                  auto.get(i).setFechaPatentamiento(fechaPatentamiento);
                  
                  auto.get(i).setPrecioCompra(Double.parseDouble(s.substring(26,36)));
                  
                  auto.get(i).setTipoCombustible(s.substring(36,37).charAt(0));
                  
                  auto.get(i).setEquipoMultimedia(Boolean.parseBoolean(s.substring(37,42)));
                  
                  auto.get(i).setAireAcondicionado(Boolean.parseBoolean(s.substring(42,47)));
                  
                  auto.get(i).setGps(Boolean.parseBoolean(s.substring(47,52)));
                 
                  int codigoMarca = Integer.parseInt(s.substring(8,13));
                  int codigoModelo = Integer.parseInt(s.substring(13,18)); 
                  agregarModeloMarca(auto, modelo, codigoMarca, codigoModelo, i);
              }

              leerArchivoAutos.close();
          }

      } catch (IOException e) {
          e.printStackTrace();
      }

      return auto;
  }
  
  
  public static void agregarModeloMarca(ArrayList<Autos> auto, ArrayList<Modelos> modelo, int codigoMarca, int codigoModelo, int i) {
	  
	  for(Modelos m : modelo) {
		  
		  if(codigoModelo == m.getCodigoModelo() && codigoMarca == m.getMarcas().getCodigoMarca()) {
			  
			  auto.get(i).setModelos(m);
			  break;
		  }			
	  }
	  
  }
}