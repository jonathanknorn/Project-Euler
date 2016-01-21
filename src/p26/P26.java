package p26;

import java.math.BigDecimal;
import java.math.MathContext;

import res.Euler;

public class P26 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P26();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		
		return 0;
	}

	@Override
	public String getName() {
		return "P26";
	}

	@Override
	public String description() {
		return "A unit fraction contains 1 in the numerator. The decimal representation of the unit\n"
				+ "fractions with denominators 2 to 10 are given:\n\n"
				+ "\t1/2	= 	0.5\n"
				+ "\t1/3	= 	0.(3)\n"
				+ "\t1/4	= 	0.25\n"
				+ "\t1/5	= 	0.2\n"
				+ "\t1/6	= 	0.1(6)\n"
				+ "\t1/7	= 	0.(142857)\n"
				+ "\t1/8	= 	0.125\n"
				+ "\t1/9	= 	0.(1)\n"
				+ "\t1/10	= 	0.1\n\n"
				+ "Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that\n"
				+ "1/7 has a 6-digit recurring cycle.\n\n"
				+ "Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its\n"
				+ "decimal fraction part.";
	}

}
