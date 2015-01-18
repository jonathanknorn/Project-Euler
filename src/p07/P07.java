package p07;

import res.Euler;

public class P07 extends Euler {


	public static void main(String[] args) {
		System.out.println(new P07().run());
	}

	@Override
	public long run(){
		int found = 1;
		int pNbr = 10001;
		int val = 2;
		for(int pr = 3; found < pNbr; pr += 2){
			int limit = (int) Math.sqrt(pr);
			boolean prime = true;
			for(int i = 3; i <= limit; i++){
				if(pr % i == 0){
					prime = false;
					break;
				}
			}
			if(prime){
				val = pr;
				found++;
			}
		}
		return val;
	}
	
	@Override
	public String getName() {
		return "P07";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
