package p28;

import res.Euler;

public class P28 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P28().run());
	}

	@Override
	public long run() {
		long sum = 1;
		int size = 1001;
		int add = 2;
		int last = 1;
		do{
			for(int i = 0; i < 4;i++){
				last = last += add;
				sum += last;
			}
			add +=2;
		}while(last < size*size);
		return sum;
	}

	@Override
	public String getName() {
		return "P28";
	}

}
