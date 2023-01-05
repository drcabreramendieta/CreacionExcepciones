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
public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void verificarEdad() throws AccessLevelException{
        if(edad < 18){
            throw new AccessLevelException("Es menor de edad con "+edad+" años");
        }
        else{
            System.out.println("Es mayor de edad");
        }
    }
}
