package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoDezesseis {
	
	public static boolean primo(int numero){
		
		int contador=0;
		
		for(int i =2; i<=numero/2;i++) {
			if(numero%i==0)
				contador++;	
		}
			if(contador==0) {
				return true;
			}else {
				return false;
			}
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		primo(numero);
		System.out.println(primo(numero));
		
		sc.close();
	}

}
