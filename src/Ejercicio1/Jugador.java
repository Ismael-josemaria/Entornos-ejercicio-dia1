package Ejercicio1;

public class Jugador {
	// Atributos
	private String nombre;
	private int rango;

	// Constructor
	public Jugador(String nombre, int rango) {
		this.nombre = nombre;
		this.rango = rango;
	}

	// Muestro el jugador
	public void mostrar() {
		System.out.println(" " + nombre);
		System.out.println("Su rango es:  " + rango);

	}

}