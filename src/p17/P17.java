package p17;

import java.util.HashMap;
import res.Euler;

public class P17 extends Euler {


	public static void main(String[] args) {
		System.out.println(new P17().run());
	}
	
	@Override
	public long run(){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0);
		map.put(1, 3);
		map.put(2, 3);
		map.put(3, 5);
		map.put(4, 4);
		map.put(5, 4);
		map.put(6, 3);
		map.put(7, 5);
		map.put(8, 5);
		map.put(9, 4);
		map.put(10, 3);
		map.put(11, 6);
		map.put(12, 6);
		map.put(13, 8);
		map.put(14, 8);
		map.put(15, 7);
		map.put(16, 7);
		map.put(17, 9);
		map.put(18, 8);
		map.put(19, 8);
		map.put(20, 6);
		map.put(30, 6);
		map.put(40, 5);
		map.put(50, 5);
		map.put(60, 5);
		map.put(70, 7);
		map.put(80, 6);
		map.put(90, 6);
		map.put(100, 10);
		map.put(200, 10);
		map.put(300, 12);
		map.put(400, 11);
		map.put(500, 11);
		map.put(600, 10);
		map.put(700, 12);
		map.put(800, 12);
		map.put(900, 11);
		map.put(1000, 11);
		
		int sum = 0;
		for(int i = 1;  i <= 1000; i++){
			int a = i % 100;
			if(a < 20){
				sum += map.get(a);
			} else {
				sum += map.get(a % 10);
				sum += map.get((a / 10)*10);
			}
			int b = i - a;
			if(i > 99 && i%100 != 0){
				sum += 3;
			}
			sum += map.get(b);
		}
		return sum;
	}

	@Override
	public String getName() {
		return "P17";
	}

}
