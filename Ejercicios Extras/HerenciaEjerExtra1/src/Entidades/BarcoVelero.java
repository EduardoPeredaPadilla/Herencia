package Entidades;

public class BarcoVelero extends Barco {
    
    private int numMastiles;

    public BarcoVelero() {
    }

    public BarcoVelero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public BarcoVelero(int numMastiles, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "BarcoVelero = " + " \n Matricula = " + matricula + " \n Eslora = " + eslora + " \n Año de Fabricacion = " + anioFabricacion +  " \n Número de Mastiles = " + numMastiles;
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo(); 
    }


    
    
    
}
