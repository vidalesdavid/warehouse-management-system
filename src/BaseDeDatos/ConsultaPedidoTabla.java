/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package BaseDeDatos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import  java.sql.ResultSet;
import java.util.Iterator;
/**
 *Clase para consultar la tabla Pedido de la base de datos y retornar un TableModel que permite cargar
 * una tabla para mostrar al usuario con informacion de la base de datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class ConsultaPedidoTabla {
    private final Connection con;
    private final DefaultTableModel modelo = new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista = new ArrayList<>();
    private final Object datos[]= new Object[4];
    /**
     * Constructor
     * @param con Recibe un objeto de Tipo Conexión
     * @throws SQLException puede lanzar excepciones SQL
     */
    public ConsultaPedidoTabla(Connection con) throws SQLException{
        this.con=con;
        consultaTabla();
    }
/**
 * Método que a traves de un statement obtiene informacion de la base de datos y la carga a un arraylist
 * @throws SQLException Puede lanzar una Excepcion en la consulta SQL
 */
    private void consultaTabla() throws SQLException {
      int reg=0;
      getModelo().addColumn("ID Pedido");
      getModelo().addColumn("Estado");
      getModelo().addColumn("Total");
      getModelo().addColumn("Id Cliente");
     try{
         Statement sts=con.createStatement();
         sts.execute("Select *from pedido");
         ResultSet rs= sts.getResultSet();
         while(rs.next()){
             getLista().add(new ArrayList<>());
             getLista().get(reg).add(rs.getString("idPedido"));
              getLista().get(reg).add(rs.getString("estado"));
               getLista().get(reg).add(rs.getString("total"));
                getLista().get(reg).add(rs.getString("idCliente"));
                reg++;
                
         }
         for(int j=0;j<getLista().size();j++){
             datos[0]=getLista().get(j).get(0);
             datos[1]=getLista().get(j).get(1);
             datos[2]=getLista().get(j).get(2);
             datos[3]=getLista().get(j).get(3);
             getModelo().addRow(datos);
         }
     }catch(SQLException ex){
         System.out.println(ex.getNextException());
     }
        System.out.println("Tam "+getLista().size());
        Iterator m=lista.iterator();
        while(m.hasNext()){
            System.out.println(m.next());
        }
    }

    /**
     * Get de Conexion
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * Get de Modelo
     * @return the modelo
     */
    public DefaultTableModel getModelo() {
        return modelo;
    }

    /**
     * Get de Lista
     * @return the lista
     */
    public ArrayList <ArrayList<Object>> getLista() {
        return lista;
    }

    /**
     * Get de Datos
     * @return the datos
     */
    public Object[] getDatos() {
        return datos;
    }
    
    
}
