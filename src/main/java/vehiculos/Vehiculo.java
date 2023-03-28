package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas; // Cantidad puertas
	private int velocidadMaxima;
	private String nombre;// Nombre vehiculo
	private int precio; // Costo del vehiculo
	private int peso; // Peso del vehiculo
	private String traccion; // Tipo de traccion
	private Fabricante fabricante; // Nombre del fabricante
	private static int CantidadVehiculos;//Cantidad vehiculos hechos hasta el momento
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		 
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}
	
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadAutomoviles()+ 
				"\n Camionetas: " + Camioneta.getCantidadCamionetas()+
				"\n Camiones: "+  Camion.getCantidadCamiones();
	}
	

}
