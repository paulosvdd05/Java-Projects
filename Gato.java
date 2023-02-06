package idadeAnimal;

public class Gato extends Animal {

	@Override
	public void calcular(int idadeAnimal, double peso) {
		if(getIdadeAnimal() == 1) {
			setIdadeHumana(15);
		}else if(getIdadeAnimal() == 2) {
			setIdadeHumana(24);
		}else if(getIdadeAnimal() == 3) {
			setIdadeHumana(28);
		}else if(getIdadeAnimal() == 4) {
			setIdadeHumana(32);
		}else if(getIdadeAnimal() == 5) {
			setIdadeHumana(36);
		}else if(getIdadeAnimal() == 6) {
			setIdadeHumana(40);
		}else if(getIdadeAnimal() == 7) {
			setIdadeHumana(44);
		}else if(getIdadeAnimal() == 8) {
			setIdadeHumana(48);
		}else if(getIdadeAnimal() == 9) {
			setIdadeHumana(52);
		}else if(getIdadeAnimal() == 10) {
			setIdadeHumana(56);
		}else if(getIdadeAnimal() == 11) {
			setIdadeHumana(60);
		}else if(getIdadeAnimal() == 12) {
			setIdadeHumana(64);
		}else if(getIdadeAnimal() == 13) {
			setIdadeHumana(68);
		}else if(getIdadeAnimal() == 14) {
			setIdadeHumana(72);
		}else if(getIdadeAnimal() == 15) {
			setIdadeHumana(76);
		}else if(getIdadeAnimal() == 16) {
			setIdadeHumana(80);
		}else if(getIdadeAnimal() == 17) {
			setIdadeHumana(84);
		}else if(getIdadeAnimal() == 18) {
			setIdadeHumana(88);
		}else if(getIdadeAnimal() == 19) {
			setIdadeHumana(89);
		}else if(getIdadeAnimal() == 20) {
			setIdadeHumana(93);
		}else if(getIdadeAnimal() == 21) {
			setIdadeHumana(96);
		}else if(getIdadeAnimal() == 22) {
			setIdadeHumana(99);
		}else if(getIdadeAnimal() == 23) {
			setIdadeHumana(103);
		}
		
		if(getPeso()<=4) {
			setResultado(55);
		}else if(getPeso()>=6) {
			setResultado(75);
		}
	}

	

}
