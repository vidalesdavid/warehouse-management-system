/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package logins;

import BaseDeDatos.Conexion;
import GUI.Administrador1;
import GUI.Principal1;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *Clase que genera reportes de logueos en la base de datos
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class Reportes {
    /**
     * Constructor nulo
     */
    public Reportes() {
    }

/**
 * Metodo para registrar el logueo en un archivo de excel y en la base de datos
 * @param con Conexion
 * @param user Usuario
 * @param pass Contraseña
 * @return 0 si el logueo fallido, 1 si fue exitoso
 * @throws logins Puede lanzar excepcion de tipo logins
 * @throws FileNotFoundException Puede lanzar la Excepcion de archivo no encontraddo
 * @throws SQLException Puede lanzar excepcion SQL
 */
    public static int login(Connection con,String user, String pass) throws logins, FileNotFoundException, SQLException{
        Date fecha = new Date();
        Date hora = new Date();
        DateFormat formatoF = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat formatoH = new SimpleDateFormat("HH:mm:ss");
         Statement insertar = con.createStatement();
         String si="insert into logins (user, pass, fecha, hora,exito) VALUES('"
                          + user+"','"+pass+"','"+fecha+"','"+hora+"','"+1+"')";
         String no="insert into logins (user, pass, fecha, hora,exito) VALUES('"
                          + user+"','"+pass+"','"+fecha+"','"+hora+"','"+0+"')";
        System.out.println("el exit: "+si);
        System.out.println("el fall: "+no);
         Statement sts = con.createStatement();
         String passc="";
          ResultSet rs;
           String consulta= "Select pass from usuarios where user ='"+user+"'";
          System.out.println(consulta);
          
          
          
           try{
                 rs = sts.executeQuery(consulta);
           }catch(Exception e){
               System.out.println("No se encontro el usuario, error "+e);
                insertar = con.createStatement();
                  insertar.executeUpdate(no);
                  JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
               throw new logins(user,pass,0);
           }
             
           
           
           if(rs.next()){
               //si se encuentra el usuario
               passc=rs.getString("pass");
               if(pass.equals(passc)){
                  insertar = con.createStatement();
                  insertar.executeUpdate(si);
                  insertar.close();
                  
                   System.out.println("conuslta en menu tipors: "+"select tipo from usuarios where user='"+user+"'");
                  ResultSet tipors= con.createStatement().executeQuery("select tipo from usuarios where user='"+user+"'");
                  tipors.next();
                   int tipo=tipors.getInt("tipo");
         
         
                
                         
                    if(tipo==1){
                            Administrador1 ad= new Administrador1(con);
                             ad.setVisible(true);
                             
                        }else{
                        Principal1 sel= new Principal1(con);
                        sel.setVisible(true);}
                         
                   throw new logins(user,pass,1);

               }else{
                    insertar = con.createStatement();
                  insertar.executeUpdate(no);
                                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                   throw new logins(user,pass,0);
               }
           }else{
               //si no se encuentra el usuario
                insertar = con.createStatement();
                  insertar.executeUpdate(no);
               System.out.println("no se encontro el usuario");
                                 JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                throw new logins(user,pass,0);
           }
    }
}
