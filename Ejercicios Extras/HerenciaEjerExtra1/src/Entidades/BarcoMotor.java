package Entidades;

public class BarcoMotor extends Barco {
    
    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(int potenciaCV, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
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
        return "BarcoMotor = " +  " \n Matricula = " + matricula + " \n Eslora = " + eslora + " \n Año de Fabricacion = " + anioFabricacion +  " \n Potencia CV = " + potenciaCV;
    }
    
    
    
}
