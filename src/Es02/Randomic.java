package Es02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomic {

	public void casuale(int num) {
		List<Integer> casuali = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			Random rndm = new Random(num + 1);

			System.out.println(rndm);
		}

	}

}
