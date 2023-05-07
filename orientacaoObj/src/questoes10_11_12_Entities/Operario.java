package questoes10_11_12_Entities;

public class Operario extends Empregado{
	
	private Double valorProducao;
	private Double comissao;
	
	public Operario() {
		super();
	}

	public Operario(String nome, Integer idade, Integer codigoSetor, Double salarioBase, Double imposto,
			Double valorProducao, Double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public Double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(Double valorProducao) {
		this.valorProducao = valorProducao;
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
