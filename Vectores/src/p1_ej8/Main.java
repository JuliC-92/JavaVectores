package p1_ej8;

public class Main {

	public static void main(String[] args) {

		Aerolinea fly = new Aerolinea();
		
		System.out.println(fly.asientosLibresConVentanilla());
		
		Reserva r1 = new Reserva("665466", 1);
		Reserva r2 = new Reserva("665466", 36);
		Reserva r3 = new Reserva("665466", 54);
		Reserva r4 = new Reserva("665466", 17);
		Reserva r5 = new Reserva("665466", 9);
		Reserva r6 = new Reserva("665466", 28);
		
		fly.agregarReserva(r1);
		fly.agregarReserva(r2);
		fly.agregarReserva(r3);
		fly.agregarReserva(r4);
		fly.agregarReserva(r5);
		fly.agregarReserva(r6);
		
		System.out.println("------------");
		fly.asignar();
		System.out.println(fly.asientosLibresConVentanilla());
		System.out.println("------------");
		fly.mostrarAvion();
	}

}
