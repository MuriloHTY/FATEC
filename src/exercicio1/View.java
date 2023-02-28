package exercicio1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {

		Controller c = new Controller();
		
		JFrame popup = new JFrame ();

		
		JOptionPane.showMessageDialog(popup, "Digite um número entre 1 e 12, 1 e 12 inclusive. Este programa retornará o fatorial deste valor.");
		
		int fat;
		do{
			fat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número:"));
		}while (fat < 1 || fat > 12);
		
		JOptionPane.showMessageDialog(popup, "O fatorial de "+fat+" é igual à: "+c.fatorial(fat));


	}

}
