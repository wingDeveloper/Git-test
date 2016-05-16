package ua.wing.collections;

import java.util.ArrayList;
import java.util.Random;

public class Main {
//1*
//	private static Mobile[] mobiles = new Mobile[3];
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	private static Random r = new Random();
	public static void main(String[] args) {
		for(int i=0; i<300; i++){
			mobiles.add(new Mobile(r.nextInt(9999999), "Name"));
		}
		for(Mobile m:mobiles){
			System.out.println(m.getNumber()+ " " +m.getName());
		}
//1*
//		mobiles[0] = new Mobile(1234567, "Iphone");
//		mobiles[1] = new Mobile(3233434, "HTC");
//		mobiles[2] = new Mobile(5454343, "Nokia");
//		
//		for(Mobile m:mobiles){
//			System.out.println(m.getNumber()+ " " +m.getName());
//		}
	}
}
