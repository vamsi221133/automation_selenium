package classroomprctc;

public class CondetionlaStatement {
	private static CondetionlaStatement vam;
	public static CondetionlaStatement getInsta() {
		if(vam == null) {
			vam = new CondetionlaStatement();
		}
		return vam;// TODO Auto-generated method stub
		//return null;
	}
	public void mymethod(int x)
	{
		if(x > 18)
		{
			System.out.println("you are eligble for vote");
		}
		else 
		{
			System.out.println("you are not eligble for vote");
		}
	}
	
	public void mymethod1(String x , String y) 
{
		if(x.equals("java") && y.equals("selenium")) {
			System.out.println(x+" is passed  and "+y+"is passed");
		}
		else
		{
			{
			if(x.equals("java") )
			{
			System.out.println("x is passed");
			}
			else System.out.println("x is failed");
			}	
			if(y.equals("selenium"))
			System.out.println("y is passed");
			else
				System.out.println("y is failed'");
			}
	}
	public void swithEx(String casename) {
		switch(casename) {
		case ("4112") : System.out.println("emloyee name  is vamsi");
						break;
		case ("4111") : System.out.println("emloyee name  is krishna");
						break;
		case("4000") : System.out.println("emp name is mourya");break;
		case("3211") : System.out.println("emp name is sam");break;
		 default : System.out.println("please enter valid empid");
		}
		
	}
}

