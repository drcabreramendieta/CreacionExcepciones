/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionexcepciones;

/**
 *
 * @author hola
 */
public class CheckedException extends Exception{

    public CheckedException() {
    }

    public CheckedException(String string) {
        super("Checked mensaje "+ string);
    }

    public CheckedException(String string, Throwable thrwbl) {
        super("Checked mensaje "+ string, thrwbl);
    }

    public CheckedException(Throwable thrwbl) {
        super(thrwbl);
    }
    
}
