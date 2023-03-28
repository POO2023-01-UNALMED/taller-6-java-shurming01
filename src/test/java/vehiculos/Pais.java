package vehiculos;

import java.util.ArrayList;
import java.util.List;


public class Pais {
	private String nombre; // nombre del pais
	
	List<String> pais = new ArrayList<String>();
	List<Integer> Cantidad = new ArrayList<Integer>();
	
	
	public static String paisMasVendedor() {
		String nombrePais;
		
		nombrePais  = Fabricante.getPais();
		
	}
	
}
