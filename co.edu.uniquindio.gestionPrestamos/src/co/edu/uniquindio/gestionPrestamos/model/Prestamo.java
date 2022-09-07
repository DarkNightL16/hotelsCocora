package co.edu.uniquindio.gestionPrestamos.model;

import java.util.ArrayList;

/**
 * Representa la clase Prestamo
 * @author santi, juan, nodier
 *
 */
public class Prestamo {

	//VARIBALES DE LA CLASE
    private String codigo;
    private String estadoHabitacion;
    private String valor;
    private String fechaIngreso;
    private String fechaSalida;
    private Cliente cliente;
    private String numeroHabitacion;
    private Objeto tipoHabitacion;
    private int diasTranscurridos;
    private int diasSolicitados;
    
    public Prestamo(String codigo, String valor, String fechaIngreso, String fechaSalida, String estadoHabitacion,
			Cliente cliente, Objeto tipoHabitacion, int diasTranscurridos, int diasSolicitados) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.estadoHabitacion = estadoHabitacion;
		this.cliente = cliente;
		this.tipoHabitacion = tipoHabitacion;
		this.diasTranscurridos = diasTranscurridos;
		this.diasSolicitados = diasSolicitados;
	}
    
    
	
    public String getNumeroHabitacion() {
    	numeroHabitacion = tipoHabitacion.getTipoHabitacion();
		return numeroHabitacion;
	}


	/**
     * Metodo get del codigo del Prestamo
     * @return un String con el codigo
     */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Metodo set del codigo del Prestamo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo get del estado del prestamo
	 * @return un String con el estado del prestamo
	 */
	public String getEstadoHabitacion() {
		return estadoHabitacion;
	}

	/**
	 * Metodo set del estado del prestamo
	 * @param estadoPrestamo 
	 */
	public void setEstadoHabitacion(String estadoHabitacion) {
		this.estadoHabitacion = estadoHabitacion;
	}

	/**
	 * Metodo get del velor del prestamo
	 * @return un String con el valor del prestamo
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Metodo set del valor del prestamo
	 * @param valor
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * Metodo get de la fecha en que se realizo el prestamo
	 * @return un String con la fecha del prestamo
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * Metodo set del la fecha del prestamo
	 * @param fechaPrestamo
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Metodo get de la fecha de entrega del prestamo
	 * @return un String con la fecha de entrega del prestamo
	 */
	public String getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * Metodo set de la fecha de entrega del prestamo
	 * @param fechaEntrega
	 */
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * Metodo get del Cliente que hizo el prestamo
	 * @return cliente un objeto de tipo Cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Metodo set del Cliente que hizo el prestamo
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Metodo get del Objeto que sera prestado
	 * @return objeto un objeto de tipo Objeto
	 */
	public Objeto getObjeto() {
		return tipoHabitacion;
	}

	/**
	 * Metodo set del Objeto del prestamo
	 * @param objeto
	 */
	public void setObjeto(Objeto objeto) {
		this.tipoHabitacion = objeto;
	}

	/**
	 * Metodo get de los dias transcurridos
	 * @return los dias transcurridos
	 */
	public int getDiasTranscurridos() {
		return diasTranscurridos;
	}

	/**
	 * Metodo set de los dias transcurridos
	 * @param diasTranscurridos
	 */
	public void setDiasTranscurridos(int diasTranscurridos) {
		this.diasTranscurridos = diasTranscurridos;
	}

	/**
	 * Metodo get de los dias solicitados
	 * @return los dias solicitados
	 */
	public int getDiasSolicitados() {
		return diasSolicitados;
	}

	/**
	 * Metodo set de los dias solicitados
	 * @param diasSolicitados
	 */
	public void setDiasSolicitados(int diasSolicitados) {
		this.diasSolicitados = diasSolicitados;
	}



	@Override
	public String toString() {
		return "Codigo: " + codigo + "\nEstado de la habitación: " + estadoHabitacion + "\nValor: " + valor
				+ "\nFecha del ingreso: " + fechaIngreso + "\nFecha de salida: " + fechaSalida + "\nCliente: " +
				cliente.getNombre() + "\nDocumento del cliente: " + cliente.getDocumento()
				+ "\nTipo de la habitación: " + numeroHabitacion + "\nCódigo: " + tipoHabitacion.getCodigo() 
				+ "\nDias transcurridos: " + diasTranscurridos + "\nDias solicitados: " + diasSolicitados + ".";
	}
	
	

}
