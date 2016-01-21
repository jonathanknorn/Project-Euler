package p03;

import res.Euler;

public class P03 extends Euler  {

	public static void main(String[] args) {
		Euler p = new P03();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run(){
		long num = 600851475143L;
		long temp = num;
		long factor = 0;
		for(long i = 2; i*i < temp; i++){
			while(temp % i == 0){
				temp = temp / i;
				factor = i;
			}
		}
		if(temp > factor){
			factor = temp;
		}
		return factor;
	}
	
	@Override
	public String getName(){
		return "P03";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
