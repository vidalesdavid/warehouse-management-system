/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package BaseDeDatos;

import opsAlmacen.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
/**
 * Clase para generar un objeto tipo cliente de la base de datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx 
 */
public class ClienteBD {
    /**
     * variable para la conexión
     */
    private final Connection con;
      /**
     * variable para obtener un objeto de tipo cliente
     */
    private final Cliente objCliente;
    /**
     * Constructor que recibe un objeto de tipo conexión y un objeto de tipo cliente
     * @param con Conexion
     * @param objCliente Cliente
     */
    public ClienteBD(Connection con, Cliente objCliente){
        this.con= con;
        this.objCliente=objCliente;
        }
    /**
     * Metodo para insertar un registro de tipo cliente en la base de datos
     * @throws SQLException Puede lanzar excepciones SQL
     */
     public void insertarSQLCliente() throws SQLException{
       try{
           Statement sts = con.createStatement();
           String nuevoRegistro = "INSERT INTO cliente "
                   + "(idCliente, nombre, telefono, email)"
                   + "VALUES ('"+objCliente.getIdCliente()+"','"
                   +objCliente.getNombre()+"','"
                   +objCliente.getTelefono()+"', '"
                   +objCliente.getEmail()+"') ";
           //System.out.println("registro: "+nuevoRegistro);
                    sts.executeUpdate(nuevoRegistro);
                   }catch(SQLException e){
                       System.out.println("Error ISQL 1"+e);
                   }
       
        }
    
    
    
}
