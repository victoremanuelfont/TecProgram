package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoCinco {
	
	public static void copia(int[]vect) {
		
		int []copia = new int [10];
		for(int i=0; i<vect.length; i++ ) {
			copia[i] = vect[i];
		}
		
		for(int i=0; i<vect.length; i++ ) {
			System.out.print(copia[i]);
		}
		
	}
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int []vect = new int [10];
		System.out.print("Digite os valores do vetor: ");
		for(int i=0; i<vect.length; i++ ) {
			vect[i] = sc.nextInt();
		}
	
		copia(vect);
		
		sc.close();
	}

}
