package questao_14Entities;

import java.util.Date;

public class Pessoa {
	
	private Integer idade;
	private Date data;
	private String nome;
	
	public Pessoa() {
	}

	public Pessoa(Integer idade, Date data, String nome) {
		this.idade = idade;
		this.data = data;
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calculaIdade() {
		return 0;
	}
	
	public int informaIdade() {
		return idade;
	}
	public String informaNome() {
		return nome;
	}
	
	
	
	

}
