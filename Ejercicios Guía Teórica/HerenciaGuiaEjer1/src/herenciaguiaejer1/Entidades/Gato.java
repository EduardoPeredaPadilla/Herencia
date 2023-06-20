package herenciaguiaejer1.Entidades;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
        
        System.out.println("Hola, soy un gato y me alimento de " + this.alimento);
    }
    
    
    
}
