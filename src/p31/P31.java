package p31;

import res.Euler;

public class P31 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P31();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		int sum = 0;
		int[] co = {200,100,50,20,10,5,2,1};
		for(int a = 0; a*co[0] <= 200; a++){
			int ac = a*co[0];
			for(int b = 0; ac + b*co[1] <= 200; b++){
				int bc = b*co[1];
				for(int c = 0; ac + bc + c*co[2] <= 200; c++){
					int cc = c*co[2];
					for(int d = 0; ac + bc + cc+ d*co[3] <= 200; d++){
						int dc = d*co[3];
						for(int e = 0; ac + bc + cc + dc + e*co[4] <= 200; e++){
							int ec = e*co[4];
							for(int f = 0; ac + bc + cc + dc + ec + f*co[5] <= 200; f++){
								int fc = f*co[5];
								for(int g = 0; ac + bc + cc + dc + ec + fc + g*co[6] <= 200; g++){
									int gc = f*co[6];
									if((200-(ac+bc+cc+dc+ec+fc+gc))%co[7] == 0){
										sum++;
									}
								}
							}
						}
					}
				}
			}
		}
		return sum;
	}

	@Override
	public String getName() {
		return "P31";
	}

	@Override
	public String description() {
		return "In England the currency is made up of pound, £, and pence, p,\n"
				+ "and there are eight coins in general circulation:\n\n"
				+ "\t1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).\n\n"
				+ "It is possible to make £2 in the following way:\n\n"
				+ "\t1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p\n\n"
				+ "How many different ways can £2 be made using any number\n"
				+ "of coins?";
	}

}
