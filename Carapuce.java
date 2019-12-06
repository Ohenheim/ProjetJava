public class Carapuce extends Eau{

	public Carapuce(String nom, int pvmax, int attaque, int x, int y) {
		super(nom,pvmax,attaque,x,y);
	}
	
	public Carapuce(String nom, int pvmax, int attaque){
		super(nom,pvmax,attaque);
	}

	@Override
	public void talent() {
		pv*=1.1;
		if (pv>pvmax) pv=pvmax;
	}
		
}