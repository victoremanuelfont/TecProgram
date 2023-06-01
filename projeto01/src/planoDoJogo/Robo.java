package planoDoJogo;

public abstract class Robo {

	public Posicao posicao;
	public Plano plano;
	
	public Robo(Plano plano) {
		this.plano = plano;
		posicao = null;
	}
	
	public abstract boolean[][] possiveisMovimentos();
	
	public boolean possivelMovimento(Posicao posicao) {
		return possiveisMovimentos()[posicao.posicaoX][posicao.posicaoY];
	}
	
	public boolean umMovimentoPossivel() {
		boolean[][] matriz = possiveisMovimentos();
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(matriz[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
