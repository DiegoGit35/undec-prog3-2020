public class Aeropuerto {
    public String codIATA;
    public String nombre;
    public String ciudad;
    public int codPostal;

    public Aeropuerto(String codIATA, String nombre, String ciudad, int codPostal) {
        this.codIATA = codIATA.toUpperCase();
        this.nombre = capitalize(nombre);
        this.ciudad = capitalize(ciudad);
        this.codPostal = codPostal;
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

    public String getCodIATA() {
        return codIATA;
    }

    public void setCodIATA(String codIATA) {
        this.codIATA = codIATA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre2) {
        this.nombre = capitalize(nombre2);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = capitalize(ciudad);
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }
}
