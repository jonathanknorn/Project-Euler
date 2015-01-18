package p14;

import res.Euler;

public class P14 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P14().run());
	}

	@Override
	public long run(){
		long longest = 1;
		int longestN = 1;
		for(int i = 1; i < 1000000; i++){
			long j = i;
			long length = 1;
			while(j > 1){
				j = j % 2 == 0 ? j/2 : (3*j)+1;
				length++;
			}
			if(length > longest){
				longest = length;
				longestN = i;
			}
		}
		return longestN;
	}
	
	@Override
	public String getName() {
		return "P14";
	}
	
//	@Override
	public String description() {
		return "";
	}

}