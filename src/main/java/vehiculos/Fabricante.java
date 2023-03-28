package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fabricante {
	private String nombre; // nombre fabricante
	private Pais pais;  // nombre ubicación fabricante
	
	static Map<Fabricante,Integer> ventasFabrica = new HashMap<Fabricante,Integer>();
	
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		int maxValor = -1;
		Fabricante fabricaMasVentas = null;
		
		for(Entry<Fabricante, Integer> entry: ventasFabrica.entrySet()){
			
			final int mayorActual = entry.getValue();
			
			if (mayorActual > maxValor) {
				
				maxValor = mayorActual;
				fabricaMasVentas = entry.getKey();
			}
		}
		
		return fabricaMasVentas;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
}
