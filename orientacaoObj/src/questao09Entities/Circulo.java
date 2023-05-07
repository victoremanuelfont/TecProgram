package questao09Entities;

public class Circulo extends Forma{
	
	private Double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		
		return raio*raio*3.14;
	}

	@Override
	public String imprimirNome() {
		
		return "Area do circulo: " + calcularArea() ;
	}

}
