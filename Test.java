
public class Test {

	public static void main(String[] args) {
		Dresseur d1 = new Dresseur("Basile");
		Dresseur d2 = new Dresseur("Anne");
		Pokemon s = new Salameche();
		Pokemon b = new Bulbizarre("Patrick",180,50);
		Pokemon[] p = new Pokemon[1];
		p[0]=s;
		Pokemon[] p2 = new Pokemon[1];
		p2[0]=b;
		d1.capturePokemons(p);
		d2.capturePokemons(p2);
		d1.combat(d2);
		System.out.println(d1);
		System.out.println(d2);

	}

}
