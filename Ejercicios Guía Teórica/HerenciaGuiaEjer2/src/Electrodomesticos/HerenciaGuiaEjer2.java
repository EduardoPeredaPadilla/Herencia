package Electrodomesticos;

import Electrodomesticos.entidades.Electrodomestico;
import Electrodomesticos.entidades.Lavadora;
import Electrodomesticos.entidades.Televisor;
import Electrodomesticos.services.LavadoraService;
import Electrodomesticos.services.TelevisorService;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaGuiaEjer2 {
    
        
        static LavadoraService lavServ = new LavadoraService();
        static TelevisorService tvServ = new TelevisorService();
        static ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        static ArrayList<Lavadora> lavadoras = new ArrayList();
        static ArrayList<Televisor> televisores = new ArrayList();

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n= 2;
        
        for (int i = 0; i < n; i++) {
            LavadoraService lavServ = new LavadoraService();
            TelevisorService tvServ = new TelevisorService();
            
           Lavadora lav = lavServ.crearLavadora();
           Televisor tv = tvServ.crearTelevisor(); 
           electrodomesticos.add(lav);
           electrodomesticos.add(tv);
           lavadoras.add(lav);
           televisores.add(tv);
        }
        
        
        System.out.println("-------------- ELECTRODOMESTICOS ------------------");
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico.toString());
        }
        System.out.println("-------------- LAVADORAS ------------------");
        for (Lavadora lavadora : lavadoras) {
            System.out.println(lavadora.toString());
        }
        System.out.println("-------------- TELEVISORES ------------------");
        for (Televisor televisor : televisores) {
            System.out.println(televisor.toString());
        }
        
        System.out.println("");
        System.out.println("------------------- NUEVOS PRECIOS ------------------------");
        System.out.println("");
        
        for (Lavadora lavadora : lavadoras) {
            Electrodomestico electro = new Electrodomestico();
            electro.setColor(lavadora.getColor());
            electro.setLetra(lavadora.getLetra());
            electro.setPeso(lavadora.getPeso());
            electro.setPrecio(lavadora.getPrecio());
            
            lavServ.precioFinal(electro, lavadora);
            lavadora.setPrecio(electro.getPrecio());
        }
        for (Televisor televisor : televisores) {
            Electrodomestico electro = new Electrodomestico();
            electro.setColor(televisor.getColor());
            electro.setLetra(televisor.getLetra());
            electro.setPeso(televisor.getPeso());
            electro.setPrecio(televisor.getPrecio());
            tvServ.precioFinal(electro, televisor);
            televisor.setPrecio(electro.getPrecio());
        }
        
        System.out.println("-------------- ELECTRODOMESTICOS ------------------");
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico.toString());
        }
        System.out.println("-------------- LAVADORA ------------------");
        for (Lavadora lavadora : lavadoras) {
            System.out.println(lavadora.toString());
        }
        System.out.println("-------------- TELEVISOR ------------------");
        for (Televisor televisor : televisores) {
            System.out.println(televisor.toString());
        }
        
        System.out.println("");
        System.out.println("---------- SUMA DE PRECIOS FINANLES DE LOS ELETRODOMÉSTICOS ----------------");
        double suma = 0d;
        double sumaLav = 0d;
        double sumaTv = 0d;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            suma = suma + electrodomestico.getPrecio();
        }
        for (Lavadora lavadora : lavadoras) {
            sumaLav = sumaLav + lavadora.getPrecio();
        }
        for (Televisor televisor : televisores) {
            sumaTv = sumaTv + televisor.getPrecio();
        }
        System.out.println("El suma de los precios de todos los electrodomésticos es = $" + suma);
        System.out.println("El suma de los precios de las lavadoras es = $" + sumaLav);
        System.out.println("El suma de los precios de los televisores es = $" + sumaTv);
        
    }

}
