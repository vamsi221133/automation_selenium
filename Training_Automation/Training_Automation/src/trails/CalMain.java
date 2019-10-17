package trails;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cal c = new Cal();
		c.calc();
		//System.out.println("do you want to continue ? \npress 1 fi yes\npress 2 of no");
		int k = sc.nextInt();
		
		if ( k == 1) {
			c.calc();
			if ( k == 1) {
				c.calc();
				}
			}
		else 
		{
				System.out.println("thank you");
			}

	}

}
