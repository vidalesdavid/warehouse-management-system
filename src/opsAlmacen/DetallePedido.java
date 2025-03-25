/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package opsAlmacen;

/**
 *Clase para crear objetos de tipo DetallePedido
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class DetallePedido {
    private int idPedido;
    private String modelo;
    private int cantidad;
    private float precioUnitario;
    private float subtotal;
/**
 * Constructor
 * @param idPedido Id
 * @param modelo Modelo
 * @param cantidad Cantidad
 * @param precioUnitario Precio
 * @param subtotal Subtotal del pedidoS
 */
    public DetallePedido(int idPedido, String modelo, int cantidad, float precioUnitario, float subtotal) {
        this.idPedido = idPedido;
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }
/**
 * Constructor nulo
 */
    public DetallePedido() {
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
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the precioUnitario
     */
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the subtotal
     */
    public float getSubtotal() {
        return subtotal;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
