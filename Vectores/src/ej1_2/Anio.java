package ej1_2;

public class Anio {
	
	String [] arrayDeAnios = {
			"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre"
		};
		
		int[] arrayDiasTranscurridos = {
				0,31,59,90,120,151,181,212,243,273, 304,334};
		
		public String getNombreDelMes (int numeroMes) {
			if (validar(numeroMes)) {
			}else throw new ArrayIndexOutOfBoundsException ("Los meses son 12");
			return arrayDeAnios[numeroMes-1].toString();
			
		}
		
		public boolean validar (int numeroMes) {
			return numeroMes>=1 && numeroMes<=12;
		}
		
		
		public int diasTrasncurridos(int numeroMes) {
			if (validar(numeroMes)) {
			}else throw new ArrayIndexOutOfBoundsException ("Los meses son 12");
			return arrayDiasTranscurridos[numeroMes-1];
		}

}
