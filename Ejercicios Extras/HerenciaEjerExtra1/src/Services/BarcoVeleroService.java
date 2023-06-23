package Services;

import Entidades.Barco;
import Entidades.BarcoVelero;
import java.util.Random;

public class BarcoVeleroService extends BarcoVelero {
    
    Random random = new Random();
    
    public BarcoVelero crearVelero() {
        
        BarcoService barcoServ = new BarcoService();
        Barco barco = barcoServ.crearBarco();
        int nMastiles = random.nextInt(11) + 1;
        BarcoVelero velero = new BarcoVelero(nMastiles, barco.getMatricula(), barco.getEslora(), barco.getAnioFabricacion());
        
        
        return velero;
    }
    
    public int calcModulo(BarcoVelero velero) {
        
        int modulo = velero.calcularModulo();
        modulo = modulo + velero.getNumMastiles();
        
        return modulo;
    }
    
}
