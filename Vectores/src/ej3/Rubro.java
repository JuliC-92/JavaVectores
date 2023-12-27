package ej3;

public class Rubro {
	
	private final int TOTAL_MESES = 12;
	
	private String nombre;
	 double[] gastosPorMes;
	
	
	public Rubro (String nombre) {
		this.nombre=nombre;
		inicializarGastos();
	}

	private void inicializarGastos() {
		gastosPorMes = new double [TOTAL_MESES];
	}

	public void agregarGasto (Mes mes, double importe) {
		int i = mes.ordinal();
		gastosPorMes[i]+= importe;
		}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getTotalGastos(Mes mes) {
		int i= mes.ordinal();
		return this.gastosPorMes[i];
		}

	
}
