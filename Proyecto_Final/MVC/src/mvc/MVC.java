/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//import mvc.Modelo;
//import mvc.Vista;
//import mvc.Controlador;

/*
 *
 * @author Aldoh
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
       try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace(); // Imprimir la traza de la excepción para depuración
        }

        // Inicializar modelo, vista y controlador
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        
        // Iniciar la vista
        controlador.iniciarVista();
        
    }
    
}
