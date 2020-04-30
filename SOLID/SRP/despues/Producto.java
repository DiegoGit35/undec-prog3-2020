package despues;

public class Producto {
	private String nombre;
	private double precio;

	public Producto(String nombre, double precio){
			this.nombre = nombre;
			this.precio = precio;
		}

	public double getPrecio() {
		return precio;
	}
	
	public String getNombre() {
		Capitalize c = new Capitalize(nombre);
		return c.nombre2;
	}
	
	public double getPrecioSinIva() {
		PrecioSinIva i = new PrecioSinIva(precio);
		return i.precio2;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + "nombre=" + nombre +"]";
	}
	
}
