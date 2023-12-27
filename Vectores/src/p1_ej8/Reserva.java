package p1_ej8;

public class Reserva {
	
	private String ID;
	private String DNICliente;
	private int numeroAsiento;
	
	
	
	public Reserva(String dNICliente, int numeroAsiento) {
		super();
		DNICliente = dNICliente;
		this.numeroAsiento = numeroAsiento;
	}



	public int getNumeroAsiento() {
		return numeroAsiento;
	}
	
	
	

}
