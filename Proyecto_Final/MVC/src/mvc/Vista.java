/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;
import java.awt.*;
import javax.swing.*;



/**
 *
 * @author Aldoh
 */
public class Vista extends JFrame {
  public JButton pesos, dolares;
    public JPanel panelB, panelR;
    public JLabel lResultado;
    public JTextField campoTexto;

    public Vista() {
        // Configuración del layout principal de la ventana
        getContentPane().setLayout(new BorderLayout());
        
        // Panel para los botones
        panelB = new JPanel(new FlowLayout());
        panelR = new JPanel(new FlowLayout());
        
        // Inicialización de botones y otros componentes
        pesos = new JButton("Convertir a pesos");
        dolares = new JButton("Convertir a dólares");
        
        lResultado = new JLabel("Resultado");
        campoTexto = new JTextField(20);
        
        // Agregar botones al panel inferior
        panelB.add(pesos);
        panelB.add(dolares);
        
        // Agregar resultado al panel central
        panelR.add(lResultado);
        
        // Agregar componentes a la ventana principal
        add(campoTexto, BorderLayout.NORTH);
        add(panelB, BorderLayout.SOUTH);
        add(panelR, BorderLayout.CENTER);   
        
        // Configuración final de la ventana
        //setVisible(true);
    }

    void setDefaulCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}


