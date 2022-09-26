package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	private Persona yo;
    private Persona vani;

    @BeforeEach
    public  void setUp() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String stringFecha = "06/10/1999";
        Date fecha = sdf.parse(stringFecha);

        stringFecha = "06/12/1989";
        Date fecha1 = sdf.parse(stringFecha);

        yo = new Persona("Micael", fecha);
        vani = new Persona("Vani", fecha1);
    }

    @Test
    public void edadTest(){
        assertEquals(22, yo.getEdad());
    }
    
    @Test
    
    public void menorQueTest() {
    	assertTrue(yo.menorQue(vani));
    }
}