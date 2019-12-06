
public class Dresseur {
		protected String nom;
		protected Pokemon[] pokemons;
		protected int nbPokeballs;
		protected int nbPokemons;
		protected static int nbDresseurs = 0;
		protected boolean vaincu;
		protected int nbValides;
		
		public Dresseur (String nom, int x, int y){
			this.nom=nom;
			pokemons = new Pokemon[10];
			nbPokeballs = 10;
			nbPokemons = 0;
			//this.x=x;
			//this.y=y;
			nbDresseurs++;
			vaincu = false;
			nbValides = nbPokemons;
		}
		
		//public Dresseur(int x, int y, int niveau){
			//this("Dresseur" + (nbDresseurs), x, y, niveau);
	//	}
		
		public Dresseur(String nom){
			this(nom,0,0);
		}
		
		public Dresseur( int x, int y){
			this("Dresseur" + (nbDresseurs), x, y);
		}
		
		public Dresseur() {
			this("Dresseur" + (nbDresseurs));
		}
		
		public void capturePokemons( int nbPokemons){
			Pokemon [] nouveauxPokemons = new Pokemon[nbPokemons];
			for (int n=0; n<nbPokemons;n++){
				nouveauxPokemons[n] = Pokemon.pokemonAleatoire();
			}
			capturePokemons(nouveauxPokemons);
		}
		
		public void capturePokemons( Pokemon [] nouveauxPokemons){
			for (int pokemonNum= 0; pokemonNum < nouveauxPokemons.length;pokemonNum++){
				if (nbPokemons == 10 || nbPokeballs == 0) {
					break;
				}
				pokemons[nbPokemons] = nouveauxPokemons[pokemonNum];
				nbPokemons++;
				nbValides++;
			}
		}
		
		public void infirmerie() {
			for (int pokemonNum = 0; pokemonNum<nbPokemons; pokemonNum++) {
				pokemons[pokemonNum].soigner();
			}
			nbValides=nbPokemons;
		}
		
		public String toString() {
			return nom;
		}
		
		public void combat (Dresseur adversaire) {
			System.out.println(this + " affronte " + adversaire);
			boolean termine = false;
			int pokemonNum = 0, pokemonNumAdv = 0;
			Dresseur vainqueur = null;
			
			while(!termine){
				Pokemon.combat(pokemons[pokemonNum], adversaire.pokemons[pokemonNumAdv], "a", "b ");
				if (pokemons[pokemonNum].estKO()){
					pokemonNum++;
				}
				if (adversaire.pokemons[pokemonNumAdv].estKO()){
					pokemonNumAdv++;
				}
				if (pokemonNum==nbPokemons){
					termine = true;
					if (pokemonNumAdv!=adversaire.nbPokemons) {
						vainqueur = adversaire;
					}
				}
				else if (pokemonNumAdv == adversaire.nbPokemons){
					termine = true;
					vainqueur = this;
				}
			}
			infirmerie();
			adversaire.infirmerie();
			if (vainqueur == null){
				System.out.println("Egalité !");
			}
			else {
				System.out.println("Victoire de " + vainqueur + " !");
			}
		}
				
}
		
	


