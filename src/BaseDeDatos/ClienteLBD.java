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
 *Clase para generar un ArrayList de clientes de la base de datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class ClienteLBD {
     private final Connection con;
    private ArrayList < ArrayList<Object> > lista = new ArrayList< >();
    /**
     * Constructor que recibe un objeto tipo Connection
     * @param con Objeto que recibe la conexión con la base de datos
     */
    public ClienteLBD(Connection con){
         this.con=con; 
    }
    /**
     * metodo que crea la lista a partir de la base de datos
     */
  public final void crearLista(){
      int reg=0;
      try{
          Statement sts=this.con.createStatement();
          sts.execute("Select * from cliente");
          ResultSet rs = sts.getResultSet();
          while(rs.next()){
              getLista().add(new ArrayList<>());
              getLista().get(reg).add(rs.getInt("idCliente"));
              getLista().get(reg).add(rs.getString("nombre"));
              getLista().get(reg).add(rs.getString("telefono"));              
              getLista().get(reg).add(rs.getString("email"));
              reg++;
          }
      }catch(SQLException ex){
          System.out.println(ex.getNextException());
      }
  }
  /**
   * Metodo que imprime en consola el contenido de una lista
   * 
   */
  public void imprimeIterator(){
      Iterator miIterator= getLista().iterator();
      while(miIterator.hasNext()){
          System.out.println(miIterator.next());
      }
  }
      /**
       * metodo que retorna la lista
       * @return Objeto de Tipo Lista
       */
      public ArrayList <ArrayList<Object> >getLista(){
          return lista;
      }
      /**
       * Metodo para modificar la lista
       * @param lista ArrayList
       */
      public void setLIsta(ArrayList< ArrayList<Object>> lista){
          this.lista=lista;
      }
}
