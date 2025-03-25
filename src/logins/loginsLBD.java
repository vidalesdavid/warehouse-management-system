/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package logins;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *Clase que genera un arraylist con informacion de la base de datos de la tabla logins
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class loginsLBD {
      private final Connection con;
    private ArrayList < ArrayList<Object> > lista = new ArrayList< >();
    /**
     * Constructor
     * @param con Conexion
     */
    public loginsLBD(Connection con){
         this.con=con; 
    }
    /**
     * Crea un arraylist con la información de la base de datos
     */
  public final void crearLista(){
      int reg=0;
      try{
          Statement sts=this.con.createStatement();
          sts.execute("Select * from logins");
          ResultSet rs = sts.getResultSet();
          while(rs.next()){
              getLista().add(new ArrayList<>());
              getLista().get(reg).add(rs.getString("user"));
              getLista().get(reg).add(rs.getString("pass"));
              getLista().get(reg).add(rs.getString("fecha"));              
              getLista().get(reg).add(rs.getString("hora"));
                getLista().get(reg).add(rs.getString("exito"));
              reg++;
          }
      }catch(SQLException ex){
          System.out.println(ex.getNextException());
      }
  }
  /**
   * Crear una lista de logueos exitosos
   */
   public final void listaExitosa(){
      int reg=0;
      try{
          Statement sts=this.con.createStatement();
          sts.execute("Select * from logins");
          ResultSet rs = sts.getResultSet();
          while(rs.next()){
             if(rs.getInt("exito")==1){
              getLista().add(new ArrayList<>());
              getLista().get(reg).add(rs.getString("user"));
              getLista().get(reg).add(rs.getString("pass"));
              getLista().get(reg).add(rs.getString("fecha"));              
              getLista().get(reg).add(rs.getString("hora"));
                getLista().get(reg).add(rs.getInt("exito"));
                 reg++;
             }
             
          }
      }catch(SQLException ex){
          System.out.println(ex.getNextException());
      }
  }
   /**
    * Crear una lista de logueos fallidos
    */
     public final void listaFallida(){
      int reg=0;
      try{
          Statement sts=this.con.createStatement();
          sts.execute("Select * from logins");
          ResultSet rs = sts.getResultSet();
          while(rs.next()){
              if(rs.getInt("exito")==0){
              getLista().add(new ArrayList<>());
              getLista().get(reg).add(rs.getString("user"));
              getLista().get(reg).add(rs.getString("pass"));
              getLista().get(reg).add(rs.getString("fecha"));              
              getLista().get(reg).add(rs.getString("hora"));
                getLista().get(reg).add(rs.getInt("exito"));
                    reg++;
              }
              
          
          }
      }catch(SQLException ex){
          System.out.println(ex.getNextException());
      }
  }
     /**
      * Metodo para imprimir el contenido de una lista
      */
  public void imprimeIterator(){
      Iterator miIterator= getLista().iterator();
      while(miIterator.hasNext()){
          System.out.println(miIterator.next());
      }
  }
      /**
       * Get la Lista
       * @return Un arraylist
       */
      public ArrayList <ArrayList<Object> >getLista(){
          return lista;
      }
      /**
       * SetLista
       * @param lista Modificar lista 
       */
      public void setLIsta(ArrayList< ArrayList<Object>> lista){
          this.lista=lista;
      }
}
