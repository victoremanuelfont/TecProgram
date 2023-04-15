package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoDezenove {
	
	public static boolean numeroPerfeito(int numero) {
		int soma = 0;
		for(int i=1; i<=numero/2; i++) {
			if(numero%i==0)
				soma+=i;
		}

		if(soma == numero) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um numero: ");
		int numero = sc.nextInt();
		
		numeroPerfeito(numero);
		System.out.print(numeroPerfeito(numero));
		
		
		
		
		sc.close();
	}

}
