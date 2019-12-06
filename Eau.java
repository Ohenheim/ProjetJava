
public abstract class Eau extends Pokemon{

	public Eau(String nom, int pvmax, int attaque, int x, int y) {
		super(nom,pvmax,attaque,x,y);
	}
	
	public Eau(String nom, int pvmax, int attaque){
		super(nom,pvmax,attaque);
	}
	
	public Eau(){
		super();
	}
	
	public void attaque(Pokemon adversaire, String choixAttaque){
		System.out.println("\t\t\tAttaque " + choixAttaque + " ! ");
		if (choixAttaque.equals("Hydroblast")){
			multiplicateur*=2.2;
			attaque(adversaire);
			paralyse=1;	
		}
	}
	
	
	public boolean fortContre(Pokemon adversaire){
		if (adversaire instanceof Feu){
			return true;
		}
		if (adversaire instanceof Terre){
			return true;
		}
		return false;
	}
	
	public boolean faibleContre(Pokemon adversaire){
		if (adversaire instanceof Eau){
			return true;
		}
		if (adversaire instanceof Herbe){
			return true;
		}
		if (adversaire instanceof Electricite){
			return true;
		}
		return false;
	}

}
