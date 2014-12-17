package res;

import java.util.ArrayList;

import p01.P01;
import p02.P02;
import p03.P03;
import p04.P04;
import p05.P05;
import p06.P06;
import p07.P07;
import p08.P08;
import p09.P09;
import p10.P10;
import p11.P11;
import p12.P12;
import p13.P13;
import p14.P14;
import p15.P15;
import p16.P16;
import p17.P17;
import p18.P18;
import p19.P19;
import p20.P20;
import p21.P21;
import p22.P22;
import p23.P23;
import p24.P24;
import p25.P25;

public class RunAll {

	public static void main(String[] args) {
		ArrayList<Euler> list = new ArrayList<Euler>();
		list.add(new P01());
		list.add(new P02());
		list.add(new P03());
		list.add(new P04());
		list.add(new P05());
		list.add(new P06());
		list.add(new P07());
		list.add(new P08());
		list.add(new P09());
		list.add(new P10());
		list.add(new P11());
		list.add(new P12());
		list.add(new P13());
		list.add(new P14());
		list.add(new P15());
		list.add(new P16());
		list.add(new P17());
		list.add(new P18());
		list.add(new P19());
		list.add(new P20());
		list.add(new P21());
		list.add(new P22());
		list.add(new P23());
		list.add(new P24());
		list.add(new P25());

		
		long bef, aft;
		long befA = System.currentTimeMillis();
		
		
		for(Euler e : list){
			bef = System.currentTimeMillis();
			System.out.println(e.run());
			aft = System.currentTimeMillis();
			System.out.println(e.getName() + ": " + (aft-bef) + "ms");
		}
		aft = System.currentTimeMillis();
		
		System.out.println("All problems ran in " + (aft - befA) + "ms");
	}

}
