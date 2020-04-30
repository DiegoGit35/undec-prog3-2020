package despues;

public class Capitalize {
	public String nombre2;
	public Capitalize(String nombre) {
		String[] cadena = nombre.split(" ");
		String nom = "";
		for (int i = 0; i < cadena.length; i++) {
			nom += " " + cadena[i].toUpperCase().charAt(0) + cadena[i].toLowerCase().substring(1, cadena[i].length());
		}
		System.out.println(nom);
		this.nombre2 = nom.substring(1);
	}
}
