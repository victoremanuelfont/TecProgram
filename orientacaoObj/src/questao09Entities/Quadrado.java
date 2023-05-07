package questao09Entities;

public class Quadrado extends Forma{
	
	private Double base;
	
	public Quadrado() {
		super();
	}

	public Quadrado(Double base) {
		this.base = base;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return base*base;
	}

	@Override
	public String imprimirNome() {
		
		return "Area do Quadrado: " + calcularArea();
	}
	
	
	
	
	
	
	
	

}
