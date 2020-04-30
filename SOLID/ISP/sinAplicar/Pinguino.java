package sinAplicar;

public class Pinguino implements Ave{
	public String ubicacionActual;
    public  int cantidadDePlumas;

    public Pinguino(int cantidadInicialPlumas) {
        this.cantidadDePlumas = cantidadInicialPlumas;
    }

    public void mudarPlumas() {
        this.cantidadDePlumas -= 1;
    }

    public void volar() {
        throw new UnsupportedOperationException();
    }

    public void nadar() {
        this.ubicacionActual = "En el agua";
    }
}
