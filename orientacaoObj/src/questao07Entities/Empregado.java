package questao07Entities;

public abstract class Empregado {
	
	private String nome;
	protected Double salario;
	
	public Empregado() {
	}

	public Empregado(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public abstract String toString();
	
	

}
