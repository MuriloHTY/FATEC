package exercicio2;

public class Controller {

	public int calculo(int v[], int length) {
		
		//Enquanto o vetor tiver ocorrências para percorrer, o programa pula para "else if"
		if(length < 0) {
			return 0;
		}
		else if (v[length] < 0){
			return 1 + calculo(v, length - 1);
			//Essa recursiva vai verificar se o valor da ocorrência analisada é < 0, se sim ele somará fazendo a recursiva e subtrai 1 do tamanho do vetor, caso contrário ele apenas segue.
		}
		return calculo(v, length - 1);
		//Chama a recursiva subtraindo 1 do tamanho do vetor.
	}
}


