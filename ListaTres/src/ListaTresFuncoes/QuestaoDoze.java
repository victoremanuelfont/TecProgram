package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoDoze {
	
	public static void primo(int numero) {
		
		int contador=0;
		
		for(int i =2; i<=numero/2;i++) {
			if(numero%i==0)
				contador++;	
		}
			if(contador==0) {
				System.out.println("É primo");
			}else {
				System.out.println("não é primo");
			}
				
		
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		primo(numero);
		
		
		sc.close();
	}

}
