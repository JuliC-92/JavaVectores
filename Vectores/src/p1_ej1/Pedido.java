package p1_ej1;

import java.util.ArrayList;

public class Pedido {

	private String cliente;
	
	private Cajero Cajero;
	
	private int iDCajero;
	
	private Robot robot;
	
	private String codigoRobot;
	
	ArrayList<Objeto> objetos;
	
	private double monto;

	public Pedido(String cliente, Cajero cajero, Robot robot, double monto) {
		super();
		this.cliente = cliente;
		this.Cajero = cajero;
		this.robot = robot;
		this.iDCajero = cajero.getId();
		this.codigoRobot = robot.getCodigo();
		this.monto = monto;
		this.objetos= new ArrayList<>();
	}

	public double getMonto() {
		return monto;
	}
	
	private String[] ganerarPedido() {
		String monto = Double.toString(this.monto);
		String batRobot = Double.toString(this.robot.getNivelBat());
		String[] pedido =
			{monto,this.Cajero.getApellido(),batRobot};
		
		return pedido;
		
	}
	
	public void mostrarPedido() {
		String [] pedido = this.ganerarPedido();
		System.out.println("Pedido de "+this.cliente);
		for (String actual : pedido) {
			System.out.println(actual);
		}
	}
	
	public double riesgo() {
		return this.robot.getNivelBat();
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", iDCajero=" + iDCajero + ", codigoRobot=" + codigoRobot + ", monto="
				+ monto + "]";
	}
	
	
	
	
}
