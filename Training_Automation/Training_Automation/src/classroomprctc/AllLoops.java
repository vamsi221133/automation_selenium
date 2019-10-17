package classroomprctc;

public class AllLoops {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,88};
		if(a!=null) {
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			while(a[i]%2==0) {
				System.out.println(a[i]+"\t is even");
				break;
			}
			while(a[i]%2!=0) {
				System.out.println(a[i]+"\t is odd");
				break;
			}
		}
		}
		else {
			System.out.println("keep valid set ");
		}
	}
}
