package co.edu.uniquindio.gestionPrestamos.model;

/**
 * Representa la clase Persona
 * @author santi, nodier, juan
 *
 */
public class Persona {

	//Variables de la clase Persona
    private String documento;
    private String nombre;
    private String telefono;
    private String mail;
    
    /**
     * Metodo constructor de la clase persona
     * @param documento Representa el documento de una persona
     * @param nombre Representa el nombre de una persona
     * @param telefono Representa el telefono de una persona
     * @param celular Representa el celular de una persona
     */
    public Persona(String documento, String nombre, String telefono, String mail) {
        super();
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }
    //---------------------------------GETTERS AND SETTERS---------------------------//
    
    /**
     * Metodo get del documento de una persona
     * @return String con el documento de una persona
     */
    public String getDocumento() {
        return documento;
    }
    
    /**
     * Metodo set del documento de una persona
     * @param documento
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    /**
     * Metodo get del nombre de una persona
     * @return String con el nombre de una persona
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo set con el nombre de una persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo get con el telefono de una persona
     * @return String con el telefono de una persona
     */
    public String getTelefono() {
        return telefono;
    }
    
    /**
     * Metodo set del telefono de una persona
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Metodo get del email de una persona
     * @return String con el email de una persona
     */
    public String getMail() {
        return mail;
    }
    
    /**
     * Metodo set del email de una persona
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona [documento=" + documento + ", nombre=" + nombre + ", mail=" + mail +  "]";
    }

}