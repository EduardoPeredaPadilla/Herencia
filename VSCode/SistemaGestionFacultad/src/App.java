import java.util.ArrayList;

import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalMant;
import Entidades.Profesor;
import Service.EstudianteService;
import Service.PersMatService;
import Service.ProfesorService;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        ArrayList<Persona> personas = new ArrayList<>();

        EstudianteService estServ = new EstudianteService();
        Estudiante est = estServ.nuevoEstudiante();
        personas.add(est);

        ProfesorService porfServ = new ProfesorService();
        Profesor prof = porfServ.nuevoProfesor();
        personas.add(prof);

        PersMatService pMServ = new PersMatService();
        PersonalMant persMant = pMServ.crearPersonalMant();
        personas.add(persMant);

        System.out.println("");
        System.out.println("--------------- LISTA DE PERSONAS -------------");
        System.out.println("");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
            System.out.println("");
        }

        
        System.out.println("");

        System.out.println("");
        System.out.println("--------------- LISTA DE PERSONAS (Después de correr métodos de reasignación) -------------");
        System.out.println("");

        estServ.cambiarEC(est);
        porfServ.cambiarECP(prof);
        pMServ.cambiarECPM(persMant);

        estServ.cambioCurso(est);
        porfServ.reasigDespacho(prof);
        porfServ.cambioDepartamento(prof);
        pMServ.reasigDespPM(persMant);
        pMServ.cambioSecc(persMant);

        for (Persona persona : personas) {
            System.out.println(persona.toString());
            System.out.println("");
        }

    }
}
