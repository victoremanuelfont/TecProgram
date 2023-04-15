package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoTreze {
	
	public static void iguais(int vetor[], int outroVetor[], int tamanho) {
		
		int aux[] = new int[tamanho+tamanho];
		for(int i =0; i< tamanho; i++) {
			for( int j = 0; j<tamanho; j++) {
				if(vetor[i] == outroVetor[j])
			       	
			}
		}
		int contador =0;
		for(int i =0; i<tamanho; i++){
			if(!(aux[i]==0)) {
				vetor[i] = aux[i];
				contador++;
			}
		}
		
		for(int i =0; i<=tamanho - contador; i++){
			System.out.println(vetor[i]);
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamanho dos vetores: ");
		int tamanho = sc.nextInt();
		
		int vetor[] = new int[tamanho];
		System.out.println("Valores do vetor:");
		for(int i =0; i<tamanho; i++) {
			vetor[i] = sc.nextInt();
		}
		System.out.println("Valores do outro vetor: ");
		int outroVetor[] = new int[tamanho];
		for(int i =0; i<tamanho; i++) {
			outroVetor[i] = sc.nextInt();
		}
		
		iguais(vetor,outroVetor,tamanho);
		
		sc.close();
	}

}
