package Service;

import java.util.Random;

import Entidades.Estudiante;

public class EstudianteService {
    
    Random random = new Random();

    public Estudiante nuevoEstudiante() {

        Estudiante est = new Estudiante();
        est.setNombre("Eduardo");
        est.setApellido("Pereda");
        est.setNumID(random.nextInt(3001) + 1000);
        est.setEstadoCivil("Soltero");
        est.setCurso("FullStack");

        return est;
    }

    public void cambiarEC(Estudiante est) {

        est.cambiarEstadoCivil(est);

    }

    public void cambioCurso(Estudiante est) {

        est.nuevoCurso(est);

    }

}
