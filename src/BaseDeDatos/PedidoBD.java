/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package BaseDeDatos;


import opsAlmacen.Pedido;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *Clase que crea un objeto de tipo Pedido obteniendo información de la base de datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class PedidoBD {
    private final Connection con;
    private final Pedido objPedido;
    /**
     * Constructor
     * @param con Conexion
     * @param objPedido Objeto de tipo Pedido
     */
    public PedidoBD(Connection con, Pedido objPedido){
        this.con= con;
        this.objPedido=objPedido;
        }
    /**
     * Metodo para insertar un registro de Pedido en la base de datos
     * @throws SQLException Puede lanzar excepciones SQL
     */
     public void insertarSQLPedido() throws SQLException{
       try{
           Statement sts = con.createStatement();
           String nuevoRegistro = "INSERT INTO pedido "
                   + "(idPedido, estado, total, idCliente)"
                   + "VALUES ('"+objPedido.getIdPedido()+"','"
                   +objPedido.getEstado()+"','"
                   +objPedido.getTotal()+"', '"
                   +objPedido.getIdCliente()+"') ";
           //System.out.println("registro: "+nuevoRegistro);
                    sts.executeUpdate(nuevoRegistro);
                   }catch(SQLException e){
                       System.out.println("Error ISQL 1"+e);
                   }
       
        }
    
    
}
