import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Vuelo {
    public String codVuelo;
    public GregorianCalendar salida;
    public GregorianCalendar arribo;
    public Aeropuerto aeropuertoSal;
    public Aeropuerto aeropuertoDest;
    public Avion avion;
    public List tripulacion;
    public Aerolinea aerolinea;

    public Vuelo(GregorianCalendar salida, GregorianCalendar arribo, Aeropuerto aeropuertoSal, Aeropuerto aeropuertoDest, Avion avion, List tripulacion, Aerolinea aerolinea) {
        this.codVuelo = codVuelo;
        this.salida = salida;
        this.arribo = arribo;
        this.aeropuertoSal = aeropuertoSal;
        this.aeropuertoDest = aeropuertoDest;
        this.avion = avion;
        this.tripulacion = tripulacion;
        this.aerolinea = aerolinea;
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        codVuelo = codVuelo;
    }

    public GregorianCalendar getSalida() {
        return salida;
    }

    public void setSalida(int h, int m) {
    }

    public GregorianCalendar getArribo() {
        return arribo;
    }

    public void setArribo(int h, int m) {
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



}
