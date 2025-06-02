/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiae_practica2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author saulg
 */
public class Vista extends JFrame{
    
    public JButton pesos, dolares;
    public JPanel panelB, panelR;
    public JLabel lResultado;
    public JTextField campoTexto;

    public Vista(){
        getContentPane().setLayout(new FlowLayout());
        
        panelB = new JPanel();
        panelB.setLayout(new FlowLayout());
        
        panelR = new JPanel();
        panelR.setLayout(new FlowLayout());
        
        pesos = new JButton("Convertir a Pesos");
        dolares = new JButton("Convertir a Dolares");
        
        lResultado = new JLabel("Resultado");
        campoTexto = new JTextField(20);
        
        
        panelB.add(pesos);
        panelR.add(dolares);
        
        add(campoTexto, BorderLayout.NORTH);
        add(panelB, BorderLayout.SOUTH);
        add(panelR, BorderLayout.SOUTH);
        add(lResultado, BorderLayout.NORTH);
    }
    
    public JButton getPesos() {
        return pesos;
    }

    public void setPesos(JButton pesos) {
        this.pesos = pesos;
    }

    public JButton getDolares() {
        return dolares;
    }

    public void setDolares(JButton dolares) {
        this.dolares = dolares;
    }

    public JPanel getPanelB() {
        return panelB;
    }

    public void setPanelB(JPanel panelB) {
        this.panelB = panelB;
    }

    public JPanel getPanelR() {
        return panelR;
    }

    public void setPanelR(JPanel panelR) {
        this.panelR = panelR;
    }
    
}
