import exceptions.ExceptionAvion;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Avion {
    public String matricula;
    public String modelo;
    public int capacidad;
    public int anioFab;


    public Avion(String matricula, String modelo, int capacidad, int anioFab) throws ExceptionAvion {
        if(validarMatricula(matricula))
            this.matricula = matricula.toUpperCase().replace(" ", "");
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.anioFab = anioFab;
    }

    private boolean validarMatricula(String matricula) throws ExceptionAvion
    {
        if(matricula == null)
        {
            throw new ExceptionAvion("la matricula no puede ser Nula");
        }
        if(matricula == "")
        {
            throw new ExceptionAvion("la matricula no puede ser vacia");
        }
        if(!matricula.contains("-"))
        {
            throw new ExceptionAvion("la matricula debe llevar -");
        }
        if(matricula.contains("-"))
        {
            String[] cadena = matricula.split("-");
            if(!(cadena[0].toUpperCase().replace(" ", "").matches("LV") || (cadena[0].toUpperCase().replace(" ", "").matches("LQ")) && cadena[1].replace(" ", "").length()==3))
                throw new ExceptionAvion("la matricula debe comenzar comenzar con LV o LQ");
        }
        return true;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        if(anioFab >= 1903)
            this.anioFab = anioFab;
    }

}
