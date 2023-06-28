package Service;

import java.util.Random;

import Entidades.PersonalMant;
import Enums.Area;

public class PersMatService {
    
    Random random = new Random();

    public PersonalMant crearPersonalMant() {

        PersonalMant persMant = new PersonalMant();
        persMant.setNombre("Rodri");
        persMant.setApellido("Alvarez");
        persMant.setNumID(random.nextInt(3001) + 1000);
        persMant.setEstadoCivil("Soltero");
        persMant.setArea(Area.biblioteca);
        persMant.setAnioIncorporacion(random.nextInt(2024 - 2000) + 2000);
        persMant.setNumdespacho(random.nextInt(11) + 1);

        return persMant;
    }

    public void cambiarECPM(PersonalMant persMant) {

        persMant.cambiarEstadoCivil(persMant);

    }

    public void reasigDespPM(PersonalMant persMant) {

        persMant.reasignacionDespacho(persMant);

    }

    public void cambioSecc(PersonalMant persMant) {

        persMant.nuevaSeccion(persMant);

    }

}
