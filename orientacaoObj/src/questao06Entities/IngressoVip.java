package questao06Entities;

public class IngressoVip extends Ingresso{
	
	private Double valorAdicional;
	
	public IngressoVip() {
		super();
	}

	public IngressoVip(Double valor, Double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public String toString() {
		double soma = getValor() + valorAdicional;
		return "Preço do ingresso Vip: $" + soma;
	}
	
	
}
