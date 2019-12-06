public class Racaillou extends Terre{

	public Racaillou(String nom, int pvmax, int attaque, int x, int y) {
		super(nom,pvmax,attaque,x,y);
	}
	
	public Racaillou(String nom, int pvmax, int attaque){
		super(nom,pvmax,attaque);
	}

	@Override
	public void talent() {
	}
	
	public void subire(Pokemon adversaire, int degats){
		if (Math.random()>0.3) super.subire(adversaire,(int) (degats*0.85));
	}
}