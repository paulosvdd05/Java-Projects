package exercicioMiguel;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] i) {
		String sexo = JOptionPane.showInputDialog("Digite o sexo(H ou M)");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		String s = sexo.toUpperCase();
		double pesoIdeal = 0;
		double diferenca = 0;
		System.out.println(s);

		if (s == "H") {
			pesoIdeal = (72.7 * altura) - 58;
			if (pesoIdeal == peso) {
				JOptionPane.showMessageDialog(null, "A pessoa está no peso ideal: " + pesoIdeal);
				System.out.println(pesoIdeal);
				
			} else if (pesoIdeal > peso) {
				diferenca = pesoIdeal - peso;
				JOptionPane.showMessageDialog(null, "A pessoa está abaixo do peso ideal" + "\nPeso Atual: " + peso
						+ "\nPeso Ideal: " + pesoIdeal + "\nA pessoa precisa ganhar mais: " + diferenca);
				System.out.println(pesoIdeal);
			} else if (pesoIdeal < peso) {
				diferenca = peso - pesoIdeal;
				JOptionPane.showMessageDialog(null, "A pessoa está acima do peso ideal" + "\nPeso Atual: " + peso
						+ "\nPeso Ideal: " + pesoIdeal + "\nA pessoa precisa perder mais: " + diferenca);
				System.out.println(pesoIdeal);
			}

		} else {
			pesoIdeal = (62.1 * altura) - 44;
			if (pesoIdeal == peso) {
				JOptionPane.showMessageDialog(null, "A pessoa está no peso ideal: " + pesoIdeal);
			} else if (pesoIdeal > peso) {
				diferenca = pesoIdeal - peso;
				JOptionPane.showMessageDialog(null, "A pessoa está abaixo do peso ideal" + "\nPeso Atual: " + peso
						+ "\nPeso Ideal: " + pesoIdeal + "\nA pessoa precisa ganhar mais: " + diferenca);
			} else if (pesoIdeal < peso) {
				diferenca = peso - pesoIdeal;
				JOptionPane.showMessageDialog(null, "A pessoa está acima do peso ideal" + "\nPeso Atual: " + peso
						+ "\nPeso Ideal: " + pesoIdeal + "\nA pessoa precisa perder mais: " + diferenca);
			}

		}
		

	}

}
