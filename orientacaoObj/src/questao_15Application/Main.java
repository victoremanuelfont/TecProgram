package questao_15Application;

import java.util.Locale;
import java.util.Scanner;

import questao_15Entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preços de custo: ");
		double custo = sc.nextDouble();
		System.out.print("Preços de venda: ");
		double venda = sc.nextDouble();
		System.out.print("Despesas: ");
		double despesas = sc.nextDouble();
		
		Produto prod = new Produto(custo,venda,despesas);
		
		System.out.println("Margem de lucro: " + prod.margemDeLucro());
		
		
	sc.close();
	}

}
