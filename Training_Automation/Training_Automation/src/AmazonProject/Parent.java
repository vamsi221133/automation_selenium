package AmazonProject;

import java.util.Scanner;

 abstract class Parent {
	 
	 abstract void categeories();
	 void products()
	 {
		 System.out.println("The Followings are the available categeries...\n");
	 }
}
 class catgs extends Parent implements Prise{
	 
	 
	static int ctno =0,itno=0;
	 int a = 20000,b=60000,c=13000,d=14500,e = 7000,r=0;
	 Scanner sc = new Scanner(System.in);
	
	@Override
	void categeories() {
	
		System.out.println("1.mobiles\n2.watches\n3.shoes\n4.shirts\n5.jeens\n press which catogirey you want 1/2/3/4/5...");
		
		ctno = sc.nextInt();
		switch(ctno) {
		case 1 : System.out.println("the avilable mobiles are :\n");
					mobiles();break;
		case 2 : System.out.println("the avilable watches are :\n");
					watches();break;
		case 3 : System.out.println("the avilable shoes are :\n");
					shoes();
					break;
		case 4 : System.out.println("the avilable shirts are :\n");
					shirts();
					break;
		case 5 : System.out.println("the avilable jeens are :\n");
					jeens();
					break;
		default : System.out.println("please enter the valid input");
		}
		itno=sc.nextInt();
		switch(itno) {
		case 1 : mobilep();System.out.println("total Amount is "+(a*r));break;
		case 2 : mobilep();System.out.println("total Amount is "+(b*r));break;
		case 3 : mobilep();System.out.println("total Amount is "+(c*r));break;
		case 4 : mobilep();System.out.println("total Amount is "+(d*r));break;
		case 5 : mobilep();System.out.println("total Amount is "+(e*r));break;
		default : System.out.println("please enter the valid input");
		}
	}
	 
	 private void mobiles() {
		 System.out.println("top 5 mobiles :\n 1. redmi note 7 pro\t\t"+a+"\n2.infocus vission 3 pro\t\t"+b+"\n3.vivo v16 pro \t\t"+c+"\n4.coolpad cool 1\t\t"+d+"\n5.redmi 6 pro\t\t"+e+"\n choose any one...");
	 }
	 private void watches() {
		 System.out.println("top 5 watches :\n 1. model 1\t"+a+"\n2.model 2\t"+b+"\n3.model 3 \t"+c+"\n4.model 4\t"+d+"\n5.model 5\t"+e+"\n choose any one...");
		 	 
	 }
	 private void shoes() {
		 System.out.println("top 5 shoes :\n 1. model 1\t"+a+"\n2.model 2\t"+b+"\n3.model 3 \t"+c+"\n4.model 4\t"+d+"\n5.model 5\t"+e+"\n choose any one...");
		 	 
	 }
	 private void shirts() {
		 System.out.println("top 5 shirts :\n 1. model 1\t"+a+"\n2.model 2\t"+b+"\n3.model 3 \t"+c+"\n4.model 4\t"+d+"\n5.model 5\t"+e+"\n choose any one...");
		 	 
	 }
	 private void jeens() {
		 System.out.println("top 5 jeens :\n 1. model 1\t"+a+"\n2.model 2\t"+b+"\n3.model 3 \t"+c+"\n4.model 4\t"+d+"\n5.model 5\t"+e+"\n choose any one...");
		 	 
	 }
	@Override
	public void mobilep() {
		System.out.println("how many items you want...!");
		r = sc.nextInt();
	}	
	void products()
	 {
		 System.out.println("thank you for running my proram.. :)");
	 }
}

