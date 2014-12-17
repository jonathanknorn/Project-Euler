package p09;

import res.Euler;

public class P09 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P09().run());
	}

	@Override
	public long run() {
		boolean found = false;
		for (int c = 997; !found; c--) {
			for (int b = (1000 - c) / 2; b + c <= 999 && b < c; b++) {
				int a = 1000 - b - c;
				if (a < b && a * a + b * b == c * c) {
					return a * b * c;
				}
			}
		}
		return -1;
	}
	
	@Override
	public String getName() {
		return "P09";
	}
}
