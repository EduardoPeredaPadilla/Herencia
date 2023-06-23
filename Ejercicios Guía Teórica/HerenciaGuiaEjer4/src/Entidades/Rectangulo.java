package Entidades;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo " + "Base = " + base + " Altura = " + altura;
    }
    
    

    @Override
    public void calcularArea() {
        
        int area = base * altura;
        System.out.println("El área del Rectangulo es = " + area);
    }

    @Override
    public void calcularPerimetro() {
        
        int perimetro = (base + altura) * 2;
        System.out.println("El perímetro del Rectangulo es = " + perimetro);
    }
    
    
    
}
