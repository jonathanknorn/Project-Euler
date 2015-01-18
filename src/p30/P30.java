package p30;

import res.Euler;

public class P30 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P30();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		long res = 0;
		for(int i = 2; i < 1000000; i++){
			int sum = 0;
			int j = i;
			while(j>0){
				int d = j%10;
				sum += (d*d*d*d*d);
				j = j/10;
			}
			if(sum == i){
				res+= i;
			}
		}
		return res;
	}

	@Override
	public String getName() {
		return "P30";
	}

	@Override
	public String description() {
		return "Surprisingly there are only three numbers that can be written as the sum of\n"
				+ "fourth powers of their digits:\n\n"
				+ "\t1634 = 1^4 + 6^4 + 3^4 + 4^4\n"
				+ "\t8208 = 8^4 + 2^4 + 0^4 + 8^4\n"
				+ "\t9474 = 9^4 + 4^4 + 7^4 + 4^4\n\n"
				+ "As 1 = 1^4 is not a sum it is not included\n\n."
				+ "The sum of these numbers is 1634 + 8208 + 9474 = 19316.\n\n"
				+ "Find the sum of all the numbers that can be written as the sum of fifth\n"
				+ "powers of their digits.";
	}

}
