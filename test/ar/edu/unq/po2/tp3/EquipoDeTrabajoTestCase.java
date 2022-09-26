package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	private PersonaConApellido yo;
	private PersonaConApellido vani;
	private PersonaConApellido persona3;
	private PersonaConApellido persona4;
	private PersonaConApellido persona5;
	
	@BeforeEach
    public  void setUp() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String stringFechaYo = "06/10/1999";
        Date fecha = sdf.parse(stringFechaYo);

        String stringFechaVani = "06/12/1989";
        Date fecha2 = sdf.parse(stringFechaVani);
        
        String stringFechaPersona3 = "06/10/1991";
        Date fecha3 = sdf.parse(stringFechaPersona3);

        String stringFechaPersona4 = "06/12/1982";
        Date fecha4 = sdf.parse(stringFechaPersona4);

        String stringFechaPersona5 = "06/10/1996";
        Date fecha5 = sdf.parse(stringFechaPersona5);

        yo = new PersonaConApellido("Micael", fecha, "Goitea");
        vani = new PersonaConApellido("Vani", fecha2, "Gutierrez");
        persona3 = new PersonaConApellido("Viviana", fecha3, "Blasko");
        persona4 = new PersonaConApellido("Jose", fecha4, "Gomez");
        persona5 = new PersonaConApellido("Gustavo", fecha5, "Perez");  
    }
	
	@Test
	void equipoDeTrabajoConoceSuNombre() {
		 EquipoDeTrabajo nuevoEquipoDeTrabajo = new EquipoDeTrabajo();
		 nuevoEquipoDeTrabajo.setNombreEquipo("TeamMike");
		 nuevoEquipoDeTrabajo.añadirPersona(yo);
		 nuevoEquipoDeTrabajo.añadirPersona(vani);
		 nuevoEquipoDeTrabajo.añadirPersona(persona3);
		 nuevoEquipoDeTrabajo.añadirPersona(persona4);
		 nuevoEquipoDeTrabajo.añadirPersona(persona5);
		 
		 assertEquals(nuevoEquipoDeTrabajo.getNombreEquipo(), "TeamMike");
	}
	
	@Test
	void equipoDeTrabajoConoceSuCantidadDeIntegrantes() {
		 EquipoDeTrabajo nuevoEquipoDeTrabajo = new EquipoDeTrabajo();
		 nuevoEquipoDeTrabajo.setNombreEquipo("TeamMike");
		 nuevoEquipoDeTrabajo.añadirPersona(yo);
		 nuevoEquipoDeTrabajo.añadirPersona(vani);
		 nuevoEquipoDeTrabajo.añadirPersona(persona3);
		 nuevoEquipoDeTrabajo.añadirPersona(persona4);
		 nuevoEquipoDeTrabajo.añadirPersona(persona5);
		 
		 assertEquals(nuevoEquipoDeTrabajo.getIntegrantes().size(), 5);
	}

	@Test
	void equipoDeTrabajoTestCase() {
		 EquipoDeTrabajo nuevoEquipoDeTrabajo = new EquipoDeTrabajo();
		 nuevoEquipoDeTrabajo.setNombreEquipo("TeamMike");
		 nuevoEquipoDeTrabajo.añadirPersona(yo);
		 nuevoEquipoDeTrabajo.añadirPersona(vani);
		 nuevoEquipoDeTrabajo.añadirPersona(persona3);
		 nuevoEquipoDeTrabajo.añadirPersona(persona4);
		 nuevoEquipoDeTrabajo.añadirPersona(persona5);
		 
		 assertEquals(nuevoEquipoDeTrabajo.promedioDeEdades(), 29);
		 System.out.println(nuevoEquipoDeTrabajo.promedioDeEdades());
	}
}