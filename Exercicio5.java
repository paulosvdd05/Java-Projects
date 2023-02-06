package exercicioMiguel;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] i) {
		String nome = JOptionPane.showInputDialog("Digite o nome");
		double credito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de seus creditos"));
		double debito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de seu debito"));
		double saldo = credito-debito;
		String tipoCliente = null;
		double taxa = 0;
		double taxaAPagar;
	
		
		if(saldo < 3000) {
			tipoCliente="Comum";
			taxa = saldo*0.15;
			double saldoAtual = saldo-taxa;
			JOptionPane.showMessageDialog(null, "Saldo: " + saldo + "R$\nTipo Cliente: " + tipoCliente + "\nTaxa a pagar: " + taxa + "R$\nSaldo Atual: " + saldoAtual + "R$");
			
			
		}else if(saldo < 5000) {
			tipoCliente="Especial";
			taxa = saldo*0.1;
			double saldoAtual = saldo-taxa;
			JOptionPane.showMessageDialog(null, "Saldo: " + saldo + "R$\nTipo Cliente: " + tipoCliente + "\nTaxa a pagar: " + taxa + "R$\nSaldo Atual: " + saldoAtual + "R$");
			
			
		}else if(saldo > 5000) {
			tipoCliente="Premium";
			taxa = saldo*0.05;
			double saldoAtual = saldo-taxa;
			JOptionPane.showMessageDialog(null, "Saldo: " + saldo + "R$\nTipo Cliente: " + tipoCliente + "\nTaxa a pagar: " + taxa + "R$\nSaldo Atual: " + saldoAtual + "R$");
			
			
		}
	}

}
