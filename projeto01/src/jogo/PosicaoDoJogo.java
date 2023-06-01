package jogo;


//import planoDoJogo.Plano;
import planoDoJogo.Posicao;

public class PosicaoDoJogo {
	
	public char coluna;
	public int linha;
	//public Plano plano;
	
	
	public PosicaoDoJogo(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h'||linha <1 || linha>8) {
			throw new JogoException("valores invalidos ");
		}
		this.coluna = coluna;
		this.linha = linha;
	}
	
	public Posicao toPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
		
	}
	
	public static PosicaoDoJogo vemDaPosicao(Posicao posicao) {
		return new PosicaoDoJogo((char)('a'- posicao.posicaoY), 8 - posicao.posicaoX);
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
	
	
	

}
