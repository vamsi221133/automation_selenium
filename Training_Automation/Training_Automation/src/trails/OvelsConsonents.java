package trails;

import java.util.Scanner;

public class OvelsConsonents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an alphabet");
		char alfa = sc.next().charAt(0);
		boolean istrue = false;
		switch(alfa)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : istrue = true;			
		}
		if(istrue == true) {
			System.out.println(alfa+"\t is vowel");
		}
		else {
			if((alfa>='a'&& alfa<='z') || (alfa>='A'&& alfa<='Z'))
		System.out.println(alfa+"\tis consonent");
			else
				System.out.println("given value not an string or charecter");
		}
	}

}
