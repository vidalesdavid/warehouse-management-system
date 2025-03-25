/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package logins;


import java.sql.Connection;

/**
 *  Clase que genera objetos de tipo Login desde la base de datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class loginsBD {
      private final Connection con;
    private final log obj;
    /**
     * Constructor
     * @param con Conexion
     * @param obj Objeto de tipo log
     */
    public loginsBD(Connection con, log obj){
        this.con= con;
        this.obj=obj;
        }
}
    
