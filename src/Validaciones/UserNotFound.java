/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package Validaciones;

import BaseDeDatos.Funciones;

/**
 *Clase de tipo Excepcion que se lanza en la clase validaciones
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class UserNotFound extends Exception {
    private Funciones funcion=  new Funciones();
/**
 * Constructor
 * @param message Mensaje de la excepcion 
 */
    public UserNotFound(String message) {
        super(message);
    }

   
    
}
