package p37;

import res.Euler;

public class P37 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P37();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
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
		n = 0;
		int sum = 0;
		for(int i = 11; n < 11; i++){
			if(primes[i] != -1){
				int rev = 0;
				boolean x = true;
				int k = 0;
				for(int j = i; j > 10; j /=10){
					if(primes[j/10] == -1){
						x = false;
						break;
					}
					rev += j%10*Math.pow(10, k);
					if(primes[rev] == -1){
						x = false;
						break;
					}
					k++;
				}
				if(x){
					sum += i;
					n++;
				}
			}
		}
		return sum;
	}

	@Override
	public String getName() {
		return "P37";
	}

	@Override
	public String description() {
		return "The number 3797 has an interesting property. Being prime itself, it is possible to\n"
				+ "continuously remove digits from left to right, and remain prime at each stage:\n"
				+ "3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37,\n"
				+ "and 3.\n\n"
				+ "Find the sum of the only eleven primes that are both truncatable from left to\n"
				+ "right and right to left.\n\n"
				+ "NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.";
	}

}
