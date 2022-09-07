package co.edu.uniquindio.gestionPrestamos.model;

import java.util.ArrayList;

/**
 * Representa del detalle del prestamo
 * @author santi, juan, nodier.
 *
 */
public class DetallePrestamo {

    private int habitacionesOcupadas;
    private double subTotal;
    private ArrayList<Objeto> habitaciones = new ArrayList<>();
    
    
    /*
     * Constructor
     * @param borrowedUnits
     * @param subTotal
     * @param loanedProduct
     */
    public DetallePrestamo(int habitacionesOcupadas, double subTotal, ArrayList<Objeto> habitaciones) {
        super();
        this.habitacionesOcupadas = habitacionesOcupadas;
        this.subTotal = subTotal;

    }
    
    /**
     * Constructor2
     * @param borrowedUnits
     * @param subTotal
     */
    public DetallePrestamo(int habitacionesOcupadas, double subTotal) {
        super();
        this.habitacionesOcupadas = habitacionesOcupadas;
        this.subTotal = subTotal;
    }
    
    //Getters y setters
    public int getUnidadesOcupadas() {
        return habitacionesOcupadas;
    }
    
    public void setUnidadesOcupadas(int habitacionesOcupadas) {
        this.habitacionesOcupadas = habitacionesOcupadas;
    }
    
    public double getSubTotal() {
        return subTotal;
    }
    
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    public ArrayList<Objeto> getHabitaciones() {
        return habitaciones;
    }
    
    public void setHabitaciones(ArrayList<Objeto> loanedProduct1) {
        this.habitaciones = loanedProduct1;
    }
    
	

}

