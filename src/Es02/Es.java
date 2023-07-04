package Es02;

import java.util.Scanner;

public class Es {

	public static void main(String[] args) {
		int numero;
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		numero = Integer.parseInt(input.nextLine());
		casuale(numero);
	}

}
