package p39;

import res.Euler;

public class P39 extends Euler {

	public static void main(String[] args) {
		Euler p = new P39();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		int lar = -1;
		int[] len = new int[1001];
		for(int a = 3; a <= 1000; a++){
			for(int b = a+1; a+b <= 1000; b++){
				double c =  Math.sqrt(a*a+b*b);
				int p = a+b+(int)c;
				double d = c - (int)c;
				if(d == 0 && p <= 1000){
					len[p]++;
					if(lar == -1 || len[p] > len[lar]){
						lar = p;
					}
				}
				
			}
		}
		return lar;
	}

	@Override
	public String getName() {
		return "P39";
	}
	
	@Override
	public String description() {
		return "If p is the perimeter of a right angle triangle with integral length sides,\n"
				+ "{a,b,c}, there are exactly three solutions for p = 120.\n\n"
				+ "{20,48,52}, {24,45,51}, {30,40,50}\n\n"
				+ "For which value of p <= 1000, is the number of solutions maximised?";
	}

}
