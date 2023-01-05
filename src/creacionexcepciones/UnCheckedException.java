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
public class UnCheckedException extends RuntimeException{

    public UnCheckedException() {
    }

    public UnCheckedException(String string) {
        super("Mi mensaje:"+string);
    }

    public UnCheckedException(String string, Throwable thrwbl) {
        super("Mi mensaje:"+string, thrwbl);
    }

    public UnCheckedException(Throwable thrwbl) {
        super(thrwbl);
    }
    
}
