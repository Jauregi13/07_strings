
public class NumerosPrimos {

	public static void main(String[] args) {
		System.out.println("Estos son los números primos del 1 al 100:");
		for (int numero = 1; numero <= 100; numero ++){
			int contador = 0;
			for (int division = 1; division <= numero; division++) {

				if (numero % division == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				System.out.println(numero);
			}
		}
			
				
			
		
	}

}
