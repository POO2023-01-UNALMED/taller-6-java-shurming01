package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	//private int velocidadMaxima = 90;
	//private String traccion = "4X4"; // Tipo de traccion
	private static int cantidadCamionetas;
	
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,
			 Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.cantidadCamionetas++;//Se utiliza el nombre de la clase porque es un atributo de clase
	}


	public boolean isVolco() {
		return volco;
	}


	public void setVolco(boolean volco) {
		this.volco = volco;
	}


	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}


	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}
	
	
	

}
