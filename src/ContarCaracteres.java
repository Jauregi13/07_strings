import java.util.Scanner;

public class ContarCaracteres {

	public static void main(String[] args) {
		
		int contador = 0;
	
		Scanner lector = new Scanner (System.in);
		
		String frase ="Hola mundo";
		
		System.out.println("Escribe un caracter:");
		
		String frase2 = lector.nextLine();
		
		char caracter = frase2.charAt(0);
		
		for (int i = 0; i < frase.length(); i++){
			if (frase.charAt(i)== caracter){
				contador++;
			}
		}
		System.out.println("La frase " + frase + " tiene " + contador +" " + caracter +"(s)");

	}

}
