package jogo.robos;

import jogo.RobosDoJogo;
import jogo.Tipo;
import planoDoJogo.Plano;
import planoDoJogo.Posicao;

public class Andador extends RobosDoJogo{

	public Andador(Plano plano, Tipo tipo) {
		super(plano, tipo);
	}
	
	@Override 
	public String toString() {
		return "A";
	}
	
	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] matriz = new boolean[plano.linhas][plano.colunas];

		
		Posicao p = new Posicao(0,0);
		
		// avancar pra cima
		p.atualizaValores(posicao.posicaoX - 1,posicao.posicaoY);
		while(plano.existePosicao(p) && !plano.existeRobo(p)) {
			matriz[p.posicaoX][p.posicaoY] = true;
				 p.posicaoX -= 1;	
		}
		if(plano.existePosicao(p) && seTemAdversario(p)) {
			matriz[p.posicaoX][p.posicaoY] = true;
		}
		
		// retroceder pra baixo
		
		p.atualizaValores(posicao.posicaoX + 1,posicao.posicaoY);
		while(plano.existePosicao(p) && !plano.existeRobo(p)) {
			matriz[p.posicaoX][p.posicaoY] = true;
				 p.posicaoX += 1;	
		}
		if(plano.existePosicao(p) && seTemAdversario(p)) {
			matriz[p.posicaoX][p.posicaoY] = true;
		}
	
		
		return matriz;
	}
	
	

}
