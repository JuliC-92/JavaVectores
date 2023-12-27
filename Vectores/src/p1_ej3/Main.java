package p1_ej3;

public class Main {

	public static void main(String[] args) {
		
		Plantel argentina = new Plantel();
		
		Jugador j1 = new Jugador ("MARTÍNEZ",1, Posicion.ARQUERO);
		Jugador j2 = new Jugador("RODRÍGUEZ", 2, Posicion.DEFENSOR);
		Jugador j3 = new Jugador("LÓPEZ", 3, Posicion.DEFENSOR);
		Jugador j4 = new Jugador("GONZÁLEZ", 4, Posicion.DEFENSOR);
		Jugador j5 = new Jugador("PÉREZ", 5, Posicion.MEDIOCAMPISTA);
		Jugador j6 = new Jugador("FERNÁNDEZ", 6, Posicion.MEDIOCAMPISTA);
		Jugador j7 = new Jugador("SÁNCHEZ", 7, Posicion.DELANTERO);
		Jugador j8 = new Jugador("RAMÍREZ", 8, Posicion.MEDIOCAMPISTA);
		Jugador j9 = new Jugador("SILVA", 9, Posicion.DELANTERO);
		Jugador j10 = new Jugador("MARTÍN", 10, Posicion.MEDIOCAMPISTA);
		Jugador j11 = new Jugador("TORRES", 11, Posicion.DELANTERO);
		Jugador j12 = new Jugador("GÓMEZ", 12, Posicion.ARQUERO);
		Jugador j13 = new Jugador("RODRÍGUEZ", 13, Posicion.DEFENSOR);
		Jugador j14 = new Jugador("MENDOZA", 14, Posicion.MEDIOCAMPISTA);
		Jugador j15 = new Jugador("FERNÁNDEZ", 15, Posicion.MEDIOCAMPISTA);
		Jugador j16 = new Jugador("GONZÁLEZ", 16, Posicion.DEFENSOR);
		Jugador j17 = new Jugador("MORALES", 17, Posicion.DELANTERO);
		Jugador j18 = new Jugador("PÉREZ", 18, Posicion.MEDIOCAMPISTA);
		Jugador j19 = new Jugador("GONZÁLEZ", 19, Posicion.DELANTERO);
		Jugador j20 = new Jugador("LÓPEZ", 20, Posicion.DEFENSOR);
		Jugador j21 = new Jugador("RAMÍREZ", 21, Posicion.MEDIOCAMPISTA);
		Jugador j22 = new Jugador("SOTO", 22, Posicion.ARQUERO);
		Jugador j23 = new Jugador("HERRERA", 23, Posicion.DEFENSOR);

		argentina.agregarJugadores(j23);
		argentina.agregarJugadores(j22);
		argentina.agregarJugadores(j21);
		argentina.agregarJugadores(j20);
		argentina.agregarJugadores(j19);
		argentina.agregarJugadores(j18);
		argentina.agregarJugadores(j17);
		argentina.agregarJugadores(j16);
		argentina.agregarJugadores(j15);
		argentina.agregarJugadores(j14);
		argentina.agregarJugadores(j13);
		argentina.agregarJugadores(j12);
		argentina.agregarJugadores(j11);
		argentina.agregarJugadores(j10);
		argentina.agregarJugadores(j9);
		argentina.agregarJugadores(j8);
		argentina.agregarJugadores(j7);
		argentina.agregarJugadores(j6);
		argentina.agregarJugadores(j5);
		argentina.agregarJugadores(j4);
		argentina.agregarJugadores(j3);
		argentina.agregarJugadores(j2);
		argentina.agregarJugadores(j1);
	

		argentina.mostrarJugadoresPosicion();





		
	}

}
