package questao09Entities;

public class Retangulo extends Forma{

	private Double base;
	private Double altura;
	
	public Retangulo() {
		super();
	}
	
	public Retangulo(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		
		return base*altura;
	}

	@Override
	public String imprimirNome() {
		
		return "Area do retangulo: " + calcularArea();
	}

}
