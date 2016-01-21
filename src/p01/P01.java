package p01;

import res.Euler;

public class P01 extends Euler {

	public static void main(String[] args) {
		Euler p = new P01();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());	}

	@Override
	public long run(){
		int sum = 0;

		for(int i = 3; i < 1000; i+=3){
			sum += i;
		}
		for(int i = 5; i < 1000; i+=5){
			if(i%3 != 0){
				sum += i;
			}
		}
		return sum;
	}
	
	@Override
	public String getName(){
		return "P01";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
