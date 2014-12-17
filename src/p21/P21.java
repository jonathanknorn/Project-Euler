package p21;

import java.util.ArrayList;

import res.Euler;

public class P21 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P21().run());
	}

	@Override
	public long run() {
		long res = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		for (int num = 1; num < 10000; num++) {
			int sum = 1;
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					sum += i;
					sum += num / i;
				}
			}
			list.add(sum);
		}
		int size = list.size();
		for(int i = 1; i < size; i++){
			int a = list.get(i);
			if(a != i && a < size && list.get(a) == i){
				res += i;
			}
		}
		return res;
	}

	@Override
	public String getName() {
		return "P21";
	}

}
