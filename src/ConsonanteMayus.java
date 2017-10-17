import java.util.Scanner;

public class ConsonanteMayus {

	public static void main(String[] args) {
		System.out.println("Escribe una frase:");
		
		Scanner lector = new Scanner (System.in);
		
		String cadena = lector.nextLine();
		String cadenaMayus = "";
		char mayus = ' ';
		for (int i = 0; i < cadena.length(); i++){
			if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u' && cadena.charAt(1) != ' '){
				mayus = Character.toUpperCase(cadena.charAt(i));
				cadenaMayus = cadenaMayus + mayus;
			}
			else {
				cadenaMayus = cadenaMayus + cadena.charAt(i);
			}
			
			
		}
		System.out.println(cadenaMayus);


	}
}