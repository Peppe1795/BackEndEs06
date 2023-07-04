package Es03;

public class App {

	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica("peppe", "546546544");
		rubrica.inserisci("Marco", "354867545");
		rubrica.inserisci("Antonio", "3456978157");
		rubrica.inserisci("Flavio", "2165165161");
		rubrica.inserisci("Luca", "651155651");
		rubrica.inserisci("Francesco", "65151116");
		rubrica.stampa();
		rubrica.rimuovi("Flavio");
		rubrica.stampa();
		rubrica.trovaPerNom("Antonio");
		rubrica.trovaPerNum("65151116");
	}
}
