package p58;

import res.Euler;
import res.Resources;

public class P58 extends Euler {

	public static void main(String[] args) {
		Euler  p = new P58();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		long tot = 0;
		long primes = 0;
		int add = 2;
		int last = 1;
		int size = 1;
		do{
			for(int i = 0; i < 4;i++){
				last = last += add;
				tot++;
				primes = Resources.isPrime(last) ? primes+1 : primes;
			}
			add +=2;
			size+=2;
		}while(10*primes > tot);
		return size;
	}

	@Override
	public String getName() {
		return "P58";
	}

	@Override
	public String description() {
		return "Starting with 1 and spiralling anticlockwise in the following way,\n"
				+ "a square spiral with side length 7 is formed.\n\n"
				+ "\t37 36 35 34 33 32 31\n"
				+ "\t38 17 16 15 14 13 30\n"
				+ "\t39 18  5  4  3 12 29\n"
				+ "\t40 19  6  1  2 11 28\n"
				+ "\t41 20  7  8  9 10 27\n"
				+ "\t42 21 22 23 24 25 26\n"
				+ "\t43 44 45 46 47 48 49\n\n"
				+ "It is interesting to note that the odd squares lie along the\n"
				+ "bottom right diagonal, but what is more interesting is that 8\n"
				+ "out of the\n13 numbers lying along both diagonals are prime;\n"
				+ "that is, a ratio of 8/13 ≈ 62%.\n\n"
				+ "If one complete new layer is wrapped around the spiral above,\n"
				+ "a square spiral with side length 9 will be formed. If this\n"
				+ "process is continued, what is the side length of the square\n"
				+ "spiral for which the ratio of primes along both diagonals first\n"
				+ "falls below 10%?";
	}

}
