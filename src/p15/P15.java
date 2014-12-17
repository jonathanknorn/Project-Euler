package p15;

import res.Euler;

public class P15 extends Euler {

	public static void main(String[] args) {
		System.out.println(new P15().run());
	}

	@Override
	public long run(){
		int size = 20;
		long[][] grid = new long[size+1][size+1];
		grid[0][0] = 0;
		grid[1][0] = 1;
		grid[0][1] = 1;
		
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid.length; j++){
				long val = grid[i][j];
				if(i+j > 1){
					val = 0;
					val += i > 0 ? grid[i-1][j] : 0;
					val += j > 0 ? grid[i][j-1] : 0;
				}
				grid[i][j] = val;
				grid[j][i] = val; 
			}
		}
		return grid[size][size];
	}
	
	@Override
	public String getName() {
		return "P15";
	}

}
