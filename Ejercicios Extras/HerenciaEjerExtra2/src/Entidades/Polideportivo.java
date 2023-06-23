package Entidades;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private String tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoDeInstalacion) {
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public Polideportivo(String nombre, String tipoDeInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public int calcularSuperficie() {
        
        int superficie = largo * ancho;
        System.out.println("La superficie del Polideportivo es de = " + superficie);
       return superficie;
    }

    @Override
    public int calcularVolumen() {
        
       int vol = largo * ancho * alto;
       System.out.println("El volumen del Polideportivo es de = " + vol);
       return vol; 
    }

    @Override
    public String toString() {
        return "Polideportivo " + "ancho = " + ancho + ", alto = " + alto + ", largo = " + largo + " nombre = " + nombre + ", tipoDeInstalacion = " + tipoDeInstalacion;
    }
    
    


    
    




    
    
}
