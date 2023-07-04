package Es02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Es {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int numero = input.nextInt();
		Randomic randomic = new Randomic();
		randomic.casuale(numero);
		List<Integer> nuovaLista = new ArrayList<>();
		nuovaLista.add(3);
		nuovaLista.add(10);
		nuovaLista.add(15);
		System.out.println("Liste Concatenate e invertite");
		randomic.liste(nuovaLista);
		System.out.println("Stampa solo le posizioni pari");
		randomic.terza(nuovaLista, true);
		System.out.println("Stampa solo le posizioni disapari");
		randomic.terza(nuovaLista, false);
	}

}
