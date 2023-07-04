package Es01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Inserisci numero elementi");

			int numeroElementi = input.nextInt();
			input.nextLine();
			if (numeroElementi > 0) {
				Set<String> collezioneSet = new HashSet<>();
				Set<String> collezioneSetDup = new HashSet<>();
				for (int i = 0; i < numeroElementi; i++) {
					System.out.println("Inserisci parola");
					String numParole = input.nextLine();

					if (collezioneSet.contains(numParole) == false) {
						collezioneSet.add(numParole);
					} else {
						collezioneSetDup.add(numParole);
					}

				}
				System.out.println("Numero di parole distinte: ");

				System.out.println(collezioneSet.size());

				System.out.println("Elenco di parole distinte: ");

				for (String primoSet : collezioneSet) {
					System.out.println(primoSet);
				}

				System.out.println("Set con parole duplicate: ");

				for (String secondoSet : collezioneSetDup) {
					System.out.println(secondoSet);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

	}

}
