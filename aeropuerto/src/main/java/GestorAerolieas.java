import java.util.ArrayList;
import java.util.List;

public class GestorAerolieas {
    List<Aerolinea> misAerolineas = new ArrayList<Aerolinea>();


    public void addAerolinea(Aerolinea al) {
        boolean bandera = false;
        for (Aerolinea a : misAerolineas)
            if (a.getNombre().toUpperCase().contains(al.nombre.toUpperCase()))
                bandera = true;
        if(bandera == false)
            misAerolineas.add(al);
    }

    public int cantAerolineas() {
        return misAerolineas.size();
    }

    public List<Aerolinea> buscarAerolineaXnombre(String nombre) {
        List<Aerolinea> salida= new ArrayList<Aerolinea>();
        for (Aerolinea a : misAerolineas)
            if (a.getNombre().toUpperCase().contains(nombre.toUpperCase()))
                salida.add(a);
        return salida;
    }
}
