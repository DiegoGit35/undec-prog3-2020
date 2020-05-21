import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class GestorVuelo {
    List<Vuelo> misVuelos = new ArrayList<Vuelo>();

    public void addVuelo(Vuelo v2) {
        boolean bandera = false;
        for(Vuelo v : misVuelos)
            if(v.getCodVuelo().contains(v2.getCodVuelo()))
                bandera = true;
        if(bandera == false)
            misVuelos.add(v2);
    }

    public int cantVuelos() {
        return misVuelos.size();
    }

//    public List<Vuelo> buscarVueloXcodVuelo(String nombre) {
//        List<Vuelo> salida= new ArrayList<Vuelo>();
//        for (Vuelo v : misVuelos)
//            if (v.codVuelo.contains(nombre))
//                salida.add(v);
//        return salida;
//    }

    public List<Vuelo> buscarVuelosXfecha(GregorianCalendar fecha) {
        List<Vuelo> lv = new ArrayList<Vuelo>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for(Vuelo v : misVuelos)
            if(v.getFechaSalida().contains(sdf.format(fecha.getTime())))
                lv.add(v);
        return lv;
    }

    public List<Vuelo> buscarVuelosXaerolnea(Aerolinea al) {
        List<Vuelo> lv = new ArrayList<Vuelo>();
        for(Vuelo v : misVuelos)
            if(v.aerolinea.CodIATA.contains(al.CodIATA))
                lv.add(v);
        return lv;
    }
}
