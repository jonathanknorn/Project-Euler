package p39;

import res.Euler;

public class P39 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P39().run());
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

}
