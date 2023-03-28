package vehiculos;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pais {
	private String nombre; // nombre del pais
	static Map<Pais,Integer> ventasPais = new HashMap<Pais,Integer>();
	
	
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}



	public static Pais paisMasVendedor() {
		int maxValor = -1;
		Pais paisMasVendedor = null;
		
		for(Entry<Pais, Integer> entry: ventasPais.entrySet()){
			
			final int mayorActual = entry.getValue();
			
			if (mayorActual > maxValor) {
				
				maxValor = mayorActual;
				paisMasVendedor = entry.getKey();
			}
		}
		
		return paisMasVendedor;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 	

	
}
