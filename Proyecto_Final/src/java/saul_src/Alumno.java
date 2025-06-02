package saul_src;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saulg
 */
public class Alumno {
    private String matricula;
    private String nombre;
    private String apellido;
    private String division;
    private int trimestre;

    public Alumno(String matricula, String nombre, String apellido, String division, int trimestre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.division = division;
        this.trimestre = trimestre;
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    @Override
    public String toString() {
        return  "matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + ", division=" + division + ", trimestre=" + trimestre;
    }

   
    
    
}
