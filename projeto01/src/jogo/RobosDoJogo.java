package jogo;

import planoDoJogo.Plano;
import planoDoJogo.Posicao;
import planoDoJogo.Robo;

public abstract class RobosDoJogo extends Robo{
	
	public Tipo tipo;

	public RobosDoJogo(Plano plano, Tipo tipo) {
		super(plano);
		this.tipo = tipo;
	}
	
	
	protected boolean seTemAdversario(Posicao posicao) {
		RobosDoJogo r = (RobosDoJogo)plano.robo(posicao);
		return r != null && r.tipo != tipo; 
	}
	

}
