/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package logins;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *Clase de tipo Excepcion que se lanza al intento de logueo para generar el reporte posteriormente 
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
 public class logins extends Exception {
    private final String userLogin;
    private final String userPassword;
    private final Date fecha, hora;
    private final DateFormat formatoF, formatoH;
    int exitoso=0;
    /**
     * Constructor
     * @param userLogin Usuario
     * @param userPassword Contraseña
     * @param exitoso 0, 1 
     * @throws FileNotFoundException Puede lanzar la excepcion de archivo no encontrado
     */
    public logins(String userLogin,String userPassword,int exitoso)
            throws FileNotFoundException {
        fecha = new Date();
        hora= new Date();
        formatoF=DateFormat.getDateInstance(DateFormat.FULL);
        formatoH=new SimpleDateFormat("HH:mm:ss");
        this.userLogin=userLogin;
        this.userPassword= userPassword;
          
        if(exitoso==0){
            agregaArchivo("loginsfallidos");
        }else if(exitoso==1){
            agregaArchivo("loginsexitosos");
        }
  
    }
    /**
     * Metodo para crear un archivo de reporte
     * @param archName Nombre del archivo
     * @throws FileNotFoundException Puede lanzar excepciones SQL   
     */
    public void crearArchivo(String archName) throws FileNotFoundException{
        //crea o sobre escribe el archivo
        PrintStream arch= new PrintStream("src/archivos/"+archName+".xls");
        /*arch.println("""
                           Intentos fallidos de ingreso al sistema 
                           Usuario\t\t\tPassword\t\tFecha\t\t\t\t\tHora
                           """);*/
    }
    /**
     * Metodo para agregar un Archivo de excel con logueos
     * @param archName Nombre del archivo
     * @throws FileNotFoundException  Puede lanzar excepciones SQL 
     */
    public void agregaArchivo(String archName) throws FileNotFoundException{
            System.out.println("en logins clase pass="+userPassword);
        try{
            File archivo= new File("src/archivos/"+archName+".xls");
            if(!archivo.exists()){
                System.out.println(System.getProperty("src/archivos/"+archName+".xls"));
                crearArchivo(archName);
            }
            try(//true indica agretgar informacion al aechivo
             
                FileWriter fw = new FileWriter(archivo.getAbsoluteFile(),true);
                    //este bloque esta interno porque neceita el arhcivo de arriba
                    BufferedWriter bw= new BufferedWriter(fw)){
                        bw.write(userLogin+"\t\t"+userPassword+"\t\t"+
                        formatoF.format(fecha)+
                        "\t\t"+formatoH.format(hora)+"\n");
                
            }
        }catch(IOException err){
                System.out.println(err);
        }
    }
    
 
}


