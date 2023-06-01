package aplicacaoDoJogo;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import jogo.Partida;
import jogo.PosicaoDoJogo;
import jogo.RobosDoJogo;
import jogo.Tipo;

public class Programa {

	//public Plano plano;
	
//	public Programa (Plano plano) {
//		this.plano = plano;
//	}
	public static PosicaoDoJogo lerPosicao(Scanner sc) {
		try {
		String s = sc.nextLine();
		char  coluna = s.charAt(0);
		int linha = Integer.parseInt(s.substring(1));
		return new PosicaoDoJogo(coluna, linha);
		}catch(RuntimeException e) {
			throw new InputMismatchException("ERRO: Valido apenas de a1 ate h8");
		}
		
	}
	
	public static void imprimirPartida(Partida partida, List<RobosDoJogo> capturado) {
		printPlano(partida.retornaMatrizRobos());
		System.out.println();
		imprimirAlunosCapturados(capturado);
		System.out.println();
		System.out.println("Turno: " + partida.getTurno());
		System.out.println("Esperando o jogador: " + partida.getJogadorAtual());
		
		
		
	}
	
	
	
	public static void printPlano(RobosDoJogo[][] robos) {
		for(int  i=0; i<robos.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j=0; j<robos.length; j++) {
				printRobo(robos[i][j]);
			}
			System.out.println();
		}
//		System.out.print("  ");
//		for( char j = 'a'; j<'z'; j++ ) {
//			System.out.print( j + " ");
//		}
		System.out.println("  a b c d e f g h");
	}
	
//	private static void printRobo(RobosDoJogo robos) {
//		if(robos == null) {
//			System.out.print("-");
//		}else {
//			System.out.print(robos);
//		}
//		System.out.print(" ");
//	}
	
//	public static void printPlano(RobosDoJogo[][] robos) {
//		for(int  i=0; i<robos.length; i++) {
//			System.out.print((8 - i) + " ");
//			for(int j=0; j<robos.length; j++) {
//				printRobo(robos[i][j]);
//			}
//			System.out.println();
//		}
//	}
	
	private static void printRobo(RobosDoJogo robos) { // imprimir uma unica peça
//		if(background) {
//			//System.out.print();
//		}
		if (robos == null) {
            System.out.print("-");
        }
        else {
            if (robos.tipo == Tipo.ALIADO) {
                System.out.print( robos );
            }
            else {
                System.out.print( robos );
            }
        }
        System.out.print(" ");
	}
	
	private static void imprimirAlunosCapturados(List<RobosDoJogo> capturado) {
		
		List<RobosDoJogo> aliado = capturado.stream().filter(x -> x.tipo == Tipo.ALIADO).collect(Collectors.toList());
		List<RobosDoJogo> adversario = capturado.stream().filter(x -> x.tipo == Tipo.ADVERSARIO).collect(Collectors.toList());
		List<RobosDoJogo> vitima = capturado.stream().filter(x -> x.tipo == Tipo.VITIMA).collect(Collectors.toList());
		
		System.out.println(vitima.size());
		
		
		
		
		
//		System.out.print("Alunos salvos pelos Robos: ");
//		System.out.println(Arrays.toString(vitima.toArray()));
//		System.out.print("Alunos capturados pelos Bugs: ");
//		System.out.println(Arrays.toString(vitima.toArray()));
		
		
	}

}
