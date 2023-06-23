package Services;

import Entidades.Barco;
import java.util.Random;

public class BarcoService {
    
    Random random = new Random();
    
    public Barco crearBarco() {
        
        Barco barco = new Barco();
        
        barco.setMatricula(random.nextInt(9000) + 1000);
        barco.setEslora(random.nextInt(11) + 1);
        barco.setAnioFabricacion(random.nextInt(33) + 1990);
        
        return barco;
    }
    
    public int calcModulo(Barco barco) {
        
        int modulo = barco.calcularModulo();
        return modulo;
    }
    
}
