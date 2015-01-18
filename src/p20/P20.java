package p20;

import java.math.BigInteger;

import res.Euler;

public class P20 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P20().run());
	}
	
	@Override
	public long run() {
		BigInteger b = BigInteger.ONE;
		BigInteger m = BigInteger.ONE;
		for(int i = 2; i <= 100; i++){
			m = m.add(BigInteger.ONE);
			b = b.multiply(m);
		}
		String s = b.toString();
		long sum = 0;
		for(char c : s.toCharArray()){
			sum += c - '0';
		}
		return sum;
	}

	
	@Override
	public String getName() {
		return "P20";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
