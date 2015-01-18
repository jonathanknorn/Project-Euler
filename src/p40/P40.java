package p40;

import res.Euler;

public class P40 extends Euler {

	public static void main(String[] args) {
		Euler p = new P40();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		int d = 1;
		int dd = 1;
		long fac = 1;
		for(int i = 1; d<=1000000; i++){
			char[] c = new Integer(i).toString().toCharArray();
			for(int j = 0; j < c.length && d <=1000000 ; j++){
				int s = c[j] - '0';
				if(d%dd==0){
					dd *=10;
					fac *= s;
				}
				d++;
			}
		}
		return fac;
	}

	@Override
	public String getName() {
		return "P40";
	}
	
	@Override
	public String description() {
		return "An irrational decimal fraction is created by concatenating the positive integers:\n"
				+ "\t0.123456789101112131415161718192021...\n\n"
				+ "It can be seen that the 12th digit of the fractional part is 1.\n\n"
				+ "If dn represents the nth digit of the fractional part, find the value of the following expression.\n\n"
				+ "d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000";
	}

}
