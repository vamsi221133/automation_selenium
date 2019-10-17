package classroomprctc;

public interface Intrfac {
	String str ="vamsi";
	public void name();
	public void dept();
	public void dsgntn();
	default void myname() {
		System.out.println("vamsi krishna"+str);
	}
	

}
