package questao05Program;

import java.util.Locale;
import java.util.Scanner;

import questao05Entities.Contato;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		int codigo=0;
		do {
			System.out.print("Codigo: ");
			codigo = sc.nextInt();
			
		} while(!(codigo>1000 && codigo<9999));
		
		System.out.print("email: ");
		sc.nextLine();
		String email = sc.nextLine();
		Contato cont = new Contato(codigo,nome,email);
		
		int telefone = 0;
		do {
			System.out.print("telefone: ");
			telefone = sc.nextInt();
		}while(!(telefone> 10000000 && telefone<99999999));
		System.out.print("telefone: ");
		
		
		Contato tef = new Contato(telefone);
		
		
		sc.close();
	}

}
