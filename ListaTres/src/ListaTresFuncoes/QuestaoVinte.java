package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoVinte {
	
	public static int diminui(int tamanho) {
		
	int []vetor = new int[tamanho];
		if(!(tamanho == 1)){
			for(int i=1; i<tamanho;i++) {
				tamanho = tamanho-1;
			}
		}
		return tamanho;
		
		
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamanho do vetor: ");
		int tamanho = sc.nextInt();
		
		diminui(tamanho);
		System.out.println(diminui(tamanho));
		
		
		
		
		sc.close();
	}

}
