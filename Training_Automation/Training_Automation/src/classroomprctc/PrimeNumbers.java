package classroomprctc;

import java.util.Scanner;

public class PrimeNumbers {
	/*	
	public static  boolean find_prime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {return false;}
		}return true;
		
	}*/
//another way
	public static void main(String[] args) {
	System.out.println("enter any number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean istrue = false;
		//int k = 0;
		for(int i=2;i<num;i++)
	{
			System.out.println(i);
		if(num%i==0 ) {
			istrue = true;
			//k =10;
			break;
		}
		}
		if(!istrue)
		//if(k!=10)
		{
			System.out.println(num+"\tis  a prime number");
		}
		else
		{
			System.out.println(num+"\tgiven number is not prime number");
		}
		/*PrimeNumbers oo = new PrimeNumbers();
		System.out.println(oo.find_prime(17));*/
	}
	
}
