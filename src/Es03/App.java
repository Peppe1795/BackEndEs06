package Es03;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Rubrica giuseppe = new Rubrica("peppe", "546546544");
		Rubrica antonio = new Rubrica("antonio", "546546544");
		Rubrica luca = new Rubrica("luca", "546546544");
		Map<String, Rubrica> contatti = new HashMap<>();
		giuseppe.inserisci(contatti, giuseppe);
		antonio.inserisci(contatti, antonio);
		luca.inserisci(contatti, luca);
		giuseppe.stampa(contatti);

	}
}
