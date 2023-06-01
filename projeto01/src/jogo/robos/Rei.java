package jogo.robos;

import jogo.RobosDoJogo;
import jogo.Tipo;
import planoDoJogo.Plano;
import planoDoJogo.Posicao;

public class Rei extends RobosDoJogo{

	public Rei(Plano plano, Tipo tipo) {
		super(plano, tipo);
	}
	
	@Override 
	public String toString() {
		return "R";
	}
	
	public boolean podeMover(Posicao posicao) {
		RobosDoJogo r = (RobosDoJogo)plano.robo(posicao);
		return r == null || r.tipo != tipo; 
		
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] matriz = new boolean[plano.linhas][plano.colunas];
		
		Posicao p = new Posicao(0,0);
		
		
		// diagonal noroeste
		p.atualizaValores(posicao.posicaoX - 4, posicao.posicaoY - 4);
		if(plano.existePosicao(p)&& podeMover(p)) {
		matriz[p.posicaoX][p.posicaoY] = true;
		}
		
		// diagonal nordeste
		p.atualizaValores(posicao.posicaoX - 4, posicao.posicaoY + 4);
		if(plano.existePosicao(p)&& podeMover(p)) {
		matriz[p.posicaoX][p.posicaoY] = true;
		}
		
		// diagonal sudoeste
		p.atualizaValores(posicao.posicaoX + 4, posicao.posicaoY - 4);
		if(plano.existePosicao(p)&& podeMover(p)) {
		matriz[p.posicaoX][p.posicaoY] = true;
		}
		
		// diagonal sudeste
		p.atualizaValores(posicao.posicaoX + 4, posicao.posicaoY + 4);
		if(plano.existePosicao(p)&& podeMover(p)) {
		matriz[p.posicaoX][p.posicaoY] = true;
		}
		

		return matriz;
	}
	
	
		
	
	

}