package classroomprctc;

public class ArrayEx {
	int size;
	int v = 10;
	public void sumArray(){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = {9,2,7,6,5,4,3,2,1};
		int[] d =new int[10];
		for(int i = 0;i<a.length;i++) {
			d[i]= a[i]+b[i];
			System.out.println(a[i]+"+"+b[i]+"  =  "+d[i]);
		}
	}
	public void calculateEven() {
		int[] a = {1,2,3,4,5,6,7,8,9};
		size = a.length;
		System.out.println(size);
			for(int i=0;i<=size+1;i++) 
			{
				//System.out.println(a[i]);
				if(a[i]<2) {
					System.out.println(a[i]+"is prime");
				}
			for(int j = 2;j<a[i];j++) {
			if(a[i]%j==0)
			{
				v = v+1;
			}
			}
			if(v==10) {
				System.out.println(a[i]+"is prime");	
				
			}
			else {
				System.out.println(a[i]+"is  not prime");
			}
			}
		
	}
	public void sampleArray() {
		int[] b = new int[5];
		b[0] = 11;
		b[1] = 12;
		b[2] = 13;
		System.out.println(b[1]);
		
		//int[] a = {1,2,3,4,5,6,7,8,8,9};
		String[] str = {"v","a","m","s","i"} ;
	
		
		
		int i =0;
		System.out.println(str.length);
		while(i<=str.length) {
			System.out.print(str[i]);
			i++;
			}
		String[] strArray2 = {"A","B","C"}; 
		for (int f = 0; f< str.length; f++) {
			System.out.print(str[f]);
		//ArrayEx o = new ArrayEx();
		//o.calculateeven();
	}
	}
	public static void main(String[] args) {
		
		ArrayEx o = new ArrayEx();
		o.sumArray();
		
	}
}

