package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int getEdad() {
		 LocalDate hoy = LocalDate.now();   
		 LocalDate nacimiento = this.getFechaDeNacimiento().toInstant().
		           atZone(ZoneId.systemDefault()).toLocalDate(); 
		 Long edad = ChronoUnit.YEARS.between(nacimiento, hoy);
		 
	return Integer.valueOf(edad.toString());
	}
	
	public boolean menorQue (Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
	public Persona(String nombre, Date fechaDeNacimiento) { // Constructor
		super();
		this.setNombre(nombre);
		this.setFechaDeNacimiento(fechaDeNacimiento);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}