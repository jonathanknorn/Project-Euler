package p04;

import res.Resources;
import res.Euler;

public class P04 extends Euler  {

	public static void main(String[] args) {
		System.out.println(new P04().run());
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
