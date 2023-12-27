package ej1_2;

public enum Mes {
	
	
	ENERO(0),FEBRERO(31),MARZO(59),ABRIL(90),MAYO(120),JUNIO(151),JULIO(181),AGOSTO(212),SEPTIEMBRE(243),OCTUBRE(273),NOVIEMBRE(304),DICIEMBRE(334);
		
	private final int diasDeMes;
	
	private Mes(int valorEntero) {
		this.diasDeMes = valorEntero;
	}

	public int getDiasMes() {
		return this.diasDeMes;
	}
}
