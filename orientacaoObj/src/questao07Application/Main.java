package questao07Application;

import java.util.Locale;
import java.util.Scanner;

import questao07Entities.Empregado;
import questao07Entities.Gerente;
import questao07Entities.Vendedor;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Nome do empregado: ");
		String nome = sc.nextLine();
		System.out.print("Salário do empregado: ");
		double salario = sc.nextDouble();
		System.out.print("Departamento: ");
		sc.nextLine();
		String departamento = sc.nextLine();
		System.out.println("Percentual de comissão do vendedor: ");
		double percentual = sc.nextDouble(); 
		
		Empregado emp = new Gerente(nome,salario,departamento);
		Empregado empe = new Vendedor(nome,salario,percentual);	
		
		System.out.println(emp);
		System.out.println();
		System.out.println(empe);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
