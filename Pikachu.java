public class Pikachu extends Pokemon implements Electricite{

	public Pikachu(String nom, int pvmax, int attaque, int x, int y) {
		super(nom,pvmax,attaque,x,y);
	}
	
	public Pikachu(String nom, int pvmax, int attaque){
		super(nom,pvmax,attaque);
	}

	@Override
	public void talent() {	
		
	}
	
	public void attaque(Pokemon adversaire,double chance){
		if (chance<0.2){
			adversaire.paralyse=2;
		}
		super.attaque(adversaire);
	}
	
	public void attaque(Pokemon adversaire, String choixAttaque){
		System.out.println("\t\t\tAttaque " + choixAttaque + " ! ");
		if (choixAttaque.equals("Elecanon")){
			multiplicateur*=0.6;
			if(Math.random()<0.6){
				adversaire.paralyse=1;
			}
			attaque(adversaire);
			
		}
	}
	
	
	public boolean fortContre(Pokemon adversaire){
		if (adversaire instanceof Eau){
			return true;
		}
		return false;
	}
	
	public boolean faibleContre(Pokemon adversaire){
		if (adversaire instanceof Terre){
			return true;
		}
		if (adversaire instanceof Electricite){
			return true;
		}
		return false;
	}

}



