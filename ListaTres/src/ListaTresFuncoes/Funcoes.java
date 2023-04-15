package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Funcoes {
	
	public static int somatorio(int vetor[]) {
		int soma = 0;
		for(int i=2;i<vetor.length-2;i++) {
			soma += vetor[i];
		}
		return soma;
	}
	
	public static double media(int vectUm[],int vectDois[],int n) {
		double media =0.0;
		int somaUm=0;
		int somaDois =0;
		for(int i =0; i<vectUm.length;i++ ) {
			somaUm += vectUm[i];
		}
		for(int i =0; i<vectDois.length;i++ ) {
			somaDois += vectDois[i];
		}
		media = (somaUm + somaDois)/(n+n);
		
		return media;
	}
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// questao 01
		int []vetor =  new int[10];
		
		System.out.print("Numeros no vetor: ");
		for(int i = 0; i<vetor.length;i++) {
			vetor[i]= sc.nextInt();
		}
		
		somatorio(vetor);
		System.out.println(somatorio(vetor));
		
		//questao 02
		
		System.out.println("Tamanho dos vetores? ");
		int n = sc.nextInt();
		int[]vectUm = new int [n];
		int[]vectDois = new int [n];
		
		System.out.println("Numeros do vetor Um: ");
		for(int i=0; i<vectUm.length;i++) {
			vectUm[i] = sc.nextInt();
		}
		
		System.out.println("Numeros do vetor Dois: ");
		for(int i=0; i<vectDois.length;i++) {
			vectDois[i] = sc.nextInt();
		}
		
		media(vectUm,vectDois,n);
		System.out.println(media(vectUm,vectDois,n));
		
		
		sc.close();
	}

}
