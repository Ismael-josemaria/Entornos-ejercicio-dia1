package Ejercicio1;

public class Test {

	public static void main(String[] args) {
		//Creo el equipo
		Equipo Fireball = new Equipo (" Fireball");
		//creo jugadores
		Jugador Ismael = new Jugador ("Ismael", 4);
		Jugador Pedro = new Jugador ("Pedro", 5);
		Jugador Francisco = new Jugador ("Francisco", 5);
		//meto jugadores en el equipo
		Fireball.agregarjugador(Pedro);
		Fireball.agregarjugador(Ismael);
		Fireball.agregarjugador(Francisco);
		//muestro el equipo con sus jugadores
		Fireball.mostrar();
		

	}

}
