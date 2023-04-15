package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoNove {
	
	public static int kesimoMenor(int vetor[],int tamanho, int k) {
		int menor=0;
		for(int i=0;i<tamanho;i++) {
			if(vetor[i]<k)
				menor = vetor[i];
		}
		
		return menor;
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
		
		kesimoMenor(vetor,tamanho,k);
		System.out.println(kesimoMenor(vetor,tamanho,k));
		
		
		
		
		
		
		
		sc.close();
	}

}
