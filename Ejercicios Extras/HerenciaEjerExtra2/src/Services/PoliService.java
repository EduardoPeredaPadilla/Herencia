package Services;

import Entidades.Polideportivo;
import java.util.Random;
import java.util.Scanner;

public class PoliService {
    
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    
    public Polideportivo crearPolideportivo() {
        
        Polideportivo poli = new Polideportivo();
        
        poli.setNombre("Polideportivo MX");
        poli.setTipoDeInstalacion("Techado");
        poli.setLargo(50);
        poli.setAncho(20);
        poli.setAlto(5);
        
        return poli;
    }
    
    public void calcularSup(Polideportivo poli) {
        
        poli.calcularSuperficie();
    }
    
    public void calcularVol(Polideportivo poli) {
        
        poli.calcularVolumen();
    }
    
}
