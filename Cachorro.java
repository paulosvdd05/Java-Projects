package idadeAnimal;

public class Cachorro extends Animal{


	public void calcular(int idadeAnimal, double peso) {
		setIdadeHumana(getIdadeAnimal()*7);
		if(getPeso()<=3) {
			setResultado((0.10*getPeso())*1000);
		}else if(getPeso()<=10) {
			setResultado((0.06*getPeso())*1000);
		}else if(getPeso()<=25) {
			setResultado((0.05*getPeso())*1000);
		}else if(getPeso()>25) {
			setResultado((0.04*getPeso())*1000);
		}
	}


	

}
