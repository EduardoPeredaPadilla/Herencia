package Electrodomesticos.services;

import Electrodomesticos.entidades.Electrodomestico;
import Electrodomesticos.entidades.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectroService {
    
    Scanner scan = new Scanner(System.in);
    Televisor tv = new Televisor();
    
    
    
    ElectroService electroServ = new ElectroService();
    Electrodomestico electro = new Electrodomestico();
    
    public Televisor crearTelevisor() {
        
        electro = electroServ.crearElectrodomestico();
        
        tv.setPeso(electro.getPeso());
        tv.setColor(electro.getColor());
        tv.setLetra(electro.getLetra());
        tv.setPrecio(electro.getPrecio());
        
        tv.setResolucion(50);
        tv.setTDT(true);
        
//        precioFinal(electro);
        
        return tv;
    }

    @Override
    public void precioFinal(Electrodomestico electro, Object o) {
        super.precioFinal(electro, o);
        Televisor tv = (Televisor) o;
        
        if (tv.getResolucion() > 40) {
            tv.setPrecio(tv.getPrecio() * 1.3);
        }
        
        if (tv.isTDT()) {
            tv.setPrecio(tv.getPrecio() + 500);
        }
        
    }
    
    
    
}
