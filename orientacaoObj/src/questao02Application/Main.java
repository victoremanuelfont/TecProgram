package questao02Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import questao02Entities.Empregado;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Numero de empregados? ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
		System.out.println();
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Sobrenome: ");
		String sobrenome = sc.nextLine();
		System.out.print("Salario Mensal: ");
		double salarioMensal = sc.nextDouble();
		
		Empregado result = new Empregado(nome,sobrenome,salarioMensal);
		list.add(result);
		}
		
	
		for(Empregado resposta : list) {
			System.out.println();
			System.out.print(resposta.getName());
			System.out.println();
			System.out.println("Salario Mensal: $" + resposta.getSalarioMensal());
			System.out.print("Salario Anual : $" + resposta.salarioAnual());
			System.out.println();
			System.out.print("Salario depois do aumento: $" + resposta.aumento());
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
