/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package BaseDeDatos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *Clase que realiza diferentes funciones útiles al momento de recuperar información de la base de datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class Funciones {
    /**
     * Constructor nulo
     */
    public Funciones() {
    }
    
    /**
     * Método para comparar si existe informacion igual a la recibida en la base de datos
     * en la tabla y campo deseados
     * @param con Conexión
     * @param field Campo de la tabla a buscar
     * @param compara Informacion a comparar
     * @param tabla Tabla de la cual sacar informacion
     * @return booleano que indica si se encontro un registro igual o no
     * @throws SQLException  Puede lanzar excepciones SQL 
     */
      public boolean compararIguales(Connection con, String field, String compara, String tabla) throws SQLException{
        String consulta="select * from "+tabla+" where "+field+" ='"+compara+"'";
          System.out.println("en comparariguales consulta: "+consulta);
        ResultSet rs= con.createStatement().executeQuery(consulta);
          return rs.next();
    }
      /**
       * Metodo que complementa a comboId()
       * Crea un arrayList de la base de datos de la tabla deseada y el campo deseado
       * @param con Conexión
       * @param tabla tabla deseada
       * @param campo Campo de la tabla 
       * @return ArrayList de Strings
       */
      public ArrayList<String> arrayId(Connection con,String tabla, String campo){
        
          ArrayList<String> lista= new ArrayList<>();
          try{
         Statement sts=con.createStatement();
         sts.execute("Select *from "+tabla);
         ResultSet rs= sts.getResultSet();
         while(rs.next()){
             lista.add(rs.getString(campo));
            // System.out.println("lista en cinsuktaciente: "+lista);
         }
        return lista;
     }catch(SQLException ex){
         System.out.println(ex.getNextException());
         return null;
     }
    }
      /** 
       * Metodo que usa a arrayId()
       * Una vez obtenido el arreglo de cadenas deseadas, lo agrega al JcomboBox mandado
       * @param con Conexion
       * @param tabla Tabla deseada
       * @param campo campo de la tabla
       * @param combo Combo a cargar el array de Strings
       */
    public void comboId(Connection con, String tabla, String campo, javax.swing.JComboBox<String> combo){
       ArrayList<String> lis= arrayId(con,tabla, campo);
       for(String cad: lis){
           combo.addItem(cad);
       }
      
    }
}
