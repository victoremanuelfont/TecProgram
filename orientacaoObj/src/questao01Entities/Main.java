package questao01Entities;

public class Main {

	
		Classe � onde se armazena as caracteristicas, atribui��es e detalhes de um objeto.
		Geralmente esse conceito tem um caracter�stica mais abstratas, tendo em vista seu
		car�ter subjetivo. Toda classe possui um nome, visibilidade(public, private ou   
		protected), al�m de membros como caracter�sticas e a��es. Para se criar uma classe
		necessita de uma declara��o e nomea��o:
			
			EXEMPLO DE CLASSE:
				
				public class Test{
			
				atributos
				construtores vazios
				contrutores com atributos
				get e set
				metotos
		}
		
		Objetos s�o os atributos e m�todos de uma classe. Ou seja, as propriedades e fun�oes 
		de um objeto. Metodos tem carcateristicas como rearoveitamento do c�digo e tamb�m 
		delega��o de responsabilidades. 
		
		Exemplo de Atributo:
			
		public int idade;
		
		Exemplo de um M�todo;
		
		public int SomaIdade() {
			return idade +=idade;
		}
		
		Encapsulamento pode ser enetendido como uma maneira de esconder detalhes de implementa��o
		de uma classe, expondo somente as opera��es seguras e que mantenham os objetos em um 
		estado consistente. Geralmente o objeto n�o deve expor nenhum atributo,podendo ent�o ser
		acessados por meio de m�todos get e set. Get acessa o atributo e Set altera o valor ou nome
		do atributo.
		
		Modificadores de acesso s�o identificados como private: o membro so pode ser acessado na propria classe.
		Ou ent�o como protected: Pode ser acessado no mesmo pacote ou subclasses de pacotes diferentes.
		E tambem pode ser public, que pode ser acessado por todas as classes.
		
		Heran�a � um tipo de associa��o que permite que uma classe herde todos dados e comportamentos de outra.
		Vantagens disso � o reuso e polimorfismo. Ja esse conceito, Polimorfismo, � um recurso que permite que 
		variaveis de um mesmo tipo mais generico possam apontar para objetos de tipos especificos diferentes,
		tendo assim comportamentos diferentes conforme cada tipo especifico. 
		
		Sobrescrita � a implementa��o de um m�todo de uma superclasse na subclasse. 
		
		A palavra super refere-se a implementa��o da superclasse. 
		
		Classe Final e Metodo final evitam que sejam criadas subclasses, ja no caso do metodo, n�o seja sobreposto.
		
		Construtor � uma opera��o especial da classe, que executa no momento da instancia��o do objeto.
		
		
		
	
}
