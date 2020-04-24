package dominio;

public class Producto {
	private double precio;
	private String nombre;
	private String codigo;
	private String descripcion;

	

	public Producto(String nombre, String descripcion, double precio){
		this.nombre = capitalize(nombre);
		this.precio = precio;
		this.setDescripcion(descripcion);
		this.codigo = GenerarCodigo(nombre);
	}

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	private String capitalize(String nombre2) {
		String[] cadena = nombre2.split(" ");
		String nom = "";
		for (int i = 0; i < cadena.length; i++) {
			nom += " " + cadena[i].toUpperCase().charAt(0) + cadena[i].toLowerCase().substring(1, cadena[i].length());
		}
//		System.out.println(nom);
		return nom.substring(1);
	}

	private boolean ValidarNombre(String nombre2) throws ExceptionProducto
	{
		if(nombre2 == null) 
		{
			throw new ExceptionProducto("El nombre del producto no puede ser Nulo");
		}
		if(nombre2 == "") 
		{
			throw new ExceptionProducto("El nombre del producto no puede estar vacio");
		}
		return true;
	}
	private boolean ValidarDescripcion(String descripcion2) throws ExceptionProducto
	{
		if(descripcion2 == null) 
		{
			throw new ExceptionProducto("La descripcion del producto no puede ser Nula");
		}
		if(descripcion2 == "") 
		{
			throw new ExceptionProducto("La descripcion del producto no puede estar vacia");
		}
		return true;
	}
	private boolean ValidarPrecio(double precio2) throws ExceptionProducto
	{
		if(precio2 == 0)
		{
			throw  new ExceptionProducto("El precio del producto no puede ser cero");
		}
		if(precio2 < 0)
		{
			throw  new ExceptionProducto("El precio del producto no puede ser negativo");
		}
		return true;
	}

	private String GenerarCodigo(String nombre2) {
		String[] cadena = nombre2.split(" ");
		String cod="";
		for (int i = 0; i < cadena.length; i++) {
			cod += cadena[i].charAt(0);
		}
//		System.out.println(cod);
		return cod;
	}

	public double getPrecio() {
		return precio;
	}

	public void changePrecio(double precio2) throws ExceptionProducto {
		if(precio2 < 0)
			throw  new ExceptionProducto("Al actualizar el precio no puede ser negativo");
		if(precio2 == 0)
		{
			throw  new ExceptionProducto("Al actualizar el precio no puede ser cero");
		}
		this.precio = precio2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}

	public void changePrecio(String precio2) throws ExceptionProducto {
		String a[] = precio2.split("%");
//		System.out.println("el porcentaje es: ");
//		System.out.println(a[0]);
		if(Double.parseDouble(a[0]) < 0)
			throw  new ExceptionProducto("Al actualizar el precio no puede ser negativo");
		if(Double.parseDouble(a[0]) == 0)
		{
			throw  new ExceptionProducto("Al actualizar el precio no puede ser cero");
		}
		this.precio += this.precio*(Double.parseDouble(a[0]))/100;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
