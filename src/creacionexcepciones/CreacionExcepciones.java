/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionexcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hola
 */
public class CreacionExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //throw new UnCheckedException("Error");
            Usuario u1 = new Usuario("pepe",17);
            u1.verificarEdad();
        } catch (AccessLevelException ex) {
            System.out.println(ex);
        }
    }
    
}
