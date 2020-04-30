package sinAplicar;

public class AutoDeCarreras {
    private final int maxNafta = 100;
    private int naftaRestante;
    private int velocidad;

    public AutoDeCarreras(final int maxNafta) {
        this.naftaRestante = maxNafta;
    }

    public void acelerar(){
        velocidad++;
        naftaRestante--;
    }

}
