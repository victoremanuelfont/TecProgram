package jogo.alunos;

import jogo.RobosDoJogo;
import jogo.Tipo;
import planoDoJogo.Plano;
import planoDoJogo.Posicao;

public class Aluno extends RobosDoJogo{

	public Aluno(Plano plano, Tipo tipo) {
		super(plano, tipo);
	}
	
	@Override 
	public String toString() {
		return "a";
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		return null;
	}
	
	
}