import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
	
	private String nombre;
	private String ciudad;
	private Vuelos vuelo;
	
	public Aeropuerto(String nombre, String ciudad, Vuelos vuelo) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.vuelo = vuelo;
	}
	
	public Aeropuerto() {
		this.vuelo = new Vuelos();
		this.nombre = "Aeropuerto Tunque";
		this.ciudad = "Arequipa";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Vuelos getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelos vuelo) {
		this.vuelo = vuelo;
	}
	
	public void imprimir() {
		System.out.println("========Aeropuerto========\n");
		System.out.println(nombre);
		System.out.println("Ciudad: "+ciudad);
		System.out.println("\n--------------------------\n");
		List<List<Vuelos>> lista_vuelos = new ArrayList<List<Vuelos>>();
		List<Vuelos> lista_lista_vuelos = new ArrayList<Vuelos>();
		lista_vuelos.add(lista_lista_vuelos);
		
		
		
		Vuelos vuelo_1 = new Vuelos();
		Pilotos piloto_1 = new Pilotos();
		Pasajeros pasajero_1 = new Pasajeros();
		
		vuelo_1.setPasajeros(pasajero_1);
		vuelo_1.setPiloto(piloto_1);
		lista_vuelos.get(0).add(vuelo_1);
		
		Vuelos vuelo_2 = new Vuelos();
		Pilotos piloto_2 = new Pilotos();
		Pasajeros pasajero_2 = new Pasajeros();
		
		vuelo_1.setPasajeros(pasajero_2);
		vuelo_1.setPiloto(piloto_2);
		lista_vuelos.get(0).add(vuelo_2);
		
		
		for (List<Vuelos> list : lista_vuelos) {
			for (Vuelos list2 : list) {
				list2.imprimir();
			}
		}
	}
}















