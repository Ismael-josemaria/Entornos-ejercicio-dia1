package Ejercicio2;

public class Usuario {
	// Atributos
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String nickName;
	private Mensaje[] mensajes;
	private int nromensajes;

	// Constructor
	public Usuario(String nombre, String apellidos, String fechaNacimiento, String nickName) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.nickName = nickName;
		this.mensajes = new Mensaje[10000];
	}

	public String getNombre() {
		return nombre;
	}

	// Metodo publicar mensaje
	public void publicarMensaje(Mensaje mensajear) {
		mensajes[nromensajes] = mensajear;
		nromensajes++;

	}

	// Metodo eliminar
	public void eliminarMensaje(Mensaje mensajear) {
		for (Mensaje mensaje : mensajes[nromensajes]) {

		}
		nromensajes--;

	}

	// Metodo mostrar
	public void MostrarUsuario() {
		System.out.println("Usuario: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
		System.out.println("Apodo: " + nickName);
		System.out.println("Numero de mensajes publicados: " + nromensajes);
	}

}
