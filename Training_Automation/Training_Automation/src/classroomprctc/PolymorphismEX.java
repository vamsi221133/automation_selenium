package classroomprctc;

public class PolymorphismEX {
	public void method_overload(int a) {
		System.out.println("int a"+a);
	}
	public void method_overload(int a,int b) {
		System.out.println("int a and b"+a+b);
	}
	public void method_overload(int a,int b,int c) {
		System.out.println("int a and b and c"+a+b+c);
	}
	public void method_overload(int a,int b , String b1) {
		System.out.println("int a and b and String b1"+a+b1+b1);
	}
	
}
