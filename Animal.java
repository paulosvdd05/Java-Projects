package idadeAnimal;

public abstract class Animal {
	protected String nome;
	protected int idadeAnimal;
	protected int idadeHumana;
	protected double peso;
	protected double resultado;

	public Animal(String nome, int idadeAnimal, int idadeHumana, double peso, double resultado) {
		this.nome = nome;
		this.idadeAnimal = idadeAnimal;
		this.idadeHumana = idadeHumana;
		this.peso = peso;
		this.resultado = resultado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public Animal() {
		this("", 0, 0, 0.0, 0.0);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public int getIdadeHumana() {
		return idadeHumana;
	}

	public void setIdadeHumana(int idadeHumana) {
		this.idadeHumana = idadeHumana;
	}

	public abstract void calcular(int idadeAnimal, double peso);



}
