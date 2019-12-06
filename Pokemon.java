
public abstract class Pokemon {
	protected static int aleaNum = 1;
	protected String nom;
	protected int pvmax;
	protected int niveau, pv, attaque;
	protected String[] attaquesDisponibles;
	protected int nbAttaques;
	protected double multiplicateur;
	protected int paralyse;
	protected int x,y;
	
	public Pokemon (String nom, int pvmax, int attaque, int x, int y){
		this.nom=nom;
		this.pvmax=pvmax;
		pv=pvmax;
		niveau=1;
		this.attaque=attaque;
		attaquesDisponibles = new String[5];
		nbAttaques =1;
		multiplicateur = 1.0;
		paralyse = 0;
	}
	public Pokemon (String nom, int pvmax, int attaque){
		this(nom,pvmax, attaque,0,0);
	}
	public Pokemon(){
		this("Anonyme"+aleaNum,100+(int)(Math.random()*100),40+(int)(Math.random()*100));
		aleaNum++;
	}
	
	/*
	 * A completer
	 */
	public static Pokemon pokemonAleatoire() {
		return null;
	}
	
	public int getNiveau() {
		return niveau;
	}
	
	public boolean estKO(){
		return pv == 0;
	}
	
	public void perdu() {
		pv=0;
		multiplicateur = 1;
	}
	
	public void soigner() {
		pv = pvmax;
	}
	
	public boolean fortContre(Pokemon adversaire) {
		return false;
	}
	
	public boolean faibleContre( Pokemon adversaire) {
		return false;
	}
	
	public String[] getAttaqueDisponibles() {
		return attaquesDisponibles.clone();
	}
	
	public void afficheAttaques(){
		String s = "";
		for (int i=0; i< attaquesDisponibles.length;i++)
			s+=i + "	\t";
		System.out.println(s);
		for (String attaque : attaquesDisponibles)
			s+= attaque + "\t";
		System.out.println(s);
	}
	
	public abstract void talent();
	
	public void subire (Pokemon adversaire , int degats){
		pv-=degats;
		if (pv<0)
			pv=0;
		System.out.println(this.nom + " subit " + degats + " ! ");
	}
	public void attaque (Pokemon adversaire){
		if (paralyse>0){
			paralyse--;
			return;
		}
		double multiplicateurAvantage = 1;
		if (fortContre(adversaire))
			multiplicateurAvantage = 2;
		else if (faibleContre(adversaire))
			multiplicateurAvantage = 0.5;
		talent();
		System.out.println("\t\t" + this + " attaque avec un multiplicateur de " + multiplicateurAvantage*multiplicateur + " : " + attaque*multiplicateur*multiplicateurAvantage + " !");
		adversaire.subire(this, (int)(attaque * multiplicateur * multiplicateurAvantage));
		multiplicateur = 1;
	}
	
	public void attaque (Pokemon adversaire, String choixAttaque){
		System.out.println("\t\t\tAttaque " + choixAttaque + " ! ");
		if (choixAttaque.equals("default"))
			attaque(adversaire);
	}
	
	public static void combat (Pokemon p1, Pokemon p2, String attaque1, String attaque2){
		//A faire plus tard
	}
	
	public void gagnerniveau(){
		niveau++;
		pvmax+= 20;
		pv+= pvmax/2;
		if (pv>pvmax)
			pv=pvmax;
		attaque=+10;
		System.out.println(this.nom + "passe au niveau " + niveau + " !");
	}
	
	public void changerNom(String nouveauNom){
		nom=nouveauNom;
	}
	
	public String toString(){
		return nom + " (" + pv +"/" + pvmax + "pv, "+ attaque + " att";
	}
	
	public String getNom(){
		return nom;
	}
	
	//Affichage du style bulbizarre jean claude
	
	public String getId(){
		return "Pas d'espèce ! " + nom;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
