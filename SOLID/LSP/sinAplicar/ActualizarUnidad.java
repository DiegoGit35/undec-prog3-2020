package sinAplicar;

public class ActualizarUnidad {
    public void upgrade(Casa casa) {
        casa.metrosCuadrados+= 40;

        if (casa.getClass() != Casa.class)
            casa.numeroDeCuartos+= 1;
    }
}
