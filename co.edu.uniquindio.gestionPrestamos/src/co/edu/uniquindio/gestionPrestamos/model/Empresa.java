package co.edu.uniquindio.gestionPrestamos.model;

import java.util.ArrayList;
import co.edu.uniquindio.gestionPrestamos.exception.CustomerExistException;
import co.edu.uniquindio.gestionPrestamos.exception.EmployeeExistException;
import co.edu.uniquindio.gestionPrestamos.exception.LoanExistException;
import co.edu.uniquindio.gestionPrestamos.exception.ProductExistException;

/**
 * Representa la clase Empresa
 * @author santi
 */
public class Empresa {

	//Variables de la empresa y ArrayList donde se almacenaras los respectivos datos.
	private String nombre;
	private String nit;
	private ArrayList<Cliente> listaClientes = new ArrayList<>();
	private ArrayList<Objeto> listaHabitaciones = new ArrayList<>();
	private ArrayList<Prestamo> listaReservas = new ArrayList<>();

	/**
	 * Metodo contructor de la clase Empresa
	 * @param nombre String con el nombre de la empresa
	 * @param nit    String con el nit de la empresa
	 */
	public Empresa(String nombre, String nit) {
		super();
		this.nombre = nombre;
		startData();
	}

	// ----------------------------------GETTERS AND SETTERS---------------------------------------//

	/**
	 * Metodo get del parametro nombre
	 * @return el nombre de la empresa
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del parametro nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del parametro nit
	 * @return el nit de la empresa
	 */
	public String getNit() {
		return nit;
	}

	/**
	 * Metodo set del parametro nombre
	 * @param nit
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}

	/**
	 * Metodo get del ArrayList de los clientes
	 * @return lista de clientes
	 */
	public ArrayList<Cliente> getCliente() {
		return listaClientes;
	}

