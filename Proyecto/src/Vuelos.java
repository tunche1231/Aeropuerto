
public class Vuelos {
	
	private String hora;
	private Aviones avion;
	private Pilotos piloto;
	private Pasajeros pasajeros;
	

	
	public Vuelos(String hora, Aviones avion, Pilotos piloto, Pasajeros pasajeros) {
		this.hora = hora;
		this.avion = avion;
		this.piloto = piloto;
		this.pasajeros = pasajeros;
	}

	public Vuelos() {
		this.pasajeros = new Pasajeros();
		this.avion = new Aviones();
		this.piloto = new Pilotos();
		this.hora = "2:30 pm";
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Aviones getAvion() {
		return avion;
	}

	public void setAvion(Aviones avion) {
		this.avion = avion;
	}

	public Pilotos getPiloto() {
		return piloto;
	}

	public void setPiloto(Pilotos piloto) {
		this.piloto = piloto;
	}
	
	public Pasajeros getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Pasajeros pasajeros) {
		this.pasajeros = pasajeros;
	}

	public void imprimir() {
		System.out.println("========Vuelo========\n");
		System.out.println("Hora de salida :  "+hora);
		avion.imprimir();
		piloto.imprimir();
		pasajeros.imprimir();
	}
}












