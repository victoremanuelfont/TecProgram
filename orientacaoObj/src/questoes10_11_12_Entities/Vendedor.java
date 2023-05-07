package questoes10_11_12_Entities;

public class Vendedor extends Empregado{

	private Double valorVendas;
	private Double comissao;
	
	public Vendedor() {
	}

	public Vendedor(String nome, Integer idade, Integer codigoSetor, Double salarioBase, Double imposto,
			Double valorVendas, Double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public Double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(Double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return  (salarioBase -(salarioBase * imposto)) + comissao;
	}
	
}
