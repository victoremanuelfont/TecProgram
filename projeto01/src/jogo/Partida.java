package jogo;

import java.util.ArrayList;
import java.util.List;

import jogo.alunos.Aluno;
import jogo.bugs.Bug;
import jogo.robos.Andador;
import jogo.robos.Bispo;
import jogo.robos.Cavalo;
import jogo.robos.Peao;
import jogo.robos.Rainha;
import jogo.robos.Rei;
import jogo.robos.Torre;
import planoDoJogo.Plano;
import planoDoJogo.Posicao;
import planoDoJogo.Robo;

public class Partida {
	
	private int turno;
	private Tipo jogadorAtual;
	public Plano plano;
	
	private List<Robo> alunosNoPlano = new ArrayList<>();
	private List<Robo> alunosCapturados = new ArrayList<>();
	
	
	public Partida(Plano plano) { 
		this.plano = plano;
		turno =1;
		jogadorAtual = Tipo.ALIADO;
		iniciarJogo();
	}
	
	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	public Tipo getJogadorAtual() {
		return jogadorAtual;
	}

	public void setJogadorAtual(Tipo jogadorAtual) {
		this.jogadorAtual = jogadorAtual;
	}
	
	
	public RobosDoJogo[][] retornaMatrizRobos(){
		RobosDoJogo[][] matriz = new RobosDoJogo[plano.linhas][plano.colunas]; 
		for(int i=0; i<plano.linhas; i++) {
			for(int j=0; j<plano.colunas; j++) {
			matriz[i][j] = (RobosDoJogo) plano.robo(i,j);	
			}
		}
		return matriz;
	}
	
//	public boolean[][] possiveisMovimentos(PosicaoDoJogo posicaoDeOrigem){
//		Posicao posicao = posicaoDeOrigem.toPosicao();
//		validaPosicaoDeOrigem(posicao);
//		return plano.robo(posicao).possiveisMovimentos();
//		
//	}
	
	public RobosDoJogo moverRobo(PosicaoDoJogo origemR, PosicaoDoJogo destinoR) {
		Posicao origem = origemR.toPosicao();
		Posicao destino = destinoR.toPosicao();
		validaPosicaoDeOrigem(origem);
		validaPosicaoDeDestino(origem,destino);
		Robo capturaRobo = movimento(origem,destino);
		proximoTurno();
		return (RobosDoJogo)capturaRobo;
	}
		
	
	
	private Robo movimento(Posicao origem, Posicao destino) {
		Robo p = plano.removeRobo(origem);
		Robo capturaRobo = plano.removeRobo(destino);
		plano.posicaoDoRobo(p, destino);
		
		if(capturaRobo !=null) {
			alunosNoPlano.remove(capturaRobo);
			alunosCapturados.add(capturaRobo);
		}
		
		return capturaRobo;
	}
	
	private void proximoTurno() {
		turno ++;
		jogadorAtual = (jogadorAtual == Tipo.ALIADO)? Tipo.ADVERSARIO : Tipo.ALIADO;
	}
	
	
	
	
	
	private void validaPosicaoDeOrigem(Posicao posicao) {
		if(!plano.existeRobo(posicao)) {
			throw new JogoException("Não existe Robo na posicao de Origem");
		}
		//if(jogadorAtual != ((robosDoJogo)plano.robo(posicao)).tipo) {
		//}
		if(!plano.robo(posicao).umMovimentoPossivel()) {
			throw new JogoException("Não tem movimento possivel para esse Robo");
		}
	}
	
	private void validaPosicaoDeDestino(Posicao origem, Posicao destino) {
		if(!plano.robo(origem).possivelMovimento(destino)) {
			throw new JogoException("O robo escolhido nao pode se mover para o destino");
		}
	}
	
	
	public void novoElemento(char coluna, int linha, RobosDoJogo robo) {
		plano.posicaoDoRobo(robo, new PosicaoDoJogo(coluna,linha).toPosicao());
		alunosNoPlano.add(robo);	
	}
	
	
	public void iniciarJogo() {
		novoElemento('a',1, new Rei(plano,Tipo.ALIADO));
		novoElemento('c',1, new Torre(plano,Tipo.ALIADO));
		novoElemento('b',1, new Andador(plano,Tipo.ALIADO));
		novoElemento('d',1, new Peao(plano,Tipo.ALIADO));
		novoElemento('e',1, new Bispo(plano,Tipo.ALIADO));
		novoElemento('f',1, new Cavalo(plano,Tipo.ALIADO));
		novoElemento('g',1, new Rainha(plano, Tipo.ALIADO));
		
		novoElemento('a',8, new Bug(plano,Tipo.ADVERSARIO));
		novoElemento('b',7, new Bug(plano,Tipo.ADVERSARIO));
		novoElemento('c',4, new Bug(plano,Tipo.ADVERSARIO));
		novoElemento('e',5, new Bug(plano,Tipo.ADVERSARIO));
		novoElemento('h',1, new Bug(plano,Tipo.ADVERSARIO));
		novoElemento('h',8, new Bug(plano,Tipo.ADVERSARIO));
		novoElemento('h',6, new Bug(plano,Tipo.ADVERSARIO));
		
		novoElemento('a',6, new Aluno(plano,Tipo.VITIMA));
		novoElemento('b',4, new Aluno(plano,Tipo.VITIMA));
		novoElemento('c',7, new Aluno(plano,Tipo.VITIMA));
		novoElemento('d',5, new Aluno(plano,Tipo.VITIMA));
		novoElemento('e',8, new Aluno(plano,Tipo.VITIMA));
		novoElemento('f',2, new Aluno(plano,Tipo.VITIMA));
		novoElemento('f',3, new Aluno(plano,Tipo.VITIMA));
		novoElemento('f',4, new Aluno(plano,Tipo.VITIMA));
		novoElemento('h',2, new Aluno(plano,Tipo.VITIMA));
		
		
		
		
		
		//plano.posicaoDoRobo(new Rei(plano,Tipo.ALIADO ), new Posicao(4,2));
	}

	
	
}
