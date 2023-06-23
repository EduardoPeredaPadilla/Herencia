package Services;

import Entidades.Rectangulo;
import java.util.Random;

public class RectanguloService {
    
    Random random = new Random();
    
    public Rectangulo crearRectangulo() {
        
        Rectangulo rec = new Rectangulo();
        
        rec.setBase(random.nextInt(8) + 6);
        rec.setAltura(random.nextInt(20) + 5);
        
        return rec;
    }
    
    public void calcularAreaRectangulo(Rectangulo rec){
        
        rec.calcularArea();
        
    }
    
    public void calcularPerimetroRectangulo(Rectangulo rec) {
        
      rec.calcularPerimetro();
        
    }
    
}
