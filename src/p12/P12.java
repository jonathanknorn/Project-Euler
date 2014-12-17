package p12;

import res.Euler;

public class P12 extends Euler {


	public static void main(String[] args) {
		System.out.println(new P12().run());
	}

	@Override
	public long run(){
		int factors = 0;
		int num = 0;
		for(int n = 1; factors < 500; n++){
			factors = 0;
			num += n;
			for(int i = 1; i*i <= num; i++){
				if(num % i == 0){
					factors += 2;
				}
			}
		}
		return num;
	}
	
	@Override
	public String getName() {
		return "P12";
	}

}
