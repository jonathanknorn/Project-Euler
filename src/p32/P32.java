package p32;

import java.util.Arrays;
import java.util.HashMap;

import res.Euler;

public class P32 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P32();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		long sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int a = 1; a*a<=9876543; a++){
			for(int b= a+1; a*b<=9876543; b++){
				String abs = Long.valueOf(a*b).toString();
				if(abs.length()>7){
					break;
				}
				abs = abs + Long.valueOf(a).toString() + Long.valueOf(b).toString();
				if(abs.length()>9){
					break;
				}
				char[] c = abs.toCharArray();
				Arrays.sort(c);
				abs = new String(c);
				if(abs.equals("123456789")){
					sum+= map.containsKey(a*b) ? 0 : a*b;
					map.put(a*b, a*b);
				}
			}
		}
		return sum;
	}

	@Override
	public String getName() {
		return "P32";
	}

	@Override
	public String description() {
		return "We shall say that an n-digit number is pandigital if it makes use of all the digits\n"
				+ "1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5\n"
				+ "pandigital.\n\n"
				+ "The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing\n"
				+ "multiplicand, multiplier, and product is 1 through 9 pandigital.\n\n"
				+ "Find the sum of all products whose multiplicand/multiplier/product identity can\n"
				+ "be written as a 1 through 9 pandigital.\n\n"
				+ "HINT: Some products can be obtained in more than one way so be sure to only\n"
				+ "include it once in your sum.";
	}

}
