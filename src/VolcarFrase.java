import java.util.Scanner;

public class VolcarFrase {

	public static void main(String[] args) {
		System.out.println("Escribe un nombre o una frase:");
		
		Scanner scan = new Scanner (System.in);
		String frase = scan.nextLine();
		String invertido = " ";
		
		for (int i = frase.length(); i <= frase.length() || i >= 0; i--){
			char caracter = frase.charAt(i-1);
			invertido = String.valueOf(caracter);
		}
		System.out.println(invertido);

	}

}
