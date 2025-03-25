/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package opsAlmacen;

/**
 *Clase para relacionar objetos de tipos distintos de campos de la entidad Almacén
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class RelacionAlmacen {
    private Almacn objAlmacen;
    private Cliente objCliente;
    private DetallePedido objDetpedido;
    private Pedido objPedido;
/**
 * Constructor nulo
 */
    public RelacionAlmacen() {
    }
/**
 * Constructor
 * @param objAlmacen Objeto de tipo almacen
 * @param objCliente Objeto de tipo Cliente
 * @param objDetpedido Objeto de tipo DetallePedido
 * @param objPedido Objeto de tipo Pedido
 */
    public RelacionAlmacen(Almacn objAlmacen, Cliente objCliente, DetallePedido objDetpedido, Pedido objPedido) {
        this.objAlmacen = objAlmacen;
        this.objCliente = objCliente;
        this.objDetpedido = objDetpedido;
        this.objPedido = objPedido;
    }
    /**
     * Metodo para realizar una compra
     * @return Cadena que reporta la compra
     */
    public String compra(){
        this.objDetpedido.setSubtotal(this.objDetpedido.getCantidad()*this.objDetpedido.getPrecioUnitario());
        return this.getObjCliente().getNombre()+" ha comprado "+this.getObjDetpedido().getPrecioUnitario()*this.getObjDetpedido().getCantidad();
        
    }
    
    /**
     * Encapsulamiento de variables de instancia
     * @return the objAlmacen
     */
    public Almacn getObjAlmacen() {
        return objAlmacen;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param objAlmacen the objAlmacen to set
     */
    public void setObjAlmacen(Almacn objAlmacen) {
        this.objAlmacen = objAlmacen;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the objCliente
     */
    public Cliente getObjCliente() {
        return objCliente;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param objCliente the objCliente to set
     */
    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the objDetpedido
     */
    public DetallePedido getObjDetpedido() {
        return objDetpedido;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param objDetpedido the objDetpedido to set
     */
    public void setObjDetpedido(DetallePedido objDetpedido) {
        this.objDetpedido = objDetpedido;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @return the objPedido
     */
    public Pedido getObjPedido() {
        return objPedido;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param objPedido the objPedido to set
     */
    public void setObjPedido(Pedido objPedido) {
        this.objPedido = objPedido;
    }
    
    
}

