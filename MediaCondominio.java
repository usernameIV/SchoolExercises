import java.util.Scanner;


public class MediaCondominio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numBlocos= 4;
		
		int[] somaIdadeHomens = new int[numBlocos];
		int[] somaIdadeMulheres = new int[numBlocos];
		int[] contagemHomens = new int[numBlocos];
		int[] contagemMulheres = new int[numBlocos];
		
		int somaTotalIdadeHomens = 0;
        int somaTotalIdadeMulheres = 0;
        int totalHomens = 0;
        int totalMulheres = 0;
		
		String[] letra = {"A", "B", "C", "D", "Condomínio"};	
		
	for(int bloco = 0; bloco <= 4; bloco++)	
	{ 
		for (int j = 0; j < letra.length; j++) 
		{
			for(int i = 1; i <= 20; i++) 
			{
				System.out.println("Insira a idade do residente "
					+ "numero " + i + " do Bloco " + letra[j] + ":");
					int idade = scanner.nextInt();					
				System.out.println("Informe o genero (H ou M):");
					char genero = scanner.next().charAt(0);	
						if(genero == 'H' || genero == 'h') 
						{
							somaIdadeHomens[bloco] += idade;
							contagemHomens[bloco]++;
							somaTotalIdadeHomens += idade;
		                    totalHomens++;
						} 
						else if (genero =='M' || genero == 'm') 
						{
							somaIdadeMulheres[bloco] += idade;
							contagemMulheres[bloco]++;
							somaTotalIdadeMulheres += idade;
		                    totalMulheres++;
						} 
						else {
							System.out.println("Existem apenas 2 generos");
						}					
			}		
				double mediaHomens;
				double mediaMulheres;
		        
				mediaHomens = somaIdadeHomens[bloco] / contagemHomens[bloco];
				mediaMulheres = somaIdadeMulheres[bloco] / contagemMulheres[bloco];
				
					System.out.println("Bloco " + letra[j] +":");
					if (j == 5) {
						System.out.println(letra[j]);
					}
			        System.out.println("A media das idades dos homens do bloco "
			        		+ letra[j] + " foi: " + mediaHomens);
			        System.out.println("A media das idades das mulheres "
			        		+ letra[j] +" foi: " + mediaMulheres);
		}
		
		
		double mediaTotalHomens = somaTotalIdadeHomens / totalHomens;
		double mediaTotalMulheres = somaTotalIdadeMulheres / totalMulheres;
	
		System.out.println(letra[5]);
        System.out.println("A media das idades dos homens no condomInio foi: " + mediaTotalHomens);
        System.out.println("A media das idades das mulheres no condomInio foi: " + mediaTotalMulheres);
	}
		
	}
}
