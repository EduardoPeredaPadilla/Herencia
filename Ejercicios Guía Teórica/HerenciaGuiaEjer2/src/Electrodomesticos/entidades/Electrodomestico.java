package Electrodomesticos.entidades;

public class Electrodomestico {
    
    protected Double precio;
    protected String color;
    protected char letra;
    protected Double peso;

    public Electrodomestico() {
    }
    
    public Electrodomestico(Double precio) {
        this.precio = precio;
    }

    public Electrodomestico(Double precio, String color, char letra, Double peso) {
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letra=" + letra + ", peso=" + peso + '}';
    }
    
    
    
}
