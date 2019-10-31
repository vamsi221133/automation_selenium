package classroomprctc;

public class SingletTonClass {
	private static SingletTonClass obj;
	private SingletTonClass()
	{
		System.out.println("object created");
	}
	public static  SingletTonClass getInstance()
	{
		if(obj == null)
		{
			obj = new SingletTonClass();
		}
		return obj;
	}
	public void method() {
		System.out.println("welcome to auto");
		
	}
	public void method1() {
		System.out.println("method 1");
	}
public void method2() {
	System.out.println("method2");
}
public  void method3() {
	
	System.out.println("method3");
}
}
