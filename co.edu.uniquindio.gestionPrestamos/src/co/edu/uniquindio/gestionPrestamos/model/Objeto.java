package co.edu.uniquindio.gestionPrestamos.model;

/**
 * Representa la clase Objeto
 * @author santi, juan, nodier.
 *
 */
public class Objeto {

	//Variables de la clase Objeto
    private String codigo;
    private String tipoHabitacion;
    private String precioAlquiler;
    private String estadoHabitacion;
    private String numeroHabitacion;
	private int unidadesDisponibles;
	private int unidadesPrestadas;
	
	/**
	 * Metodo constructor de la clase Objeto
	 * @param codigo Representa el codigo del objeto
	 * @param nombre Representa el nombre del objeto
	 * @param color Representa el color del objeto
	 * @param peso Representa el peso del objeto
	 * @param precioAlquiler Representa el precio de alquiler del objeto
	 * @param estadoObjeto Representa el estado del objeto
	 * @param tipo Representa el tipo de objeto
	 * @param descripcion Representa la descripcion del objeto
	 * @param unidadesDisponibles Representa las unidades disponibles del objeto
	 * @param unidadesPrestadas Representa las unidades prestadas del objeto
	 */
	public Objeto(String codigo, String tipoHabitacion,
			String precioAlquiler, String estadoHabitacion,  String numeroHabitacion, int unidadesDisponibles, int unidadesPrestadas) {
		
		super();
		
		this.codigo = codigo;
		this.tipoHabitacion = tipoHabitacion;
		this.precioAlquiler = precioAlquiler;
		this.estadoHabitacion = estadoHabitacion;
		this.numeroHabitacion = numeroHabitacion;
		this.unidadesDisponibles = unidadesDisponibles;
		this.unidadesPrestadas = unidadesPrestadas;
	}
	
	//------------------------------GETTERS AND SETTERS-----------------------------//

	/**
	 * Metodo get del codigo del objeto
	 * @return String con el codigo del objeto
	 */
	public String getCodigo() {
        return codigo;
    }
	
	/**
	 * Metodo set del codigo del objeto
	 * @param codigo
	 */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Metodo get del nombre del objeto
     * @return String con el nombre del objeto
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
    
    /**
     * Metodo set del nombre del objeto
     * @param nombre
     */
    public void setTipoHabitacion(String nombre) {
        this.tipoHabitacion = nombre;
    }
    

    /**
     * Metodo get del estado del objeto
     * @return String con el estado del objeto
     */
    public String getEstadoObjeto() {
        return estadoHabitacion;
    }
    
	/**
	 * Metodo set del estado del objeto
	 * @param estadoObjeto
	 */
	public void setEstadoObjeto(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    /**
     * Metodo get del tipo de objeto
     * @return String con el tipo de objeto
     */
    public String getTipo() {
		return numeroHabitacion;
	}
    
    /**
     * Metodo set del tipo de objeto
     * @param tipo
     */
	public void setTipo(String numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	/**
	 * Metodo get del precio del alquiler
	 * @return String con el precio del alquiler
	 */
	public String getPrecioAlquiler() {
		return precioAlquiler;
	}

	/**
	 * Metodo set del precio del alquiler
	 * @param precioAlquiler
	 */
	public void setPrecioAlquiler(String precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	/**
	 * Metodo get de las unidades disponibles
	 * @return int con las unidades disponibles
	 */
	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}
	
	/**
	 * Metodo set de las unidades disponibles
	 * @param unidadesDisponibles
	 */
	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}
	
	/**
	 * Metodo get de las unidades prestadas
	 * @return int con las unidades prestadas
	 */
	public int getUnidadesPrestadas() {
		return unidadesPrestadas;
	}

	/**
	 * Metodo set de las unidades prestadas
	 * @param unidadesPrestadas
	 */
	public void setUnidadesPrestadas(int unidadesPrestadas) {
		this.unidadesPrestadas = unidadesPrestadas;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + ", Tipo de habitación: " + tipoHabitacion + 
				 ", precioAlquiler=" + precioAlquiler + ", estadoObjeto=" + estadoHabitacion + ", Habitación número: " + numeroHabitacion
				+ ", unidadesDisponibles=" + unidadesDisponibles
				+ ", unidadesPrestadas=" + unidadesPrestadas + "]";
	}

}