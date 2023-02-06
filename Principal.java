package PP2;

import javax.swing.JOptionPane;

public class Principal {
	int qtdVsMeia = 0;
	int qtdVsInteira = 0;
	int qtdIdoso = 0;
	int qtdEstudante = 0;
	int quantidaTotal = 0;
	double fVsMeia = 0;
	double fVsInteira = 0;
	double fIdoso = 0;
	double fEstudante = 0;
	double precoFinal = 0;
	double valorPago = 0;
	double troco = 0;
	
	public Principal(int qtdVsMeia, int qtdVsInteira, int qtdIdoso, int qtdEstudante,int quantidadeTotal, double fVsMeia, double fVsInteira,
			double fIdoso, double fEstudante, double precoFinal, double valorPago, double troco) {
		super();
		this.qtdVsMeia = qtdVsMeia;
		this.qtdVsInteira = qtdVsInteira;
		this.qtdIdoso = qtdIdoso;
		this.qtdEstudante = qtdEstudante;
		this.quantidaTotal = quantidadeTotal;
		this.fVsMeia = fVsMeia;
		this.fVsInteira = fVsInteira;
		this.fIdoso = fIdoso;
		this.fEstudante = fEstudante;
		this.precoFinal = precoFinal;
		this.valorPago = valorPago;
		this.troco = troco;
	}
	
	public Principal() {
		this(0,0,0,0,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
	}
	
	public int getQtdVsMeia() {
		return qtdVsMeia;
	}
	public void setQtdVsMeia(int qtdVsMeia) {
		this.qtdVsMeia = qtdVsMeia;
	}
	public int getQtdVsInteira() {
		return qtdVsInteira;
	}
	public void setQtdVsInteira(int qtdVsInteira) {
		this.qtdVsInteira = qtdVsInteira;
	}
	public int getQtdIdoso() {
		return qtdIdoso;
	}
	public void setQtdIdoso(int qtdIdoso) {
		this.qtdIdoso = qtdIdoso;
	}
	public int getQtdEstudante() {
		return qtdEstudante;
	}
	public void setQtdEstudante(int qtdEstudante) {
		this.qtdEstudante = qtdEstudante;
	}
	public double getfVsMeia() {
		return fVsMeia;
	}
	public void setfVsMeia(double fVsMeia) {
		this.fVsMeia = fVsMeia;
	}
	public double getfVsInteira() {
		return fVsInteira;
	}
	public void setfVsInteira(double fVsInteira) {
		this.fVsInteira = fVsInteira;
	}
	public double getfIdoso() {
		return fIdoso;
	}
	public void setfIdoso(double fIdoso) {
		this.fIdoso = fIdoso;
	}
	public double getfEstudante() {
		return fEstudante;
	}
	public void setfEstudante(double fEstudante) {
		this.fEstudante = fEstudante;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public double getTroco() {
		return troco;
	}
	public void setTroco(double troco) {
		this.troco = troco;
	}
	public int getQuantidadeTotal() {
		return quantidaTotal;
	}
	public void setQuantidadeTotal(int quantidadeTotal) {
		this.quantidaTotal = quantidadeTotal;
	}
	
	public void calcularPedido() {
		setfVsMeia(qtdVsMeia*20);
		setfVsInteira(qtdVsInteira*40);
		setfEstudante(qtdEstudante*20);
		setfIdoso(qtdIdoso*20);
		setQuantidadeTotal(qtdEstudante+qtdIdoso+qtdVsInteira+qtdVsMeia);
		setPrecoFinal(getfEstudante()+getfIdoso()+getfVsInteira()+getfVsMeia());
	}
	
	public void calcularTroco() {
		if (getPrecoFinal()> getValorPago()) {
			JOptionPane.showMessageDialog(null, "Valor Insuficiente, ainda faltam: R$" + (getPrecoFinal()-getValorPago()));
			
		}else {
			setTroco(getValorPago()-getPrecoFinal());
		}
	}
	

}
