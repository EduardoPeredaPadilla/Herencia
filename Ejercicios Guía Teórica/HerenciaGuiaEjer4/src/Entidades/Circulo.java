package Entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo " + "Radio = " + radio + " Diametro = " + diametro;
    }

    @Override
    public void calcularArea() {
        
        Double area = pi * (radio * radio);
        System.out.println("El área del Circulo es " + area);
        
    }

    @Override
    public void calcularPerimetro() {
        
        Double perimetro = pi * diametro;
        System.out.println("El perímetro del circulo es = " + perimetro);
        
    }
    
    
    
}
