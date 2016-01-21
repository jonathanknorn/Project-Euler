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
import p26.P26;
import p27.P27;
import p28.P28;
import p29.P29;
import p30.P30;
import p31.P31;
import p32.P32;
import p33.P33;
import p35.P35;
import p36.P36;
import p37.P37;
import p38.P38;
import p39.P39;
import p40.P40;
import p41.P41;
import p42.P42;
import p43.P43;
import p45.P45;
import p52.P52;
import p55.P55;
import p56.P56;
import p58.P58;
import p67.P67;

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
		list.add(new P26());
		list.add(new P27());
		list.add(new P28());
		list.add(new P29());
		list.add(new P30());
		list.add(new P31());
		list.add(new P32());
		list.add(new P33());
		list.add(new P35());
		list.add(new P36());
		list.add(new P37());
		list.add(new P38());
		list.add(new P39());
		list.add(new P40());
		list.add(new P41());
		list.add(new P42());
		list.add(new P43());
		list.add(new P45());
		list.add(new P52());
		list.add(new P55());
		list.add(new P56());
		list.add(new P58());
		list.add(new P67());
		
		long bef, aft;
		long befA = System.currentTimeMillis();
		
		
		for(Euler e : list){
			bef = System.currentTimeMillis();
			long l = e.run();
			aft = System.currentTimeMillis();
			System.out.println(e.getName() + ": " + l + "\n ran in " + (aft-bef) + "ms\n");
		}
		aft = System.currentTimeMillis();
		
		System.out.println("All problems ran in " + (aft - befA) + "ms");
	}

}
