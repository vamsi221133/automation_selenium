package classroomprctc;

public class WhileLoop {
	public static void main(String[] args) {
		
	int i;
		for (i=0;i<10;i++) {
		while(i<=5) {
				System.out.println("loop exicuted upto"+i);
				break;
			}
				
				
		}
		int j = 1;
		while(j<=10) {
			System.out.println("mourya"+j);	
			j++;
			
		}
		int k=0;
		do {
			k++;
			System.out.println("vamsi"+k);
			
		}while(k<10);
		int s=0;
		
		String[] str = {"vamsi","manju","mourya"};
		while(str[0]!=null) {
			System.out.println("print"+str[0]);
			break;
		}
		while(s<str.length) {
			
			System.out.println(str[s]);
			s++;
		}
	}
	{
	int[] arr = {1,2,3,4,5,8,7,8};
	
	for(int o=0;o<arr.length;o++)
	{
		while(arr[o]%2==0)
		{
			System.out.println(arr[o]+"is even");
			break;
		}
		while(arr[o]%2!=0)
		{
			System.out.println(arr[o]+"is odd");
			break;
		}
	}
	}}

