package co.edu.uniquindio.gestionPrestamos.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

import co.edu.uniquindio.gestionPrestamos.Aplicacion;
import co.edu.uniquindio.gestionPrestamos.exception.LoanExistException;
import co.edu.uniquindio.gestionPrestamos.model.Cliente;
import co.edu.uniquindio.gestionPrestamos.model.Objeto;
import co.edu.uniquindio.gestionPrestamos.model.Prestamo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class LoanController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEmpleadoPrestamoPrestar;
    
    @FXML
    private TextField txtObjetoPrestado;
    
    @FXML
    private TextField txtDiasSolici;

    @FXML
    private TextField txtDiasTranscu;

    @FXML
    private Button btnRegistarPrestar;

    @FXML
    private Button btnNuevoPrestar;

    @FXML
    private TableColumn<Prestamo, String> columnCodigoPrestar;

    @FXML
    private TableColumn<Prestamo, String> columnValorPrestar;

    @FXML
    private TextField txtcodigoPrestamoPrestar;

    @FXML
    private Button btnActualizarPrestar;
    
    @FXML
    private Button btnEliminarPrestar;
    
    @FXML
    private ComboBox<String> comboBoxEstado;
    
    @FXML
    private DatePicker dpFechaPrestamoPrestar;

    @FXML
    private DatePicker dpFechaEntregaPrestar;
    
    @FXML
    private Button btnBuscarPrestamosPrestar;
    
    @FXML
    private TextField txtBuscarPrestamoPrestar;

    @FXML
    private TextField txtValorPrestamoPrestar;

    @FXML
    private Button btnBuscarPrestamoPrestar;

    @FXML
    private TableView<Prestamo> tblListPrestar;
    
    @FXML
    private TableColumn<Prestamo, String> columnNombreObjeto2;

    @FXML
    private TextField txtEstadoPrestamoPrestar;

    @FXML
    private TextField txtclientePrestamoPrestar;
    
	private Aplicacion aplicacion;
	ObservableList<Prestamo> listaPrestamos = FXCollections.observableArrayList();
	private Prestamo reservaSeleccionada;

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
		loadLoanList();
	}
	
	@FXML
	void initialize() {

		this.columnValorPrestar.setCellValueFactory(new PropertyValueFactory<>("valor"));
		this.columnCodigoPrestar.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		this.columnNombreObjeto2.setCellValueFactory(new PropertyValueFactory<>("nombreObjeto"));

		tblListPrestar.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
			reservaSeleccionada = newSelection;
			showLoanInformation(reservaSeleccionada);
		});
		
		ArrayList<String> listaTipoEstado = new ArrayList<>();
		Collections.addAll(listaTipoEstado, new String[] {"Falta por entregar","Entregado"});
		
		comboBoxEstado.getItems().addAll(listaTipoEstado);
	} 
	
	@FXML
    void buscarPrestamoPrestar(ActionEvent event) {
		buscarPrestamoPrestar();
    }

    @FXML
    void actualizarPrestar(ActionEvent event) throws LoanExistException {
    	actualizarPrestar();
    }

    @FXML
    void registarPrestar(ActionEvent event) {
    	registarReserva();
    }
    
    @FXML
    void eliminarPrestar(ActionEvent event) {
    	eliminarPrestar();
    }
   

    @FXML
    void nuevoPrestar(ActionEvent event) {
    	txtcodigoPrestamoPrestar.setText("");
    	//txtEstadoPrestamoPrestar.setText("");
		comboBoxEstado.getSelectionModel().select(null);
    	txtValorPrestamoPrestar.setText("");
		dpFechaPrestamoPrestar.setValue(null);
		//txtFechaPrestamoPrestar.setText("");
		dpFechaEntregaPrestar.setValue(null);
		//txtFechaEntregaPrestamoPrestar.setText("");
		txtclientePrestamoPrestar.setText("");
		txtEmpleadoPrestamoPrestar.setText("");
		txtObjetoPrestado.setText("");
		txtDiasSolici.setText("");
		txtDiasTranscu.setText("");
		txtBuscarPrestamoPrestar.setText("");
		//txtBuscarPrestar.setText("");
		btnRegistarPrestar.setDisable(false);
		btnActualizarPrestar.setDisable(true);
		tblListPrestar.getSelectionModel().clearSelection();
    }
    
	private void showMessage(String titulo, String header, String contenido, AlertType tipoAlerta) {

		Alert alert = new Alert(tipoAlerta);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(contenido);
		alert.showAndWait();

	}
	
	private void loadLoanList() {
		tblListPrestar.getItems().clear();
		tblListPrestar.setItems(obtenerReservas());
	}
	
    
	private ObservableList<Prestamo> obtenerReservas() {
		listaPrestamos.addAll(aplicacion.obtenerReservas());
		return listaPrestamos;
	}
	
	private void showLoanInformation(Prestamo prestamo) {

		if (prestamo != null) {
			txtcodigoPrestamoPrestar.setText(prestamo.getCodigo());
			//txtEstadoPrestamoPrestar.setText(loan.getEstadoPrestamo().toString());
			comboBoxEstado.getSelectionModel().select(prestamo.getEstadoHabitacion());
			txtValorPrestamoPrestar.setText(prestamo.getValor());
			dpFechaPrestamoPrestar.setValue(LocalDate.parse(prestamo.getFechaIngreso()));
			//txtFechaPrestamoPrestar.setText(prestamo.getFechaPrestamo());
			dpFechaEntregaPrestar.setValue(LocalDate.parse(prestamo.getFechaIngreso()));
			//txtFechaEntregaPrestamoPrestar.setText(prestamo.getFechaEntrega());
			txtclientePrestamoPrestar.setText(prestamo.getCliente().getNombre()+ " " + "CC: " + prestamo.getCliente().getDocumento());
			txtObjetoPrestado.setText(prestamo.getObjeto().getTipoHabitacion()+ " " + "Codigo: " + prestamo.getObjeto().getCodigo());
			txtDiasSolici.setText(String.valueOf(prestamo.getDiasSolicitados()));
			txtDiasTranscu.setText(String.valueOf(prestamo.getDiasTranscurridos()));
			btnRegistarPrestar.setDisable(true);
			btnActualizarPrestar.setDisable(false);

		}

	}
	
	private void registarReserva() {
	 	String prestamoCodigo = txtcodigoPrestamoPrestar.getText();
			//String prestamoEstado = txtEstadoPrestamoPrestar.getText();
			String valorPrestamo = txtValorPrestamoPrestar.getText();
			String fechaPrestamo = dpFechaPrestamoPrestar.getValue().toString();
			//String fechaPrestamo = txtFechaPrestamoPrestar.getText();
			String fechaEntrega = dpFechaEntregaPrestar.getValue().toString();
			//String fechaEntrega = txtFechaEntregaPrestamoPrestar.getText();
			String cliente = txtclientePrestamoPrestar.getText();
			String habitacion = txtObjetoPrestado.getText();
			String diasSolicitados = txtDiasSolici.getText();
			String diasTranscurridos = txtDiasTranscu.getText();
			String prestamoEstado = comboBoxEstado.getSelectionModel().getSelectedItem();

			if (validarDatosPrestamo(prestamoCodigo, prestamoEstado, valorPrestamo, fechaPrestamo, fechaEntrega, cliente,
			 habitacion, diasSolicitados, diasTranscurridos)) {

				Cliente clienteEncontrado = aplicacion.buscarCliente(cliente);
				Objeto objetoEncontrado = aplicacion.buscarHabitacion(habitacion);

				int diasTrans = Integer.parseInt(diasTranscurridos);
				int diasSoli = Integer.parseInt(diasSolicitados);

				Prestamo loan = null;

				if (objetoEncontrado.getUnidadesDisponibles() > 0) {
					loan = aplicacion.registrarReserva(prestamoCodigo, prestamoEstado, valorPrestamo, fechaPrestamo,
							fechaEntrega, clienteEncontrado, objetoEncontrado, diasTrans, diasSoli);

					objetoEncontrado.setUnidadesDisponibles(objetoEncontrado.getUnidadesDisponibles() - 1);
					objetoEncontrado.setUnidadesPrestadas(objetoEncontrado.getUnidadesPrestadas() + 1);

					if (loan != null) {
						listaPrestamos.add(loan);
						showMessage("Notificación.", "Registro completado.", "Prestamo registrado con exito.",
								AlertType.INFORMATION);
					} else {
						showMessage("Notificación.", "¡Algo ocurrio! El registro no se pudó completar.",
								"El prestamo no se pudo registrado con exito.", AlertType.INFORMATION);
					}

				} else {
					showMessage("Notificación.", "¡Algo ocurrio!", "No hay unidades disponibles.", AlertType.INFORMATION);

				}

			}
	}
	
	private void actualizarPrestar() throws LoanExistException {
	 	String prestamoCodigo = txtcodigoPrestamoPrestar.getText();
		String prestamoEstado = comboBoxEstado.getSelectionModel().getSelectedItem();
		//	String prestamoEstado = txtEstadoPrestamoPrestar.getText();
			String valorPrestamo = txtValorPrestamoPrestar.getText();
			String fechaPrestamo = dpFechaPrestamoPrestar.getValue().toString();
			String fechaEntrega = dpFechaEntregaPrestar.getValue().toString();
			String cliente = txtclientePrestamoPrestar.getText();
		
			String habitacion = txtObjetoPrestado.getText();
			String diasSolicitados = txtDiasSolici.getText();
			String diasTranscurridos = txtDiasTranscu.getText();
		
		if (reservaSeleccionada != null) {
			if (validarDatosReserva2(prestamoCodigo, prestamoEstado, valorPrestamo, fechaPrestamo, fechaEntrega, cliente,
			 habitacion, diasSolicitados, diasTranscurridos)) {
			
			int diasTrans = Integer.parseInt(diasTranscurridos);
			int diasSoli = Integer.parseInt(diasSolicitados);
			
			Cliente clienteEncontrado = aplicacion.buscarCliente(cliente);
			Objeto objetoEncontrado = aplicacion.buscarHabitacion(habitacion);

			aplicacion.actualizarPrestamo(reservaSeleccionada.getCodigo(), prestamoCodigo, valorPrestamo, fechaPrestamo, fechaEntrega,
					prestamoEstado, clienteEncontrado, objetoEncontrado, diasTrans, diasSoli);

			showMessage("Notificación.", "Actualizacion Completada", "Se ha actualizado con exito.",
					AlertType.INFORMATION);
			tblListPrestar.refresh();
		}
	} else {
		showMessage("Notificación.", "Actualizacion incompleta", "No se ha podido actualizar la información.",
				AlertType.INFORMATION);
	}
		}
	
	
	private void buscarPrestamoPrestar() {
		String codigo = txtBuscarPrestamoPrestar.getText();
		Prestamo prestamoEncontrado = null;
		prestamoEncontrado = aplicacion.consultarReserva(codigo);
		
		if(prestamoEncontrado != null) {
			showMessage("ENCONTRADO.", "Prestamo encontrado.", "Es: "+prestamoEncontrado.toString()+" ",
					AlertType.INFORMATION);
		}else {
			showMessage("NO ENCONTRADO.", "Prestamo no encontrado.", "Por favor verifique los datos",
					AlertType.WARNING);
		}
		
	}
	
	
	private void eliminarPrestar() {
		if(reservaSeleccionada != null) {
			if(reservaSeleccionada.getEstadoHabitacion().equalsIgnoreCase("Entregado")) {
			int i = 0;
			i = aplicacion.eliminarAPrestamo(reservaSeleccionada.getCodigo());
			if(i >= 0) {
				reservaSeleccionada.getObjeto().setUnidadesDisponibles(reservaSeleccionada.getObjeto().getUnidadesDisponibles() +1);
				reservaSeleccionada.getObjeto().setUnidadesPrestadas(reservaSeleccionada.getObjeto().getUnidadesPrestadas() -1);
				listaPrestamos.remove(i);
				showMessage("Notificación.", "Eliminacion Completada", "Se ha eliminado con exito.",
						AlertType.INFORMATION);
			}
		}else {
			showMessage("Notificación.", "Eliminacion incompleta", "Esta reserva se encuentra activa.",
					AlertType.INFORMATION);
		}
			}else {
			showMessage("Notificación.", "Eliminacion incompleta", "Seleccione un cliente.",
					AlertType.WARNING);
		}
	}
	
	private boolean validarDatosPrestamo(String codigo, String estado, String valor, String fechaIngreso,
			String fechaSalida, String cliente, String habitacion, String diasSolicitados,
			String diasTranscurridos) {

		String mensaje = "";
		String estado1 = "Disponible";
		String estado2 = "Ocupada";
		if (codigo == null || codigo.equals("") || codigo.matches("[a-zA-Z]")) {
			mensaje += "¡CÓDIGO NO VALIDO!";
		} else {
			if (reservaSeleccionada != null) {
				if (!codigo.equals(reservaSeleccionada.getCodigo())) {
					if (aplicacion.verificarCodigoReserva(codigo)) {
						mensaje += "¡ESTE CÓDIGO YA ESTÁ REGISTRADO!";
					}
				}
			} else {
				if (aplicacion.verificarCodigoReserva(codigo)) {
					mensaje += "¡ESTE CÓDIGO YA ESTÁ REGISTRADO!";
				}
			}
		}
		if (!estado.equalsIgnoreCase(estado1) || estado == null || estado.equals("")) {
			if (!estado.equalsIgnoreCase(estado2)) {
				mensaje += "¡ESTADO INVALIDO!";
			}
		}
		if (valor == null || valor.equals("") || valor.matches("[a-zA-Z]")) {
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
	
	private boolean validarDatosReserva2(String codigoReserva, String estadoReserva, String valorReserva, String fechaIngreso,
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

