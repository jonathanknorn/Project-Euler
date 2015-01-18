package p41;

import res.Euler;
import res.Resources;

public class P41 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P41();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		int[] primes = new int[7654321]; //1+2+3+4+5+6+7+8%3 == 0, 1+2+3+4+5+6+7+8+9 % 3 == 0
		for (int i = 0; i < primes.length; i++) {
			primes[i] = i;
		}
		primes[0] = -1;
		primes[1] = -1;
		int n = 2;
		while (n < primes.length) {
			for (int i = 2; n * i < primes.length; i++) {
				primes[i * n] = -1;
			}
			n++;
			while (n < primes.length && primes[n] == -1) {
				n++;
			}
		}
		for (int i = primes.length-1; i >= 0; i--) {
			if (primes[i] != -1) {
				if(Resources.isNPandigital(primes[i])){
					return primes[i];
				}
			}
		}
		return -1;
	}

	@Override
	public String getName() {
		return "P41";
	}

	@Override
	public String description() {
		return "We shall say that an n-digit number is pandigital if it makes use\n"
				+ "of all the digits 1 to n exactly once. For example, 2143 is a\n"
				+ "4-digit pandigital and is also prime.\n\n"
				+ "What is the largest n-digit pandigital prime that exists?";
	}

}
