package p18;

import res.Euler;

public class P18 extends Euler {

	int[][] in = {{75},
			{95, 64},
			{17, 47, 82},
			{18, 35, 87, 10},
			{20, 04, 82, 47, 65},
			{19, 01, 23, 75, 03, 34},
			{88, 02, 77, 73, 07, 63, 67},
			{99, 65, 04, 28, 06, 16, 70, 92},
			{41, 41, 26, 56, 83, 40, 80, 70, 33},
			{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
			{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
			{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
			{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
			{63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
			{04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23}};
	
	public static void main(String[] args) {
		System.out.println(new P18().run());
	}

	@Override
	public long run() {
		int[][] graph = in;
		for(int i = 1; i < graph.length; i++){
			for(int j = 0; j < graph[i].length; j++){
				if(j == 0){
					graph[i][j] += graph[i-1][0];
				} else if (j == graph[i].length-1){
					graph[i][j] += graph[i-1][j-1];
				} else {
					graph[i][j] += Math.max(graph[i-1][j-1], graph[i-1][j]);
				}
			}
		}
		int res = 0;
		for(int i : graph[graph.length-1]){
			res = i > res ? i : res;
		}
		return res;
	}

	@Override
	public String getName() {
		return "P18";
	}

}
