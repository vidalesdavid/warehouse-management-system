/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Clase que permite generar una conexion con la base de datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class Conexion {
    /**
     * Constructor nulo
     */
    public Conexion() {
    }
    
    private Connection con;   
    /**
     * Metodo que realiza la conexión y la retorna
     * 
     * @return Objeto de tipo Connection
     */
    public Connection conectar(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/upslpbd_persona","root","");
            System.out.println("OK cONEXION :)");            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro r :(" +e);
        }
        return con;
    }
}
