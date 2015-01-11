package p29;

import java.math.BigInteger;
import java.util.HashMap;

import res.Euler;

public class P29 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P29().run());
	}

	@Override
	public long run() {
		int lim = 100;
		HashMap<String, String> m = new HashMap<String, String>();
		for(int a = 2; a <= lim; a++){
			for(int b = 2; b <= lim; b++){
				String s = BigInteger.valueOf(a).pow(b).toString(); 
				m.put(s,s);
			}
		}
		return m.size();
	}

	@Override
	public String getName() {
		return "P29";
	}

}
