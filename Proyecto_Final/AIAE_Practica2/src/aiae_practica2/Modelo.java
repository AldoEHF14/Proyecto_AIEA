/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiae_practica2;

/**
 *
 * @author saulg
 */
public class Modelo {
    
    private Double moneda, cantidad, resultado;

    public Double getMoneda() {
        return moneda;
    }

    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    
    public void convertirDolarAPeso(){
        resultado = cantidad*moneda;
    }
    
    public void convertirPesoADolar(){
        resultado = cantidad*moneda;
    }
}
