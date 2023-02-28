package exercicio4;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View4 {
	public static void main(String[] args) {
		
		JFrame popup = new JFrame ();
		
		JOptionPane.showMessageDialog(popup, "Entre com uma palavra, este programa mostrará a inversão dessa palavra.");

		
		String palavra = JOptionPane.showInputDialog("Qual a palavra que quer inverter? ");
		String inversao = Controller.inversao(palavra);
		
		JOptionPane.showMessageDialog(null, "A palavra "+palavra+" invertida fica "+inversao);
	}
}