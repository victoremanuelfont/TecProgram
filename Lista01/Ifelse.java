package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			//questao 01
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a>10) {
				System.out.println("A>10");
			}
			if(a+b == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("N�mero Inv�lido");
			}
			
			//questao 02
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			

			if(a<10) {
				System.out.println("A < 10 ");
			}
			else if(a+b == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("N�mero n�o v�lido");
			}
			
			
			//questao 03
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a == 10) {
				System.out.println("A == 10");
			}
			if(a+b == 20) {
				System.out.println("A + B == 20");
			}
			if(b == 10) {
				System.out.println("B == 10");
			}
			
			// questao 04
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a>10 || a+b == 20) {
				System.out.println("n�mero v�lido");
			}else if(a==b) {
				System.out.println("A � igual B; A e B s�o diferentes de 10; A � menor que 10");
			}else {
				System.out.println("N�mero n�o v�lido");
			}
			
			// questao 05
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if( a>10 || a+b==20 ) {
				System.out.println("n�mero v�lido");
			}else {
				System.out.println("n�mero n�o v�lido");
			}
			
			// questao 06
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a>10) {
				System.out.println("A > 10");
			}else {
				System.out.println("A <= 10");
			}
			if(a+b == 20) {
				System.out.println("A+B == 20");
			}else {
				System.out.println("A + B != 20");
			}
			
			
			// QUESTAO 07
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();	
			
			if(a>10 && a+b == 20) {
				System.out.println("n�meros v�lidos");
			}else if (!(a>10)) {
				System.out.println("n�mero n�o v�lido");
			}
			
			
			// questao 08
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a>10) {
				System.out.println("A > 10");
			}
			if(a+b == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("n�mero n�o v�lido");
			}

			// questao 09
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a>10) {
			}
			if(a+b == 20) {
				System.out.println("A+b == 20");
			}
			if(a<10 && !(a+b==20)) {
				System.out.println("n�mero n�o v�lido");
			}
			
			// questao 10
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a>10) {
			}else {
				System.out.println("N�mero menor que 10");
			}
			if(a+b == 20) {
			}else {
				System.out.println("n�mero diferente de 20");
			}
			
			// questao 11
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a > 10) {
			}else if(a+b == 20) {
				System.out.println("A + B == 20");
			}else if(a<10 && !(a+b==20)) {
				System.out.println("n�mero n�o v�lido");
			}
			
			
			// questao 12
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a==a) {
			if(a>10) {
				System.out.println(" A > 10 ");
			}else if(a+b == 20) {
				System.out.println(" a+ b == 20");
			}else {
				System.out.println("n�meros n�o v�lidos");
			}
			System.out.println("Sejam bem vindos � disciplina de T�cnicas de Programa��o");
			}
			
			
			//questao 13
			
			System.out.print("Valor para a variavel A: ");
			int a = sc.nextInt();
			System.out.print("Valor para a variavel B: ");
			int b = sc.nextInt();
			
			if(a>10) {
				System.out.println("A > 10");
			}
			if(a+b == 20) {
				System.out.println("A + B == 20");
			}
			if(a<10 && !(a+b==20)) {
				System.out.println("n�meros n�o v�lidos");
			}
			
		
			sc.close();
	}

}
