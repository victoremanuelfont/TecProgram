package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoDez {
	
	public static boolean igualdade(int vetorUm[], int vetorDois[], int tamanho) {
		int contador =0;
		
		for(int i=0; i<tamanho; i++) {
			if(vetorUm[i]==vetorDois[i])
				contador++;
		}
		if(contador == tamanho)
			return true;
		else
			return false;
					
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho dos vetores? ");
		int tamanho = sc.nextInt();
		
		int vetorUm[] = new int [tamanho];
		System.out.println("Digite o vetorUm: ");
		for(int i =0; i<tamanho; i++) {
			vetorUm[i]=sc.nextInt();
		}
		
		int vetorDois[] = new int[tamanho];
		System.out.println("Digite o vetorDois: ");
		for(int i =0; i<tamanho; i++) {
			vetorDois[i]=sc.nextInt();
		}
		
		igualdade(vetorUm,vetorDois,tamanho);
		System.out.println(igualdade(vetorUm,vetorDois,tamanho));
		
		
		
		sc.close();
	}

}
