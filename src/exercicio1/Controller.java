package exercicio1;

public class Controller {
		
		public int fatorial(int fat) {
			
			// Enquanto o parâmetro passado para esta função (fat) for maior que 1, ele não retorna o resultado.
			if (fat < 1) {
				return 1;
			}
			return fat * fatorial(fat-1);
			//Em caso de fat>1 a função recursiva é acionada, multiplicando fat por fat-1 e retornando o resultado esperado pela fórmula matemática.
		}
	}


