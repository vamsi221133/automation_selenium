package AmazonProject;

public class MainMtd extends catgs{

	public static void main(String[] args) {
		
		catgs objj=new IDname();
		IDname obj=(IDname) objj;
		
		obj.setId(4098);
		int idd=obj.getId();
		if(idd==4098)
		{
			obj.setUsername("Babu");
			String name=obj.getUsername();
			if(name=="Babu")
			{
				catgs obb = new catgs();
				obb.categeories();
//				((catgs) obb).setId(4098);
//				
				catgs obb1 = new MainMtd();
				//obb1.categeories();//upcasting
				obb1.products();
			}
				
		}
		else
		{
			System.out.println("Invalid username or password");
		}
		
		
		
		

	}

}
