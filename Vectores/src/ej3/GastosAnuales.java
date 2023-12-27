package ej3;

import java.util.ArrayList;
import java.util.Iterator;

public class GastosAnuales {
	
	ArrayList<Rubro> rubros;
	
	public GastosAnuales() {
		rubros = new ArrayList<>();
	}
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		Rubro rubro=obtenerRubro(nombreRubro);
		if(importe>0) {
		rubro.agregarGasto(mes, importe);
		}else System.out.println("El importe no puede ser 0");
	}
	
	private Rubro buscarRubro(String nombreRubro) {
		Rubro rubroBuscado = null;
		Rubro rubroActual = null;
		int i =0;
		while(i<this.rubros.size() && rubroBuscado==null) {
			rubroActual = this.rubros.get(i);
			if (rubroActual.getNombre()==nombreRubro) {
				rubroBuscado=rubroActual;
			}else i++;
		}

		return rubroBuscado;
	}

	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubroBuscado = buscarRubro(nombreRubro);
		if (rubroBuscado==null) {
			rubroBuscado = new Rubro(nombreRubro);
			rubros.add(rubroBuscado);
		}
		return rubroBuscado;
		
	}
	
	private double [][] consolidadoDeGastos(){
		double [][] matrizGastos = new double [this.rubros.size()][12];
		double gastoMes = 0;
		for (int iRubros=0; iRubros < this.rubros.size(); iRubros++) {
			int iMeses = 0;
			for ( iMeses =0; iMeses < 12; iMeses++) {
				gastoMes = this.rubros.get(iRubros).getTotalGastos(Mes.values()[iMeses]);
				matrizGastos [iRubros][iMeses] = gastoMes;
				}
			}return matrizGastos;
		}
		
	
	public double gastoAcumulado(Mes mes) {
		 int i = mes.ordinal();
		 double acumulado =0;
		 double [][] matrizGastos = consolidadoDeGastos();
		 for (int iColumna = 0; iColumna < matrizGastos.length; iColumna++) {
			  acumulado += matrizGastos[iColumna][i]; 	
		} 
		 return acumulado;
	}
	
	public double gastoAcumulado (String nombreRubro) {
		 int i = this.rubros.indexOf(buscarRubro(nombreRubro));
		 double acumulado =0;
		 double [][] matrizGastos = consolidadoDeGastos();
		 for (int iColumna = 0; iColumna < matrizGastos.length; iColumna++) {
			  acumulado += matrizGastos[iColumna][i]; 	
		} 
		 return acumulado;
	}
	
	
}
