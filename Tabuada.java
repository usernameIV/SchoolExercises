import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		
		
	
	
		int N = 0;
	
		System.out.println("Insira um numero inteiro para ver sua tabuada: ");
		N = scanner.nextInt();
		
		for (int i = 0; i < 11; i++) {
			System.out.println(N + " x " + i + " = " + N*i);	
			
		}
		
		
		
		while (true) {
		System.out.println("\nDeseja inserir um novo numero para ver sua tabuada? ");
		System.out.print("\"s\" para sim \n");
		System.out.print("\"n\" para nao: ");
		
		boolean escolha;
		String respostaStr = scanner.next();
		
		
		if (respostaStr.length() > 0) {
			char resposta = respostaStr.charAt(0);
		
		
		
		if (resposta == 's' || resposta == 'S') {
			escolha = true;
		}
		else if (resposta == 'n' || resposta == 'N') {
			escolha = false;
			System.out.println("Uma pena... Retorne quando precisar...");
			break;
		}
		else { 
			System.out.println("escolha uma das opçoes acima...");
			scanner.close();
			return;
			
			
		}
		
		if (escolha) {
			System.out.println("\nOtimo...\n");
			System.out.println("Insira um numero inteiro para ver sua tabuada: ");
			N = scanner.nextInt();
			
			for (int i = 0; i < 11; i++) {
				System.out.println(N + " x " + i + " = " + N*i);	
					}
				}
			} 

		}  
	scanner.close();
	}
}
