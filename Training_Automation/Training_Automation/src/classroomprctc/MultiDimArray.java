package classroomprctc;

import java.util.Scanner;

public class MultiDimArray {
	int k ;
	public void reverseString() {
		String[][] str= {{"v","a","m","s","i"}};
		for(int i =0 ;i<5;i++) {
			//System.out.println(str.length);
			//System.out.println(str[0][i]);
			//String ele = str[0][i];
			for(int k = 4;k>=0;k--) {
				
				//char rev =ele.charAt(k);
				//System.out.println(ele.charAt(k));
				System.out.println("reverse string is "+str[0][k]);
				
			}
		}
	}
	
	public void MdAprime() {
		int x[][] = {{11,66,11},{45,57,86},{9,11,22}};
		int s=1;
		boolean istrue = false;

	 for (int i =0;i<3;i++) {
	        for(int j=0;j<3;j++) {
	          //System.out.println(x[i][j]);
	          int sam = x[i][j];
	          //System.out.println(sam);
	          
	          {for(int k=2;k<sam/2;k++)
	      	{
	      			//System.out.println(sam);
	      		if(sam%k==0 ) {
	      			istrue = true;
	      			//k =10;
	      			break;
	      		}}
	      		}
	      		if(!istrue)
	      		//if(k!=10)
	      		{
	      			System.out.println(sam+"\tis  a prime number");
	      		}
	      		else
	      		{
	      			System.out.println(sam+"\tgiven number is not prime number");
	      		}
	      		/*for(int k = 2;i<sam;i++) {
        		
		           if(sam %i== 0) {
		  			 s =s+1;
		  		 }}
		        	if(s==1) {System.out.println(sam+"is prime");}
		           else {
		        	   System.out.println(sam+"is not prime");
		         */ } 
	        	}
	        }
	public void MdAoddEven2() {
		int x[][] = new int[3][2];
		x[0][0] = 1;
		x[0][1] = 2;
		x[1][0] = 3;
		x[1][1] = 4;
		x[2][0] = 5;
		x[2][1] = 6;
		 for (int[] innerArray: x) {
		        for(int data: innerArray) {
		          // System.out.println(data);
		           if(data %2== 0) {
		  			 System.out.println(data+"is even");
		  		 }
		           else {
		        	   System.out.println(data+"is odd");
		           }
		        }
		     }
		 
	}
	
	public void VSampleM() {
		int x[][] = new int[3][2];
		x[0][0] = 1;
		x[0][1] = 2;
		x[1][0] = 3;
		x[1][1] = 4;
		x[2][0] = 5;
		x[2][1] = 6;
		for(int i = 0;i<3;i++)
			for(int j =0;j<2;j++) {
				System.out.println(x[i][j]);
			}
		/*for (int[] innerArray: x) {
	        for(int data: innerArray) {
	           System.out.println(data);
	        }
	     }*/
		
	}
	public void sampleMArray() {
		int twoDimenArray[][]= new int[3][5]; 
		int i, j, k = 0; 
		for(i=0; i<3; i++) 
		for(j=0; j<5; j++){ 
		twoDimenArray[i][j] = k; 
		k++; 
		} 
		for(i=0; i<3; i++){ 
			for(j=0; j<5; j++){
				System.out.print(twoDimenArray[i][j]+ " " );
			}
		System.out.println(); 
		} 
	}
	public void MArrayScanner1() {
		int i,j,i1,i2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows for dimentional array :");
		 i1 = sc.nextInt();
		System.out.println("enter number of columns for dimentional array :");
		i2 = sc.nextInt();
	int a[][]=new int [10][10];
	System.out.println("enter  "+(i1 * i2)+"  elements");
	 for( i=0; i<i1; i++)
	 { for(j =0 ;j<i2;j++)
	    {
	        a[i][j] = sc.nextInt();
	    }
	} System.out.print("The Array is :\n");
    for(i=0; i<i1; i++)
    {
        for(j=0; j<i2; j++)
        {
            System.out.print(a[i][j]+ "  ");
        }
        System.out.println();
    }
	
	}

	public static void main(String[] args) {
		MultiDimArray ob = new MultiDimArray();
		//ob.sampleMArray();
		//ob.VSampleM();
		//ob.MdAoddEven2();
		//ob.MdAprime();
		//ob.MArrayScanner1();
		ob.reverseString();
		
	}

	}


