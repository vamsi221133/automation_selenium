package trails;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any year\t");
		int year = sc.nextInt();
		boolean isleap = false;
		if(year % 4 == 0)
		{
			isleap = true;
		}
		else {
			isleap = false;
		}
		if(isleap = true) {
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+"is not a leap year");
		}

	}

}
