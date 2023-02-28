package exercicio4;

public class Controller {
	
	public static String inversao(String palavra) {
	    
		//Quando a String possuir apenas um caracter, o programa retorna.
	    if (palavra.length() <= 1) {
	        return palavra;
	    }
	    else {
	        char primeiro = palavra.charAt(0);
	        char ultimo = palavra.charAt(palavra.length()-1);
	        String subcadeia = palavra.substring(1, palavra.length()-1);
	        return ultimo + inversao(subcadeia) + primeiro;
	        //A recursiva é acionada para fazer a inversão do primeiro caracter com o ultimo, retornando a resposta.
	    }
	}
}
