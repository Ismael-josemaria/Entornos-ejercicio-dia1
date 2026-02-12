package Ejercicio2;

public class Tests {

	public static void main(String[] args) {
		// Creo el usuario
		Usuario Ismael = new Usuario("Ismael", "Josemaria Fernandez", "24/02/2005", "Chema");
		// Creo el mensaje que depende de que haya ya un usuario
		Mensaje comprar = new Mensaje("Compra huevos", "12/02/2026", Ismael, "#ILOVEYOU", "werewrwerewr");
		Mensaje ayuda = new Mensaje("Necesito ayuda", "19/03/2026", Ismael, "#HELPME", "yhrtrthrtbrtb");
		Mensaje tiene = new Mensaje("Gracia ya lo tengo", "7/03/2025", Ismael, "#THANKS", "ewrewrwerwerwerwer");
		Ismael.publicarMensaje(comprar);
		Ismael.publicarMensaje(ayuda);
		Ismael.publicarMensaje(tiene);
		Ismael.MostrarUsuario();
		System.out.println("  ");
		comprar.mostrarmensaje();

	}

}