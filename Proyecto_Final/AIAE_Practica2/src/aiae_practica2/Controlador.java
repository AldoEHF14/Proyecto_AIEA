/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiae_practica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author saulg
 */
public class Controlador implements ActionListener{

    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.pesos.addActionListener(this);
        this.vista.dolares.addActionListener(this);
    }
    
    public void iniciarVista(){
        vista.setTitle("Conversor");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evento){
        Double cantidad = 0.0;
        if(vista.pesos ==evento.getSource()){
            if(!"".equals(vista.campoTexto.getText())){
                try {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setMoneda(20.07);
                    modelo.convertirDolarAPeso();
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (Exception e) {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        }
        else if (vista.dolares == evento.getSource()) {
            if(!"".equals(vista.campoTexto.getText())){
                try {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setMoneda(0.05);
                    modelo.convertirPesoADolar();
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (Exception e) {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        }
    }
}
