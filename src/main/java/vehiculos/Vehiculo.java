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
		
		
		if (Pais.ventasPais.containsKey(fabricante.getPais())){
			Pais.ventasPais.put(fabricante.getPais(), Pais.ventasPais.get(fabricante.getPais())+1);
		}else {
			Pais.ventasPais.put(fabricante.getPais(), 1);
		}
		
		if (Fabricante.ventasFabrica.containsKey(fabricante)){
			Fabricante.ventasFabrica.put(fabricante, Fabricante.ventasFabrica.get(fabricante)+1);
		}else {
			Fabricante.ventasFabrica.put(fabricante, 1);
		}
		
		CantidadVehiculos++;
	}
	
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadAutomoviles()+ 
				"\n Camionetas: " + Camioneta.getCantidadCamionetas()+
				"\n Camiones: "+  Camion.getCantidadCamiones();
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getPuertas() {
		return puertas;
	}


	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}


	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public String getTraccion() {
		return traccion;
	}


	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}


	public Fabricante getFabricante() {
		return fabricante;
	}


	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}


	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}


	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	

}
