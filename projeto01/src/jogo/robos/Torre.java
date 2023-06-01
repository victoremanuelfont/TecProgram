package jogo.robos;

import jogo.RobosDoJogo;
import jogo.Tipo;
import planoDoJogo.Plano;
import planoDoJogo.Posicao;

public class Torre extends RobosDoJogo{

	public Torre(Plano plano, Tipo tipo) {
		super(plano, tipo);
	}
	
	@Override 
	public String toString() {
		return "T";
	}
	
	public boolean podeMover(Posicao posicao) {
		RobosDoJogo r = (RobosDoJogo)plano.robo(posicao);
		return r == null || r.tipo != tipo; 
		
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] matriz = new boolean[plano.linhas][plano.colunas];
		
		Posicao p = new Posicao(0,0);
		
			
			
			// acima 
			p.atualizaValores(posicao.posicaoX - 2, posicao.posicaoY);
			if(plano.existePosicao(p)&& podeMover(p)) {
				matriz[p.posicaoX][p.posicaoY] = true;
			}
			
			//baixo 
			p.atualizaValores(posicao.posicaoX + 2, posicao.posicaoY);
			if(plano.existePosicao(p)&& podeMover(p)) {
			matriz[p.posicaoX][p.posicaoY] = true;
			}
			
			

		return matriz;
	}
	
	
		
	
	

}
