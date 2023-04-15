package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoQuinze {
	
	public static void palindromo(String palavra) {
		String pali = "";
		
		for(int i= palavra.length() - 1; i>=0; i--) {
			pali += palavra.charAt(i);
		}
		if(pali.toLowerCase().equals(palavra.toLowerCase())) {
			System.out.print("� um pal�ndromo!" + "\n" + pali);
		}
		else {
			System.out.print("N�o � um pal�ndromo!" + "\n" + pali);
			
		}
		
	}
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite uma palavra:");
		String palavra = sc.nextLine();
		
		palindromo(palavra);
		
		sc.close();
	}

}
