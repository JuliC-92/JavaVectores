package p1_ej1;

public class Objeto {
	
	private String tipo;

	public Objeto(String tipo) {
		super();
		this.tipo = tipo;
	}
	

	public String getTipo() {
		return tipo;
	}


	@Override
	public String toString() {
		return "Objeto [tipo=" + tipo + "]";
	}
	
	

}
