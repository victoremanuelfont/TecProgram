package aplicacaoDoJogo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import jogo.JogoException;
import jogo.Partida;
import jogo.PosicaoDoJogo;
import jogo.RobosDoJogo;
import planoDoJogo.Plano;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Tamanho do plano do jogo(quantidade de Linhas e Colunas): ");
//		int linhas = sc.nextInt();
//		int colunas  = sc.nextInt();
		
		Plano plano = new Plano(8,8);
		Partida partida = new Partida(plano);
		List<RobosDoJogo> capturado = new ArrayList<>();
		
		while(true) {
		try {	
		Programa.imprimirPartida(partida,capturado);
		System.out.println();
		System.out.print("Origem: ");
		PosicaoDoJogo origem = Programa.lerPosicao(sc);
		
//		boolean[][] possiveisMovimentos = partida.possiveisMovimentos(origem);
//		Programa.printPlano(partida.retornaMatrizRobos(), possiveisMovimentos);

		
		System.out.println();
		System.out.print("Destino: ");
		PosicaoDoJogo destino= Programa.lerPosicao(sc);
		
		RobosDoJogo capturaRobo = partida.moverRobo(origem, destino);
		
		if(capturaRobo != null) {
			capturado.add(capturaRobo);
		}
		
		
		
		}catch(JogoException e) {
			System.out.println(e.getMessage());
			
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
			
		}
		
		}
		
		
		
		
		
		
		//sc.close();
	}

}
