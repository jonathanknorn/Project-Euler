package p35;

import java.util.ArrayList;

import res.Euler;

public class P35 extends Euler {

	public static void main(String[] args) {
		Euler p = new P35();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		int res = 0;
		int[] primes = new int[1000000];
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
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] != -1) {
				int t = 0;
				for (int j : rotations(i)) {
					t++;
					if (primes[j] == -1) {
						break;
					}
					t--;
				}
				if (t == 0) {
					res++;
				}
			}
		}
		return res;
	}

	@Override
	public String getName() {
		return "P35";
	}

	@Override
	public String description() {
		return "The number, 197, is called a circular prime because all rotations\n"
				+ "of the digits: 197, 971, and 719, are themselves prime.\n\n"
				+ "There are thirteen such primes below 100:\n"
				+ "2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.\n\n"
				+ "How many circular primes are there below one million?";
	}

	private int[] rotations(int n) {
		char[] c = Integer.valueOf(n).toString().toCharArray();
		int[] l = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 1; j <= c.length; j++) {
				int x = i+j-1;
				l[j-1] += (c[x%(c.length)] -'0')
						* Math.pow(10, c.length -1 - i);
			}
		}
		return l;
	}
}
