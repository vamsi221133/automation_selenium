package classroomprctc;

class base{
	int a =10;
	public void basemethod() {
		System.out.println("base calss");
	}
}

public class InheritanceEx extends base {
	int b = 15;
	public void chailmethod() {
		System.out.println("chaild method");
	}
public static void main(String args[]) {
	InheritanceEx obj = new InheritanceEx();//normal obj creation for chaild class
	obj.basemethod();
	base obj1 = new base();//normal obj creation for parant class
	obj1.basemethod();
	System.out.println(obj1.a);
	base upcasting = new InheritanceEx();//upcastion
	System.out.println(upcasting.a);
	
	InheritanceEx downcasting =  (InheritanceEx) upcasting;//downcasting
	downcasting.chailmethod();
}
}
