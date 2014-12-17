package p22;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import res.Euler;

public class P22 extends Euler {

	public static void main(String[] args) {
//		System.out.println('C' - 'A' + 1);
				System.out.println(new P22().run());
	}

	@Override
	public long run() {
		Scanner read;
		ArrayList<String> list = new ArrayList<String>();
		try {
			read = new Scanner(new File("names.txt"));
			read.useDelimiter(",");
			while (read.hasNext()) {
				String s = read.next();
				list.add(s.substring(1, s.length()-1));
			}
			read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String[] names = new String[list.size()];
		list.toArray(names);
		Arrays.sort(names);

		long ans = 0;
		for(int i = 0; i < names.length; i++){
			String s = names[i];
			long sum = 0;
			for(char c : s.toCharArray()){
				sum += c - 'A' + 1;
			}
			sum *= (i+1);
			ans += sum;
		}
		
		return ans;
	}

	@Override
	public String getName() {
		return "P22";
	}

}
