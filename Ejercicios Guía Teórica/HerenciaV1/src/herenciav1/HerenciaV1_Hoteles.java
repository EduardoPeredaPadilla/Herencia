package herenciav1;

import herenciav1.EntidadesHoteles.Hotel;
import herenciav1.EntidadesHoteles.Hotel1;
import herenciav1.EntidadesHoteles.Hotel2;
import herenciav1.EntidadesHoteles.Hotel3;
import herenciav1.EntidadesHoteles.Hotel4;
import herenciav1.EntidadesHoteles.Hotel5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HerenciaV1_Hoteles {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        List<Hotel> hoteles = new ArrayList();
        
        Hotel1 h1 = new Hotel1(500d, 80d, 50);
        Hotel2 h2 = new Hotel2(500d, 80d, 50);
        Hotel3 h3 = new Hotel3(500d, 80d, 50);
        Hotel4 h4 = new Hotel4(500d, 80d, 50);
        Hotel5 h5 = new Hotel5(500d, 80d, 50);
        
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);
        
        for (Hotel hotel : hoteles) {
            
            if (hotel instanceof Hotel5) {
                Hotel5 object = (Hotel5) hotel;
                System.out.println("Soy Hotel 5");
            }
            
        }

    }

}
