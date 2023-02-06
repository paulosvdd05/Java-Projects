package PP;

public class Calculadora {
	double numero1;
	double numero2;
	int op;
	double resultado;
	
	public Calculadora(double numero1, double numero2, int op, double resultado) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.op = op;
		this.resultado = resultado;
	}
	
	public Calculadora() {
		this(0.0,0.0,0,0.0);
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public double multiplicacao(double numero1, double numero2 ) {
		numero1 = getNumero1();
		numero2 = getNumero2();
		resultado = numero1*numero2;
		setResultado(resultado);
		return resultado;
	}
	public double divisao(double numero1, double numero2 ) {
		numero1 = getNumero1();
		numero2 = getNumero2();
		resultado = numero1/numero2;
		setResultado(resultado);
		return resultado;
	}
	public double subtracao(double numero1, double numero2 ) {
		numero1 = getNumero1();
		numero2 = getNumero2();
		resultado = numero1-numero2;
		setResultado(resultado);
		return resultado;
	}
	public double soma(double numero1, double numero2 ) {
		numero1 = getNumero1();
		numero2 = getNumero2();
		resultado = numero1+numero2;
		setResultado(resultado);
		return resultado;
	}
	}
	
	

