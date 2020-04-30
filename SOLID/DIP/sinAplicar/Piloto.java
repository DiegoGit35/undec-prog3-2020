package sinAplicar;

public class Piloto {
	private AutoDeCarreras vehiculo;

    public Piloto(){
        this.vehiculo = new AutoDeCarreras(100);
    }

    public void PisarAcelerador(){
        vehiculo.acelerar();
    }
}
