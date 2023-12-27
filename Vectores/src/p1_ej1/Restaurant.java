package p1_ej1;

import java.util.ArrayList;

public class Restaurant {
	
	private Robot[] robots = new Robot [8];
	
	private Cajero [] cajeros = new Cajero [5];
	
	private ArrayList<Pedido> pedidos;
	
	private ArrayList<Objeto> objetos;

	public Restaurant() {
		super();
		this.robots = new Robot[8];
		this.cajeros = new Cajero[5];
		this.pedidos = new ArrayList<>();
	}
	
	public double[] montosPorCajero () {
		double [] montoDeCajeros= new double[5];
		for (int i = 0; i < cajeros.length; i++) {
			montoDeCajeros[i] = cajeros[i].montosDeCajero();
		}
	return montoDeCajeros;
	}
	
	public void mostrarPedidoConMasRiesgo() {
		Pedido pedidoMasRiesgo = null;
		double batMasBaja = Double.MAX_VALUE;
		for (Pedido pedidoActual : pedidos) {
			if (pedidoActual.riesgo()<batMasBaja) {
				pedidoMasRiesgo = pedidoActual;
				batMasBaja = pedidoActual.riesgo();
			}
		} 
		 pedidoMasRiesgo.mostrarPedido();
	}
	
	public void generarPedido(String cliente, Cajero cajero, Robot robot, double monto) {
		Pedido pedido = new Pedido(cliente, cajero, robot, monto);
		pedidos.add(pedido);
	}

	public void agregarRobot(Robot robot) {
		int i = 0;
		boolean agregar = false;
		while (i < robots.length && agregar) {
			if(robots[i]==null) {
				robots[i]=robot;
				agregar = true;
			}else i++;
		}
	}
	
	public void agregarCajero(Cajero cajero) {
		int i = 0;
		boolean agregar = false;
		while (i < cajeros.length && agregar) {
			if(cajeros[i]==null) {
				cajeros[i]=cajero;
				agregar = true;
			}else i++;
		}
	}
}
