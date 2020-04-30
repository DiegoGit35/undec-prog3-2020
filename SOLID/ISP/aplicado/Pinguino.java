package aplicado;

public class Pinguino implements CriaturaEmplumada, CriaturaNadadora{
	 public String ubicacionActual;
	 public int cantidadDePlumas;


    public Pinguino(int cantidadInicialPlumas) {
        this.cantidadDePlumas = cantidadInicialPlumas;
    }

    public void nadar() {
        this.ubicacionActual = "En el agua";
    }

    public void mudarPlumas() {
        this.cantidadDePlumas -= 4;
    }
}
