/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aldo_src;

/**
 *
 * @author Aldoh
 */
public class Libreria {
    private int id;
    private String nombre;
    private String autor;
    private String tipo;
    private String descripcion;
    private double precio;

    public Libreria(int id, String nombre, String autor, String tipo, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String datos(){
        String registro = this.id + "," + this.nombre + "," + this.autor + "," 
                          + this.tipo + "," + this.descripcion + "," + this.precio + "\n";
        return registro;
    }
    
    
    @Override
    public String toString() {
        return "Libro [ID=" + this.id + ", Nombre=" + this.nombre + ", Autor=" +
                this.autor + ", Tipo=" + this.tipo + ", Descripción=" + this.descripcion 
                + ", Precio=" + this.precio + "]";
    }
    
}
