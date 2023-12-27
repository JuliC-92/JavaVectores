package ej1_2;

public class main1 {

	public static void main(String[] args) {

		Anio anio = new Anio();

		AnioV2 anio2 = new AnioV2();

		try {
			System.out.println(anio.diasTrasncurridos(8));
			System.out.println(anio.getNombreDelMes(3));


			System.out.println("-------------------------");

			System.out.println(anio2.getNombreDelMes(3));
			System.out.println(anio2.diasTranscurridos(8));
			
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
