package exercicio3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View3 {

	public static void main(String[] args) {
		
		Controller c = new Controller();
		
		JFrame popup = new JFrame ();
		
		JOptionPane.showMessageDialog(popup, "Digite um número inteiro, este programa retornará a quantidade de digitos que esse número contém.");

		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		
		JOptionPane.showMessageDialog(popup, "O valor "+n+" contém "+c.digitos(n));


	}

}
