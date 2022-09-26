package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
	
public class Persona {
	
	private String nombre;
	private Date fechaNacimiento;
	
	public Persona(String nombre, Date fechaNacimiento) {
			super();
			this.setNombre(nombre);
			this.setFechaNacimiento(fechaNacimiento);
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
	public String getNombre() {
			return this.nombre;
	}
	
	public int getEdad() {
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = this.getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Long edad = ChronoUnit.YEARS.between(nacimiento, hoy);
        return Integer.valueOf(edad.toString());
    }

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}