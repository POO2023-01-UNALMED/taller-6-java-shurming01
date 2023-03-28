package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puestos; // cantidad de asientos
	//private int puertas = 4 ;
	//private int velocidadMaxima = 100;
	//private String traccion = "FWD"; // Tipo de traccion
	private static int cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso,Fabricante fabricante,
			int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automovil.cantidadAutomoviles ++; // cantidadAutomoviles ++ no es buena practica
	}

	public int getPuestos() {
		return puestos;
	}


	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}


	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}


	public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automovil.cantidadAutomoviles = cantidadAutomoviles;
	}

	
	

}
