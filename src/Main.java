
public class Main {

	public static void main(String[] args) {
		String cadena = "Hola Mundo";
		String cadena1 = "zubiri";
		String cadena2 = "manteo";
		
		System.out.println(cadena);
		System.out.println("Hola Mundo");
		
		System.out.println("La cadena \"" + cadena + "\" tiene " + cadena.length() + " caracteres");
		
		System.out.println("El segundo caracter de \"" + cadena + "\" es '" + cadena.charAt(1) + "'");
		
		System.out.println(cadena.substring(0, 4));
		
		System.out.println(cadena.substring(5, cadena.length()));
		
		if(cadena.equals(cadena2)){
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son diferentes");
		}
		
		System.out.println(cadena.indexOf("a"));
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		
		int comparacion = cadena1.compareTo(cadena2);
		
		System.out.println("Comparacion de " + cadena1 + " con " + cadena2 + " es: " + comparacion );
		
		if(cadena2.compareTo(cadena1) == 0){
			System.out.println("son iguales");
		}
		
		
		// cadena = "Hola mundo";
		System.out.println("La ultima aparicion de o en " +cadena + " es: " +cadena.lastIndexOf("o"));
		
		System.out.println("La primera aparicion de o en " +cadena + " es: " +cadena.indexOf("o"));

	}

}
