package Entidades;

import Enums.Departamento;

public class Profesor extends Empleado {
    
    private Departamento departamento;


    public Profesor() {
    }


    public Profesor(Departamento departamento, Integer anioIncorporacion, Integer numdespacho, String nombre, String apellido, Integer numID, String estadoCivil) {
        super(anioIncorporacion, numdespacho, nombre, apellido, numID, estadoCivil);
        this.departamento = departamento;
    }

    

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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

    public void cambioDepto(Profesor prof) {

        if (prof.getDepartamento().equals(Departamento.arquitectura) || prof.getDepartamento().equals(Departamento.matematicas)) {
            prof.setDepartamento(Departamento.lenguajes);
        } else {
            prof.setDepartamento(Departamento.arquitectura);
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
        return "Profesor " +
            " \n Nombre = " + getNombre()  +
            " \n Apellido = " + getApellido() +
            " \n Número de ID =" + getNumID() +
            " \n Estado Civil = " + getEstadoCivil() +
            " \n Año deIncorporacion = " + getAnioIncorporacion() +
            " \n Número de Despacho = " + getNumdespacho() +
            " \n Departamento = " + getDepartamento();
    }



}
