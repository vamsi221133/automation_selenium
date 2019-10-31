package Collections;

import java.util.*;

public class CollectionsEx{
	static int a,j =0;
	
	static void eleFind(String str) {
		LinkedList <String> li = new LinkedList<String> ();
		li.add("vamsi");
		li.add("Maveric");
		li.add("Systems");
		li.add("ltd");
		li.add("Chennai");
		li.add("tn");
		for(int i =0;i<li.size();i++) {
			if(li.get(i)==str) {
				a=a+1;
			}}
		if(a==1){
			System.out.println(li.get(j)+"\tis found");
			
		}
		else {
				System.out.println(li.get(j)+"\tis not found");
			}
		
		}
	static void dup() {
	LinkedList <String> li = new LinkedList<String> ();
	li.add("vamsi");
	li.add("Maveric");
	li.add("Systems");
	li.add("ltd");
	li.add("ltd");
	li.add("Chennai");
	li.add("tn");
	li.add("tn");
	for(int i =0;i<li.size();i++) {
	LinkedList <String> lj= (LinkedList<String>) li.clone();
		lj.remove(i);
		for(j=0;j<lj.size();j++) {
			if(li.get(i).equals(lj.get(j))) {
				System.out.println("J----->"+lj.get(j));
				a=a+1;
				System.out.println(a);
			}}}
		if(a!=0){
			System.out.println(li.get(j)+"\t--->duplicate is found");
			
		}
		else {
				System.out.println("duplicate isnot found");
			}
			
		//System.out.println("i----->"+li.get(i));
		//System.out.println("J----->"+lj.get(j));
	}
	static void reverseTrainer() {
		LinkedList <String> li = new LinkedList<String> ();
		li.add("vamsi");
		
		li.add("");
		li.add("");
		li.add("Maveric");
		li.add("Systems");
		li.add("ltd");
		li.add("Chennai");
		li.add("tn");
		
		System.out.println(li);
		Collections.sort(li,Collections.reverseOrder());
		Collections.reverse(li);
		System.out.println(li);
		//System.out.println("the count is "+Collections.frequency(li, "chennai") );
	}
	static void dupShort() {
		LinkedList <String> li = new LinkedList<String> ();
		li.add("vamsi");
		li.add("Maveric");
		li.add("Systems");
		li.add("ltd");
		li.add("ltd");
		li.add("Chennai");
		li.add("tn");
		li.add("tn");
		
		System.out.println(li);
		for(int i =0;i<li.size();i++) {
			j=Collections.frequency(li, li.get(i));
			
		if (j!=1) {
			System.out.println(li.get(i));
		}
	}}
	static Set<String> Hashset() {
		Set<String> li = new HashSet<String>();
		li.add(null);
		li.add("");
		li.add("Mourya");
		li.add("Maveric");
		li.add("Systems");
		li.add("Privateltd");
		li.add(null);
		li.add("ltd");
		li.add("Chennai");
		li.add("tn");
		System.out.println(li);
		return li;
	}
	static void LinkedHashSetEx() {
		Set<String> li = new LinkedHashSet<String>();
		li.add(null);
		li.add("");
		
		li.add("vamsi");
		li.add("Maveric");
		li.add("Systems");
		li.add("ltd");
		li.add(null);
		li.add("ltd");
		li.add("Chennai");
		li.add("tn");
		li.addAll(Hashset());
		System.out.println(li);
		//return li;
	}
	public static void main(String[] args) {
//		eleFind("vamsi");
//		dup();
//		reverseTrainer();
//		dupShort();
//	Hashset();
		LinkedHashSetEx();
		
	}

}
