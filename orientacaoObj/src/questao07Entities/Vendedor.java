package questao07Entities;

public class Vendedor extends Empregado{

	private Double percentual;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nome, Double salario, Double percentual) {
		super(nome, salario);
		this.percentual = percentual;
	}
	
	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}

	public double calcularSalario() {
		
		return (getSalario() * percentual) + getSalario();
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + getNome() + "\n" +
				"Salario sem comi��o: " + getSalario() + "\n" +
				"Salario com comi��o: " + calcularSalario() + "\n" +
				"Percentual de comiss�o: " + percentual; 
	}
	
	

}
