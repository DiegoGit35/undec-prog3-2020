package aplicado;

public class CabecitaNegra implements CriaturaVoladora, CriaturaEmplumada{
    public String ubicacionActual;
    public int cantidadDePlumas;

    public CabecitaNegra(int cantidadInicialDePlumas) {
        this.cantidadDePlumas = cantidadInicialDePlumas;
    }

    public void volar() {
        this.ubicacionActual = "En el aire";
    }

	public void mudarPlumas() {
		this.cantidadDePlumas-=1;
	}
}
