package questao03Entities;

public class Fatura {
	
	private Integer numero;
	private String descricao;
	private Integer quantidade;
	private Double precoUnitario;
	private Double precoTotal;
	
	public Fatura() {
	}

	public Fatura(Integer numero, String descricao, Integer quantidade, Double precoUnitario, Double precoTotal) {
		this.numero = numero;
		this.descricao = descricao;
		
		if(quantidade <=0) {
			quantidade = 0;
		}
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.precoTotal = precoTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		if(quantidade < 0) {
			quantidade = 0;
		}
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		if(quantidade < 0) {
			quantidade = 0;
		}
		this.quantidade = quantidade;
	}

	public Double getPrecoUnitario() {
		if(precoUnitario<0) {
			precoUnitario = 0.0;
		}
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public double getValorFatura() {
		return quantidade*precoUnitario;
	}
	
	public double desconto() {
		return quantidade*precoUnitario*precoTotal;
	}
	
	

}
