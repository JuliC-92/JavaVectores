package p1_ej1;

import java.util.ArrayList;

public class Cajero {
	
	private int id;
	
	private String apellido;
	
	private int antiguedad;
	
	private ArrayList <Pedido> pedidos;

	public Cajero(int id, String apellido, int antiguedad) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.pedidos = new ArrayList<>();
	}
	
	public double montosDeCajero() {
		double acumulado =0;
		for (Pedido pedidoActual : pedidos) {
		 acumulado += pedidoActual.getMonto();
		}
		return acumulado/this.pedidos.size();
	}

	public int getId() {
		return id;
	}

	public String getApellido() {
		return apellido;
	}
	
	
	

}
