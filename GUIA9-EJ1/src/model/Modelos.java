package model;

public class Modelos {

	private int codigoModelo;
	private String descripcionModelo;
	private Marcas marcas;
	
	public int getCodigoModelo() {
		return codigoModelo;
	}
	public void setCodigoModelo(int codigoModelo) {
		this.codigoModelo = codigoModelo;
	}
	public String getDescripcionModelo() {
		return descripcionModelo;
	}
	public void setDescripcionModelo(String descripcionModelo) {
		this.descripcionModelo = descripcionModelo;
	}
	public Marcas getMarcas() {
		return marcas;
	}
	public void setMarcas(Marcas marcas) {
		this.marcas = marcas;
	}
	
	public Modelos() {}
	
	public Modelos(int codigoModelo, String descripcionModelo, Marcas marcas) {
		super();
		this.codigoModelo = codigoModelo;
		this.descripcionModelo = descripcionModelo;
		this.marcas = marcas;
	} 
	
	
	
	
}
