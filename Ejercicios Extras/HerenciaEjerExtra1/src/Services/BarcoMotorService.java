package Services;

import Entidades.Barco;
import Entidades.BarcoMotor;
import java.util.Random;

public class BarcoMotorService extends BarcoService {
    
    Random random = new Random();
    
    public BarcoMotor crearBarcoMotor() {
        
        BarcoService barcoServ = new BarcoService();
        Barco barco = barcoServ.crearBarco();
        int pot = random.nextInt(21) + 10;
        
        BarcoMotor barcoMotor = new BarcoMotor(pot, barco.getMatricula(), barco.getEslora(), barco.getAnioFabricacion());
        
        return barcoMotor;
    }
    
    public int calcModulo(BarcoMotor barcoMotor) {
        
        int modulo = barcoMotor.calcularModulo() + barcoMotor.getPotenciaCV();
        return modulo;
    }
    
}
