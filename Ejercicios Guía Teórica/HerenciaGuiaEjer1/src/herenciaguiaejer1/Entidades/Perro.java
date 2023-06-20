package herenciaguiaejer1.Entidades;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        super.alimentarse(); 
        
        System.out.println("Hola, soy un perro, me llamo " + this.nombre  + " y me alimento de " + this.alimento);
                
    }


    
    
}
