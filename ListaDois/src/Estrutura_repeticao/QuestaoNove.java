package Estrutura_repeticao;

public class QuestaoNove {
	
	
	public static void util(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i]= chars[j];
		chars[j]=temp;
	}
	
	public static void permuta(char[] chars, int indice) {
		if(indice == chars.length -1) {
			System.out.println(String.valueOf(chars));
		}
		for(int i = indice; i<chars.length; i++) {
			util(chars, indice, i);
			permuta(chars,indice+1);
			util(chars,indice,i);
		}
	}
	
	public static void permutacoes(String letras) {
		if(letras == null || letras.length()==0) {
			return;
		}
		
		permuta(letras.toCharArray(),0);
	
	}
	
	public static void main(String[] args) {
		
			String letras = "ABC";
			permutacoes(letras);
			

	}

}
