package p42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import res.Euler;

public class P42 extends Euler {

	public static void main(String[] args) {
		Euler p = new P42();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		int[] t = new int[26 * 20];
		for (int i = 1; i * (i + 1) / 2 < t.length; i++) {
			int a = i * (i + 1) / 2;
			t[a] = a;
		}
		int sum = 0;
		Scanner read;
		try {
			read = new Scanner(new File(System.getProperty("user.dir") + "/"
					+ "p042_words.txt"));
			read.useDelimiter(",");
			while (read.hasNext()) {
				String s = read.next();
				s = s.substring(1, s.length() - 1);
				char[] chars = s.toCharArray();
				int wordSum = 0;
				for (char c : chars) {
					wordSum += c - '@';
				}
				if (t[wordSum] != 0) {
					sum++;
				}
			}
			read.close();
		} catch (FileNotFoundException e) {
			return -1;
		}

		return sum;
	}

	@Override
	public String getName() {
		return "P42";
	}

	@Override
	public String description() {
		return "The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the\n"
				+ "first ten triangle numbers are:\n\n"
				+ "\t1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...\n\n"
				+ "By converting each letter in a word to a number corresponding to its alphabetical\n"
				+ "position and adding these values we form a word value. For example, the word value\n"
				+ "for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we\n"
				+ "shall call the word a triangle word.\n\n"
				+ "Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing\n"
				+ "nearly two-thousand common English words, how many are triangle words?";
	}

}
