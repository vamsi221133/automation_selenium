package classroomprctc;

import java.util.Scanner;

public class PrimeArrays {
		
	public static void main(String[] args) {
		   Scanner in = new Scanner (System.in);
		   System.out.println("Enter size of an array :\t");
		   int index = in.nextInt();
		 int[] array = new int [index];
		    System.out.println("Enter  "+index+"  elements of the array: ");
		    for(int i=0; i<index; i++)
		    {
		        array[i] = in.nextInt();
		    }
		   for(int i=0; i<array.length; i++){
		        boolean isPrime = true;
		        for (int j=2; j<array[i]/2; j++){

		            if(array[i]%j==0){
		                isPrime = false;
		                break;
		            }
		        }
		        if(isPrime)

		            System.out.println(array[i] + " is the prime number in the array ");
		     
		        else
		         System.out.println(array[i] + " is not a prime number in the array");
		   }  
		}
}
