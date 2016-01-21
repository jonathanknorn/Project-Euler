package p05;

import res.Euler;

public class P05 extends Euler  {

	public static void main(String[] args) {
		Euler p = new P05();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}
	
	@Override
	public long run(){
		long res;
		for(int i = 2520; true; i+=20){
			int sum = 2;
			for(int j = 3; j <= 20; j++){
				if(i%j == 0){
					sum++;
				} else {
					break;
				}
			}
			if(sum == 20){
				res = i;
				break;
			}
		}
		return res;
	}
	
	@Override
	public String getName(){
		return "P05";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
