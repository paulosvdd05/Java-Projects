package exercicioMiguel;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] i) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		if (idade<16) {
			JOptionPane.showMessageDialog(null, "Nao Eleitor.");
			
		}else if (idade > 18 && idade<65) {
			JOptionPane.showMessageDialog(null, " Eleitor Obrigatorio.");
			
		}else if (idade > 16 && idade<18 || idade > 65) {
			JOptionPane.showMessageDialog(null, " Eleitor Facultativo.");
			
		}
	}


}
