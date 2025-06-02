/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiae_practica2;

import aiae_practica2.Controlador;
import aiae_practica2.Modelo;
import aiae_practica2.Vista;
import javax.swing.UIManager;

/**
 *
 * @author saulg
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            System.out.println("UnsopportedLookAndFeelException");
        }catch(ClassNotFoundException e){     
            System.out.println("ClassNotFoundException");
        }catch(InstantiationException e){ 
            System.out.println("InstantiationException");
        }catch(IllegalAccessException e){           
            System.out.println("IllegalAccessException");
        }
        
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciarVista();
    }
    
}
