package questoes10_11_12_Entities;

public class Empregado extends Pessoa{
	private Integer codigoSetor;
	public Double salarioBase;
	public Double imposto;
	
	public Empregado() {
		super();
	}

	public Empregado(String nome, Integer idade, Integer codigoSetor, Double salarioBase, Double imposto) {
		super(nome, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public Integer getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	@Override
	public double calcularSalario() {
		return  salarioBase -(salarioBase * imposto);
	}

}
