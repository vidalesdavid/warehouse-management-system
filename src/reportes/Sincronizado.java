/*
 * Luis David Vidales Ramirez 183060
 * Universidad Politecnica de San Luis Potosi
 */
package reportes;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *Clase de tipo Hilo para abrir un archivo
 * @author Luis David Vidales Ramírez, 183060
 */
public class Sincronizado extends Thread {
    private final String nombre;
    /**
     * Constructor
     * @param nombre Nombre del archivo
     */
    public Sincronizado(String nombre){
        this.nombre=nombre;
    }
   
    @Override
    public synchronized void run(){
        File path=new File("src/archivos/",nombre);
        try{
            Desktop.getDesktop().open(path);
        }catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
}
