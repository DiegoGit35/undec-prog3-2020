import exceptions.ExceptionAerolinea;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Aerolinea {
    public String cuit;
    public String CodIATA;
    public String nombre;
    public GregorianCalendar fecha;

    private List<Avion> misAviones = new ArrayList<Avion>();
    private List<Piloto> misPilotos = new ArrayList<Piloto>();

    public Aerolinea(String cuit, String codIATA, String nombre, GregorianCalendar fecha) throws ExceptionAerolinea {
        this.cuit = cuit;
        CodIATA = codIATA.toUpperCase();
        this.nombre = capitalize(nombre);
        this.fecha = fecha;
    }

    public Aerolinea() {

    }

    private String capitalize(String nombre) {
        String[] cadena = nombre.split(" ");
        String nom = "";
        for (int i = 0; i < cadena.length; i++) {
            nom += " " + cadena[i].toUpperCase().charAt(0) + cadena[i].toLowerCase().substring(1, cadena[i].length());
        }
        System.out.println(nom);
        return nom.substring(1);
    }
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCodIATA() {
        return CodIATA;
    }

    public void setCodIATA(String codIATA) {
        CodIATA = codIATA.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre2) {
        this.nombre = capitalize(nombre2);
    }

    public String getFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.fecha.getTime());
    }

    public void setFecha(int a, int m, int d) {
        GregorianCalendar f1 = new GregorianCalendar(a, m, d);
        this.fecha = f1;
    }
    public void addAvion(Avion a1) {
        boolean bandera = false;
        for (Avion a : misAviones)
            if (a.getMatricula().contains(a1.matricula))
                bandera = true;
        if(bandera == false)
            misAviones.add(a1);
    }
    public List<Avion> getAviones() {
        return misAviones;
    }

    public List<Avion> buscarAvionesxMatriculas(String matricula) {
        List<Avion> salida= new ArrayList<Avion>();
        for (Avion a : misAviones)
            if (a.getMatricula().contains(matricula))
                salida.add(a);
        return salida;
    }

    public int cantAviones() {
        return misAviones.size();
    }

    public void addPiloto(Piloto p1) {
        boolean bandera = false;
        for(Piloto p : misPilotos)
            if (p.getCuil().contains(p1.cuil))
                bandera = true;
        if(bandera == false)
            misPilotos.add(p1);
    }

    public int cantPilotos() {
        return misPilotos.size();
    }

    public List<Piloto> getPilotos() {
        return misPilotos;
    }

    public List<Piloto> buscarPilotoxLegajo(String legajo) {
        List<Piloto> salida= new ArrayList<Piloto>();
        for (Piloto p : misPilotos)
            if (p.getCuil().contains(legajo))
                salida.add(p);
        return salida;
    }

    public List<Piloto> buscarPilotoxApellido(String apellido) {
        List<Piloto> salida= new ArrayList<Piloto>();
        for (Piloto p : misPilotos)
            if (p.getApellido().toUpperCase().contains(apellido.toUpperCase()))
                salida.add(p);
        return salida;
    }

}
