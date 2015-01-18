package p67;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import res.Euler;

public class P67 extends Euler {
	
	public static void main(String[] args) {
		Euler p = new P67();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run() {
		File f = new File(System.getProperty("user.dir")+"/"+"p067_triangle.txt");
		Scanner scan;
		int[][] triangle = new int[100][100];
		try {
			scan = new Scanner(f);
			for(int i = 0; scan.hasNext(); ){
				for(int j = 0; j <= i; j++){
					triangle[i][j] = scan.nextInt();
				}
				i++;
			}
			scan.close();
		} catch (FileNotFoundException e) {
			return -1;
		}
		for(int i = 1; i < triangle.length; i++){
			for(int j = 0; j <= i; j++){
				if(j==0){
					triangle[i][j] += triangle[i-1][0];
				} else if (j==i){
					triangle[i][j] += triangle[i-1][j-1];
				} else {
					triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]); 
				}
			}
		}
		int res = -1;
		for(int i : triangle[99]){
			res = res < i ? i : res;
		}
		return res;
	}

	@Override
	public String getName() {
		return "P67";
	}

	@Override
	public String description() {
		return "By starting at the top of the triangle below and moving to adjacent numbers on the\n"
				+ "row below, the maximum total from top to bottom is 23.\n\n"
				+ "\t   3\n"
				+ "\t  7 4\n"
				+ "\t 2 4 6\n"
				+ "\t8 5 9 3\n\n"
				+ "That is, 3 + 7 + 4 + 9 = 23.\n\n"
				+ "Find the maximum total from top to bottom in triangle.txt (right click and\n"
				+ "'Save Link/Target As...'), a 15K text file containing a triangle with\n"
				+ "one-hundred rows.\n\n"
				+ "NOTE: This is a much more difficult version of Problem 18. It is not possible to\n"
				+ "try every route to solve this problem, as there are 299 altogether! If you could\n"
				+ "check one trillion (1012) routes every second it would take over twenty billion\n"
				+ "years to check them all. There is an efficient algorithm to solve it. ;o)";
	}

}
