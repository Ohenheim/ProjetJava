
public class Bulbizarre extends Herbe{

	public Bulbizarre(String nom, int pvmax, int attaque, int x, int y) {
		super(nom,pvmax,attaque,x,y);
	}
	
	public Bulbizarre(String nom, int pvmax, int attaque){
		super(nom,pvmax,attaque);
	}

	@Override
	public void talent() {
		if (pv<=pvmax*0.3){
			if (multiplicateur ==1.0)
				multiplicateur*=1.5;
		}
		else 
			multiplicateur=1.0;
	}
	
	
	

}
