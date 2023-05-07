package questoes10_11_12_Aplication;

import java.util.Locale;
import java.util.Scanner;

import questoes10_11_12_Entities.Empregado;
import questoes10_11_12_Entities.Operario;
import questoes10_11_12_Entities.Pessoa;
import questoes10_11_12_Entities.Vendedor;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("codigo Setor: ");
		int codigoSetor = sc.nextInt();
		System.out.print("salario Base: ");
		double salarioBase = sc.nextDouble();
		System.out.print("imposto: ");
		double imposto = sc.nextDouble();
		
		Pessoa emp = new Empregado(nome,idade,codigoSetor,salarioBase, imposto);
		
		System.out.print("valor de Producao: ");
		double valorProducao = sc.nextDouble();
		System.out.print("comissao: ");
		double comissao = sc.nextDouble();
		
		Pessoa op = new Operario(nome,idade,codigoSetor,salarioBase, imposto,valorProducao,comissao );
		
		System.out.print("comissao1: ");
		double comissao1 = sc.nextDouble();
		System.out.print("valorVendas: ");
		double valorVendas = sc.nextDouble();
		
		Pessoa vend = new Vendedor(nome,idade,codigoSetor,salarioBase,imposto,valorVendas,comissao1);
		
		
		System.out.println(emp.calcularSalario());
		System.out.println(op.calcularSalario());
		System.out.println(vend.calcularSalario());
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
