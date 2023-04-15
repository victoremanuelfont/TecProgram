package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoSete {
	
	public static boolean verificaOrdenacao(int []vetor, int tamanho) {
		int temp = 0;
		int []vetorAux = new int[tamanho];
		
		
		for(int i=0; i<tamanho; i++) {
			vetorAux[i] = vetor[i];
		}
		
		for(int i=0; i<tamanho; i++) {
			for(int j=i; j<tamanho; j++) {
				if(vetorAux[i]>vetorAux[j]) {
					temp = vetorAux[i];
					vetorAux[i] = vetorAux[j];
					vetorAux[j] =  temp;
				}
			}
			
		}
		int contador = 0;
		for(int i=0; i<tamanho; i++) {
			if(vetor[i]==vetorAux[i]) {
				contador ++;
			}
		}
		
		if(contador==tamanho)
			return true;
		else
			return false;
		
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
		
		verificaOrdenacao(vetor,tamanho);
		boolean resposta = verificaOrdenacao(vetor,tamanho);
		
	
		
		System.out.println(resposta);
		
		
		
		sc.close();
	}

}
