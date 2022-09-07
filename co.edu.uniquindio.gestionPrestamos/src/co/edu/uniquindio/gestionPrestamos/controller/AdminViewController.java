package co.edu.uniquindio.gestionPrestamos.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import co.edu.uniquindio.gestionPrestamos.Aplicacion;
import co.edu.uniquindio.gestionPrestamos.exception.CustomerExistException;
import co.edu.uniquindio.gestionPrestamos.exception.LoanExistException;
import co.edu.uniquindio.gestionPrestamos.model.Cliente;
import co.edu.uniquindio.gestionPrestamos.model.Prestamo;
import co.edu.uniquindio.gestionPrestamos.model.Objeto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Representa el controlador de la vista de administrador
 * @author santi, juan, nodier.
 *
 */
public class AdminViewController {

	//-------------------------VARIABLES FXML-------------------------------------//
	
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtValorPrestamo;

	@FXML
	private TextField txtNombreObjeto;

	@FXML
	private TextField txtObjetos;

	@FXML
	private TextField txtDiasTranscurridos;

	@FXML
	private TextField txtDiasSolicitados;
	
    @FXML
    private Button btnEliminarAPrestamo;
    
    @FXML
    private ComboBox<String> comboBoxEstadoPres;
    
    @FXML
    private DatePicker dpFechaPrestamo;

    @FXML
    private DatePicker dpFechaEntrega;

	@FXML
	private TextField txtValorObjeto;

	@FXML
	private TextField txtBuscarObjeto;

	@FXML
	private Button btnRegistrarObjeto;

	@FXML
	private TextField txtCliente;

	@FXML
	private TextField txtPaisEmpleado;

	@FXML
	private TextField txtBuscarEmpleado;

	@FXML
	private TextField txtProfesion;

	@FXML
	private TextField txtDocumentoCliente;

	@FXML
	private TextField txtEstadoObjeto;

	@FXML
	private TextField txtTelefonoCliente;

	@FXML
	private Button btnNuevoCliente;

	@FXML
	private Button btnBuscarPrestamo;

	@FXML
	private TextField txtEmailCliente;

	@FXML
	private Button btnRegistrarCliente;

	@FXML
	private TextField txtDepartamentoEmpleado;

	@FXML
	private TextField txtTelefonoEmpleado;

	@FXML
	private TextField txtBuscarPrestamo;

	@FXML
	private TextField txtCódigoPrestamo;

	@FXML
	private TextField txtCodigoObjeto;

	@FXML
	private TextField txtDepartamentoCliente;

	@FXML
	private TextField txtBuscarCliente;

	@FXML
	private Button btnActuliazarCliente;

	@FXML
	private Button btnNuevoObjeto;

	@FXML
	private ComboBox<?> choiceBoxCliente;

	@FXML
	private TextField txtNombreEmpleado;

	@FXML
	private Button btnActuliazarPrestamo;

	@FXML
	private Button btnBuscarEmpleado;

	@FXML
	private Button btnNuevoEmpleado;

	@FXML
	private TextField txtCiudadCliente;
	
    @FXML
    private Button btnAEliminarCliente;
	
	@FXML
	private RadioButton rdBoton1;
	 
	@FXML
	private ToggleGroup generoC;

	@FXML
	private RadioButton rdBoton2;

    @FXML
    private Button btnRegistrarReserva;

	@FXML
	private TextField txtDescripcionObjeto;

	@FXML
	private TextField txtDireccionCliente;

	@FXML
	private TextField txtCiudadEmpleado;

	@FXML
	private TextField txtAniosExperiencia;

    @FXML
    private Button btnEliminarAEmpleado;

	@FXML
	private TextField txtDireccionEmpleado;

	@FXML
	private TextField txtEmpleado;

	@FXML
	private TextField txtPesoObjeto;

	@FXML
	private TextField txtFechaPrestamo;

	@FXML
	private TextField txtCelularEmpleado;

	@FXML
	private TextField txtNombreCliente;

	@FXML
	private Button btnRegistrarEmpleado;

