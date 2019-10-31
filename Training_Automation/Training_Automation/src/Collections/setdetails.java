package Collections;

import java.util.HashSet;

public class setdetails{
	static void Hashset() {
	HashSet <Integer> hm= new HashSet<Integer>();
	hm.add(123);
	hm.add(4);
	hm.add(5);
	hm.add(7);
	hm.add(11);
	hm.add(7);
	
	System.out.println(hm);
	System.out.println(hm.contains(6));
	hm.clone();
	System.out.println(hm);
//	hm.removeAll(hm);
//	System.out.println(hm);
	
	}
	public static void main(String args[]) {
		Hashset();
	}
}