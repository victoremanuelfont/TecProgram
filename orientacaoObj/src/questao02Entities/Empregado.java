package questao02Entities;

public class Empregado {

	private String name;
	private String sobrenome;
	private Double salarioMensal;
	
	public Empregado() {
	}

	public Empregado(String name, String sobrenome, Double salarioMensal) {
		this.name = name;
		this.sobrenome = sobrenome;
		if(salarioMensal <= 0.0) {
			salarioMensal = 0.0;
		}
		this.salarioMensal = salarioMensal;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public double salarioAnual() {
		return salarioMensal*12;
	}
	
	public double aumento() {
		return (((salarioMensal*0.1)+ salarioMensal)*12);
	}
	
	
}
