package Modelo;

import java.util.Calendar;
import java.util.TreeSet;

public class Reparaciones extends Mantenimientos{

	private TreeSet<Partes> partes;

	public TreeSet<Partes> getPartes() {
		return partes;
	}

	public void setPartes(TreeSet<Partes> partes) {
		this.partes = partes;
	}
	
	public Reparaciones() {}
	
	public Reparaciones(TreeSet<Partes> partes, Calendar fechaMantenimiento) {
		super(fechaMantenimiento);
		this.partes = partes;
	}
	
	
}
