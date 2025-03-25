/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package opsAlmacen;

/**
 *Clase para crear objetos de tipo Pedido
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class Pedido {
    
    private int idPedido;
    private String estado;
    private float total;
    private int idCliente;
/**
 * Constructor
 * @param idPedido Id
 * @param estado Estado
 * @param total Total del pedido
 * @param idCliente Id del cliente
 */
    public Pedido(int idPedido, String estado, float total, int idCliente) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.total = total;
        this.idCliente = idCliente;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the idPedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
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
    
    
}
