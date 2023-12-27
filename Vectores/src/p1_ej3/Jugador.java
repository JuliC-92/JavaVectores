package p1_ej3;

public class Jugador {

	private String apellido;
	
	private int numero;
	
	private Posicion posicion;

	public Jugador(String apellido, int numero, Posicion posicion) {
		super();
		this.apellido = apellido;
		this.numero = numero;
		this.posicion = posicion;
	}

	public boolean esTuNumero(int numero) {
		boolean es = false;
		if (numero == this.numero) {
			es = true;
		}
		return es;
	}
	
	public boolean esTuApellido(String apellido) {
		boolean es = false;
		if (apellido.equalsIgnoreCase(apellido)) {
			es= true;
		}
		return es;
	}
	
	public boolean esTuPosicion(Posicion posicion) {
		boolean es = false;
		if (posicion == this.posicion) {
			es=true;
		}
		return es;
	}
	
	
	public Posicion getPosicion() {
		return posicion;
	}

	@Override
	public String toString() {
		return "Jugador [apellido=" + apellido + ", numero=" + numero + ", posicion=" + posicion + "]";
	}

	
}
