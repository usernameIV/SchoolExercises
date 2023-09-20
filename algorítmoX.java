import java.util.Scanner;


public class algorítmoX {

	public static void main(String[] args) {
		
		int numero;
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int contador = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insert a number: (9999 to leave) ");
		
		while (true) {
			numero = scanner.nextInt();
			 
		if(numero == 9999) {
			break;
		}
			
		soma += numero;
		contador++;
		
		if(numero > maior) {
			maior = numero;
		}
		
		if(numero < menor) {
			menor = numero;
		}
		
		System.out.println("insert another number: (9999 to leave)");
		
		}

		scanner.close();
		
		if(contador > 0) {
			double media = (double) soma / contador;
			System.out.println("Sum: " + soma);
			System.out.println("Highest: " + maior);
			System.out.println("Smallest: " + menor);
			System.out.println("Median: " + media);
		} else {
			System.out.println("No insert number...");
		}
		
	}

}
