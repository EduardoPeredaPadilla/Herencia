package herenciaguiaejer4;

import Entidades.Circulo;
import Services.CirculoService;
import java.util.Scanner;

public class HerenciaGuiaEjer4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        CirculoService circServ = new CirculoService();
        Circulo circ = circServ.CrearCirculo();
        
        System.out.println(circ.toString());
        circServ.calcularAreaCirculo(circ);
        
        
    }

}
