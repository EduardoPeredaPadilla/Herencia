package Service;

import java.util.Random;

import Entidades.Profesor;
import Enums.Departamento;

public class ProfesorService {
    
    Random random = new Random();

    public Profesor nuevoProfesor() {

        Profesor prof = new Profesor();
        prof.setNombre("Rodri");
        prof.setApellido("Alvarez");
        prof.setNumID(random.nextInt(3001) + 1000);
        prof.setEstadoCivil("Soltero");
        prof.setDepartamento(Departamento.arquitectura);
        prof.setAnioIncorporacion(random.nextInt(2024 - 2000) + 2000);
        prof.setNumdespacho(random.nextInt(11) + 1);

        return prof;
    }

    public void cambiarECP(Profesor prof){

        prof.cambiarEstadoCivil(prof);

    }

    public void reasigDespacho(Profesor prof) {

        prof.reasignacionDespacho(prof);

    }

    public void cambioDepartamento(Profesor prof) {

        prof.cambioDepto(prof);

    }

}
