package sinAplicar;

public class CabecitaNegra implements Ave {
    public String ubicacionActual;
    public  int cantidadDePlumas;

    public CabecitaNegra(int cantidadInicialPlumas) {
        this.cantidadDePlumas = cantidadInicialPlumas;
    }

    public void volar() {
        this.ubicacionActual = "En el aire";
    }

    public void mudarPlumas() {
        this.cantidadDePlumas -= 1;
    }
}
