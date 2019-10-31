package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {
	

	public static void main(String[] args) {
		treesetInt();
		treesetString();
		treeset();
	}

	static  TreeSet treesetInt() {
		TreeSet ts = new TreeSet();
		ts.add(2);
		ts.add(6);
		ts.add(99);
		ts.add(4);
		ts.add(-6);
		ts.add(88);
		System.out.println(ts);
		return ts;
	}
static void treeset() {
		
		TreeSet ts = new TreeSet();
		ts.add("d");
		ts.add("h");
		ts.add("e");
		ts.add("D");
		ts.add("yytr");
		ts.add("a");
		System.out.println(ts);
	}
	static void treesetString() {
		
		TreeSet ts = new TreeSet(new mycompare());
		ts.add("d");
		ts.add("h");
		ts.add("e");
		ts.add("D");
		ts.add("yytr");
		ts.add("a");
		System.out.println(ts);
	}}
	class mycompare implements Comparator{@Override
		public int compare(Object o1, Object o2) {
			String s1 =(String) o1;
			String s2 = (String) o2;
			return s2.compareTo(s1);
		}
}


