package jogo.robos;

import jogo.RobosDoJogo;
import jogo.Tipo;
import planoDoJogo.Plano;
import planoDoJogo.Posicao;

public class Peao extends RobosDoJogo{

	public Peao(Plano plano, Tipo tipo) {
		super(plano, tipo);
	}
	
	@Override 
	public String toString() {
		return "P";
	}
	
	public boolean podeMover(Posicao posicao) {
		RobosDoJogo r = (RobosDoJogo)plano.robo(posicao);
		return r == null || r.tipo != tipo; 
		
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] matriz = new boolean[plano.linhas][plano.colunas];
		
		Posicao p = new Posicao(0,0);
		
			//esquerda
			p.atualizaValores(posicao.posicaoX, posicao.posicaoY - 1);
			if(plano.existePosicao(p)&& podeMover(p)) {
				matriz[p.posicaoX][p.posicaoY] = true;
			}
			
			//direita
			p.atualizaValores(posicao.posicaoX, posicao.posicaoY + 1);
			if(plano.existePosicao(p)&& podeMover(p)) {
				matriz[p.posicaoX][p.posicaoY] = true;
			}

		return matriz;
	}
	
	

}
