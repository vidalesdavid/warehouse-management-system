/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package logins;

/**
 *Clase que guarda los datos de un logueo 
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class log {
      private String user;
    private String pass;
    private String hora;
    private String fecha;
    private int exitoso;
/**
 * Constructor
 * @param user Usuario
 * @param pass Contraseña
 * @param hora Hora
 * @param fecha Fecha
 * @param exitoso 0 si fue faliido. 1 si fue exitoso
 */
    public log(String user, String pass, String hora, String fecha, int exitoso) {
        this.user = user;
        this.pass = pass;
        this.hora = hora;
        this.fecha = fecha;
        this.exitoso = exitoso;
        
}

    /**
     * Get Usuario
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * Get usuario
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Get Contraseña
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Modificar la contraseña
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Get Hora
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * Modificar la hora
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Get Fecha
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Modificar la fecha
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Get si fue exitoso
     * @return the exitoso
     */
    public int getExitoso() {
        return exitoso;
    }

    /**
     * Modificar el exito del logueo
     * @param exitoso the exitoso to set
     */
    public void setExitoso(int exitoso) {
        this.exitoso = exitoso;
    }
}
