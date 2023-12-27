package p1_ej8;

public class Avion {
	
	private int FILAS = 16;
	private int COLUMNAS = 6;
	private String marca;
	private Asiento[][] asientos;
	


	public Avion(int FILAS, int ASIENTOS_X_FILAS, String marca) {
		super();
		this.FILAS= FILAS;
		this.COLUMNAS = ASIENTOS_X_FILAS;
		this.marca = marca;
		this.asientos = new Asiento[FILAS][ASIENTOS_X_FILAS];
		autoGenerarAsientos();
	}

	private void autoGenerarAsientos() {
		for (int iFila = 0; iFila < asientos.length; iFila++) {
			for (int iColumna = 0; iColumna < asientos[iFila].length; iColumna++) {
				asientos[iFila][iColumna] = new Asiento(iFila* COLUMNAS + iColumna+1);
			}
		}
	}



	public void asignar (int nroAsiento) {
		int iFilas = (nroAsiento - 1) / COLUMNAS;
		int iColumnas = (nroAsiento - 1) % COLUMNAS;
		asientos[iFilas][iColumnas].reservar();
	}
	
	
	
	public int asientosLibresConVentanilla() {
		int contLibres =0;
		for (int iFila = 0; iFila < asientos.length; iFila++) {
			if(asientos[iFila][0].getEstado()==Estado.LIBRE) {
				contLibres++;
			}
		}
		for (int iFila = 0; iFila < asientos.length; iFila++) {
			if(asientos[iFila][5].getEstado()==Estado.LIBRE) {
				contLibres++;
			}
		}return contLibres;
	}
	
	
	public  void mostrarAsientos() {
		for (int iFilas = 0; iFilas < asientos.length; iFilas++) {

			for (int iCol = 0; iCol < asientos[iFilas].length; iCol++) {

				System.out.print(asientos[iFilas][iCol] + " ");
			}
			System.out.println();
		}
	}

}
