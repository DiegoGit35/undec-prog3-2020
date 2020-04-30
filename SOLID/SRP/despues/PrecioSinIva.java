package despues;

public class PrecioSinIva {
	public double precio2;
	static final double iva = 0.21;
	
	public PrecioSinIva(double precio2) {
		this.precio2 = getPrecioSinIVA(precio2);
	}
	public double getPrecioSinIVA(double precio) {
		return (precio-precio*iva);
	}
}
