package p1_ej1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurant c = new Restaurant();
		
		Robot r1 = new Robot("r1d1",15);
		Robot r2 = new Robot("r2d2",40);
		Robot r3 = new Robot("r3d3",19);
		Robot r4 = new Robot("r4d4",80);
		Robot r5 = new Robot("r5d5",90);
		Robot r6 = new Robot("r6d6",53);
		Robot r7 = new Robot("r7d7",28);
		Robot r8 = new Robot("r8d8",99);
		
		Cajero c1 = new Cajero(1, "Perez", 18);
		Cajero c2 = new Cajero(2, "Ruiz", 98);
		Cajero c3 = new Cajero(3, "Gonzalez", 21);
		Cajero c4 = new Cajero(4, "Lopez", 74);
		Cajero c5 = new Cajero(5, "Garcias", 64);
		
		c.agregarCajero(c1);
		c.agregarCajero(c2);
		c.agregarCajero(c3);
		c.agregarCajero(c4);
		c.agregarCajero(c5);
		
		c.agregarRobot(r1);
		c.agregarRobot(r2);
		c.agregarRobot(r3);
		c.agregarRobot(r4);
		c.agregarRobot(r5);
		c.agregarRobot(r6);
		c.agregarRobot(r7);
		c.agregarRobot(r8);

		c.generarPedido("Camarero", c1, r1, 285);
		c.generarPedido("Casella", c2, r2, 193);
		c.generarPedido("Milne", c3, r3, 426);
		c.generarPedido("Esposito", c4, r4, 487);
		c.generarPedido("Montalti", c5, r5, 654);
		c.generarPedido("Nuñez", c3, r6, 1285);
		c.generarPedido("Basualdo", c1, r7, 545);
		c.generarPedido("Arata", c4, r8, 4787);

		c.mostrarPedidoConMasRiesgo();
		
	}

}
