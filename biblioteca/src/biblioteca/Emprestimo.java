package biblioteca;

import java.util.ArrayList;
import java.util.List;



public class Emprestimo {

	private double moeda;

	private Publicacao publicacao;
	private List<Cliente> clientes = new ArrayList<>();

	public Emprestimo() {
	}

	public Emprestimo(Publicacao publicacao) {
		this.moeda = moeda;
		this.publicacao = publicacao;
	}

	public double getMoeda() {
		return moeda;
	}

	public void setMoeda(double moeda) {
		this.moeda = moeda;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void removeCliente(Cliente cliente) {
		clientes.remove(cliente);
	}

	public double aplicacaoEmprestimo(Cliente cliente, double moeda, Publicacao publicacao) {

		String prof = "PROFESSOR";
		String serv = "SERVIDOR";
		if (cliente.getFuncao().equals(prof)) {
			moeda = moeda + 25;
		} else if (cliente.getFuncao().equals(serv)) {
			moeda = moeda + 15;
		} else {
			if (publicacao.getTipo().equals("LIVRO_01") || publicacao.getTipo().equals("LIVRO_02")) {
				moeda = moeda + (10 - (10 * 0.1));
			} else if (publicacao.getTipo().equals("ARTIGO")) {
				moeda = moeda + (10 - (10 * 0.5));
			} else {
				moeda = moeda + (10 - (10 * 0.01));
			}
		}

		return moeda;
	}


}
