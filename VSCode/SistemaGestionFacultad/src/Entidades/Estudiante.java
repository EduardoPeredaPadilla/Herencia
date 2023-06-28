package Entidades;

public class Estudiante extends Persona {
    
    private String curso;


    public Estudiante() {
    }


    public Estudiante(String curso, String nombre, String apellido, Integer numID, String estadoCivil) {
        super(nombre, apellido, numID, estadoCivil);
        this.curso = curso;
    }


    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public void nuevoCurso(Estudiante est){

        if (est.getCurso().equalsIgnoreCase("FullStack")) {
            est.setCurso("Programación desde cero");
        } else {
            est.setCurso("FullStack");
        }

    }

    @Override
    public void cambiarEstadoCivil(Persona pers) {
        super.cambiarEstadoCivil(pers);
    }


    @Override
    public String toString() {
        return "Estudiante " +
            " \n Nombre = " + getNombre()  +
            " \n Apellido = " + getApellido() +
            " \n Número de ID =" + getNumID() +
            " \n Estado Civil = " + getEstadoCivil() +
            " \n Curso = " + getCurso();
    }


}
