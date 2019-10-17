package classroomprctc;

public class PolymorphismEXMain extends PolymorphismEX{

	
		public void method_overload(int a,int b) {
			int k= 10;
			System.out.println("method ");
			System.out.println("int a and b"+a+b+k);
		}
		public void method(int a,int b) {
			int k= 10;
			System.out.println("method "+k);	
		}
public static void main(String[] args) {
	PolymorphismEXMain oo = new PolymorphismEXMain();
	//oo.method_overload(8, 6);
	oo.method_overload(10, 5);	
	
}
}