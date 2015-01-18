package p33;

import res.Euler;

public class P33 extends Euler {

	public static void main(String[] args) {
		Euler p = new P33();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		int prodN = 1;
		int prodD = 1;
		int res = -1;
		for (int n = 10; n < 99; n++) {
			for (int d = n + 1; d < 100; d++) {
				double frac = (double) n / (double) d;
				int nFirst = n / 10;
				int nLast = n % 10;
				int shortD = -1;
				int shortN = -1;
				if (nLast != 0) {
					if (d / 10 == nFirst) {// 9
						shortD = d % 10;// 8
						shortN = nLast;
					} else if (d % 10 == nFirst) {// 8
						shortD = d / 10;// 9
						shortN = nLast;
					} else if (d / 10 == nLast) {
						shortD = d % 10;
						shortN = nFirst;
					} else if (d % 10 == nLast) {
						shortD = d / 10;
						shortN = nFirst;
					}
					
						if (shortD != -1 && (double) shortN / (double) shortD == frac) {
							prodN *= shortN;
							prodD *= shortD;
						
					}
				}
			}
		}
		for(int i = prodN; i > 0; i--){
			if(prodN % i == 0 && prodD % i == 0){
				res = prodD / i;
				break;
			}
		}
		return res;
	}

	@Override
	public String getName() {
		return "P33";
	}

	@Override
	public String description() {
		return "The fraction 49/98 is a curious fraction, as an inexperienced mathematician\n"
				+ "in attempting to simplify it may incorrectly believe that 49/98 = 4/8,\n"
				+ "which is correct, is obtained by cancelling the 9s.\n\n"
				+ "We shall consider fractions like, 30/50 = 3/5, to be trivial examples.\n\n"
				+ "There are exactly four non-trivial examples of this type of fraction,\n"
				+ "less than one in value, and containing two digits in the numerator and\n"
				+ "denominator.\n\n"
				+ "If the product of these four fractions is given in its lowest common\n"
				+ "terms, find the value of the denominator.";
	}

}
