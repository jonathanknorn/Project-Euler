package p02;

import res.Euler;

public class P02 extends Euler {

	public static void main(String[] args) {
		Euler p = new P02();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run(){
		int f1 = 1;
		int f2 = 2;
		int sum = f2;
		while(f1 + f2 < 4000000){
			int temp = f1 + f2;
			f1 = f2;
			f2 = temp;
			if(f2 % 2 == 0){
				sum += f2;
			}
		}
		return sum;
	}
	
	@Override
	public String getName(){
		return "P02";
	}
	
//	@Override
	public String description() {
		return "";
	}

}