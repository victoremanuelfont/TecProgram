package questao01Entities;

public class Main {

	
		Classe é onde se armazena as caracteristicas, atribuições e detalhes de um objeto.
		Geralmente esse conceito tem um característica mais abstratas, tendo em vista seu
		caráter subjetivo. Toda classe possui um nome, visibilidade(public, private ou   
		protected), além de membros como características e ações. Para se criar uma classe
		necessita de uma declaração e nomeação:
			
			EXEMPLO DE CLASSE:
				
				public class Test{
			
				atributos
				construtores vazios
				contrutores com atributos
				get e set
				metotos
		}
		
		Objetos são os atributos e métodos de uma classe. Ou seja, as propriedades e funçoes 
		de um objeto. Metodos tem carcateristicas como rearoveitamento do código e também 
		delegação de responsabilidades. 
		
		Exemplo de Atributo:
			
		public int idade;
		
		Exemplo de um Método;
		
		public int SomaIdade() {
			return idade +=idade;
		}
		
		Encapsulamento pode ser enetendido como uma maneira de esconder detalhes de implementação
		de uma classe, expondo somente as operações seguras e que mantenham os objetos em um 
		estado consistente. Geralmente o objeto não deve expor nenhum atributo,podendo então ser
		acessados por meio de métodos get e set. Get acessa o atributo e Set altera o valor ou nome
		do atributo.
		
		Modificadores de acesso são identificados como private: o membro so pode ser acessado na propria classe.
		Ou então como protected: Pode ser acessado no mesmo pacote ou subclasses de pacotes diferentes.
		E tambem pode ser public, que pode ser acessado por todas as classes.
		
		Herança é um tipo de associação que permite que uma classe herde todos dados e comportamentos de outra.
		Vantagens disso é o reuso e polimorfismo. Ja esse conceito, Polimorfismo, é um recurso que permite que 
		variaveis de um mesmo tipo mais generico possam apontar para objetos de tipos especificos diferentes,
		tendo assim comportamentos diferentes conforme cada tipo especifico. 
		
		Sobrescrita é a implementação de um método de uma superclasse na subclasse. 
		
		A palavra super refere-se a implementação da superclasse. 
		
		Classe Final e Metodo final evitam que sejam criadas subclasses, ja no caso do metodo, não seja sobreposto.
		
		Construtor é uma operação especial da classe, que executa no momento da instanciação do objeto.
		
		
		
	
}
