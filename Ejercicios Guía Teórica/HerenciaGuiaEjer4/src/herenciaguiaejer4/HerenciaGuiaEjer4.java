package herenciaguiaejer4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import Services.CirculoService;
import Services.RectanguloService;
import java.util.Scanner;

public class HerenciaGuiaEjer4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        CirculoService circServ = new CirculoService();
        RectanguloService recServ = new RectanguloService();
        
        Circulo circ = circServ.CrearCirculo();
        Rectangulo rec = recServ.crearRectangulo();
        
        System.out.println("--------------- CIRCULO--------------------");
        System.out.println(circ.toString());
        circServ.calcularAreaCirculo(circ);
        circServ.calcularPerimetroCirculo(circ);
        
        System.out.println("");
        System.out.println("-------------------- RECTANGULO -----------------");
        System.out.println(rec.toString());
        recServ.calcularAreaRectangulo(rec);
        recServ.calcularPerimetroRectangulo(rec);
    }

}
