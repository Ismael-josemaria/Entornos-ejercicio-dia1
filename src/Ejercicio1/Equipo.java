package Ejercicio1;

public class Equipo {
	// Atributos
	private String nombre;
	private int nrojugadores;
	private Jugador[] jugadores;

	// Constructor equipo
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.jugadores = new Jugador[10000];
	}

	// metodo agregarjugador
	public void agregarjugador(Jugador jugador) {
		jugadores[nrojugadores] = jugador;
		nrojugadores++;

	}

	// metodo mostrar equipo y sus jugadores
	public void mostrar() {
		System.out.println("Nombre Equipo: " + nombre);
		System.out.println("Numero de Jugadores: " + nrojugadores);
		for (int i = 0; i < nrojugadores; i++) {
			System.out.println(" ");
			jugadores[i].mostrar();

		}

	}
}
