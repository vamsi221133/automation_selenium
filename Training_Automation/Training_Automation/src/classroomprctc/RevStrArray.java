package classroomprctc;

public class RevStrArray {
	public void duplicates() {
		String a = "aaaiieekkllss";
		char[] c =a.toCharArray();
		//int count=0;
		for(int i =0;i<a.length();i++) {
			for(int j =i+1;j<a.length();j++) {
				
				if (c[i]==c[j])
				  {
				   System.out.print(c[j]);
				 //  count++;
				   break;
				  }
			}
		}
	}
	 static String rev = "";
	 public static void reverse(String[] ar) {
		 
	 for(int i=0;i<ar.length;i++) 
	 {
		 {
			 String ele = ar[i];
			 for(int j=ele.length()-1;j>=0;j--) 
			 {
				rev = rev+ele.charAt(j);
			 }
			 System.out.println(rev);
			 rev = "";
		 }	 
		 }
	 }
	public static void main(String[] args) {
		//reverse(new String[] {"vamsi","krishna","arava"});
		RevStrArray ss =new RevStrArray();
		ss.duplicates();
	}

}
