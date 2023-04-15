package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestoesSeis {
	
	public static void crescente(int []vetor, int tamanho) {

		for (int i = 0; i < tamanho; i++) {
			for (int j = i; j < tamanho; j++){
		        if (vetor[i] > vetor[j]) {
		                int temp = vetor[i];
		                vetor[i] = vetor[j];
		                vetor[j] = temp;
		         }
		     }
		}
	
		for (int i = 0; i < tamanho; i++){
			System.out.print(vetor[i]);
		}	
		
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho do vetor: ");
		int tamanho = sc.nextInt();
		
		int []vetor = new int[tamanho];
		System.out.print("Digite os valores do vetor: ");
		for(int i =0; i<vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
		
		crescente(vetor, tamanho);
		
		
		
		
		
		sc.close();
	}

}
