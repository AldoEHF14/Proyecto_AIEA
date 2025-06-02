/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
//import mvc.Modelo;
//import mvc.Vista;

//package mvc;
/**
 *
 * @author Aldoh
 */
public class Controlador implements ActionListener {
   private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.pesos.addActionListener(this);
        this.vista.dolares.addActionListener(this);
    }
    
    public void iniciarVista() {
        vista.setTitle("Conversión");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evento) {
        if (vista.pesos == evento.getSource() && !vista.campoTexto.getText().isEmpty()) {
            try {
                double cantidad = Double.valueOf(vista.campoTexto.getText());
                modelo.setCantidad(cantidad);
                modelo.setMoneda(20.05); // Tasa de conversión de dólar a peso
                modelo.convertirDolarAPeso();
                vista.lResultado.setText(modelo.getResultado().toString());
            } catch (NumberFormatException e) {
                vista.lResultado.setText("Introduce una cantidad válida");
            }
        } 
        else if (vista.dolares == evento.getSource() && !vista.campoTexto.getText().isEmpty()) {
            try {
                double cantidad = Double.valueOf(vista.campoTexto.getText());
                modelo.setCantidad(cantidad);
                modelo.setMoneda(0.05); // Tasa de conversión de peso a dólar
                modelo.convertirPesoADolar();
                vista.lResultado.setText(modelo.getResultado().toString());
            } catch (NumberFormatException e) {
                vista.lResultado.setText("Introduce una cantidad válida");
            }
        }
    }
    
}
