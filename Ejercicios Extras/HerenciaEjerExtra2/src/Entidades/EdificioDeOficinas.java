package Entidades;

public class EdificioDeOficinas extends Edificio {
    
    private int numDeOficinas;
    private int cantPersonasPorOficina;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numDeOficinas, int cantPersonasPorOficina, int numPisos) {
        this.numDeOficinas = numDeOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(int numDeOficinas, int cantPersonasPorOficina, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numDeOficinas = numDeOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.numPisos = numPisos;
    }

    public int getNumDeOficinas() {
        return numDeOficinas;
    }

    public void setNumDeOficinas(int numDeOficinas) {
        this.numDeOficinas = numDeOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
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
        return superficie;
    }

    @Override
    public int calcularVolumen() {
        int vol = largo * ancho * alto;
        return vol;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas " + "ancho = " + ancho + ", alto = " + alto + ", largo = " + largo + " numDeOficinas = " + numDeOficinas + ", cantPersonasPorOficina = " + cantPersonasPorOficina + ", numPisos = " + numPisos;
    }
    
    
    
}
