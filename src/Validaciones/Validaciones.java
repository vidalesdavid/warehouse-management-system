/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package Validaciones;

import BaseDeDatos.Funciones;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *Clase que realiza validaciones de formato y datos en general
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class Validaciones {
/**
 * Constructor nulo
 */
    public Validaciones() {
    }
    
    private Funciones funcion= new Funciones();
    /**
     * Metodo para vslidar un Telefono
     * @param cadena Cadena a validar
     * @return booleano true o false
     */
    public boolean validaTelefono(String cadena){
        boolean val=false;
           val=cadena.matches("\\d+");
           
           if(val && cadena.length()==10){
             return true;
        }else{    
             JOptionPane.showMessageDialog(null,"El telefono debe de ser de 10 dígitos y contener solo numeros");
             return false;
            }
      
    }
    /**
     * Metodo para validar un email
     * @param cadena Cadena a validar
     * @return booleano true o false
     */
   public boolean validaEmail(String cadena){
       boolean val=cadena.contains("@") && cadena.contains(".");
       if(val==false){
           JOptionPane.showMessageDialog(null, "El email debe conetener un @ y un punto");
           return val;
       }
        return val;
    }
   /**
    * Metodo para encontrar un registro igual en la base de datos comparandolo con una String dada
    * @param con Conexión
    * @param field Campo de la tabla
    * @param compara String a comparar
    * @param tabla Tabla de la base de datos
    * @throws SQLException Puede lanzar excepciones SQL
    * @throws UserNotFound Puede lanzar la excepcion de Usuario no Encontrado
    */
   public void EncuentraCliente(Connection con, String field, String compara,String tabla) throws SQLException, UserNotFound{
       boolean val= funcion.compararIguales(con, field, compara, tabla);
      if(!val){
          throw new UserNotFound("No se encontro el usuario");
      }
   }
   /**
    * Metodo para validar el total de un pedido
    * @param total Total como cadena que provendrá de un textfield
    * @return booleano true o false
    */
   public boolean ValidaTotal(String total){
       try{
           if(Double.parseDouble(total)<0 || total.length()>6 || Double.parseDouble(total)==0){
               JOptionPane.showMessageDialog(null,"El total debe ser un numero entero no mayor a 6 digitos");
               return false;
           }else{
               return true;
           }
          
       }catch(NumberFormatException e){
           System.out.println(e);
           JOptionPane.showMessageDialog(null,"El total debe ser un numero");
           return false;
       }
       
   }
 
}
