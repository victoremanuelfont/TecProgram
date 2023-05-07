package questao04Entities;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer quantidade; 
	
	public Produto() {
	}

	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public String comprarProduto() {
		
		if(quantidade*preco <=100) {
			return "Compra Aprovada de " +getNome() + "no valor de $" + quantidade*preco;
		}else if(quantidade*preco>100 && quantidade*preco <=200 ) {
			return "Compra aprovada de " + getNome() + " com 10% de desconto no valor de $" + ((quantidade*preco*0.1)+quantidade*preco);
		}else if(quantidade*preco >200 && quantidade*preco<=500) {
			return "Compra aprovada  de " + getNome() + "com 20% de desconto no valor de $" + ((quantidade*preco*0.2)+quantidade*preco);
		}else {
			return "Compra aprovada de " + getNome() + " com 25% de desconto no valor de $" + ((quantidade*preco*0.25)+quantidade*preco);
		}
		
	
	}
	
}
