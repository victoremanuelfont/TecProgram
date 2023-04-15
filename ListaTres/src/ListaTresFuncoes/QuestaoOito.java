package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoOito {
	
	public static int kesimo(int vetor[],int k, int tamanho) {
		
		int maior =0;
		for(int i =0; i<tamanho; i++) {
			if(vetor[i]>k) 
				maior = vetor[i];
		}
		return maior;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho do vetor? ");
		int tamanho = sc.nextInt();
		
		int vetor[] = new int [tamanho];
		System.out.print("Digite os valores do vetor: ");
		for(int i=0; i<tamanho; i++) {
			vetor[i] = sc.nextInt();
		}
		System.out.print("valor de k? ");
		int k =sc.nextInt();
		
		kesimo(vetor,k,tamanho);
		System.out.print("Maior valor que k é: " + kesimo(vetor,k,tamanho));
		
			
		
		sc.close();
	}

}
