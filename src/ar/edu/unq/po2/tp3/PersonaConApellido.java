package ar.edu.unq.po2.tp3;

import java.util.Date;

public class PersonaConApellido extends Persona {
	
	public PersonaConApellido(String nombre, Date fechaNacimiento, String apellido) {
		super(nombre, fechaNacimiento);
		this.setApellido(apellido);
	}

	private String apellido;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}