package biblioteca;

public class Cliente {

	private String nome;
	private int matricula;
	private TipoCliente funcao;
	
	public Cliente() {
	}

	public Cliente(String nome, int matricula, TipoCliente funcao) {
		this.nome = nome;
		this.matricula = matricula;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public TipoCliente getFuncao() {
		return funcao;
	}

	public void setFuncao(TipoCliente funcao) {
		this.funcao = funcao;
	}
	
	
	
	
	
	
}
