package Services;

import Entidades.Alquiler;
import Entidades.Barco;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AlquilerService {
    
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    
    public Alquiler crearAlquiler(Barco barco) {
        
        Alquiler alq = new Alquiler();
        
        System.out.println("Ingerse el nombre del cliente");
        alq.setNombre(scan.next());
        System.out.println("Ingrese el documento del cliente");
        alq.setDocumento(scan.next());
        System.out.println("Ingrese la fecha de alquiler (MM/DD/YYYY)");
        String fecha = scan.next();
        Date fechaAlq = new Date(fecha);
        alq.setFechaAlquiler(fechaAlq);
        System.out.println("Ingrese la fecha de devolución (MM/DDYYYY)");
        String fecha2 = scan.next();
        Date fechaDev = new Date(fecha2);
        alq.setFechaDev(fechaDev);
        System.out.println("Ingrese la posición del amarre");
        alq.setPosAmarre(scan.next());
        alq.setBarco(barco);
        
        return alq;
    }
    
    public int calcularPrecio(Alquiler alq, int modulo) {
        
        int numDias = alq.getFechaDev().getDate()- alq.getFechaAlquiler().getDate();
        System.out.println("Total de días = " + numDias);
        int precio = numDias * modulo;
        alq.setPrecio(precio);
        System.out.println("El precio del alquiler es de = $" + precio);
        return precio;
    }
    
            
}
