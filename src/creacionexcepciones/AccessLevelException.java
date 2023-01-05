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
public class AccessLevelException extends Exception{

    public AccessLevelException() {
    }

    public AccessLevelException(String string) {
        super(string);
    }

    public AccessLevelException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public AccessLevelException(Throwable thrwbl) {
        super(thrwbl);
    }
    
}
