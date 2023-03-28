package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	//private int puertas = 2 ;
	//private int velocidadMaxima = 80;
	//private String traccion = "4X2"; // Tipo de traccion
	private static int cantidadCamiones;
	

	public Camion(String placa, String nombre, int precio, int peso,Fabricante fabricante, 
			int ejes) {
		super(placa, 2 ,  80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Camion.cantidadCamiones++;// cantidadCamiones++; no es buena practica
	}


	public int getEjes() {
		return ejes;
	}


	public void setEjes(int ejes) {
		this.ejes = ejes;
	}


	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}


	public static void setCantidadCamiones(int cantidadCamiones) {
		Camion.cantidadCamiones = cantidadCamiones;
	}
	
	
}
