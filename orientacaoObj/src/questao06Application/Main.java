package questao06Application;

import java.util.Locale;
import java.util.Scanner;

import questao06Entities.Evento;
import questao06Entities.Ingresso;
import questao06Entities.IngressoVip;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos ingressos serão vendidos? ");
		int quantidade = sc.nextInt();
		
		Evento evento = new Evento(quantidade);
		
		
		
		System.out.print("Valor do Ingresso: ");
		double valor = sc.nextDouble();
		System.out.print("Valor adicional: ");
		double valorAdicional = sc.nextDouble();
		
		Ingresso ingresso = new Ingresso(valor); 
		Ingresso ingressoVip = new IngressoVip(valor, valorAdicional);
		
		System.out.println(ingresso);
		System.out.println(ingressoVip);
		
		
	sc.close();	
	}

}
