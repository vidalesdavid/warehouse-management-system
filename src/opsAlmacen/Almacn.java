/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package opsAlmacen;

/**
 *Clase para crear objetos de tipo Almacen
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class Almacn {
    
    private String modelo;
    private int cantidad;
    private float precioUnitario;
    private String ubicacion;
    /**
     * Constructor con parametros nulos
     */
   public Almacn(){
       
   }
       /**
        * Constructor
        * @param modelo Modelo
        * @param cantidad Cantidad
        * @param precioUnitario Precio
        * @param ubicacion  Ubicacion en Almacen
        */
   public Almacn(String modelo, int cantidad, float precioUnitario, String ubicacion){
       this.modelo=modelo;
       this.cantidad=cantidad;
       this.precioUnitario=precioUnitario;
       this.ubicacion= ubicacion;
       
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
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Encapsulamiento de variables de instancia
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
   
}
