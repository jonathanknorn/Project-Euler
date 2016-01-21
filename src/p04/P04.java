package p04;

import res.Euler;
import res.Resources;

public class P04 extends Euler  {

	public static void main(String[] args) {
		Euler p = new P04();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run(){
		int largest = -1;
		for(int i = 100; i < 1000; i++){
			for(int j = 100; j < 1000; j++){
				int fac = i*j;
				if(Resources.isPalindrome(fac) && fac > largest){
					largest = fac;
				}
			}
		}
		return largest;
	}
	
	@Override
	public String getName(){
		return "P04";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
