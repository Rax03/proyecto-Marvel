package Model;

import java.io.Serializable;

public class Marvel implements Serializable {
    private String nombre;
    private String sexo;
    private String Origen;
    private String poder;
    private String equipamiento;

    public Marvel(String nombro, String sexo, String origen, String poder, String equipo) {
        this.nombre = nombro;
        this.sexo = sexo;
        Origen = origen;
        this.poder = poder;
        this.equipamiento = equipo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getGrupo() {
        return equipamiento;
    }

    public void setGrupo(String grupo) {
        this.equipamiento = grupo;

    }

    @Override
    public String toString() {
        return "Marvel{" +
                "nombre='" + nombre + '\n' +
                ", sexo='" + sexo + '\n' +
                ", Origen='" + Origen + '\n' +
                ", poder='" + poder + '\n' +
                ", equipamiento='" + equipamiento + '\n' +
                '}';
    }



}


