package p55;

import java.math.BigInteger;
import java.util.HashMap;

import res.Euler;
import res.Resources;

public class P55 extends Euler {
	
	private HashMap<Long, Integer> map;
	
	public static void main(String[] args) {
		Euler p = new P55();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		map = new HashMap<Long, Integer>();
		long sum = 0;
		for(long i = 1; i < 10000; i++){
			if(degree(i, 1) == 50){
				sum++;
			}
		}
		return sum;
	}

	@Override
	public String getName() {
		return "P55";
	}

	@Override
	public String description() {
		return "If we take 47, reverse and add, 47 + 74 = 121, which is palindromic.\n\n"
				+ "Not all numbers produce palindromes so quickly. For example,\n\n"
				+ "\t349 + 943 = 1292,\n"
				+ "\t1292 + 2921 = 4213\n"
				+ "\t4213 + 3124 = 7337\n\n"
				+ "That is, 349 took three iterations to arrive at a palindrome.\n\n"
				+ "Although no one has proved it yet, it is thought that some numbers,\n"
				+ "like 196, never produce a palindrome. A number that never forms a\n"
				+ "palindrome through the reverse and add process is called a Lychrel\n"
				+ "number. Due to the theoretical nature of these numbers, and for the\n"
				+ "purpose of this problem, we shall assume that a number is Lychrel\n"
				+ "until proven otherwise. In addition you are given that for every\n"
				+ "number below ten-thousand, it will either (i) become a palindrome in\n"
				+ "less than fifty iterations, or, (ii) no one, with all the computing\n"
				+ "power that exists, has managed so far to map it to a palindrome. In\n"
				+ "fact, 10677 is the first number to be shown to require over fifty\n"
				+ "iterations before producing a palindrome: 4668731596684224866951378664\n"
				+ "(53 iterations, 28-digits).\n\n"
				+ "Surprisingly, there are palindromic numbers that are themselves Lychrel\n"
				+ "numbers; the first example is 4994.\n\n"
				+ "How many Lychrel numbers are there below ten-thousand?\n\n"
				+ "NOTE: Wording was modified slightly on 24 April 2007 to emphasise the\n"
				+ "theoretical nature of Lychrel numbers.";
	}
	
	private int degree(long l, int d){
		if(d > 50){
			return 50;
		} else if(!map.containsKey(l)){
			long i = l + Resources.reverse(l);
			if(Resources.isPalindrome(i)){
				map.put(l, d);
				return d;
			} else {
				int res = degree(i, d+1);
				map.put(l, res);
				return res;
			}
		} else {
			return map.get(l);
		}
	}

}
