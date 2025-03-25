/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package opsAlmacen;

/**
 *Clase para crear objetos de tipo Cliente
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String telefono;
    private String email;
/**
 * Constructor
 * @param idCliente Id
 * @param nombre Nombre
 * @param telefono Telefono
 * @param email Correp
 */
    public Cliente(int idCliente, String nombre, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
/**
 * Constructor nulo
 */
    public Cliente() {
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param email the email to set
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
