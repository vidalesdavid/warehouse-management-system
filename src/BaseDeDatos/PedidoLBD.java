/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package BaseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *Clase para crear un ArrayList de objetos de tipo Pedido de la base de Datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class PedidoLBD {
     private final Connection con;
    private ArrayList < ArrayList<Object> > lista = new ArrayList< >();
    /**
     * Constructor
     * @param con Conexión
     */
    public PedidoLBD(Connection con){
         this.con=con; 
    }
    /**
     * Metodo que crea el ArrayList de la base de datos
     */
  public final void crearLista(){
      int reg=0;
      try{
          Statement sts=this.con.createStatement();
          sts.execute("Select * from pedido");
          ResultSet rs = sts.getResultSet();
          while(rs.next()){
              getLista().add(new ArrayList<>());
              getLista().get(reg).add(rs.getInt("idPedido"));
       
              getLista().get(reg).add(rs.getString("estado"));
              //System.out.println(rs.getString("estado"));
              getLista().get(reg).add(rs.getFloat("total"));              
              getLista().get(reg).add(rs.getInt("idCliente"));
              reg++;
          }
      }catch(SQLException ex){
          System.out.println(ex.getNextException());
      }
  }
  /**
   * Metodo que imprime en consola el contenido de la lista
   */
  public void imprimeIterator(){
      Iterator miIterator= getLista().iterator();
      while(miIterator.hasNext()){
          System.out.println(miIterator.next());
      }
  }
      /**
       * Get Lista
       * @return La lista 
       */
      public ArrayList <ArrayList<Object> >getLista(){
          return lista;
      }
      /**
       * Modificar la lista
       * @param lista ArrayList
       */
      public void setLIsta(ArrayList< ArrayList<Object>> lista){
          this.lista=lista;
      }
}
