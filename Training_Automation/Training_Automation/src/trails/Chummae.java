package trails;

import java.util.Scanner;

public class Chummae {
	
	public void prime() {
		int[] a = {6,7,8,9,44};
			int s = 10;
			int num = a.length;
			for(int i=0;i<num;i++)
			{
				int n = a[i];
				System.out.println(n);
				for(int j=2;j<n;j++) {
					
				if(n%j==0 ) {
					s = s+1;
					break;
				}
				}
				if(s==10)
				{
					System.out.println(n+"\tis  a prime number");
					
				}
				else
				{
					System.out.println(n+"\tgiven number is not prime number");
					
				}
			}
	}
	public void trail() {
		   {
		       int row, col, i, j;
		       int arr[][] = new int[10][10];
		       Scanner scan = new Scanner(System.in);
			   
		       System.out.print("Enter Number of Row for Array (max 10) : ");
		       row = scan.nextInt();
		       System.out.print("Enter Number of Column for Array (max 10) : ");
		       col = scan.nextInt();
			   
		       System.out.print("Enter " +(row*col)+ " Array Elements : ");
		       for(i=0; i<row; i++)
		       {
		           for(j=0; j<col; j++)
		           {
		               arr[i][j] = scan.nextInt();
		           }
		       }
			   
		       System.out.print("The Array is :\n");
		       for(i=0; i<row; i++)
		       {
		           for(j=0; j<col; j++)
		           {
		               System.out.print(arr[i][j]+ "  ");
		           }
		           System.out.println();
		       }
		   }
		}
	

	public static void main(String[] args) {
		
		Chummae ob = new Chummae();
		ob.trail();
	}
	
}
