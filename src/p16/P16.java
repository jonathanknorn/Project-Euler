package p16;

import res.Euler;

public class P16 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P16().run());
	}

	@Override
	public long run() {
		String n = "1";
		for (int i = 0; i < 1000; i++) {
			char[] c = n.toCharArray();
			int r = 0;
			String t = "";
			for (int j = c.length - 1; j >= 0; j--) {
				int a = c[j] - '0';
				a = a * 2 + r;
				t = a % 10 + t;
				r = a / 10;
			}
			n = r > 0 ? r + t : t;
		}

		int sum = 0;
		for (char c : n.toCharArray()) {
			sum += c - '0';
		}
		return sum;
	}
	
	@Override
	public String getName() {
		return "P16";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
