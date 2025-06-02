/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aldo_src;

/**
 *
 * @author Aldoh
 */
public class Empleado {
    private String id;
    private String nombreL;
    private String tipo;
    private String descripcion;

    public Empleado(String id, String nombreL, String tipo, String descripcion) {
        this.id = id;
        this.nombreL = nombreL;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreL() {
        return nombreL;
    }

    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
  
 
    @Override
    public String toString() {
    return "ejemploClase{" + "id=" + id + ", nombreL=" + nombreL + ", tipo=" + tipo + ", descripcion=" + this.descripcion + '}';
    }
    
    
    
}