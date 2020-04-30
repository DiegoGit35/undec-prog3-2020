package sinAplicar;

public class Libro {
	private String nombre;
	private String autor;
	private String genero;
	private double precio;
	public Libro(String nombre, String genero, String autor,double precio) {
		this.nombre = nombre;
		this.genero = genero;
		this.autor = autor;
		this.precio = precio;
	}
	public double descuento() {
        if (this.genero == "terror") {
            return this.precio-this.precio*0.5;
        }
        else if (this.genero == "novela") {
            return this.precio-this.precio*0.10;
        }
        else if (this.genero == "autoayuda") {
            return this.precio-this.precio*0.15;
        }
        else {
            return this.precio;
        }
    }
}
