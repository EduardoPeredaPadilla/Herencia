package Entidades;

import Interfaces.calculoModulo;

public class Barco implements calculoModulo {
    
    protected int matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(int matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
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
        
        int modulo = eslora *10;
        return modulo;
    }
    
        @Override
    public String toString() {
        return "Barco = " + " \n Matricula = " + matricula + " \n Eslora = " + eslora + " \n Año de Fabricacion = " + anioFabricacion;
    }
    
}
