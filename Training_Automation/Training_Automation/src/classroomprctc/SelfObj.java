package classroomprctc;

public class SelfObj {
	private static SelfObj obj;
	/*private SelfObj()
	{
		System.out.println("object created");
	}*/
	public static SelfObj getInstance()
	{
		if(obj == null)
		{
			obj = new SelfObj();
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
public void method3() {
	
	System.out.println("method3");
}
}
