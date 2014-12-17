package p02;

import res.Euler;

public class P02 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P02().run());
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
	
}