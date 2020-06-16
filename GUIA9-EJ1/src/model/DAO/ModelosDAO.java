package model.DAO;

import java.io.*;
import java.util.*;
import model.Marcas;
import model.Modelos;

public class ModelosDAO {

	  private static final String directorio = "C:\\\\Users\\\\Flor\\\\git\\\\GUIA9-EJ1\\\\src\\\\resources\\";

	  public static ArrayList<Modelos> bajarModelosTXT(TreeSet<Marcas> marcas) {

		  ArrayList<Modelos> modelo = new ArrayList<Modelos>();
	      try {
	          File archivo = new File( directorio + "Modelos.txt");
	          if (archivo.exists()){
	              Scanner leerArchivoModelos = new Scanner(archivo);
	              ArrayList<String> modelosST = new ArrayList<String>();

	              //Guardar contenido en String
	              while (leerArchivoModelos.hasNext()) {
	                  String lineaActual = leerArchivoModelos.nextLine();
	                  modelosST.add(lineaActual);
	              }

	              // Guardar objetos
	              int i = 0;
	              for (String s : modelosST) {
	            	  
	            	  String [] modeloST = s.split("\t");
	            	  
	            	  int codigoMarca = Integer.parseInt(modeloST[0]);
	            	  int codigoModelo = Integer.parseInt(modeloST[1]);
	            	  String descripcionModelo = modeloST[2];
	            	  
	            	  Marcas marcaAux = agregarMarca(marcas, codigoMarca);
	            	  
	            	  modelo.add(new Modelos(codigoModelo, descripcionModelo, marcaAux));
	              }

	              leerArchivoModelos.close();
	          }

	      } catch (IOException e) {
	          e.printStackTrace();
	      }

	      return modelo;
	  }
	  
	  public static Marcas agregarMarca(TreeSet<Marcas> marcas, int codigoMarca) {
		  
	   Marcas marca;
   	   Marcas marcaAux = null;
       Iterator<Marcas> mar = marcas.iterator();
       while (mar.hasNext()) {
   	     marca = mar.next();
         
          if (marca.getCodigoMarca() == codigoMarca) {
       	   marcaAux = marca;
              break;
          }
       }
	   return marcaAux;
	  }
}
