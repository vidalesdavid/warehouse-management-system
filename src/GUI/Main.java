/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package GUI;

/**
 *Hilo principal de ejecución
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class Main {
    /**
     * Constructor nulo
     */
    public Main() {
    }
    
    /**
     * Hilo principal de ejecución del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu= new Menu();
        menu.setVisible(true);
    }
    
}
