public abstract class Terre extends Pokemon{

	public Terre(String nom, int pvmax, int attaque, int x, int y) {
		super(nom,pvmax,attaque,x,y);
	}
	
	public Terre(String nom, int pvmax, int attaque){
		super(nom,pvmax,attaque);
	}
	
	public Terre(){
		super();
	}
	
	public void attaque(Pokemon adversaire, String choixAttaque){
		System.out.println("\t\t\tAttaque " + choixAttaque + " ! ");
		if (choixAttaque.equals("Ampleur")){
			multiplicateur*=Math.random()*0.7+0.8;
			attaque(adversaire);	
		}
	}
	
	
	public boolean fortContre(Pokemon adversaire){
		if (adversaire instanceof Feu){
			return true;
		}
		if (adversaire instanceof Electricite){
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
		if (adversaire instanceof Terre){
			return true;
		}
		return false;
	}

}
