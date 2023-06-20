package herenciaguiaejer1;

import herenciaguiaejer1.Entidades.Animal;
import herenciaguiaejer1.Entidades.Caballo;
import herenciaguiaejer1.Entidades.Gato;
import herenciaguiaejer1.Entidades.Perro;

public class HerenciaGuiaEjer1 {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doverman");
        perro1.alimentarse();
        
        Animal perro2 = new Perro("Maya", "Croquetas", 10, "Calle");
        perro2.alimentarse();
        
        Animal gato1 = new Gato("Moona", "de todo", 5, "Gata esponjosa");
        gato1.alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();

    }

}
