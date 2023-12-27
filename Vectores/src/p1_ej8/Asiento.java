package p1_ej8;

public class Asiento {

	private Estado estado;
	private int numero;
	
	
	public Asiento(int numero) {
		super();
		this.estado = Estado.LIBRE;
		this.numero = numero;
	}

	

	public Estado getEstado() {
		return estado;
	}



	@Override
	public String toString() {
		return "A" + String.format("%02d", numero)+estado.name().charAt(0);
	}


	public void reservar() {
		this.estado = Estado.RESERVADO;
	}
}
