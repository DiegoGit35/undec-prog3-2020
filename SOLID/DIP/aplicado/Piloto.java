package aplicado;

public class Piloto {
	private Vehiculo vehiculo;

    public Piloto(final Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public void PisarAcelerador(){
        vehiculo.acelerar();
    }
}
