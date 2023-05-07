package questao_15Entities;

public class Produto {
	
	private String nome;
	private Double custo;
	private Double venda;
	private Double lucro;
	private Double despesas;
	
	public Produto() {
	}

	public Produto(Double custo, Double venda, Double despesas) {
		this.custo = custo;
		this.venda = venda;
		this.despesas = despesas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Double getVenda() {
		return venda;
	}

	public void setVenda(Double venda) {
		this.venda = venda;
	}

	public Double getLucro() {
		return lucro;
	}

	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}

	public Double getDespesas() {
		return despesas;
	}

	public void setDespesas(Double despesas) {
		this.despesas = despesas;
	}
	
	public double margemDeLucro() {
		
		return ((venda-(custo+despesas))/venda)*100;
		
	}
	
	

}
