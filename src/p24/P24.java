package p24;

import java.util.ArrayList;
import java.util.List;

import res.Euler;

public class P24 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P24().run());
	}

	@Override
	public long run() {
		int index = 999999;
		String nums = "0123456789";
		String res = "";
		for(int i = 9; i >= 0; i--){
			int f = fac(i);
			char c = nums.charAt(index / f);
			nums = nums.replaceAll(c + "", "");
			index %= f;
			res += c;
		}
		return new Long(res);
	}

	
	private int fac(int n){
		if(n <= 1) {
			return 1;
		} else {
			return n * fac(n-1);
		}
	}
	
	
	@Override
	public String getName() {
	return "P24";
	}


}
