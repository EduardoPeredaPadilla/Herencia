package Services;

import Entidades.Barco;
import Entidades.Yate;
import java.util.Random;

public class YateService extends BarcoService {
    
    Random random = new Random();
    
    public Yate crearYate() {
        
        BarcoService barcoServ = new BarcoService();
        Barco barco = barcoServ.crearBarco();
        int pot = random.nextInt(21) + 10;
        int numCamarotes = random.nextInt(5) + 1;
        
        Yate yate = new Yate(pot, numCamarotes, barco.getMatricula(), barco.getEslora(), barco.getAnioFabricacion());
        
        return yate;
    }
    
    public int calculoModulo(Yate yate) {
        
        int modulo = yate.calcularModulo() + yate.getPotenciaCV() + yate.getNumCamarotes();
        return modulo;
    }
    
}
