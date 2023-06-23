package Entidades;

import java.util.Date;

public class Alquiler {
    
    private String nombre;
    private String documento;
    private Date fechaAlquiler;
    private Date fechaDev;
    private String posAmarre;
    private Barco barco;
    private int precio;

    public Alquiler() {
    }

    public Alquiler(String nombre, String documento, Date fechaAlquiler, Date fechaDev, String posAmarre, Barco barco, int precio) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDev = fechaDev;
        this.posAmarre = posAmarre;
        this.barco = barco;
        this.precio = precio;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    

    @Override
    public String toString() {
        return "Alquiler " + " \n Nombre = " + nombre + " \n Documento = " + documento + " \n Fecha de Alquiler = " + fechaAlquiler.toString() + " \n Fecha de Devolución = " + fechaDev + " \n Posisión del Amarre = " + posAmarre + " \n" + barco + " \n Precio = $" + precio;
    }
    
    
    
}
