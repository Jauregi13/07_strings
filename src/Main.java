
public class Main {

	public static void main(String[] args) {
		String cadena = "Hola Mundo";
		
		System.out.println(cadena);
		System.out.println("Hola Mundo");
		
		System.out.println("La cadena \"" + cadena + "\" tiene " + cadena.length() + " caracteres");
		
		System.out.println("El segundo caracter de \"" + cadena + "\" es '" + cadena.charAt(1) + "'");
		
		System.out.println(cadena.substring(0, 4));
		
		System.out.println(cadena.substring(5, cadena.length()));

	}

}
