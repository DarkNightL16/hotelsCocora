package co.edu.uniquindio.gestionPrestamos;

import java.io.IOException;

import java.util.ArrayList;

import co.edu.uniquindio.gestionPrestamos.controller.LoginController;
import co.edu.uniquindio.gestionPrestamos.exception.CustomerExistException;
import co.edu.uniquindio.gestionPrestamos.exception.LoanExistException;
import co.edu.uniquindio.gestionPrestamos.exception.ProductExistException;
import co.edu.uniquindio.gestionPrestamos.model.Empresa;
import co.edu.uniquindio.gestionPrestamos.model.Cliente;
import co.edu.uniquindio.gestionPrestamos.model.Prestamo;
import co.edu.uniquindio.gestionPrestamos.model.Objeto;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * Representa la clase Aplicacion que extiende de Application. (JavaFX).
 * @author santi, nodier, juan.
 *
 */
public class Aplicacion extends Application{
	
	private Empresa empresa = new Empresa("Hostals Cocora.", "1000");
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Reservar Habitaciones.");
		//Aqui llamamos para mostrar lo que hemos cargado dentro el metodo
		showLoginWindow();
	}

	private void showLoginWindow() {
		//Puede que no exista nada entonces lo hacemos con un try catch
		try {
			FXMLLoader loader = new FXMLLoader();
			//Buscar y cagar el archivo FMXL
			loader.setLocation(Aplicacion.class.getResource("view/LoginOverView.fxml"));

			BorderPane rootLayout = loader.load();
			
			//Cargar controlador
			LoginController loginController = loader.getController();
			loginController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Cliente> obtenerClientes() {
		return empresa.getCliente();
	}

	public ArrayList<Objeto> obtenerHabitaciones() {
		return empresa.getHabitaciones();
	}

	public ArrayList<Prestamo> obtenerReservas() {
		return empresa.getReserva();
	}
	
	//Verifica la identificación del cliente
	public boolean verifyIdentificacionCliente(String documentoCliente) {
		return empresa.verificarIdentificacionCliente(documentoCliente);
	}
	
	//Verifica el código del objeto o producto
	public boolean verificarCodigoHabitacion(String codigoHabitacion) {
		return empresa.verificarCodigoHabitacion(codigoHabitacion);
	}

	
	//Verifica el código del prestamo
	public boolean verificarCodigoReserva(String codigoReserva) {
		return empresa.verificarCodigoReserva(codigoReserva);
	}
	
	public Cliente registrarACliente(String documento, String nombre, String telefono, String mail) {
		return empresa.registrarClient(documento, nombre, telefono, mail);
	}

	public Objeto registrarAObjeto(String codigo, String nombre, String precioAlquiler,
			String estadoObjeto,  String tipo, int unidadesDisponibles,
			int unidadesPrestadas) {
		return empresa.registrarHabitacion(codigo,nombre,precioAlquiler,
				estadoObjeto, tipo, unidadesDisponibles, unidadesPrestadas);
	}
	
	public Prestamo registrarReserva(String codigoReserva, String estadoHabitacion,
			String valorReserva, String fechaIngreso,
			String fechaSalida, Cliente clienteEncontrado, Objeto habitacionEncontrado,
			int diasTranscurridos, int diasSolicitados) {

		return empresa.registrarReserv(codigoReserva, estadoHabitacion, valorReserva,
				fechaIngreso, fechaSalida, clienteEncontrado,habitacionEncontrado, diasTranscurridos, diasSolicitados);
	}

	public void actualizarAcliente(String documentoAntiguo, String documento, String nombre, String telefono, String mail) throws CustomerExistException {

		 empresa.actualizarCliente(documentoAntiguo, documento,nombre,telefono, mail);
	}

	public void actualizarHabitacion(String codigoAnterior, String codigo, String numeroHabitacion, String precioReserva,
			String estadoHabitacion,  String tipo, int unidadesDisponibles,
			int unidadesPrestadas) throws ProductExistException {

		empresa.actualizarHabitacion(codigoAnterior, codigo,numeroHabitacion,precioReserva,
				estadoHabitacion,tipo, unidadesDisponibles, unidadesPrestadas);

	}

	public void actualizarPrestamo(String codigoAnterior, String codigo, String valor,
			String fechaEntrada, String fechaSalida, String estadoHabitacion,
			Cliente cliente, Objeto habitacion,
			int diasTranscurridos, int diasSolicitados) throws LoanExistException{
		
		empresa.actualizarReserva(codigoAnterior, codigo, valor, fechaEntrada,
				fechaSalida, estadoHabitacion, cliente, habitacion,
				diasTranscurridos, diasSolicitados);
	}
	
	public int eliminarACliente(String documentoCliente) {
		return empresa.eliminarCliente(documentoCliente);
	}
	
	public int eliminarAObjeto(String codigoHabitacion) {
		return empresa.eliminarObjeto(codigoHabitacion);
	}
	
	public int eliminarAPrestamo(String codigoReserva) {
		return empresa.eliminarPrestamo(codigoReserva);
	}

	public Cliente buscarCliente(String cliente) {
		return empresa.obtenerCliente(cliente);
	}

	public Objeto buscarHabitacion(String objeto) {
		return empresa.obtenerHabitacion(objeto);
	}
	
	public boolean obtenerClienteReserva(Cliente cliente) {
		return empresa.buscarReservaConCliente(cliente);
	}
	
	public boolean obtenerObjetoPrestamo(Objeto habitacion) {
		return empresa.buscarReservaConHabitacion(habitacion);
	}
	
	public Cliente consultarAcliente(String documento) {
		return empresa.consultarCliente(documento);
	}
	
	public String consultarHabitacion(String codigo) {
		return empresa.consultarHabitacion(codigo);
	}
	
	public Prestamo consultarReserva(String codigoReserva) {
		return empresa.consultarReserva(codigoReserva);
	}

}