	/**
	 * Metodo set para Lista de clientes
	 * @param listaClientes
	 */
	public void setCliente(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	/**
	 * Metodo get del ArrayList de los objetos o productos
	 * @return lista de objetos
	 */
	public ArrayList<Objeto> getHabitaciones() {
		return listaHabitaciones;
	}

	/**
	 * Metodo set para Lista de objetos
	 * @param listaObjetos
	 */
	public void setHabitaciones(ArrayList<Objeto> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	/**
	 * Metodo get del ArrayList de los prestamos
	 * @return lista de prestamos
	 */
	public ArrayList<Prestamo> getReserva() {
		return listaReservas;
	}

	/**
	 * Metodo set para Lista de prestamos
	 * @param listaPrestamos
	 */
	public void setPrestamo(ArrayList<Prestamo> listaPrestamos) {
		this.listaReservas = listaPrestamos;
	}

	@Override
	public String toString() {
		return "Empresa: " + nombre + ", nit: " + nit + ", lista de clientes:"
				+ listaClientes + ", lista de habitaciones: " + listaHabitaciones + ", Reservas: " + listaReservas;
	}

	/**
	 * Metodo para cargar datos de prueba
	 */
	private void startData() {

		Cliente cliente1 = new Cliente("Irelia", "10010", "1009", "irelia@hotmail.com");
		getCliente().add(cliente1);

		Cliente cliente2 = new Cliente("Anna", "20020", "1008", "Anna@gmail.com");
		getCliente().add(cliente2);

		Cliente cliente3 = new Cliente("Blanca", "30030", "1007", "blanca.g@hotmail.com");
		getCliente().add(cliente3);
		
		Cliente cliente4 = new Cliente("Maira", "1105611", "1006", "mairamendez1107@hotmail.com");
		getCliente().add(cliente4);
		
		Cliente cliente5 = new Cliente("Mateo", "10075", "310300", "mateo.a@hotmail.com");
		getCliente().add(cliente5);

		Objeto habitacion1 = new Objeto("258749", "Sencilla", "40000", "Disponible", "Habitacion 2", 1, 1);
		getHabitaciones().add(habitacion1);

		Objeto habitacion2 = new Objeto("1234", "Doble", "60000", "Ocupada", "Habitacion 1", 1, 1);
		getHabitaciones().add(habitacion2);
		
		
		Prestamo reserva1 = new Prestamo("123", "40000", "6/12/2021", "10/12/2021", "Ocupada", cliente1, habitacion1, 3, 12);
		getReserva().add(reserva1);

		Prestamo reserva2 = new Prestamo("456", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva2);
		
		Prestamo reserva3 = new Prestamo("789", "40000", "6/12/2021", "10/12/2021", "Ocupada", cliente3, habitacion1, 1, 5);
		getReserva().add(reserva3);

		Prestamo reserva4 = new Prestamo("1011", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva4);
		
		Prestamo reserva5 = new Prestamo("1213", "40000", "6/12/2021", "10/12/2021", "Ocupada", cliente1, habitacion1, 1, 3);
		getReserva().add(reserva5);

		Prestamo reserva6 = new Prestamo("1314", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva6);
		
		Prestamo reserva7 = new Prestamo("1415", "40000", "6/12/2021", "10/12/2021", "Ocupada", cliente1, habitacion1, 5, 12);
		getReserva().add(reserva7);

		Prestamo reserva8 = new Prestamo("1617", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva8);
		
		Prestamo reserva9 = new Prestamo("1718", "40000", "6/12/2021", "10/12/2021", "Ocupada", cliente3, habitacion1, 4, 10);
		getReserva().add(reserva9);

		Prestamo reserva10 = new Prestamo("1920", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva10);
		
		Prestamo reserva11 = new Prestamo("2021", "40000", "6/12/2021", "10/12/2021", "Ocupada", cliente1, habitacion1, 8, 8);
		getReserva().add(reserva11);

		Prestamo reserva12 = new Prestamo("2223", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva12);

		Prestamo reserva13 = new Prestamo("2324", "40000", "6/12/2021", "10/12/2021", "Ocupada", cliente1, habitacion1, 7, 7);
		getReserva().add(reserva13);

		Prestamo reserva14 = new Prestamo("2425", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva14);
		
		Prestamo reserva15 = new Prestamo("7181", "40000", "6/12/2021", "10/12/2021", "Ocupada", cliente3, habitacion1, 2, 7);
		getReserva().add(reserva15);

		Prestamo reserva16 = new Prestamo("1212", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva16);
		
		Prestamo reserva17 = new Prestamo("4328", "40000", "6/12/2021", "10/12/2021", "Disponible", cliente1, habitacion1, 0, 0);
		getReserva().add(reserva17);

		Prestamo reserva18 = new Prestamo("2227", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva18);
		
		Prestamo reserva19 = new Prestamo("1821", "40000", "6/12/2021", "10/12/2021", "Disponible", cliente1, habitacion1, 0, 0);
		getReserva().add(reserva19);

		Prestamo reserva20 = new Prestamo("2828", "60000", "14/12/2021", "18/12/2021", "Disponible", null, habitacion2, 0, 0);
		getReserva().add(reserva20);

	}

	public boolean verificarIdentificacionCliente(String documentoCliente) {
		Cliente clienteAux = null;
		for (int i = 0; i < listaClientes.size(); i++) {
			clienteAux = listaClientes.get(i);
			if (clienteAux.getDocumento().equals(documentoCliente)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarCodigoHabitacion(String codigoHabitacion) {
		Objeto habitacionAux = null;
		for (int i = 0; i < listaHabitaciones.size(); i++) {
			habitacionAux = listaHabitaciones.get(i);
			if (habitacionAux.getCodigo().equals(codigoHabitacion)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarCodigoReserva(String codigoReserva) {
		Prestamo reservaAux = null;
		for (int i = 0; i < listaReservas.size(); i++) {
			reservaAux = listaReservas.get(i);
			if (reservaAux.getCodigo().equals(codigoReserva)) {
				return true;
			}
		}
		return false;
	}

	public Cliente registrarClient(String documento, String nombre, String telefono,String mail) {

		
		Cliente cliente = new Cliente(documento, nombre, telefono, mail);

		cliente.setNombre(nombre);
		cliente.setTelefono(telefono);
		cliente.setDocumento(documento);
		cliente.setMail(mail);
		listaClientes.add(cliente);

		return cliente;
	}
	public Objeto registrarHabitacion(String codigo, String tipoHabitacion, String precioReserva, String estadoHabitacion, String tipo, int unidadesDisponibles, int unidadesPrestadas) {
		
		Objeto habitacion = new Objeto(codigo, nombre, precioReserva,
				estadoHabitacion, tipo, unidadesDisponibles, unidadesPrestadas);
		
		habitacion.setTipoHabitacion(tipoHabitacion);
		habitacion.setCodigo(codigo);
		habitacion.setEstadoObjeto(estadoHabitacion);
		habitacion.setTipo(tipo);
		habitacion.setPrecioAlquiler(precioReserva);
		habitacion.setUnidadesDisponibles(unidadesDisponibles);
		habitacion.setUnidadesPrestadas(unidadesPrestadas);
		listaHabitaciones.add(habitacion);

		return habitacion;
	}

	public Prestamo registrarReserv(String reservaCodigo, String estadoHabitacion,
			String valorReserva, String fechaIngreso,
			String fechaSalida, Cliente clienteEncontrado, Objeto productoEncontrado,
			int diasTranscurridos, int diasSolicitados) {

		Prestamo reserva = new Prestamo(reservaCodigo, valorReserva, fechaIngreso,
				fechaSalida, estadoHabitacion, clienteEncontrado,
				productoEncontrado, diasTranscurridos,
				diasSolicitados);
		
		reserva.setCodigo(reservaCodigo);
		reserva.setValor(valorReserva);
		reserva.setFechaIngreso(fechaIngreso);
		reserva.setFechaSalida(fechaSalida);
		reserva.setEstadoHabitacion(estadoHabitacion);
		reserva.setCliente(clienteEncontrado);
		reserva.setObjeto(productoEncontrado);
		reserva.setDiasTranscurridos(diasTranscurridos);
		reserva.setDiasSolicitados(diasSolicitados);
		listaReservas.add(reserva);

		return reserva;
	}

	public void actualizarCliente(String documentoAntiguo, String documento, String nombre, String telefono, String mail) 
			throws CustomerExistException {

		Cliente cliente = obtenerCliente(documentoAntiguo);

		if (cliente != null) {
			cliente.setNombre(nombre);
			cliente.setTelefono(telefono);
			cliente.setDocumento(documento);
			cliente.setMail(mail);
			
		} else {
			throw new CustomerExistException("No existe el cliente");
		}

	}

	public void actualizarHabitacion(String codigoAnterior, String codigo, String numeroHabitacion,
			String precioAlquiler, String estadoObjeto, String tipo, int unidadesDisponibles,
			int unidadesPrestadas) throws ProductExistException {

		Objeto habitacion = obtenerHabitacion(codigoAnterior);
		if (habitacion != null) {
			habitacion.setTipoHabitacion(numeroHabitacion);
			habitacion.setCodigo(codigo);
			habitacion.setEstadoObjeto(estadoObjeto);
			habitacion.setTipo(tipo);
			habitacion.setPrecioAlquiler(precioAlquiler);
			habitacion.setUnidadesDisponibles(unidadesDisponibles);
			habitacion.setUnidadesPrestadas(unidadesPrestadas);
		} else {
			throw new ProductExistException("No existe la habitación.");
		}

	}

	public void actualizarReserva(String codigoAnterior, String codigo, String valor,
			String fechaIngreso, String fechaSalida, String estadoHabitacion,
			Cliente cliente, Objeto habitacion, int diasTranscurridos,
			int diasSolicitados) throws LoanExistException {

		Prestamo reserva = obtenerReserva(codigoAnterior);
		if (reserva != null) {
			reserva.setCodigo(codigo);
			reserva.setValor(valor);
			reserva.setFechaIngreso(fechaIngreso);
			reserva.setFechaSalida(fechaSalida);
			reserva.setEstadoHabitacion(estadoHabitacion);
			reserva.setCliente(cliente);
			reserva.setObjeto(habitacion);
			reserva.setDiasTranscurridos(diasTranscurridos);
			reserva.setDiasSolicitados(diasSolicitados);
		} else {
			throw new LoanExistException("La reserva no existe.");
		}

	}

	public Cliente obtenerCliente(String identificacionCliente) {

		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getDocumento().equals(identificacionCliente)) {
				return listaClientes.get(i);
			}

		}
		return null;
	}

	public Objeto obtenerHabitacion(String codigoHabitacion) {

		for (Objeto habitacion : listaHabitaciones) {
			if (habitacion.getCodigo().equals(codigoHabitacion)) {
				return habitacion;
			}
		}
		return null;
	}

	public Prestamo obtenerReserva(String codigoReserva) {
		for (Prestamo reserva : listaReservas) {
			if (reserva.getCodigo().equals(codigoReserva)) {
				return reserva;
			}
		}
		return null;
	}


	public int eliminarCliente(String documentoCliente) {
		Cliente cliente = obtenerCliente(documentoCliente);
		int i = buscarPosicionCliente(cliente);

		if (i != -1) {
			listaClientes.remove(i);
		}

		return i;
	}

	private int buscarPosicionCliente(Cliente cliente) {

		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).equals(cliente)) {
				return i;
			}

		}

		return -1;
	}


	public int eliminarObjeto(String codigo) {
		Objeto objeto = obtenerHabitacion(codigo);
		int i = buscarPosicionHabitacion(objeto);

		if (i != -1) {
			listaHabitaciones.remove(i);
		}

		return i;
	}

	private int buscarPosicionHabitacion(Objeto habitacion) {

		for (int i = 0; i < listaHabitaciones.size(); i++) {
			if (listaHabitaciones.get(i).equals(habitacion)) {
				return i;
			}
		}
		return -1;
	}

	public int eliminarPrestamo(String codigoReserva) {
		Prestamo reserva = obtenerReserva(codigoReserva);
		int i = buscarPosicionReserva(reserva);

		if (i != -1) {
			listaReservas.remove(i);
		}

		return i;
	}
	private int buscarPosicionReserva(Prestamo habitacion) {

		for (int i = 0; i < listaReservas.size(); i++) {
			if (listaReservas.get(i).equals(habitacion)) {
				return i;
			}
		}

		return 0;
	}

	public boolean buscarReservaConCliente(Cliente cliente) {
		for (int i = 0; i < listaReservas.size(); i++) {
			if (listaReservas.get(i).getCliente().equals(cliente)) {
				return true;
			}
		}
		return false;
	}

	public boolean buscarReservaConHabitacion(Objeto objeto) {
		for (int i = 0; i < listaReservas.size(); i++) {
			if (listaReservas.get(i).getObjeto().equals(objeto)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Metodo para consultar un cliente
	 * @param documento
	 * @return
	 */
	public Cliente consultarCliente(String documento) {
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getDocumento().equals(documento)) {
				return listaClientes.get(i);
			}
		}
		return null;
	}
	
	public String consultarHabitacion(String codigo) {
		
		String datos1 ="";
	
		for (int i = 0; i < listaHabitaciones.size(); i++) {
			if (listaHabitaciones.get(i).getCodigo().equals(codigo) ||
					listaHabitaciones.get(i).getTipoHabitacion().equals(codigo)) {
				
				datos1="Habitación: " + listaHabitaciones.get(i).getTipoHabitacion() + "\nCodigo: "
				+ listaHabitaciones.get(i).getCodigo() + ".";
				return datos1;
			}
		}
		return null;
	}

	public Prestamo consultarReserva(String codigoPrestamo) {
		for (int i = 0; i < listaReservas.size(); i++) {
			if(listaReservas.get(i).getCodigo().equals(codigoPrestamo)) {
				return listaReservas.get(i);
			}
		}
		return null;
	}
	
}
