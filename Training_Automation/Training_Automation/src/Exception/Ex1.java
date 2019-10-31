package Exception;

public class Ex1 {
	static int c ;

	public static void main(String[] args) {
		System.out.println("main method");
		//mymethod();
		//arr();
		try1();

	}/*
	static void mymethod() {
		System.out.println("mymethod ");
		mymethod1();
	}
	static void mymethod1() {
		System.out.println("mymethod1");
		mymethod2();
	}
	static void mymethod2() {
		try {
		int a =38;
		int b=0;
	 c = a/b;
	System.out.println(c);
	}
		catch(ArithmeticException e) {
			e.printStackTrace();
			//this.c = c;
			System.out.println(c);
		}
	}
	static void arr() {
		int[] a = new int[3];int i=0;
		try {a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		}
		catch(ArrayIndexOutOfBoundsException v) {
			v.printStackTrace();
			for(i=0;i<a.length;i++) {
				System.out.println("array elements are"+a[i]);
			}
			//System.out.println(a[i]);
		}
	}*/
	static void try1() {
		int[] a = new int[3];int i=0;
//	try {a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		a[4] = 5;
	try {
		int a1 =38;
		int b=0;
		c = a1/b;
		System.out.println(c);
	}
	
		catch(Exception e) {
			//e.printStackTrace();
			//this.c = c;
			//System.out.println(c);
			System.out.println("check your arthamatic operation");
		}}
//		catch(ArrayIndexOutOfBoundsException v) {
//			v.printStackTrace();
//			for(i=0;i<a.length;i++) {
//				System.out.println("array elements are"+a[i]);
//			}
			//System.out.println(a[i]);
		//}

		
//	}
	
}
