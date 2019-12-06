
public abstract class Herbe extends Pokemon{
	
	public Herbe(String nom, int pvmax, int attaque, int x, int y) {
		super(nom,pvmax,attaque,x,y);
	}
	
	public Herbe(String nom, int pvmax, int attaque){
		super(nom,pvmax,attaque);
	}
	
	public Herbe(){
		super();
	}
	
	public void attaque(Pokemon adversaire, String choixAttaque){
		System.out.println("\t\t\tAttaque " + choixAttaque + " ! ");
		if (choixAttaque.equals("végé-attaque")){
			multiplicateur*=2.5;
		}
	}
	
	public boolean fortContre(Pokemon adversaire){
		if (adversaire instanceof Eau){
			return true;
		}
		if (adversaire instanceof Terre){
			return true;
		}
		return false;
	}
	
	public boolean faibleContre(Pokemon adversaire){
		if (adversaire instanceof Feu){
			return true;
		}
		if (adversaire instanceof Herbe){
			return true;
		}
		return false;
	}

}
