package p34;

import res.Euler;
import res.Resources;

public class P34 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P34();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		int res = 0;
		for(int i = 3; i < 9999999; i++){
			int sum = 0;
			for(int j = i; j > 0; j/=10){
				sum += Resources.fac(j%10);
				if(sum>i){
					break;
				}
			}
			if(sum==i){
				res += sum;
			}
		}
		return res;
	}

	@Override
	public String getName() {
		return "P34";
	}

	@Override
	public String description() {
		return "145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.\n\n"
				+ "Find the sum of all numbers which are equal to the sum of the\n"
				+ "factorial of their digits.\n\n"
				+ "Note: as 1! = 1 and 2! = 2 are not sums they are not included.";
	}

}
