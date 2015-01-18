package p56;

import java.math.BigInteger;

import res.Euler;

public class P56 extends Euler {

	public static void main(String[] args){
		Euler p = new P56();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}
	
	@Override
	public long run() {
		long lar = 0;
		for(int a = 1; a < 100; a++){
			for(int b = 1; b < 100; b++){
				String s = BigInteger.valueOf(a).pow(b).toString();
				long sum = digitSum(s);
				lar = sum > lar ? sum : lar;
			}
		}
		return lar;
	}

	@Override
	public String getName() {
		return "P56";
	}

	@Override
	public String description() {
		return "A googol (10^100) is a massive number: one followed by one-hundred\n"
				+ "zeros; 100^100 is almost unimaginably large: one followed by\n"
				+ "two-hundred zeros. Despite their size, the sum of the digits\n"
				+ "in each number is only 1.\n\n" + 
				"Considering natural numbers of the form, a^b, where a, b < 100,\n"
				+ "what is the maximum digital sum?";
	}
	
	private long digitSum(String s) {
		long sum = 0;
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++){
			sum += c[i] - '0';
		}
		return sum;
	}

}
