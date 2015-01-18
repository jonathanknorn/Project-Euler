package p25;

import java.math.BigInteger;

import res.Euler;

public class P25 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P25().run());
	}

	@Override
	public long run() {
		BigInteger b1 = BigInteger.ONE;
		BigInteger b2 = BigInteger.ONE;
		BigInteger comp = BigInteger.valueOf(10).pow(999);
		BigInteger temp;

		long count = 2;
		while(b2.compareTo(comp) < 0){
			temp = b2;
			b2 = b2.add(b1);
			b1 = temp;
			count++;
		}
		return count;
	}

	@Override
	public String getName() {
		return "P25";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
