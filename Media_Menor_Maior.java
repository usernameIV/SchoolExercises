		import java.util.Scanner;

public class Media_Menor_Maior {

	public static void main(String[] args) {

		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int totalNumeros = 10;
		
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int [10];
		System.out.println("Insira 10 numeros inteiros...");
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println("digite o numero " + (i+1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("Os numeros inseridos foram: ");		
		for (int i = 0; i < 10; i++) {
			System.out.println("numero " + (i+1) + ": " + numeros[i]);
			
			soma += numeros[i];
			
			if(numeros[i]>maior) {
				maior = numeros[i];
			}
			
			if(numeros[i] < menor) {
				menor = numeros[i];
				
			
			
			}
		
		}
		
		
		double media = (double) soma / totalNumeros;
		
		System.out.println("\nMEDIA:" + media);
		System.out.println("MAIOR:"+ maior);
		System.out.println("MENOR:" + menor);
			
		
		
		scanner.close();
		
		
		
	}

}
