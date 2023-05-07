package questao05Entities;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	
	private int codigo;
	private String nome;
	private String endereco;
	protected String email;
	private Integer telefone;
	private String observacao;
	
	public Contato() {
	}

	public Contato(int codigo) {
		do {
		}while(!(codigo>1000 && codigo<9999));
		this.codigo = codigo;
	}

	public Contato(Integer codigo, String nome) {
		do {
		}while(!(codigo>1000 && codigo<9999));
		this.codigo = codigo;
		this.nome = nome;
	}

	public Contato(Integer codigo, String nome, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
	}

	public Contato(Integer telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		
		return "codigo : " + codigo + "\n" +
				"nome : " + nome + "\n" + 
				"endereco : " + endereco + "\n" +
				"email : " + email + "\n" + 
				"telefone : " + telefone + "\n" +
				"Observacoes : " + observacao;
	}
	
	
	
	
	
	
	
	
	
	

}
