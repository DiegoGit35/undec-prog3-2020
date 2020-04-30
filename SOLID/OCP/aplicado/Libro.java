package aplicado;

public class Libro {
	private String nombre;
	private String autor;
	private Genero genero;
	private double precio;
	public Libro(String nombre, Genero genero, String autor,double precio) {
		this.nombre = nombre;
		this.genero = genero;
		this.autor = autor;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double descuento() {
		return this.genero.descontar(this.precio);
    }
}
