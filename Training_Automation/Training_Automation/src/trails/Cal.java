package trails;

import java.util.Scanner;

public class Cal {

	public void calc(){
		Scanner sc = new Scanner(System.in);{
	System.out.print("enter a value  :");
		
		int a = sc.nextInt();
		System.out.print("enter b value  :");
		int b =sc .nextInt();
		System.out.print("enter arthamatic operation  :");
		String s = sc.next();
		switch(s)
		{
		case "+" : int add = a+b;System.out.println(a+"+"+b+"="+add);
				break;
		case "-" : int sup = a-b;System.out.println(a+"-"+b+"="+sup);
		break;
		case "*" : int mult = a*b;System.out.println(a+"*"+b+"="+mult);
		break;
		case "/" : double devide = a/b;System.out.println(a+"/"+b+"="+devide);
		break;
		case "%" : int per = a%b;System.out.println(a+"%"+b+"="+per);
		break;
		}
		System.out.println("do you want to continue ? \npress 1 fi yes\npress 2 of no");		
	}		
}
}

	


