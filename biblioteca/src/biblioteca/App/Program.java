package biblioteca.App;

import java.util.Locale;
import java.util.Scanner;

import biblioteca.Cliente;
import biblioteca.Emprestimo;
import biblioteca.Publicacao;
import biblioteca.TipoCliente;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de Clientes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Matricula: ");
		int matricula = sc.nextInt();
		System.out.print("Funcao (PROFESSOR/ALUNO/SERVIDOR): ");
		sc.nextLine();
		String funcao = sc.nextLine();
		
		Cliente cliente = new Cliente(nome, matricula, TipoCliente.valueOf(funcao));
		
		System.out.print("Tipo: ");
		String tipo = sc.nextLine();
		
		Publicacao publi = new Publicacao(tipo);
		
		Emprestimo emp = new Emprestimo(publi);
		emp.addCliente(cliente);
		
		System.out.println(emp.getMoeda());
		}
		
		
		sc.close();
	}

}
