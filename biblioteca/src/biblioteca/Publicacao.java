package biblioteca;

public class Publicacao {
	
	private String tipo;
	private String titulo;
	private int ano;
	private String autor;
	private int quantidade;
	
	public Publicacao() {
	}

	public Publicacao(String tipo) {
		this.tipo = tipo;
		if(tipo == "LIVRO_01") {
		this.titulo = "Como programar em Java";
		this.ano = 2022;
		this.autor = "Deitel";
		this.quantidade = 20;
		}else if(tipo == "LIVRO_02") {
			this.titulo = "Como ser aprovado em tecnicas de programação";
			this.ano = 2023;
			this.autor = "Geovana e Cauã";
			this.quantidade = 10;
		}else if(tipo == "ARTIGO") {
			this.titulo = "Um comparativo de desempenho entre Java e Python";
			this.ano = 2021;
			this.autor = "Silva";
			this.quantidade = 10;	
		}else {
			this.titulo = "INDICO: Inclusão digital necessaria para sociedade atual";
			this.ano = 2023;
			this.autor = "Geovana e Cauã";
			this.quantidade = 10;	
			
		}
	}

	public String getTipo() {
		return titulo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
