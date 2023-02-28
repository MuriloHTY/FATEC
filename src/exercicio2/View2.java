package exercicio2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View2 {

	public static void main(String[] args) {
		
		Controller c = new Controller();
		
		JFrame popup = new JFrame ();
		
		JOptionPane.showMessageDialog(popup, "Entre com o tamanho do vetor, então este programa retornará o n° de valores negativos contidos nele.");
		
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor:"));

		int[] v = new int[n];
				
		
		for(int i = 0 ; i < n ; i++) {
			v[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Dê a "+(i+1)+"° posição do vetor: "));
		}
		
		int length = v.length;

		JOptionPane.showMessageDialog(popup, "O vetor contém "+n+" posições e suas ocorrências retornaram "+c.calculo(v, length - 1)+" números negativos.");

		
	}

}
