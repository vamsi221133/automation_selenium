package classroomprctc;

public class IfPrac {

	
		public void ifloop(String name)
		{
			if(name.matches("vamsi")) {
				System.out.println("test assosiate");
			}
			
		}
		public void nestedif(int age) {
			if(age > 18) {
				if(age>60) {
					System.out.println("sener citizen");
				}
				else {
					System.out.println("eligible citizen");
				}
			}
			else {
				System.out.println("you are miner");
			}
		}
		public void switchcase(String ope) {
			switch(ope) {
			case "+" : System.out.println("addition");break;
			case "*" : System.out.println("multiplication");break;
			case "/" : System.out.println("devide");break;
			default : System.out.println("enter valid input");
			
			}
	}
}

