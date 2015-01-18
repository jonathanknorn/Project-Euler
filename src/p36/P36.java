package p36;

import res.Euler;
import res.Resources;

public class P36 extends Euler {

	public static void main(String[] args){
		Euler  p = new P36();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}
	
	@Override
	public long run() {
		long sum = 0;
		for(int i = 1; i < 1000000; i++){
			if(Resources.isPalindrome(i) && Resources.isPalindrome(Integer.toBinaryString(i))){
				sum +=i;
			}
		}
		return sum;
	}
	
	@Override
	public String getName() {
		return "P36";
	}
	
	@Override
	public String description() {
		return "The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.\n\n"
				+ "Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.\n\n"
				+ "(Please note that the palindromic number, in either base, may not include leading zeros.)";
	}

}
