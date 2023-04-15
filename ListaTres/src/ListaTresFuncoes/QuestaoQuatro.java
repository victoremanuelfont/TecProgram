package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoQuatro {
	
	public static int contagemElementos(int []vetorUm, int []vetorDois, int elemento) {
		int repeticoes = 0;
		
		for(int i=0; i<vetorUm.length; i++) {
			if( elemento == vetorUm[i]) {
				repeticoes ++;
			}
			if(elemento == vetorDois[i]) {
				repeticoes ++;
			}
		}
		
		return repeticoes;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o tamanho do vetor? ");
		int quantidade = sc.nextInt();
		
		int []vetorUm = new int[quantidade];
		System.out.print("Digite os elementos do vetor Um: ");
		for(int i=0; i<vetorUm.length; i++) {
			vetorUm[i] = sc.nextInt();
		}
		
		int []vetorDois = new int[quantidade];
		System.out.print("Digite os elementos do vetor Dois: ");
		for(int i=0; i<vetorDois.length; i++) {
			vetorDois[i] = sc.nextInt();
		}
		
		System.out.print("Qual numero vc quer saber quantas vezes repetiu?");
		int elemento = sc.nextInt();
		
		contagemElementos(vetorUm,vetorDois,elemento);
		
		System.out.print("o numero "+ elemento + " repetiu : " + contagemElementos(vetorUm,vetorDois,elemento)+ " vezes");
		
		
		sc.close();
	}

}
