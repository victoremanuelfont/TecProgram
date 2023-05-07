package questao07Entities;

public class Gerente extends Empregado{
	
	private String departamento;
	
	public Gerente() {
		super();
	}
	
	public Gerente(String nome, Double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Nome: " + getNome() + "\n"+
				"Salario: $" + getSalario() + "\n"+
				"Departamento: " + departamento;	
	}
	

}
