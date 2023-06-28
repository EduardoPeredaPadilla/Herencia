package Entidades;

public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected Integer numID;
    protected String estadoCivil;


    public Persona() {
    }


    public Persona(String nombre, String apellido, Integer numID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numID = numID;
        this.estadoCivil = estadoCivil;
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

    public void cambiarEstadoCivil(Persona pers) {

        if (pers.getEstadoCivil().equalsIgnoreCase("Soltero")) {
            pers.setEstadoCivil("Casado");
        } else {
            pers.setEstadoCivil("Soltero");
        }

    }

    

    


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", numID='" + getNumID() + "'" +
            ", estadoCivil='" + getEstadoCivil() + "'" +
            "}";
    }






}
