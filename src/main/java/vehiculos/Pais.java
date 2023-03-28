package vehiculos;

import java.util.ArrayList;
import java.util.List;


public class Pais {
	private String nombre; // nombre del pais
	//public static int cont = 0;
	
	List<String> pais = new ArrayList<String>();
	List<Integer> cantidad = new ArrayList<Integer>();
	
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}


	public  String paisMasVendedor() {
		int mayorIndice = 0;
		String busqueda = this.nombre;
		int indice = pais.indexOf(busqueda);
		
		if(indice == -1) { // Si es -1 es que la busqueda no esta
			pais.add(this.nombre);
			int indice2 = pais.indexOf(busqueda);
			cantidad.add(indice2,+1);
		}else {
			int indice2 = pais.indexOf(busqueda);
			cantidad.add(indice2,+1);
		}
		
		for(int i = 1; i < pais.size();i++){
			
			if (cantidad.get(i) > cantidad.get(mayorIndice)) {
				
				mayorIndice = i;
			}
		}
		
		int maxCantidad = cantidad.get(mayorIndice);
		String paisMasVendedor = pais.get(mayorIndice);
		
		return paisMasVendedor;

	}
	
	
	
}
