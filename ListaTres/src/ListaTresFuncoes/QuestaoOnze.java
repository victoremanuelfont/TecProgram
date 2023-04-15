package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoOnze {
	
	public static void potenciacao(int base, int expoente) {
		int vetor[]=new int[expoente];
		int potencia =1;
		for(int i=0; i<expoente; i++) {
			potencia = potencia*base;
		}
		System.out.println(potencia);
		
		
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a base? ");
		int base = sc.nextInt();
		
		System.out.println("EXPOENTE? ");
		int expoente = sc.nextInt();
		
		potenciacao(base, expoente);
		
		
		sc.close();
	}

}
