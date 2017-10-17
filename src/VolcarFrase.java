import java.util.Scanner;

public class VolcarFrase {

	public static void main(String[] args) {
		System.out.println("Escribe un nombre o una frase:");
		
		Scanner scan = new Scanner (System.in);
		String frase = scan.nextLine();
		String invertido = "";
	
		for (int i = frase.length(); i >= 1; i--){
			invertido = invertido + frase.charAt(i-1);
		}
		System.out.println("La frase o nombre al reves es así: " +invertido);

	}

}
