package aplicado;

public class AutoDeCarreras implements Vehiculo{
    private final int maxNafta = 100;
    int naftaRestante;
    int velocidad;

    public AutoDeCarreras(final int maxNafta) {
        this.naftaRestante = maxNafta;
    }

    @Override
    public void acelerar() {
        velocidad++;
        naftaRestante--;
    }
}
