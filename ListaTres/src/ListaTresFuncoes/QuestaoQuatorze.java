package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoQuatorze {
	
	public static void remocao(int vetor[],int numero, int tamanho){
	
		int contador = 0;
		for(int i =0; i<tamanho; i++) {
			if(vetor[i]==numero)
				contador ++;
		}
		
		int aux[] = new int [tamanho - contador];
		for(int i =0; i<tamanho; i++) {
			if()
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
		System.out.println("Valor que sera removido do vetor: ");
		int numero = sc.nextInt();
		
		remocao(vetor,numero,tamanho);
		
		
		sc.close();
	}

}
