package exercicio3;

public class Controller {

	public int digitos(int n) {
		
		//Se o valor de "n" chegar a 0, ele retorna.
		if (n == 0) {
            return 0;
        } 
		else {
            return 1 + digitos(n / 10);
            //Aciona a recursiva somando 1 e dividindo "n" por 10, retornando assim a soma de um digito por vez. 
		}

}
}