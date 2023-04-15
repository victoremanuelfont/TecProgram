package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoTres {
	
	public static double mediaPonderada(int vetorNotas[],int vetorPesos[],int quantidade) {
		
		double mediaPonderada =0.0;
		int dividendo =0;
		double divisor =0.0;
		
		for(int i =0; i<vetorPesos.length; i++) {
			dividendo += vetorPesos[i];
		}
		
		for(int i=0; i<quantidade; i++) {
			divisor = divisor + (vetorNotas[i]*vetorPesos[i]);
		}
		
		mediaPonderada = divisor/dividendo;
		
		
		return mediaPonderada;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas notas serão?");
		int quantidade = sc.nextInt();
		
		int []vetorNotas = new int[quantidade];
		int []vetorPesos = new int[quantidade];
		
		System.out.print("Digite as Notas: ");
		for(int i=0; i<vetorNotas.length; i++) {
			vetorNotas[i] = sc.nextInt();
		}
		
		System.out.print("Digite os Pesos: ");
		for(int i=0; i<vetorPesos.length; i++) {
			vetorPesos[i] = sc.nextInt();
		}
		
		mediaPonderada(vetorNotas,vetorPesos,quantidade);

		System.out.println(mediaPonderada(vetorNotas,vetorPesos,quantidade));
		
		
		sc.close();
	}

}
