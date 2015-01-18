package p38;

import res.Euler;
import res.Resources;

public class P38 extends Euler {

	public static void main(String[] args) {
		Euler p = new P38();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}
	
	@Override
	public long run() {
		for(int i = 9999; i >= 0; i--){
			String s = "";
			for(int j = 1; s.length() < 9; j++){
				s += new Integer(i*j).toString();
			}
			if(s.length() == 9){
				long l = Integer.valueOf(s);
				if(Resources.isNPandigital(l)){
					return l;
				}
			}
			
		}
		return -1;
	}

	@Override
	public String getName() {
		return "P38";
	}

	@Override
	public String description() {
		return "Take the number 192 and multiply it by each of 1, 2, and 3:\n\n"
				+ "\t192 × 1 = 192\n"
				+ "\t192 × 2 = 384\n"
				+ "\t192 × 3 = 576\n\n"
				+ "By concatenating each product we get the 1 to 9 pandigital, 192384576.\n"
				+ "We will call 192384576 the concatenated product of 192 and (1,2,3)\n\n"
				+ "The same can be achieved by starting with 9 and multiplying by\n"
				+ "1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the\n"
				+ "concatenated product of 9 and (1,2,3,4,5).\n\n"
				+ "What is the largest 1 to 9 pandigital 9-digit number that can be formed\n"
				+ "as the concatenated product of an integer with (1,2, ... , n) where n > 1?";
	}

}
