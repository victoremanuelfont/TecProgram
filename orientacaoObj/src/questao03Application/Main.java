package questao03Application;

import java.util.Locale;
import java.util.Scanner;

import questao03Entities.Fatura;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tech Store");
		System.out.print("Numero do item: ");
		int numero = sc.nextInt();
		System.out.print("Descricao do produto: ");
		sc.nextLine();
		String descricao = sc.nextLine();
		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();
		System.out.print("Preço unitário do produto: ");
		double precoUnitario = sc.nextDouble();
		System.out.print("Porcentagem do desconto: ");
		double precoTotal = sc.nextDouble();
		
		Fatura fatura = new Fatura(numero,descricao,quantidade,precoUnitario,precoTotal);
		System.out.println();
		System.out.println("Valor da fatura: $" + fatura.getValorFatura());
		System.out.println("Valor da fatura com desconto: $" + fatura.desconto());
	
		
		sc.close();
	}

}
