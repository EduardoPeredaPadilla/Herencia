package Entidades;

import java.util.Random;

public class Empleado extends Persona {
    
    protected Integer anioIncorporacion;
    protected Integer numdespacho;

    Random random = new Random();

    public Empleado() {
    }


    public Empleado(Integer anioIncorporacion, Integer numdespacho, String nombre, String apellido, Integer numID, String estadoCivil) {
        super(nombre, apellido, numID, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numdespacho = numdespacho;
    }


    public Integer getAnioIncorporacion() {
        return this.anioIncorporacion;
    }

    public void setAnioIncorporacion(Integer anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNumdespacho() {
        return this.numdespacho;
    }

    public void setNumdespacho(Integer numdespacho) {
        this.numdespacho = numdespacho;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumID() {
        return this.numID;
    }

    public void setNumID(Integer numID) {
        this.numID = numID;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public void cambiarEstadoCivil(Persona pers) {
        super.cambiarEstadoCivil(pers);
    }

    public void reasignacionDespacho(Empleado emp) {
        Integer nuevoDesp = random.nextInt(11) + 1;
        if (emp.getNumdespacho() != nuevoDesp) {
            emp.setNumdespacho(nuevoDesp);
        } else {
            reasignacionDespacho(emp);
        }
    }


    @Override
    public String toString() {
        return "Empleado " +
            " \n Nombre = " + getNombre()  +
            " \n Apellido = " + getApellido() +
            " \n Número de ID =" + getNumID() +
            " \n Estado Civil = " + getEstadoCivil() +
            " \n Año deIncorporacion = " + getAnioIncorporacion() +
            " \n Número de Despacho = " + getNumdespacho();
    }


}
