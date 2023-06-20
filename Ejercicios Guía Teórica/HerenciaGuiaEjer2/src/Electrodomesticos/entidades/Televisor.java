package Electrodomesticos.entidades;

public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, Double precio, String color, char letra, Double peso) {
        super(precio, color, letra, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
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
        return "Televisor " + " \n Precio = $" + precio + " \n Color = " + color + " \n Letra = " + letra + " \n Peso = " + peso + " \n Resolucion = " + resolucion + " \n TDT = " + TDT;
    }
    
    
    
}
