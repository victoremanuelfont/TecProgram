package questao04Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import questao04Entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Quantos produtos ser�o comprados?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.print("Produto #"+i+ ": ");
			System.out.println();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Pre�o: ");
			double preco = sc.nextDouble();
			System.out.println("Quantos produtos desse tipo serao comprados?");
			int quantidade = sc.nextInt();
			list.add( new Produto(nome,preco,quantidade));
			
		}
		
		
		for( Produto prod : list) {
			
			System.out.println(prod.comprarProduto());
		}
		
		
		
		sc.close();
	}

}
