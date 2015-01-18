package p52;

import res.Euler;
import res.Resources;

public class P52 extends Euler {

	public static void main(String[] args) {
		Euler p = new P52();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		boolean found = false;
		long i = 1;
		while (!found) {
			String iS = Resources.sort(i);
			int jSum = 0;
			for (int j = 2; j <= 6; j++) {
				if (!iS.equals(Resources.sort(j * i))) {
					break;
				}
				jSum++;
			}
			if (jSum == 5) {
				found = true;
			} else {
				i++;
			}
		}
		return i;
	}

	@Override
	public String getName() {
		return "P52";
	}

	@Override
	public String description() {
		return "It can be seen that the number, 125874, and its double, 251748,\n"
				+ "contain exactly the same digits, but in a different order.\n\n"
				+ "Find the smallest positive integer, x, such that 2x, 3x, 4x,\n"
				+ "5x, and 6x, contain the same digits.";
	}

}
