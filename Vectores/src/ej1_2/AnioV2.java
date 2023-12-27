package ej1_2;

public class AnioV2 {
	
	public String getNombreDelMes (int numeroMes) {
		if (numeroMes>=1 && numeroMes<=12) {
		}else throw new ArrayIndexOutOfBoundsException ("Los meses son 12");
		return Mes.values()[numeroMes-1].toString();
	}

	public int diasTranscurridos(int numeroMes) {
		if (numeroMes>=1 && numeroMes<=12) {
		}else throw new ArrayIndexOutOfBoundsException ("Los meses son 12");
		return Mes.values()[numeroMes-1].getDiasMes();
	}
}
