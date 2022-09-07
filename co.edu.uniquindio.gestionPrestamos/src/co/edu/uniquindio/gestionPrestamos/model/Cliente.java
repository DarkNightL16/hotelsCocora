package co.edu.uniquindio.gestionPrestamos.model;

/**
 * Representa la clase Cliente, esta extiende de la clase Persona
 * @author santi, juan, nodier.
 */
public class Cliente extends Persona {

	/**
	 * Metodo contructor de la clase Cliente
	 * @param documento este parametro representa el documento del cliente
	 * @param nombre este parametro representa el nombre del cliente
	 * @param telefono este parametro representa el telefono del cliente
	 * @param celular este parametro representa el celular del cliente
	 * @param direccion este parametro representa la direccion del cliente
	 * @param ciudadResidencia este parametro representa la ciudad del cliente
	 * @param departamento este parametro representa el departamento del cliente
	 * @param pais este parametro representa el pais del cliente
	 * @param mail este parametro representa el mail del cliente
	 * @param profesion este parametro representa la profesion del cliente
	 * @param genero este parametro representa el genero del cliente
	 */
	public Cliente(String documento, String nombre, String telefono, String mail) {
		
		super(documento, nombre, telefono, mail);
		//this.profesion = profesion;
		//this.genero = genero;
	}

	//-------------------------SETTERS AND GETTERS------------------------------//
	
	//@Override
	/**public String toString() {
		return "Cliente [profesion=" + profesion + ", getDocumento()=" + getDocumento() + ", getNombre()=" + getNombre()
				+ ", getTelefono()=" + getTelefono() + ", getCelular()=" + getCelular() + ", getDireccion()="
				+ getDireccion() + ", getCiudadResidencia()=" + getCiudadResidencia() + ", getDepartamento()="
				+ getDepartamento() + ", getPais()=" + getPais() + ", getMail()=" + getMail() + "]";
	}*/
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + "\nDocumento: " + getDocumento() + "\nTelefono: " + getTelefono() + "\nEmail: " + getMail();
		
	}

	public String toStringNombre() {
		return "" + getNombre();
	}
	
	

}
