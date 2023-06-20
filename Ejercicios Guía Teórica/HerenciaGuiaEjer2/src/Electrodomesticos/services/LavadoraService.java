package Electrodomesticos.services;

import Electrodomesticos.entidades.Electrodomestico;
import Electrodomesticos.entidades.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectroService {
    
    Scanner scan = new Scanner(System.in);
    Lavadora lav = new Lavadora();

    public Lavadora crearLavadora() {
        
        ElectroService electroServ = new ElectroService();
        Electrodomestico electro = electroServ.crearElectrodomestico();
        
        lav.setPeso(electro.getPeso());
        lav.setColor(electro.getColor());
        lav.setLetra(electro.getLetra());
        lav.setPrecio(electro.getPrecio());
        
        lav.setCarga(33d);
        
//        precioFinal(electro);
        
        return lav;
    }

    @Override
    public void precioFinal(Electrodomestico electro, Object o) {
        super.precioFinal(electro, o);
        Lavadora lav = (Lavadora) o;
        
        if (lav.getCarga() > 30d) {
            lav.setPrecio(lav.getPrecio() + 500);
        }
        
    }
    
    
    

    
}