	@FXML
	private Button btnActuliazarEmpleado;

	@FXML
	private Button btnBuscarCliente;

	@FXML
	private Button btnActuliazarObjeto;

	@FXML
	private Button btnNuevoPrestamo;

	@FXML
	private ComboBox<?> choiceBoxObjeto;

	@FXML
	private ComboBox<?> choiceBoxPrestamo;

	@FXML
	private ComboBox<String> choiceBoxEmpleado;

	@FXML
	private TextField txtEmailEmpleado;

	@FXML
	private TextField txtCelularCliente;

	@FXML
	private TextField txtColorObjeto;

	@FXML
	private TextField txtTipoObjeto;

	@FXML
	private TextField txtUnidadesDis;

	@FXML
	private TextField txtUnidadesPres;
	
    @FXML
    private Button btnEliminarAObjeto;

	@FXML
	private Button btnBuscarObjeto;

	@FXML
	private TextField txtFechaEntrega;

	@FXML
	private TextField txtDocumentoEmpleado;

	@FXML
	private TextField txtPaisCliente;

	@FXML
	private TableView<Cliente> tblListCostumer;


	@FXML
	private TableView<Objeto> tblListProduct;

	@FXML
	private TableView<Prestamo> tblListLoan;
	
    @FXML
    private TableColumn<Objeto, String> columnNombrePrestamo1;

	@FXML
	private TableColumn<Cliente, String> columnNombreCliente;

	@FXML
	private TableColumn<Cliente, String> columnDocumentoCliente;

	@FXML
	private TableColumn<Objeto, String> columnNombreObjeto;

	@FXML
	private TableColumn<Objeto, String> columnCodigoObjeto;

	@FXML
	private TableColumn<Prestamo, String> columnValorPrestamo;

	@FXML
	private TableColumn<Prestamo, String> columnCodigoPrestamo;
    @FXML
    private TableColumn<Prestamo, String> columnTipoHabitacion;
    @FXML
    private TableColumn<Prestamo, String> columnEstado;

    @FXML
    private TableColumn<Cliente, String> columnTelefonoCliente1;
    @FXML
    private TableColumn<Cliente, String> columnCorreoCliente;


    @FXML
    private Button btnRealizarR;
    
	private Aplicacion aplicacion;
	
	//------------------------------------------------------------------------//
	
	//Listas Observables
	ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();
	ObservableList<Objeto> listaProductos = FXCollections.observableArrayList();
	ObservableList<Prestamo> listaReservas = FXCollections.observableArrayList();
	
	// Variables de seleccion
	private Cliente clienteSeleccionado;
	private Prestamo reservaSeleccionada;

