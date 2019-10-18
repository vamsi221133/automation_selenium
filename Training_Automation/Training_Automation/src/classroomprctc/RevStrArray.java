package classroomprctc;

public class RevStrArray {
	
	 static String rev = "";
	 public static void reverse(String[] ar) {
	 for(int i=0;i<ar.length;i++) {
		 {
			 String ele = ar[i];
			 for(int j=ele.length()-1;j>=0;j--) {
				 rev = rev+ele.charAt(j);
			 }System.out.println(rev);
			 rev = "";
		 }	 }	 }
	public static void main(String[] args) {
		reverse(new String[] {"vamsi","krishna","arava"});
	}

}
