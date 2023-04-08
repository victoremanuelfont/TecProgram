package Estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		// questao 01
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				
			}
		}
		
		questao 02
		
		
		int numeroPositivo=0, soma=0;
		do {
			soma+=numeroPositivo;
			numeroPositivo = sc.nextInt();
		}while(numeroPositivo>0);
		System.out.println("Soma dos numeros positivos = "+soma);
		
	
		// questao 03
		
		int numeroCerto=5;
		System.out.println("Digite um numero:");
		int numeroDigitado = sc.nextInt();
		do {
			if(!(numeroDigitado==numeroCerto)) {
				if(numeroDigitado>numeroCerto) {
					System.out.println("O numero digitado é maior que o numero certo");
				}else {
					System.out.println("O numero digitado é menor que o numero certo");
				}
			}
			numeroDigitado=0;
			System.out.println("Digite um novo numero:");
			numeroDigitado = sc.nextInt();
			
		}while(!(numeroCerto==numeroDigitado));
		
		System.out.println("5 é o numero certo!");
		
		//questao 04
		
		int numeroEspecifico = sc.nextInt();
		int multi=0;
		do {
		 for(int i = 0; i<11; i++) {
			 multi = i*numeroEspecifico;
			 System.out.println(numeroEspecifico + " x " + i + " = " + multi);
		 }
		}while(!(numeroEspecifico==numeroEspecifico));
		
		// questao 05
		
		int n = sc.nextInt();	
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.println(i + " - " + j);
			}
			
		}
		
		// questao 06
		
		int n =2;
		int[][]matriz = new int[n][n];
		int[][]matriztrans = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matriz[i][j]!=matriztrans[j][i]) {
					System.out.println("Não é simétrica!");
				}else {
					System.out.println("É simétrica");
				}
				
			}
		}
		

		
		
		
		sc.close();
	}

}
