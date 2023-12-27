package p1_ej3;

import java.util.ArrayList;

public class Plantel {
	
	private Jugador [] jugadores;

	
	public Plantel() {
		super();
		this.jugadores = new Jugador[23];
	}

	private int buscarPosNumero(int numero) {
			int i = 0;
			int pos = -1;
			while (pos == -1 && i < this.jugadores.length) {
				if (jugadores[i].esTuNumero(numero)) {
					pos = i;
				} else {
					i++;
				}
			}

			return pos;
		}
	
	private int buscarPosApellido(String apellido) {
		int i = 0;
		int pos = -1;
		while (pos == -1 && i < this.jugadores.length) {
			if (jugadores[i].esTuApellido(apellido)) {
				pos = i;
			} else {
				i++;
			}
		}

		return pos;
	}
	
	
	public boolean cambio(int entra,int sale) {
		boolean cambio = false;
		Jugador aux = jugadores[buscarPosNumero(sale)];
		int posSale = buscarPosNumero(sale);
		int posEntra = buscarPosNumero(entra);
		if(posEntra !=-1 && posSale !=-1 && entra!=sale) {
			jugadores[posSale]= jugadores[posEntra];
			jugadores [posEntra]= aux;
			cambio = true;
		}else System.out.println("Numero invalido");
		return cambio;
	}

	public boolean cambioPorLesion (String entra,int sale) {
		boolean cambio = false;
		Jugador aux = jugadores[buscarPosNumero(sale)];
		int posSale = buscarPosNumero(sale);
		int posEntra = buscarPosApellido(entra);
		if(posEntra !=-1 && posSale !=-1 && !aux.esTuApellido(entra)) {
			jugadores[posSale]= jugadores[posEntra];
			jugadores [posEntra]= aux;
			cambio = true;
		}else System.out.println("Error no se pudo realizar el Cambio");
		return cambio;
	}
	
	public Jugador[] obtenerReservas() {
		Jugador[] reservas = new Jugador[5];
		int j=0;
		for (int i = 17; i < jugadores.length; i++) {
			reservas[j] = this.jugadores[i];
			j++;
		}
		return reservas;
	}
	
	public int[] cantJugadoresPorPosicion (){
		int defensores = 0;
		int arqueros=0;
		int medioCampistas=0;
		int delanteros =0;
		for (int i = 0; i < jugadores.length; i++) {
			Posicion posicionActual = jugadores[i].getPosicion();
			if (Posicion.ARQUERO==posicionActual) {
				arqueros ++;
			}else if(Posicion.DEFENSOR==posicionActual) {
				defensores ++;
			}else if (Posicion.DELANTERO==posicionActual) {
				delanteros ++;
			}else if (Posicion.MEDIOCAMPISTA==posicionActual) {
				medioCampistas++;
			}
			
		}
		int [] cantJugadoresPorPosicion = {
				arqueros,defensores,medioCampistas,delanteros	
			};
		return cantJugadoresPorPosicion;
	}

	public void mostrarJugadoresPosicion () {
		int [] jugadoresP = cantJugadoresPorPosicion();
		System.out.println("Arqueros : "+jugadoresP[0]);
		System.out.println("Defensores : "+jugadoresP[1]);
		System.out.println("MedioCampistas : "+jugadoresP[2]);
		System.out.println("Delanteros : "+jugadoresP[3]);
	}

	
	public void agregarJugadores(Jugador jugador) {
		int i = 0;
		boolean agregar = false;
		while (i < jugadores.length && !agregar) {
			if(jugadores[i]==null) {
				jugadores[i]=jugador;
				agregar = true;
			}else i++;
		}
	}
	
}
