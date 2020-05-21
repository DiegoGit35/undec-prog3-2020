import exceptions.ExceptionAvion;
import exceptions.ExceptionPiloto;

import java.util.GregorianCalendar;

public class Piloto {
    public String cuil;
    public int legajo;
    public String apellido;
    public String nombre;
    public GregorianCalendar fecha;
    public Enum <RolTripulacion> rol;

    public Piloto(String cuil, int legajo, String apellido, String nombre, GregorianCalendar f1, Enum rol) throws ExceptionPiloto {
        if (validarCuil(cuil)){
            this.cuil = cuil.replace(" ", "");
        }
        this.legajo = legajo;
        this.apellido = capitalize(apellido);
        this.nombre = capitalize(nombre);
        this.fecha = f1;
        this.rol = rol;
    }

    public Piloto() {

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

    private boolean validarCuil(String cuil) throws ExceptionPiloto {
        if(cuil == null)
        {
            throw new ExceptionPiloto("el cuil no puede ser Nulo");
        }
        if(cuil == "")
        {
            throw new ExceptionPiloto("el cuil no puede ser vacio");
        }
        if(!cuil.contains("-"))
        {
            throw new ExceptionPiloto("Error, el cuil debe tener la estructura XX-XXXXXXXX-X");
        }
        return true;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = capitalize(apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = capitalize(nombre);
    }
}
