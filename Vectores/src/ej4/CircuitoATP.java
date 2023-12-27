package ej4;

import java.util.ArrayList;
import java.util.Iterator;

public class CircuitoATP {
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}
	
	public void cargarData() {
		this.jugadores = new String[] {"Pella", "Del Potro", "Schwartzman", "Mayer", "Delbonis"};
		this.torneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon","Shangai"};
		this.resultados = new int[][] {	{1,3,4,1,3},
										{3,2,3,4,1},
										{2,1,5,5,2},
										{4,5,1,2,5},
										{5,4,2,3,4}};
	}
	
	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> Jugadores = new ArrayList<>();
		for (int j = 0; j < jugadores.length; j++) {
			Jugador actual = new Jugador(jugadores[j]);
			Jugadores.add(actual);
			for (int i = 0; i < resultados.length; i++) {
				actual.procesarResultado(resultados[j][i]);
			}
		}
		return Jugadores;
	}
	
	public void procesarTorneosJugador(String jugador) {
        int iJugador = buscoJugador(jugador);
        System.out.print(jugador +" : ");
        for (int iTorneo = 0; iTorneo < resultados.length; iTorneo++) {
            System.out.print(torneos[iTorneo]+ " : " + resultados[iJugador][iTorneo]+ " ");
        }
        
    }
	
	public String obtenerResultadoJugador(String jugador, String torneo) {
        int iJugador = buscoJugador(jugador);
        int iTorneo = buscoTorneo(torneo);
        int resultado = resultados [iJugador][iTorneo]; 
        
        return "Resultado de " + jugadores[iJugador] + " en "+ torneos[iTorneo] + ": " + resultado;
    }
	
	private int buscoJugador(String Jugador) {
		int posJugador = -1;
		int i = 0;
		while(posJugador == -1 && i<this.jugadores.length) {
			if(jugadores[i].equals(Jugador)) {
				posJugador = i;
			} else {
				i++;
			}
		}
		return posJugador;
	}
	
	private int buscoTorneo(String torneo) {
		int posTorneo = -1;
		int i = 0;
		while(posTorneo == -1 && i<this.torneos.length) {
			if(torneos[i].equals(torneo)) {
				posTorneo = i;
			} else {
				i++;
			}
		}
		return posTorneo;
	}
	
	public int procesarPeorPosTorneoJugador(String jugador) {
		int iJugador = buscoJugador(jugador);
		int valorMin = Integer.MIN_VALUE;
		for (int iTorneos = 0; iTorneos < resultados.length; iTorneos++) {
			if(valorMin < resultados[iJugador][iTorneos]) {
				valorMin = resultados[iJugador][iTorneos];
			}
		}
		return valorMin;
	}
}
