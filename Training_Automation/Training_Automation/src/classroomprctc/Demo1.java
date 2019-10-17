package classroomprctc;

public class Demo1 {
	
	public static int a = 20;
	public static int b = 40;
	
	

	public void add(){
		
		int a= 10;
		int b = 20;
		int x=a+b;
		subadd();
		System.out.println(x);
	}
	public void mult(int a ,int b) {
		int x = a*b;
		sam();
		System.out.println(x);
		
	}
	private void sam() {
		
		System.out.print("multiplication is\t");
	}
	
	private void subadd() {
		System.out.print("addition is\t");
		
	}
}
