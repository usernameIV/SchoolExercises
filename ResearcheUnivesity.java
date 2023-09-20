import java.util.Scanner;


public class ResearcheUnivesity {

	public static void main(String[] args) {

		/*	Foi feita uma pesquisa com um grupo de alunos de uma universidade, 
		  	na qual se perguntou para cada aluno o número de vezes que utilizou a 
		  	lanchonete da universidade no último mês. 
		  	Construa um algoritmo que determine:
			a) O percentual de alunos que utilizaram menos que 10 vezes;
			
			b) O percentual de alunos que utilizaram entre 10 e 15 vezes;
			
			c) O percentual de alunos que utilizaram acima de 15 vezes */
		
	int MenosDe5 = 0;
	int	Entre5e10 = 0;
	int MaisDe10 = 0;
		
		
	Scanner scanner = new Scanner(System.in);
		
		
	int[] picas = new int[8];
	System.out.println("Insira os dados informados pelos alunos... (9999 finalizar leitura)");
		
	for(int i = 0; i < 8; i++) {
		System.out.println("aluno " + (i+1) + ": ");
			picas[i] = scanner.nextInt();
			
		}		
	System.out.println("Os numeros inseridos foram: ");		
	System.out.print("{");
		for (int i = 0; i < 8; i++) {
			System.out.print(picas[i]);
				if (i < 7) {
					System.out.print(",");
				}
				else {
					System.out.println("}");
				}
				
				
				if(picas[i] < 5) {
					MenosDe5++;
				}
				else if (picas[i] >= 5 && picas[i] <= 10) {
					Entre5e10++;
				}
				else {
					MaisDe10++;
				}
			}
		
	int totalDeAlunos = 8;
		
	scanner.close();
		

	double mediaMenosDe5 = (MenosDe5 * 100.0) / totalDeAlunos;
	double mediaEntre5e10 = (Entre5e10 * 100.0) / totalDeAlunos;
	double mediaMaisDe10 = (MaisDe10 * 100.0) / totalDeAlunos;
		
	System.out.println("O percentual de alunos "
		+ "que usaram a lanchonete menos de 5 vezes foi:" + mediaMenosDe5+ "%");
	System.out.println("O percentual de alunos "
		+ "que usaram a lanchonete entre 5 e 10 vezes foi:" + mediaEntre5e10+ "%");
	System.out.println("O percentual de alunos "
		+ "que usaram a lanchonete mais de 10 vezes foi:" + mediaMaisDe10+ "%");
		
	}
}
