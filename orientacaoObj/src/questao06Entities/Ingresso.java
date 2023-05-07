package questao06Entities;

public class Ingresso {
	
	private Double valor;
	
	public Ingresso() {
	}

	public Ingresso(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "Valor do Ingresso: $" + valor;
	}
	
	

}