	//APLICACION
	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
		cargarListaClientes();
		cargarListaReservas();
	}

	@FXML
	void initialize() {
		//Datos de la tabla Cliente
		this.columnNombreCliente.setCellValueFactory(new PropertyValueFactory<>("documento"));
		this.columnDocumentoCliente.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columnTelefonoCliente1.setCellValueFactory(new PropertyValueFactory<>("telefono"));
		this.columnCorreoCliente.setCellValueFactory(new PropertyValueFactory<>("mail"));
		

		tblListCostumer.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
			clienteSeleccionado = newSelection;
			mostrarInformacionCliente(clienteSeleccionado);
		});

	

		//Datos de la tabla Prestamo
		this.columnNombrePrestamo1.setCellValueFactory(new PropertyValueFactory<>("numeroHabitacion"));
		this.columnValorPrestamo.setCellValueFactory(new PropertyValueFactory<>("valor"));
		this.columnCodigoPrestamo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		this.columnTipoHabitacion.setCellValueFactory(new PropertyValueFactory<>("estadoHabitacion"));
		this.columnEstado.setCellValueFactory(new PropertyValueFactory<>("diasSolicitados"));

		
		tblListLoan.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
			reservaSeleccionada = newSelection;
			mostrarInformacionReserva(reservaSeleccionada);
		});
		
		//Creando los items del comboBox de los tipos estados de los prestamos
		ArrayList<String> listaEstadoPrestamo = new ArrayList<>();
		Collections.addAll(listaEstadoPrestamo, new String[] {"Ocupada","Disponible"});
		
		comboBoxEstadoPres.getItems().addAll(listaEstadoPrestamo);
		}

	//----------------------------METODOS JAVAFX----------------------------------//
	
	@FXML
	void nuevoCliente(ActionEvent event) {
		nuevoCliente();
	}


	@FXML
	void nuevoPrestamo(ActionEvent event) {
		nuevaReserva();
	}

	@FXML
	void registrarCliente(ActionEvent event) {
		registrarCliente();
	}

    @FXML
    void realizarReserva(ActionEvent event) {
    	registrarReserva();
    }
	@FXML
	void actulizarCliente(ActionEvent event) throws CustomerExistException {
		actualizarCliente();
	}



	@FXML
	void actualizarPrestamo(ActionEvent event) throws LoanExistException {
		actualizarReserva();
	}

	@FXML
	void buscarCliente(ActionEvent event) {
		buscarCliente();
	}


	@FXML
	void buscarPrestamo(ActionEvent event) {
		buscarReserva();
	}
	
	@FXML
	void eliminarCliente(ActionEvent event) {
		eliminarCliente();
	}

	
	@FXML
	void eliminarPrestamo(ActionEvent event) {
		eliminarReserva();
	}

	
	//-----------------------------------------------------------------------------//
	
	//Nos muestra un tipo de alerta
	private void showMessage(String titulo, String header, String contenido, AlertType tipoAlerta) {

		Alert alert = new Alert(tipoAlerta);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(contenido);
		alert.showAndWait();

	}
	
	//Carga la lista de los clientes
	private void cargarListaClientes() {
		tblListCostumer.getItems().clear();
		tblListCostumer.setItems(obtenerClientes());

	}



	//Carga la lista de los prestamos
	private void cargarListaReservas() {
		tblListLoan.getItems().clear();
		tblListLoan.setItems(obtenerReservas());
	}


	//Se le añade a la ObservableList de Prestamo los prestamos de los ArrayList
	private ObservableList<Prestamo> obtenerReservas() {
		listaReservas.addAll(aplicacion.obtenerReservas());
		return listaReservas;
	}

	//Se le añade a la ObservableList de Cliente los clientes de los ArrayList
	private ObservableList<Cliente> obtenerClientes() {
		listaClientes.addAll(aplicacion.obtenerClientes());
		return listaClientes;
	}
	
	/**
	 * Metodo para que al seleccionar un cliente este se rellene el formulario 
	 * con sus respectivos datos
	 * @param cliente objeto de tipo Cliente
	 */
	private void mostrarInformacionCliente(Cliente cliente) {
		if (cliente != null) {
			txtNombreCliente.setText(cliente.getNombre());
			txtTelefonoCliente.setText(cliente.getTelefono());
			txtDocumentoCliente.setText(cliente.getDocumento());
		
			txtEmailCliente.setText(cliente.getMail());
			//txtGenero.setText(cliente.getGenero());
			btnRegistrarCliente.setDisable(true);
			btnAEliminarCliente.setDisable(false);
			btnActuliazarCliente.setDisable(false);
			
			//rdBoton1.setText(cliente.getGenero());
			//System.out.println(rdBoton1.getText());
		}
	}

	/**
	 * Metodo para que al seleccionar un prestamo se rellene el formulario 
	 * con sus respectivos datos
	 * @param prestamo
	 */
	private void mostrarInformacionReserva(Prestamo prestamo) {

		if (prestamo != null) {
			txtCódigoPrestamo.setText(prestamo.getCodigo());
			comboBoxEstadoPres.getSelectionModel().select(prestamo.getEstadoHabitacion());
			txtValorPrestamo.setText(prestamo.getValor());
			dpFechaPrestamo.setValue(LocalDate.parse(prestamo.getFechaIngreso()));
			dpFechaEntrega.setValue(LocalDate.parse(prestamo.getFechaSalida()));
			txtCliente.setText(prestamo.getCliente().getNombre()+ " " + "CC: " + prestamo.getCliente().getDocumento());
			txtObjetos.setText(prestamo.getObjeto().getTipoHabitacion()+ " " + "Codigo: " + prestamo.getObjeto().getCodigo());
			txtDiasSolicitados.setText(String.valueOf(prestamo.getDiasSolicitados()));
			txtDiasTranscurridos.setText(String.valueOf(prestamo.getDiasTranscurridos()));
			btnRegistrarReserva.setDisable(true);
			btnActuliazarPrestamo.setDisable(false);
		}

	}

	// limpia la ventana del cliente
	private void nuevoCliente() {
		txtNombreCliente.setText("");
		txtTelefonoCliente.setText("");
		txtDocumentoCliente.setText("");
		txtEmailCliente.setText("");
		btnRegistrarCliente.setDisable(false);
		btnAEliminarCliente.setDisable(true);
		tblListCostumer.getSelectionModel().clearSelection();

	}


	// Limpia la ventana del prestamo
	private void nuevaReserva() {
		txtCódigoPrestamo.setText("");
		comboBoxEstadoPres.getSelectionModel().select(null);
		txtValorPrestamo.setText("");
		dpFechaPrestamo.setValue(null);
		dpFechaEntrega.setValue(null);
		txtCliente.setText("");
		txtObjetos.setText("");
		txtDiasSolicitados.setText("");
		txtDiasTranscurridos.setText("");
		txtBuscarPrestamo.setText("");
		btnRegistrarReserva.setDisable(false);
		btnActuliazarPrestamo.setDisable(true);
		tblListLoan.getSelectionModel().clearSelection();
	}

	/**
	 * Consultar cliente 
	 */
	private void buscarCliente(){
		String documento = txtBuscarCliente.getText();
		Cliente clienteEncontrado = null;
		clienteEncontrado = aplicacion.consultarAcliente(documento);
		
		if(clienteEncontrado != null) {
		showMessage("ENCONTRADO.", "Cliente encontrado.", "Es: "+clienteEncontrado.toString(),
				AlertType.INFORMATION);
		}else {
			showMessage("NO ENCONTRADO.", "Cliente no encontrado.", "Por favor verifique los datos",
					AlertType.WARNING);
		}
		
	}
	
	

	
	/**
	 * Consultar prestamo
	 */
	private void buscarReserva() {
		String codigo = txtBuscarPrestamo.getText();
		Prestamo reservaEncontrada = null;
		reservaEncontrada = aplicacion.consultarReserva(codigo);
		
		if(reservaEncontrada != null) {
			showMessage("ENCONTRADO.", "Reserva encontrada.", ""+reservaEncontrada.toString()+" ",
					AlertType.INFORMATION);
		}else {
			showMessage("NO ENCONTRADO.", "Reserva no encontrado.", "Por favor verifique los datos",
					AlertType.WARNING);
		}
		
	}
	
	/**
	 * Registra la información del cliente
	 */
	private void registrarCliente() {
		String nombreCliente = txtNombreCliente.getText();
		String telefonoCliente = txtTelefonoCliente.getText();
		String documentoCliente = txtDocumentoCliente.getText();
		String emailCliente = txtEmailCliente.getText();
	

		if (validarDatosCliente(nombreCliente, telefonoCliente, documentoCliente, emailCliente)) {

			Cliente cliente = null;
			cliente = aplicacion.registrarACliente(nombreCliente, telefonoCliente, documentoCliente,  emailCliente);

			if (cliente != null) {
				listaClientes.add(cliente);
				showMessage("Notificación.", "Registro completado.", "Cliente registrado con exito.",
						AlertType.INFORMATION);
			} else {
				showMessage("Notificación.", "¡Algo ocurrio! El registro no se pudó completar.",
						"El cliente no se pudo registrado con exito.", AlertType.INFORMATION);
			}

		}
	}

	private void registrarReserva() {
		String prestamoCodigo = txtCódigoPrestamo.getText();
		String prestamoEstado = comboBoxEstadoPres.getSelectionModel().getSelectedItem();
		String valorPrestamo = txtValorPrestamo.getText();
		String fechaPrestamo = dpFechaPrestamo.getValue().toString();
		String fechaEntrega = dpFechaEntrega.getValue().toString();
		String cliente = txtCliente.getText();
		String habitacion = txtObjetos.getText();
		String diasSolicitados = txtDiasSolicitados.getText();
		String diasTranscurridos = txtDiasTranscurridos.getText();

		if (validarDatosReserva(prestamoCodigo, prestamoEstado, valorPrestamo, fechaPrestamo, fechaEntrega, cliente, habitacion, diasSolicitados, diasTranscurridos)) {

			Cliente clienteEncontrado = aplicacion.buscarCliente(cliente);
			Objeto objetoEncontrado = aplicacion.buscarHabitacion(habitacion);

			int diasTrans = Integer.parseInt(diasTranscurridos);
			int diasSoli = Integer.parseInt(diasSolicitados);

			Prestamo reserva = null;

			if (objetoEncontrado.getUnidadesDisponibles() > 0 && (objetoEncontrado.getEstadoObjeto().equals(prestamoEstado))) {
				reserva = aplicacion.registrarReserva(prestamoCodigo, prestamoEstado, valorPrestamo, fechaPrestamo,
						fechaEntrega, clienteEncontrado, objetoEncontrado, diasTrans, diasSoli);

				objetoEncontrado.setUnidadesDisponibles(objetoEncontrado.getUnidadesDisponibles() - 1);
				objetoEncontrado.setUnidadesPrestadas(objetoEncontrado.getUnidadesPrestadas() + 1);

				if (reserva != null) {
					listaReservas.add(reserva);
					showMessage("Notificación.", "Registro completado.", "Reserva registrada con éxito.",
							AlertType.INFORMATION);
				} else {
					showMessage("Notificación.", "¡Algo ocurrio! La reserva no se pudó completar.",
							"La reserva no se pudo realizar con éxito.", AlertType.INFORMATION);
				}

			} else {
				showMessage("Notificación.", "¡Algo ocurrio!", "No hay habitaciones disponibles.", AlertType.INFORMATION);

			}

		}

	}

	private void actualizarCliente() throws CustomerExistException {
		String nombreCliente = txtNombreCliente.getText();
		String telefonoCliente = txtTelefonoCliente.getText();
		String identificacionCliente = txtDocumentoCliente.getText();
		String emailCliente = txtEmailCliente.getText();

		if (clienteSeleccionado != null) {
			if (validarDatosCliente2(nombreCliente, telefonoCliente, identificacionCliente, emailCliente)) {

				aplicacion.actualizarAcliente(clienteSeleccionado.getDocumento(), identificacionCliente, nombreCliente,
						telefonoCliente, emailCliente);

				tblListCostumer.refresh();

				showMessage("Notificación.", "Actualizacion Completada", "Se ha actualizado con exito.",
						AlertType.INFORMATION);
			}
		} else {
			showMessage("Notificación.", "Actualizacion incompleta", "No se ha podido actualizar el cliente",
					AlertType.INFORMATION);

		}

	}


	//Actualizar un prestamo
	private void actualizarReserva() throws LoanExistException {
		String prestamoCodigo = txtCódigoPrestamo.getText();
		String prestamoEstado = comboBoxEstadoPres.getSelectionModel().getSelectedItem();
		String valorPrestamo = txtValorPrestamo.getText();
		String fechaPrestamo = dpFechaPrestamo.getValue().toString();
		String fechaEntrega = dpFechaEntrega.getValue().toString();
		String cliente = txtCliente.getText();
		String habitacion = txtObjetos.getText();
		String diasSolicitados = txtDiasSolicitados.getText();
		String diasTranscurridos = txtDiasTranscurridos.getText();
		
		if (reservaSeleccionada != null) {
			if (validarDatosReserva1(prestamoCodigo, prestamoEstado, valorPrestamo, fechaPrestamo, fechaEntrega, cliente, habitacion, diasSolicitados, diasTranscurridos)) {
				
					int diasTrans = Integer.parseInt(diasTranscurridos);
					int diasSoli = Integer.parseInt(diasSolicitados);
			
					Cliente clienteEncontrado = aplicacion.buscarCliente(cliente);
					Objeto objetoEncontrado = aplicacion.buscarHabitacion(habitacion);
					
					if(objetoEncontrado.getUnidadesDisponibles() > 0) {

					aplicacion.actualizarPrestamo(reservaSeleccionada.getCodigo(), prestamoCodigo, valorPrestamo, fechaPrestamo, fechaEntrega,
					prestamoEstado, clienteEncontrado, objetoEncontrado, diasTrans, diasSoli);

					showMessage("Notificación.", "Actualizacion Completada", "Se ha actualizado con exito.",
							AlertType.INFORMATION);
					tblListLoan.refresh();
		}else {
			showMessage("Notificación.", "Actualizacion incompletada", "No hay unidades disponibles.",
					AlertType.INFORMATION);
		}
			}
	} else {
		showMessage("Notificación.", "Actualizacion incompleta", "No se ha podido actualizar la información.",
				AlertType.INFORMATION);
	}
		}
	
	private void eliminarCliente() {
		if(clienteSeleccionado != null) {
			int i = 0;
			boolean clienteTienePrestamos = aplicacion.obtenerClienteReserva(clienteSeleccionado);
			i = aplicacion.eliminarACliente(clienteSeleccionado.getDocumento());
			if(clienteTienePrestamos == false) {
			if(i>=0) {
				listaClientes.remove(i);
				showMessage("Notificación.", "Eliminacion Completada", "Se ha eliminado con exito.",
						AlertType.INFORMATION);
			}
		}else {
			showMessage("Notificación.", "Eliminacion incompleta", "El cliente tiene prestamos activos.",
					AlertType.WARNING);
		}
			}
		else {
			showMessage("Notificación.", "Eliminacion incompleta", "Seleccione un cliente.",
					AlertType.WARNING);
		}
	}
	
	private void eliminarReserva() {
		if(reservaSeleccionada != null) {
			if(reservaSeleccionada.getEstadoHabitacion().equalsIgnoreCase("Disponible")) {
			int i = 0;
			i = aplicacion.eliminarAPrestamo(reservaSeleccionada.getCodigo());
			if(i >= 0) {
				reservaSeleccionada.getObjeto().setUnidadesDisponibles(reservaSeleccionada.getObjeto().getUnidadesDisponibles() +1);
				reservaSeleccionada.getObjeto().setUnidadesPrestadas(reservaSeleccionada.getObjeto().getUnidadesPrestadas() -1);
				listaReservas.remove(i);
				
				showMessage("Notificación.", "Eliminacion Completada", "Se ha eliminado con exito.",
						AlertType.INFORMATION);
			}
		}else {
			showMessage("Notificación.", "Eliminacion incompleta", "Esta reserva se encuentra activa.",
					AlertType.INFORMATION);
		}
			}else {
			showMessage("Notificación.", "Eliminacion incompleta", "Seleccione una reserva.",
					AlertType.WARNING);
		}
	}

	private boolean validarDatosCliente(String nombreCliente, String telefonoCliente, String documentoCliente, String emailCliente) {
		String mensaje = "";

		if (nombreCliente == null || nombreCliente.equals("") || nombreCliente.matches("[0-9]+")) {
			mensaje += "NOMBRE NO VALIDO.\n";
		}
		if (telefonoCliente == null || telefonoCliente.equals("") || telefonoCliente.matches("[a-zA-Z]+")) {
			mensaje += "TELEFONO NO VALIDO\n";
		}
		if (documentoCliente == null || documentoCliente.equals("") || documentoCliente.matches("[a-zA-Z]+")) {
			mensaje += "CEDULA NO VALIDA.\n";
		} else {
			if (clienteSeleccionado != null) {
				if (!documentoCliente.equals(clienteSeleccionado.getDocumento())) {
					if (aplicacion.verifyIdentificacionCliente(documentoCliente)) {
						mensaje += "¡ESE DOCUMENTO YA EXISTE!";
					}
				}
			} else {
				if (aplicacion.verifyIdentificacionCliente(documentoCliente)) {
					mensaje += "¡ESA DOCUMENTO YA EXISTE!";
				}
			}
		}
	
		if (emailCliente == null || emailCliente.equals("") || !emailCliente.contains("@")) {
			mensaje += "EMAIL NO VALIDO\n";
		}
		if (mensaje.equals("")) {
			return true;
		} else {

			showMessage("Notificación.", "DATOS INCORRECTOS.", mensaje, AlertType.WARNING);
			return false;
		}
	}

	// Valida los datos para la actulización del cliente
	private boolean validarDatosCliente2(String nombreCliente, String telefonoCliente, String documentoCliente,
			 String emailCliente) {
		String mensaje = "";

		if (nombreCliente == null || nombreCliente.equals("") || nombreCliente.matches("[0-9]+")) {
			mensaje += "NOMBRE NO VALIDO.\n";
		}
		if (telefonoCliente == null || telefonoCliente.equals("") || telefonoCliente.matches("[a-zA-Z]+")) {
			mensaje += "TELEFONO NO VALIDO\n";
		}
		if (documentoCliente == null || documentoCliente.equals("")
				|| documentoCliente.matches("[a-zA-Z]+")) {
			mensaje += "CEDULA NO VALIDA.\n";
		} else {
			if (clienteSeleccionado != null) {
				if (!documentoCliente.equals(clienteSeleccionado.getDocumento())) {
					if (aplicacion.verifyIdentificacionCliente(documentoCliente)) {
						mensaje += "¡ESE DOCUMENTO YA EXISTE!";
					}
				}
			} else {
				if (aplicacion.verifyIdentificacionCliente(documentoCliente)) {
					mensaje += "¡ESA DOCUMENTO YA EXISTE!";
				}
			}
		}
	
		if (emailCliente == null || emailCliente.equals("") || !emailCliente.contains("@")) {
			mensaje += "EMAIL NO VALIDO\n";
		}

		if (mensaje.equals("")) {
			return true;
		} else {

			showMessage("Notificación.", "DATOS INCORRECTOS.", mensaje, AlertType.WARNING);
			return false;
		}
	}

	private boolean validarDatosReserva(String codigoReserva, String estadoReserva, String valorReserva, String fechaIngreso,
			String fechaSalida, String customer, String habitacion, String diasSolicitados,
			String diasTranscurridos) {

		String mensaje = "";
		String estado1 = "Disponible";
		String estado2 = "Ocupada";
		if (codigoReserva == null || codigoReserva.equals("") || codigoReserva.matches("[a-zA-Z]")) {
			mensaje += "¡CÓDIGO NO VALIDO!";
		} else {
			if (reservaSeleccionada != null) {
				if (!codigoReserva.equals(reservaSeleccionada.getCodigo())) {
					if (aplicacion.verificarCodigoReserva(codigoReserva)) {
						mensaje += "¡ESTE CÓDIGO YA ESTÁ REGISTRADO!";
					}
				}
			} else {
				if (aplicacion.verificarCodigoReserva(codigoReserva)) {
					mensaje += "¡ESTE CÓDIGO YA ESTÁ REGISTRADO!";
				}
			}
		}
		if (!estadoReserva.equalsIgnoreCase(estado1) || estadoReserva == null || estadoReserva.equals("")) {
			if (!estadoReserva.equalsIgnoreCase(estado2)) {
				mensaje += "¡ESTADO INVALIDO!";
			}
		}
		if (valorReserva == null || valorReserva.equals("") || valorReserva.matches("[a-zA-Z]")) {
			mensaje += "¡VALOR INVALIDO!";
		}
		if (fechaIngreso == null || fechaIngreso.equals("") ) {
			mensaje += "¡FECHA INVALIDA!";
		}
		if (fechaSalida == null || fechaSalida.equals("") ) {
			mensaje += "¡FECHA DE SALIDA INVALIDA!";
		}
		if (!aplicacion.verifyIdentificacionCliente(customer) || customer == null || customer.equals("")
				|| customer.matches(("[a-zA-Z]"))) {
			mensaje += "¡CLIENTE INVALIDO!";
		}
		if (!aplicacion.verificarCodigoHabitacion(habitacion) || habitacion == null || habitacion.equals("")) {
			mensaje += "¡HABITACIÓN INVALIDA!";
		}
		if (diasSolicitados == null || diasSolicitados.equals("") || diasSolicitados.matches("[a-zA-Z]+")) {
			mensaje += "¡DATOS INVALIDOS!";
		}
		if (diasTranscurridos == null || diasTranscurridos.equals("") || diasTranscurridos.matches("[a-zA-Z]+")) {
			mensaje += "¡DATOS INVALIDOS!";
		}

		if (mensaje.equals("")) {
			return true;
		} else {

			showMessage("Notificación.", "DATOS INCORRECTOS.", mensaje, AlertType.WARNING);
			return false;
		}
	}

	//Valida los datos para la actualizacion de un prestamo
	private boolean validarDatosReserva1(String codigoReserva, String estadoReserva, String valorReserva, String fechaIngreso,
			String fechaSalida, String cliente, String habitacion, String diasSolicitados,
			String diasTranscurridos) {

		String mensaje = "";
		String estado1 = "Disponible";
		String estado2 = "Ocupada";
		if (codigoReserva == null || codigoReserva.equals("") || codigoReserva.matches("[a-zA-Z]")) {
			mensaje += "¡CÓDIGO NO VALIDO!";
		} else {
			if (reservaSeleccionada != null) {
				if (!codigoReserva.equals(reservaSeleccionada.getCodigo())) {
					if (aplicacion.verificarCodigoReserva(codigoReserva)) {
						mensaje += "¡ESTE CÓDIGO YA ESTÁ REGISTRADO!";
					}
				}
			}
		}
		if (!estadoReserva.equalsIgnoreCase(estado1) || estadoReserva == null || estadoReserva.equals("")) {
			if (!estadoReserva.equalsIgnoreCase(estado2)) {
				mensaje += "¡ESTADO INVALIDO!";
			}
		}
		if (valorReserva == null || valorReserva.equals("") || valorReserva.matches("[a-zA-Z]")) {
			mensaje += "¡VALOR INVALIDO!";
		}
		if (fechaIngreso == null || fechaIngreso.equals("") || fechaIngreso.matches("[a-zA-Z]+")) {
			mensaje += "¡FECHA INVALIDA!";
		}
		if (fechaSalida == null || fechaSalida.equals("") || fechaSalida.matches("[a-zA-Z]")) {
			mensaje += "¡FECHA DE SALIDA INVALIDA!";
		}
		if (!aplicacion.verifyIdentificacionCliente(cliente) || cliente == null || cliente.equals("")
				|| cliente.matches(("[a-zA-Z]"))) {
			mensaje += "¡CLIENTE INVALIDO!";
		}

		if (!aplicacion.verificarCodigoHabitacion(habitacion) || habitacion == null || habitacion.equals("")) {
			mensaje += "¡HABITACIÓN INVALIDO!";
		}
		if (diasSolicitados == null || diasSolicitados.equals("") || diasSolicitados.matches("[a-zA-Z]+")) {
			mensaje += "¡DATOS INVALIDOS!";
		}
		if (diasTranscurridos == null || diasTranscurridos.equals("") || diasTranscurridos.matches("[a-zA-Z]+")) {
			mensaje += "¡DATOS INVALIDOS!";
		}

		if (mensaje.equals("")) {
			return true;
		} else {

			showMessage("Notificación.", "DATOS INCORRECTOS.", mensaje, AlertType.WARNING);
			return false;
		}
	}
	

}
