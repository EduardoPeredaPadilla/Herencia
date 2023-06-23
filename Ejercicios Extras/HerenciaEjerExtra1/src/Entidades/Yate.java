package Entidades;

public class Yate extends Barco {
    
    private int potenciaCV;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int potenciaCV, int numCamarotes) {
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public Yate(int potenciaCV, int numCamarotes, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
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
    public int calcularModulo() {
        return super.calcularModulo(); 
    }

    @Override
    public String toString() {
        return "Yate = " + " \n Matricula = " + matricula + " \n Eslora = " + eslora + " \n Año de Fabricacion = " + anioFabricacion +  " \n Potencia CV = " + potenciaCV + " \n Número de Camarotes = " + numCamarotes;
    }
    
    
    
}
