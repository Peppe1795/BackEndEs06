package Es02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Randomic {
	List<Integer> casuali = new ArrayList<>();

	public void casuale(int num) {

		Random rndm = new Random();
		for (int i = 0; i < num; i++) {
			int numeroCasuale = rndm.nextInt(101);
			casuali.add(numeroCasuale);

		}
		System.out.println(casuali);
	}

	public void liste(List<Integer> lis) {
		lis.addAll(casuali);
		Collections.reverse(lis);

		System.out.println(lis);
	}

	public void terza(List<Integer> lis, boolean tof) {
		if (tof) {
			for (int i = 0; i < lis.size(); i += 2) {
				System.out.println(lis.get(i));
			}
		} else {
			for (int i = 1; i < lis.size(); i += 2) {
				System.out.println(lis.get(i));
			}
		}

	}

}
