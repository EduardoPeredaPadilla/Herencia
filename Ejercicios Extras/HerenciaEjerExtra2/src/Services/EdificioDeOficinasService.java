package Services;

import Entidades.EdificioDeOficinas;
import java.util.Random;
import java.util.Scanner;

public class EdificioDeOficinasService {
    
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    
    public EdificioDeOficinas crearEdifDeOficinas() {
        
        EdificioDeOficinas edifOficinas = new EdificioDeOficinas();
        
        edifOficinas.setNumDeOficinas(5);
        edifOficinas.setCantPersonasPorOficina(10);
        edifOficinas.setNumPisos(edifOficinas.getNumDeOficinas());
        
        edifOficinas.setAlto(3);
        edifOficinas.setAncho(20);
        edifOficinas.setLargo(20);
        
        return edifOficinas;
    }
    
    public void cantPersonas(EdificioDeOficinas edifOficinas) {
        
        System.out.println("El número de personas por piso es de = " + edifOficinas.getCantPersonasPorOficina());
        System.out.println("El total de personas que caben en todo el edificio es de = " + 
                edifOficinas.getCantPersonasPorOficina() * edifOficinas.getNumPisos());
        
    }
    
    public void calcularSup(EdificioDeOficinas edifOficinas) {
        
        int sup = edifOficinas.calcularSuperficie() * edifOficinas.getNumPisos();
        System.out.println("La superficie del Edificio de Oficinas es de = " + sup);
    }
    
    public void calcularVol(EdificioDeOficinas edifOficinas) {
        
        int vol = edifOficinas.calcularVolumen() * edifOficinas.getNumPisos();
        System.out.println("El volumen del Edificio de Oficinas es de = " + vol);
    }
    
}
