/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;

/**
 *
 * @author Aldoh
 */
public class Libro {
    private String nombre;
    private String img;
    private String autor;
    private String precio;
    private String descripcion;

    public Libro(String nombre, String img, String autor, String precio, String descripcion) {
        this.nombre = nombre;
        this.img = img;
        this.autor = autor;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public Libro(String nombre, String autor, String precio, String descripcion) {
        this.nombre = nombre;
        this.img = img;
        this.autor = autor;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public Libro(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
