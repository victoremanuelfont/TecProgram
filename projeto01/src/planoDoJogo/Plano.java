package planoDoJogo;


public class Plano {
	
	public int linhas;
	public int colunas;
	public Robo[][] robos;
	
	
	
	public Plano(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new PlanoException("ERRO: Tem que ser pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		robos = new Robo[linhas][colunas];
	}
	
	public Robo robo(int posicaoX, int posicaoY) {
		if (!existePosicao(posicaoX, posicaoY)) {
			throw new PlanoException("Essa posição não existe");
		}
		return robos[posicaoX][posicaoY];
	}
	
	public Robo robo(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new PlanoException("Essa posição não existe");
		}
		return robos[posicao.posicaoX][posicao.posicaoY];
	}
	
	public void posicaoDoRobo(Robo robo, Posicao posicao) {
		if (existeRobo(posicao)) {
			throw new PlanoException(" Existe um elemento nessa posicao " + posicao);
		}
		robos[posicao.posicaoX][posicao.posicaoY] = robo;
		robo.posicao = posicao;
		
	}
	
	public Robo removeRobo(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new PlanoException(" Nao tem essa posicao no plano");
		}
		if(robo(posicao)== null) {
			return null;
		}
		Robo aux = robo(posicao);
		aux.posicao = null;
		robos[posicao.posicaoX][posicao.posicaoY]= null;
		return aux;
		
	}
	
	private boolean existePosicao(int posicaoX, int posicaoY) { // metodo auxiliar
		return posicaoX >= 0 && posicaoX < linhas && posicaoY >= 0 && posicaoY < colunas;
	}

	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.posicaoX,posicao.posicaoY);
	}
	
	public boolean existeRobo(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new PlanoException("Essa posição não existe");
		}
		return robo(posicao) != null;
	}
	

}
