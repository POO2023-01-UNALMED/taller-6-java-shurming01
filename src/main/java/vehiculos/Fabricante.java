package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	private String nombre; // nombre fabricante
	private Pais pais;  // nombre ubicación fabricante
	
	List<String> fabricas = new ArrayList<String>();
	List<Integer> cantidadf = new ArrayList<Integer>();
	
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public String fabricaMayorVentas() {
		int indiceMayor = 0;
		String busqueda = this.nombre;
		int indice = fabricas.indexOf(busqueda);
		
		if(indice == -1) { 
			fabricas.add(this.nombre);
			int indice2 = fabricas.indexOf(busqueda);
			cantidadf.add(indice2,+1);
		}else {
			int indice2 = fabricas.indexOf(busqueda);
			cantidadf.add(indice2,+1);
		}
		
		for(int x = 1; x < fabricas.size();x++){
			
			if (cantidadf.get(x) > cantidadf.get(indiceMayor)) {
				
				indiceMayor = x;
			}
		}
		
		int masVentas = cantidadf.get(indiceMayor);
		String fabricaMayorVentas = fabricas.get(indiceMayor);
		
		return fabricaMayorVentas;
		
		
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
