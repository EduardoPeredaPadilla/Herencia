package herenciaguiaejer1.Entidades;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
        
        System.out.println("Hola, soy un caballo y me alimento de " + this.alimento);
    }
    
    
    
}
