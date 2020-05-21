import exceptions.ExceptionVuelo;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Vuelo {
    public String codVuelo;
    public GregorianCalendar salida;
    public GregorianCalendar arribo;
    public Aeropuerto aeropuertoSal;
    public Aeropuerto aeropuertoDest;
    public Avion avion;
    public List<Piloto> tripulacion;


    public Aerolinea aerolinea;
    static int n = 0;

    public Vuelo(GregorianCalendar salida, GregorianCalendar arribo, Aeropuerto aeropuertoSal, Aeropuerto aeropuertoDest, Avion avion, List tripulacion, Aerolinea aerolinea) throws ExceptionVuelo {
        this.codVuelo = codVuelo;
        this.salida = salida;
        this.arribo = arribo;
        this.aeropuertoSal = aeropuertoSal;
        this.aeropuertoDest = aeropuertoDest;
        this.avion = avion;
        this.tripulacion = tripulacion;
        this.aerolinea = aerolinea;
    }


    public String getCodVuelo(Aerolinea al) {
        String cod = new String();
        n++;
        String cadena = String.valueOf(n);
        cod = al.CodIATA + " " + LPAD(cadena, 4, "0");
        return cod;
    }

    public static String LPAD(String cadena, int cantDigitos, String caracter) {
        String salida=cadena;
        for (int i = 1; i <= cantDigitos-cadena.length(); i++)
            salida=caracter+salida;
        return salida;
    }

    public String getSalida() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(this.salida.getTime());
    }

    public void setSalida(int a, int mes, int d, int h, int m) {
        this.salida.set(Calendar.YEAR, a);
        this.salida.set(Calendar.MONTH, mes);
        this.salida.set(Calendar.DAY_OF_MONTH, d);
        this.salida.set(Calendar.HOUR, h);
        this.salida.set(Calendar.MINUTE, m);
    }

    public String getArribo() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(this.arribo.getTime());
    }
    public String getFechaSalida() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.salida.getTime());
    }

    public void setArribo(int a, int mes, int d, int h, int m) {
        this.arribo.set(Calendar.YEAR, a);
        this.arribo.set(Calendar.MONTH, mes);
        this.arribo.set(Calendar.DAY_OF_MONTH, d);
        this.arribo.set(Calendar.HOUR, h);
        this.arribo.set(Calendar.MINUTE, m);
    }

    public Aeropuerto getAeropuertoSal() {
        return aeropuertoSal;
    }

    public void setAeropuertoSal(Aeropuerto aeropuertoSal) {
        this.aeropuertoSal = aeropuertoSal;
    }

    public Aeropuerto getAeropuertoDest() {
        return aeropuertoDest;
    }

    public void setAeropuertoDest(Aeropuerto aeropuertoDest) {
        this.aeropuertoDest = aeropuertoDest;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public List getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(List tripulacion) {
        this.tripulacion = tripulacion;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }


    public int cantPilotos() {
        return tripulacion.size();
    }

}
