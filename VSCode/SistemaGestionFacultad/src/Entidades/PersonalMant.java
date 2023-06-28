package Entidades;

import Enums.Area;

public class PersonalMant extends Empleado {
    
    private Area area;


    public PersonalMant() {
    }


    public PersonalMant(Area area, Integer anioIncorporacion, Integer numdespacho, String nombre, String apellido, Integer numID, String estadoCivil) {
        super(anioIncorporacion, numdespacho, nombre, apellido, numID, estadoCivil);
        this.area = area;
    }


    public Area getArea() {
        return this.area;
    }

    public void setArea(Area area) {
        this.area = area;
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

    public void nuevaSeccion(PersonalMant perMant) {

        if (perMant.getArea().equals(Area.biblioteca) || perMant.getArea().equals(Area.decanato)) {
            perMant.setArea(Area.secretaria);
        } else {
            perMant.setArea(Area.biblioteca);
        }

    }

    @Override
    public void cambiarEstadoCivil(Persona pers) {
        super.cambiarEstadoCivil(pers);
    }

    @Override
    public void reasignacionDespacho(Empleado emp) {
        super.reasignacionDespacho(emp);
    }



    @Override
    public String toString() {
        return "Personal de Mantenimiento " +
            " \n Nombre = " + getNombre()  +
            " \n Apellido = " + getApellido() +
            " \n Número de ID =" + getNumID() +
            " \n Estado Civil = " + getEstadoCivil() +
            " \n Año deIncorporacion = " + getAnioIncorporacion() +
            " \n Número de Despacho = " + getNumdespacho() +
            " \n Área = " + getArea();
    }




}
