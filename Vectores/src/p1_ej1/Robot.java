package p1_ej1;

public class Robot {
	
	private String codigo;
	
	private double nivelBat;

	public Robot(String codigo, double nivelBat) {
		super();
		this.codigo = codigo;
		this.nivelBat = nivelBat;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getNivelBat() {
		return nivelBat;
	}
	
	

}
