package Ejercicio2;

public class Mensaje {
	// Atributos
	private String mensaje;
	private String fechaPublicacion;
	private Usuario[] autor;
	private String etiquetas;
	private String url;

	// Constructor mensaje
	public Mensaje(String mensaje, String fechaPublicacion, Usuario autor, String etiquetas, String url) {
		this.mensaje = mensaje;
		this.fechaPublicacion = fechaPublicacion;
		this.autor = new Usuario[10000];
		this.etiquetas = etiquetas;
		this.url = url;
	}

	// Metodo mostrar mensaje
	public void mostrarmensaje() {
		System.out.println("El auto es " + autor);
		System.out.println(fechaPublicacion);
		System.out.println(etiquetas);
		System.out.println(mensaje);
		System.out.println(url);

	}

}
