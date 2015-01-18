package p19;

import res.Euler;

public class P19 extends Euler{


	public static void main(String[] args) {
		System.out.println(new P19().run());
	}

	@Override
	public long run() {
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] weekdays = new int[7]; //Monday -> Sunday
		int day = 1; //Starts on a tuesday
		for(int year = 1901; year < 2001; year++){
			for(int month = 0; month < 12; month++){
				weekdays[day%7]++;
				day+=months[month];
				if(month == 1 && ((year%4 == 0 && year % 100 != 0) || year % 400 == 0)){
					day++;
				}
			}
		}
		return weekdays[6];
	}

	@Override
	public String getName() {
		return "P19";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
