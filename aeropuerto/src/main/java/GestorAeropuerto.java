import sun.java2d.pipe.AAShapePipe;

import java.util.ArrayList;
import java.util.List;

public class GestorAeropuerto {
    List<Aeropuerto> misAeropuertos = new ArrayList<Aeropuerto>();

    public void addAeropuerto(Aeropuerto ap) {
        boolean bandera = false;
        for (Aeropuerto a : misAeropuertos)
            if (a.getCodIATA().contains(ap.codIATA))
                bandera = true;
        if(bandera == false)
            misAeropuertos.add(ap);
    }

    public int cantAeropuertos() {
        return misAeropuertos.size();
    }

    public List<Aeropuerto> getAeropuertos() {
        return misAeropuertos;
    }

    public List<Aeropuerto> buscarXcodIATA(String iata) {
        List<Aeropuerto> salida= new ArrayList<Aeropuerto>();
        for (Aeropuerto a : misAeropuertos)
            if (a.getCodIATA().contains(iata))
                salida.add(a);
        return salida;
    }
}
