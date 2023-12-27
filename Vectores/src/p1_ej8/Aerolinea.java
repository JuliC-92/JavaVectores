package p1_ej8;

import java.util.ArrayList;

public class Aerolinea {
	
	private ArrayList<Reserva> reservas;
	
	private Avion avion;

	public Aerolinea() {
		super();
		this.reservas = new ArrayList<>();
		this.avion = new Avion(16, 6, "Boeing");
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void mostrarAvion() {
		this.avion.mostrarAsientos();
	}
	
	public void asignar() {
		for (Reserva reserva : reservas) {
			this.avion.asignar(reserva.getNumeroAsiento());
		}
	}

	public int asientosLibresConVentanilla() {
		return this.avion.asientosLibresConVentanilla();
	}
}
