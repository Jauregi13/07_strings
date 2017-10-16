import java.util.Scanner;

public class VolcarFrase {

	public static void main(String[] args) {
		System.out.println("Escribe un nombre o una frase:");
		
		Scanner scan = new Scanner (System.in);
		String frase = scan.nextLine();
		
		for (int i = 0; i < frase.length(); i++){
			frase.charAt(i);
		}
		

	}

}
