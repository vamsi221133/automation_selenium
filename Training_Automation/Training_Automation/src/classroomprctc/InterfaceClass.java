package classroomprctc;

public class InterfaceClass implements Intrfac1,Intrfac {

	
	@Override
	public void inf1() {
		System.out.println("inf1");
		
	}

	@Override
	public void dept() {
		// TODO Auto-generated method stub
		System.out.println("dept");
		
	}

	@Override
	public void dsgntn() {
		// TODO Auto-generated method stub
		System.out.println("dsgntn");
		
	}
	public static void main(String[] args) {
		Intrfac o1 = new InterfaceClass();
		o1.dept();
		o1.dsgntn();
		o1.name();
		o1.myname();
		Intrfac1 o2 = new InterfaceClass();
		o2.name();
		o2.myname();
	}


}
