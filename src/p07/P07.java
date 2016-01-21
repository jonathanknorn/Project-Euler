package p07;

import res.Euler;

public class P07 extends Euler {


	public static void main(String[] args) {
		Euler p = new P07();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
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
