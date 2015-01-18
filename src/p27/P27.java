package p27;

import res.Euler;

public class P27 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P27();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());		
	}

	@Override
	public long run() {
		int lar = -1;
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
		for(int a = -999; a < 1000; a++){
			for(int b = -999; b < 1000; b++){
				n = 0;
				int count = 0;
				while(n*n+n*a+b > 0 && primes[n*n+n*a+b] != -1){
					count++;	
					n++;
				}
				if(count>lar){
					lar = count;
					res = a*b;
				}
			}
		}
		return res;
	}

	@Override
	public String getName() {
		return "P27";
	}

	@Override
	public String description() {
		return "Euler discovered the remarkable quadratic formula:\n\n"
				+ "\tn² + n + 41\n\n"
				+ "It turns out that the formula will produce 40 primes for the consecutive values\n"
				+ "n = 0 to 39. However, when n = 40, 402 + 40 + 41 = 40(40 + 1) + 41 is divisible\n"
				+ "by 41, and certainly when n = 41, 41² + 41 + 41 is clearly divisible by 41.\n\n"
				+ "The incredible formula  n² − 79n + 1601 was discovered, which produces 80 primes\n"
				+ "for the consecutive values n = 0 to 79. The product of the coefficients, −79 and\n"
				+ "1601, is −126479.\n\n"
				+ "Considering quadratics of the form:\n\n"
				+ "\tn² + an + b, where |a| < 1000 and |b| < 1000\n\n"
				+ "\twhere |n| is the modulus/absolute value of n\n"
				+ "\te.g. |11| = 11 and |−4| = 4\n\n"
				+ "Find the product of the coefficients, a and b, for the quadratic expression that\n"
				+ "produces the maximum number of primes for consecutive values of n, starting with\n"
				+ "n = 0.";
	}

}
