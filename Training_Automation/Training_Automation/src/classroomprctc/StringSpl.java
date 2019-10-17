package classroomprctc;

public class StringSpl {
	String s1 = "vamsi";
	String s2 = "vamsi";
	String s3 = new String("vamsi");
	String s4 = new String("vamsi");
	String s7 = "maveric||Systems||ltd";
	
	
	/*public void SCompare() {
		System.out.println(s2==s1);
	}
	public void SCompare1() {
		System.out.println(s1.compareTo(s4));
	}
	public void SCompare2() {
		System.out.println(s2.contentEquals(s4));
	}
	public void SCompare3() {
		System.out.println(s1.endsWith(s4));
	}
	public void SCompare4() {
		System.out.println(s3.equals(s4));
	}
	public void SCompare5() {
		System.out.println(s3.replaceAll(s4, s1));
	}*/
public static void main(String[] args) {
	//StringSpl obj = new StringSpl();
	//obj.SCompare();
	//obj.SCompare1();
	//obj.SCompare2();
	//obj.SCompare3();
	//obj.SCompare4();
	//obj.SCompare5();
	String str = "Maveric_systems_ltd";
	String s7 = "maveric//Systems//ltd";
	
	   char[] reverse = str.toCharArray();
   System.out.println(reverse.length);
    for(int i=reverse.length-1;i>=0;i--) {
    	//System.out.println(i);
    	System.out.print(reverse[i]);
    	
    }
   String[] s8 = s7.split("//");
   System.out.println("\n"+s8[0]);
   System.out.println(s8[1]);
   System.out.println(s8[2]);
   
}
}
