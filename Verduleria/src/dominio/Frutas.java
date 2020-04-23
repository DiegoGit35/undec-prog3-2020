package dominio;


public class Frutas {

	private double precio;
	private String nombre;

	public Frutas(String nombre, double precio){
		this.nombre = capitalize(nombre);
		this.precio = precio;
	}

	private String capitalize(String nombre2) {
		String[] cadena = nombre2.split(" ");
		String nom = "";
		for (int i = 0; i < cadena.length; i++) {
			nom += cadena[i].toUpperCase().charAt(0) + cadena[i].toLowerCase().substring(1, cadena[i].length());
		}
		System.out.println(nom);
		return nom;
	}

	public double getPrecio() {
		return precio;
	}
	
	public double getPrecioConIVA() {
		return precio*1.21;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", nombre=" + nombre + "]";
	}
	
}

