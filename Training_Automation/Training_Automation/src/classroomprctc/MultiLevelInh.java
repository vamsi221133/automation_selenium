package classroomprctc;

class superparent{
	int sp = 5;
	String spa= "super";
	public  void supermethod(){
		System.out.println("super parent class...............");
	}
}
class abc extends superparent{
	int sp = 5;
	String spa= "super";
	public  void method(){
		System.out.println("super parent class");
		abc oooo = new abc();
		oooo.supermethod();
	}
}
class parent extends superparent{
	String par = "parent";
	public void parentmethod() {
		System.out.println("parent class");
		parent ob = new parent();
		ob.supermethod();
		superparent sup = new superparent();
		System.out.println(sup.spa);
	}
}
public class MultiLevelInh extends parent {
	String child = "child";
	
	public void chaildmethod() {
	 System.out.println("chaild class");
	 
	}
	public static void main(String args[]) {
		
	 abc ne = new abc();
	 ne.method();
	 
	 MultiLevelInh obj = new MultiLevelInh();
	 
	 obj.chaildmethod();
	 obj.supermethod();
	 obj.parentmethod();
	 parent ob = new MultiLevelInh();
	 ob.parentmethod();
	}
}