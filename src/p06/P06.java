package p06;

import res.Euler;

public class P06 extends Euler  {

	
	public static void main(String[] args) {
		Euler p = new P06();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	public long run(){
		int sumSq = 0, sqSum = 0;
		for(int i = 1; i <= 100; i++){
			sumSq += i*i;
			sqSum += i;
		}
		sqSum *= sqSum;
		
		return sqSum - sumSq;

	}
	
	public String getName(){
		return "P06";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
