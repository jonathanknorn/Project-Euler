package p28;

import res.Euler;

public class P28 extends Euler {

	public static void main(String[] args) {
		Euler  p = new P28();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		long sum = 1;
		int size = 1001;
		int add = 2;
		int last = 1;
		do{
			for(int i = 0; i < 4;i++){
				last = last += add;
				sum += last;
			}
			add +=2;
		}while(last < size*size);
		return sum;
	}

	@Override
	public String getName() {
		return "P28";
	}

//	@Override
	public String description() {
		return "Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:\n\n"
				+ "\t21 22 23 24 25\n"
				+ "\t20  7  8  9 10\n"
				+ "\t19  6  1  2 11\n"
				+ "\t18  5  4  3 12\n"
				+ "\t17 16 15 14 13\n\n"
				+ "It can be verified that the sum of the numbers on the diagonals is 101.\n\n"
				+ "What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?";
	}
	
}
