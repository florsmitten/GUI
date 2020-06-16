package model.DAO;

import java.io.*;
import java.util.*;
import model.Marcas;

public class MarcasDAO {

	  private static final String directorio = "C:\\\\Users\\\\Flor\\\\git\\\\GUIA9-EJ1\\\\src\\\\resources\\";

	  public static TreeSet<Marcas> bajarMarcasTXT() {

		  TreeSet<Marcas> marca = new TreeSet<Marcas>();
	      try {
	          File archivo = new File( directorio + "Marcas.txt");
	          if (archivo.exists()){
	              Scanner leerArchivoMarcas = new Scanner(archivo);
	              ArrayList<String> marcasST = new ArrayList<String>();

	              //Guardar contenido en String
	              while (leerArchivoMarcas.hasNext()) {
	                  String lineaActual = leerArchivoMarcas.nextLine();
	                  marcasST.add(lineaActual);
	              }

	              // Guardar objetos
	              int i = 0;
	              for (String s : marcasST) {
	            	  
	            	  String [] marcaST = s.split("\t");
	            	  
	            	  int codigoMarca = Integer.parseInt(marcaST[0]);
	            	  String descripcionMarca = marcaST[1];
	            	  
	            	  marca.add(new Marcas(codigoMarca, descripcionMarca));
	              }

	              leerArchivoMarcas.close();
	          }

	      } catch (IOException e) {
	          e.printStackTrace();
	      }

	      return marca;
	  }
}
