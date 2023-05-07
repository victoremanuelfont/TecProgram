package questao09Application;

import java.util.Locale;
import java.util.Scanner;

import questao09Entities.Circulo;
import questao09Entities.Forma;
import questao09Entities.Quadrado;
import questao09Entities.Retangulo;
import questao09Entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Raio do circulo: ");
		double raio = sc.nextDouble();
		Forma circulo = new Circulo(raio);
		System.out.println(circulo.imprimirNome());
		
		System.out.println();
		System.out.print("Base do Retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Altura do Retangulo: ");
		double altura = sc.nextDouble();
		Forma retangulo = new Retangulo(base, altura);
		System.out.println(retangulo.imprimirNome());
		
		System.out.println();
		System.out.print("Base do Quadrado: ");
		double baseQ = sc.nextDouble();
		Forma quadrado = new Quadrado(baseQ);
		System.out.println(quadrado.imprimirNome());
		
		System.out.println();
		System.out.print("Base do Triangulo: ");
		double baseT = sc.nextDouble();
		System.out.print("Altura do Triangulo: ");
		double alturaT = sc.nextDouble();
		Forma triangulo = new Triangulo(baseT, alturaT);
		System.out.println(triangulo.imprimirNome());
		
		
		
		
		
		sc.close();
	}

}
