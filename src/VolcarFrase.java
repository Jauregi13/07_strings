import java.util.Scanner;

public class VolcarFrase {

	public static void main(String[] args) {
		System.out.println("Escribe un nombre o una frase:");
		
		Scanner scan = new Scanner (System.in);
		String frase = scan.nextLine();
		String invertido = "";
		System.out.println(frase.length());
		System.out.println(frase.charAt(frase.length()-1));
		System.out.println(frase.charAt(frase.length()-2));
		System.out.println(frase.charAt(frase.length()-3));
		invertido = frase.charAt(frase.length()-1) + "aj";
		System.out.println(invertido);
		for (int i = frase.length(); i <= frase.length() || i > 0; i--){
			invertido = frase.charAt(i-1) + invertido;
		}
		System.out.println(invertido);

	}

}
