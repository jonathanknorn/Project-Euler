package p23;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

import res.Euler;

public class P23 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P23().run());
	}

	@Override
	public long run() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeMap<Integer, Integer> list2 = new TreeMap<Integer, Integer>();
		for (int num = 1; num < 28123; num++) {
			list2.put(num, num);
			int sum = 1;
			for (int i = 2; i * i <= num && sum <= num; i++) {
				if (num % i == 0) {
					sum += i;
					int a = num / i;
					sum += a == i ? 0 : a;
				}
			}
			if(sum > num){
				list.add(num);
			}
		}
		long sum = 0;
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j <= i; j++){
				int a = list.get(i) + list.get(j);
				list2.remove(a);
			}
		}
		for(Entry<Integer, Integer> e : list2.entrySet()){
			sum += e.getKey();
		}
		return sum;
	}

	@Override
	public String getName() {
		return "P23";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
