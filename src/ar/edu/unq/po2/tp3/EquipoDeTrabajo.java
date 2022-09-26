package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombreEquipo;
	private List<PersonaConApellido> integrantes = new ArrayList<PersonaConApellido>() ;
	
	public void añadirPersona(PersonaConApellido unaPersona) {
		integrantes.add(unaPersona);
	}
	
	public int promedioDeEdades() {
		var totalDeEdad = 0;
		for (PersonaConApellido persona : integrantes) {
			totalDeEdad = totalDeEdad + persona.getEdad();
		}
		return totalDeEdad / integrantes.size();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public List<PersonaConApellido> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<PersonaConApellido> integrantes) {
		this.integrantes = integrantes;
	}
}