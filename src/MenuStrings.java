import java.util.Scanner;

public class MenuStrings {

	public static void main(String[] args) {
		final int LARGURA = 1;
		final int ORDENAR = 2;
		final int EXTRAER = 3;
		final int SALIR = 4;
		Scanner scan = new Scanner (System.in);
		int opcion;
		do{
			System.out.println("Elige una de estas opciones:");
			System.out.println(LARGURA+". Saber el apellido más largo");
			System.out.println(ORDENAR+". Ordenar alfabeticamente los apellidos");
			System.out.println(EXTRAER+". Extraer del 'nombre apellido' el apellido");
			System.out.println(SALIR+". Salir");
			System.out.println("Pulsa un botón de estos:");
			
			opcion = Integer.parseInt(scan.nextLine());
			switch(opcion){
				case LARGURA:
					//escribir 2 apellidos y decir cual es el más largo
					System.out.println("Escribe un apellido:");
					String apellido1 = scan.nextLine();
					System.out.println("Escribe otro apellido:");
					String apellido2 = scan.nextLine();
					if (apellido1.length() > apellido2.length()){
						System.out.println("El apellido más largo es: " + apellido1);
					}
					else if (apellido2.length() > apellido1.length()){
						System.out.println("El apellido más largo es: " + apellido2);
					}
					else {
						System.out.println("Los apellidos son iguales o tienen la misma largura");
					}
				break;
				
				case ORDENAR:
					System.out.println("Escribe un apellido:");
					String apellido3 = scan.nextLine();
					System.out.println("Escribe otro apellido:");
					String apellido4 = scan.nextLine();
					if (apellido3.compareTo(apellido4)> 0){
						System.out.println("1. " + apellido4);
						System.out.println("2. " + apellido3);
					}
					else if (apellido3.compareTo(apellido4)< 0){
						System.out.println("1. " + apellido3);
						System.out.println("2. " + apellido4);
					}
					else {
						System.out.println("Los apellidos son iguales");
					}
				break;
				
				case EXTRAER:
					System.out.println("Escribe tu nombre y apellido todo junto:");
					String nombre_apellido = scan.nextLine();
					int apellido = nombre_apellido.indexOf(" ") + 1;
					System.out.println("Este es tu apellido: " +nombre_apellido.substring(apellido,nombre_apellido.length()));
				break;
				
				case SALIR:
					System.out.println("Saliendo...");
				break;
				default:
					System.out.println("Opción incorrecta");
				
				
			
			}
		}
		while(opcion != SALIR);
			System.out.println("Fin del programa");

	}

}