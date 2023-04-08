package Estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoSete {
	
	public static int primo(int numero) {
		int divisores =0;
		for(int i=1; i<=numero; i++) {
			if(numero%i == 0) {
				divisores++;
			}
		}
		if(divisores == 2) {
			return 1; 
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		int n= sc.nextInt();
		int aux=0;
		for(int i=1; i<=n; i++) {
		
			if(primo(i)==1 && i<n){
				aux=i;
			}
			
		}
		
		System.out.println(aux);

		
		
	sc.close();
	}

}
