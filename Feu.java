
public abstract class Feu extends Pokemon{

	public Feu(String nom, int pvmax, int attaque, int x, int y) {
		super(nom,pvmax,attaque,x,y);
	}
	
	public Feu(String nom, int pvmax, int attaque){
		super(nom,pvmax,attaque);
	}
	
	public Feu(){
		super();
	}
	
	public void attaque(Pokemon adversaire, String choixAttaque){
		System.out.println("\t\t\tAttaque " + choixAttaque + " ! ");
		if (choixAttaque.equals("boutefeu")){
			multiplicateur*=1.2;
			attaque(adversaire);
			pv -= attaque*0.1;
			
		}
		if (choixAttaque.equals("surchauffe")){
			if(Math.random()>0.2){
				multiplicateur*=1.3;
				attaque(adversaire);
			}
		}
	}
	
	
	public boolean fortContre(Pokemon adversaire){
		if (adversaire instanceof Herbe){
			return true;
		}
		return false;
	}
	
	public boolean faibleContre(Pokemon adversaire){
		if (adversaire instanceof Eau){
			return true;
		}
		if (adversaire instanceof Terre){
			return true;
		}
		return false;
	}

}
