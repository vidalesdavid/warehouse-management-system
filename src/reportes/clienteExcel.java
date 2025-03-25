/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package reportes;

import BaseDeDatos.ClienteBD;
import BaseDeDatos.ClienteLBD;
import opsAlmacen.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *Clase para Agregar clientes a un archivo de excel
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class clienteExcel {
    private final ClienteLBD obj;
    private int i=0;
    /**
     * Constructor
     * @param obj Objeto de tipo lista de clientes de la base de datos
     */
    public clienteExcel(ClienteLBD obj){
        this.obj=obj;
        this.i=0;
    }
            
        /**
         * Crear archivo
         * @throws FileNotFoundException Puede encontrar una excepcion de no encontrar archivo
         */
      public void crearArchivo() throws FileNotFoundException{
        //Crea o reemplaza el archivo
        PrintStream alumnoFile= new PrintStream("src/archivos/reporteClienteExcel.xls");
        /*for( alu: lista){
            alumnoFile.println(alu.getIdCliente()+"\t"+alu.getNombre()+"\t"+alu.getTelefono()+"\t"+alu.getEmail());
        }*/
        for(i=0;i<obj.getLista().size();i++){
            alumnoFile.println(obj.getLista().get(i).get(0)+"\t"+obj.getLista().get(i).get(1)+"\t"
                    +obj.getLista().get(i).get(2)+"\t"+obj.getLista().get(i).get(3));
        }
        
    
    }
      
    /**
     * Metodo para agregar a un archivo de excel existente
     * @throws FileNotFoundException Puede encontrar la excepción de archivo no encontrado
     */
      
    public void agregarArchivo() throws FileNotFoundException{
        try{
            File archivo = new File("src/archivos/reporteClienteExcel.xls");
            if(!archivo.exists()){
                System.out.println(System.getProperty("user.dir"));
                crearArchivo();
            }
            FileWriter fw = new FileWriter(archivo.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
             for(i=0;i<obj.getLista().size();i++){
            bw.write(obj.getLista().get(i).get(0)+"\t"+obj.getLista().get(i).get(1)+"\t"
                    +obj.getLista().get(i).get(2)+"\t"+obj.getLista().get(i).get(3));
        }
            System.out.println("Inforamacion agregada");
            bw.close();
            fw.close();
        } catch (IOException e) {}
    }
    /**
     * Metodo para leer un archivo de excel e imprimirlo en consola
     * @throws FileNotFoundException Puede no encontrar el archivo
     */
    public void leerArchivo() throws FileNotFoundException{
        System.out.println(System.getProperty("user.dir"));
        Scanner entraFile= new Scanner(new File("src/archivos/reporteClienteExcel.xls"));
        while(entraFile.hasNextLine()){
            String regis = entraFile.nextLine();
            System.out.println(regis);
        }
    }
}
