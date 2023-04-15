package ListaTresFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoDezoito {

	public static void jurosComposto(double valorInicial,double taxaJuros,int periodos ) {
		
		
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Valor inicial: ");
		double valorInicial = sc.nextDouble();
		System.out.print("Taxa de juros: ");
		double taxaJuros = sc.nextDouble();
		System.out.print("Números de períodos: ");
		int periodos = sc.nextInt();
		
		
		jurosComposto(valorInicial,taxaJuros,periodos);
	
		
		
		
		
	sc.close();
	}

}
