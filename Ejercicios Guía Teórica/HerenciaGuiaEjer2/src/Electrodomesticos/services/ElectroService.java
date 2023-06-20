package Electrodomesticos.services;

import Electrodomesticos.entidades.Electrodomestico;
import java.util.Scanner;
import java.util.Random;

public class ElectroService {
    
    Scanner scan = new Scanner(System.in);
    Electrodomestico electro = new Electrodomestico(1000d);
    Random random = new Random();
    
    public void comprobarConsumo(char letra) {
        
        if (letra < 65 || letra > 71) {
            electro.setLetra('F');
        }
        
    }
    
    public void comprobarColor(String color) {
        
        if (!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("azul")
                || !color.equalsIgnoreCase("gris")) {
            electro.setColor("blanco");
        }
        
    }
    
    
    public Electrodomestico crearElectrodomestico() {
        
//        Electrodomestico electro = new Electrodomestico();
//        System.out.println("Ingresa el peso del electrodoméstico");
//        electro.setPeso(scan.nextDouble());
        electro.setPeso((double) random.nextInt(90) + 1);
//        System.out.println("Ingrese el color del electrodoméstico");
//        electro.setColor(scan.next());
        electro.setColor("Verde");
//        System.out.println("Ingrese la letra para el consumo");
//        String input = scan.next();
//        electro.setLetra(input.charAt(0));
        char letra = (char) (random.nextInt(16) + 65);
        electro.setLetra(letra);
        electro.setPrecio(1000d);
        
        comprobarConsumo(electro.getLetra());
        comprobarColor(electro.getColor());
//        precioFinal(electro);
        
        return electro;
    }
    
    public void precioFinal(Electrodomestico electro, Object o) {
        
        switch(electro.getLetra()) {
            case 'A' :
                electro.setPrecio(electro.getPrecio() + 1000d);
                break;
            case 'B' :
                electro.setPrecio(electro.getPrecio() + 800d);
                break;
            case 'C' :
                electro.setPrecio(electro.getPrecio() + 600d);
                break;
            case 'D' :
                electro.setPrecio(electro.getPrecio() + 500d);
                break;
            case 'E' :
                electro.setPrecio(electro.getPrecio() + 300d);
                break;
            case 'F' :
                electro.setPrecio(electro.getPrecio() + 100d);
                break;
        }
        
        if (electro.getPeso() <= 19d) {
            electro.setPrecio(electro.getPrecio() + 100d);
        } else if(electro.getPeso() <= 49d ) {
            electro.setPrecio(electro.getPrecio() + 500d);
        } else if (electro.getPeso() <= 79d ) {
            electro.setPrecio(electro.getPrecio() + 800d);
        } else {
            electro.setPrecio(electro.getPrecio() + 1000d);
        }
    }


    
    
    
}
