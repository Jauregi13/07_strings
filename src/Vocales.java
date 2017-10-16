import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		System.out.println("Escribe una frase:");
		
		Scanner scan = new Scanner (System.in);
		
		String frase = scan.nextLine();
		
		int contador = 0;
		
		for (int i = 0; i < frase.length();i++){
			if (frase.charAt(i)== 'a' || frase.charAt(i)== 'e' || frase.charAt(i) == 'i' || frase.charAt(i)== 'o' || frase.charAt(i)== 'u') {
				contador ++;
			}
		}
		System.out.println("La frase " + frase + " tiene " + contador + " vocales");

	}

}
