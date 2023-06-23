package Services;

import Entidades.Circulo;
import java.util.Random;

public class CirculoService {
    
    Random random = new Random();
    Circulo circ = new Circulo();
    
    public Circulo CrearCirculo() {
        
        Circulo circ = new Circulo();
        circ.setRadio(Math.round((6 + (random.nextDouble() * (13 - 6))) * 100.0) / 100.0);
        circ.setDiametro(circ.getRadio() * 2);
        
        return circ;
    }
    
    public void calcularAreaCirculo(Circulo circ) {
        
        circ.calcularArea();
        
    }
    
    public void calcularPerimetroCirculo(Circulo circ) {
        
        circ.calcularPerimetro();
    }
    
}
