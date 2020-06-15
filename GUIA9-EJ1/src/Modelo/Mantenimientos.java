package Modelo;

import java.util.Calendar;

public class Mantenimientos {

	protected Calendar fechaMantenimiento;

	public Calendar getFechaMantenimiento() {
		return fechaMantenimiento;
	}

	public void setFechaMantenimiento(Calendar fechaMantenimiento) {
		this.fechaMantenimiento = fechaMantenimiento;
	}
	
	public Mantenimientos(){}

	public Mantenimientos(Calendar fechaMantenimiento) {
		super();
		this.fechaMantenimiento = fechaMantenimiento;
	}
	
	
}
