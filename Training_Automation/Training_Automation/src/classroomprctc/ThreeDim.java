package classroomprctc;

public class ThreeDim {
	static String rev = "";
	static String  arr[][][] = {{{"vamsi","kishna"},{"arava"}},{{"test","assosiate"},{"chenai"}}};
	public void ForEach() {
		for(String[][] a:arr) {
			for(String [] e :a) {
				for(String s :e) {
					
					for(int l=s.length()-1;l>=0;l--) {
						rev = rev+s.charAt(l);
					}
					System.out.println(rev);
					rev="";
				}
			}
			
		}
	}
	public void chumma() {
		for (int i=100;i>=0;i--) {
			System.out.println(i);
		}
	}
		public void ReverseString3D() {
		//String  a[][][] = {{{"vamsi","kishna"},{"arava"}},{{"test","assosiate"},{"chenai"}}};
				String [][][] a = new String[1][2][3];
				a[0][0][0]="vamsi  ";
				a[0][0][1]="krishna  ";
				a[0][0][2]="arava  ";
				a[0][1][0]="manju  ";
				a[0][1][1]="mourya  ";
				a[0][1][2]="sam  ";
				System.out.println(a.length);
				for(int i=0;i<a.length;i++)
				{
					for (int j=0;j<a.length+1;j++)
					{
						for (int k=0;k<a.length+2;k++) 
						{
							String data = a[i][j][k];
							//System.out.println(data.length());
							for(int l =data.length()-1;l>=0;l--) 
							{
								rev = rev+data.charAt(l);
							}
						}
					}System.out.println(rev+"");
				}
	}
	public static void main(String[] args) {
		ThreeDim o = new ThreeDim();
		//o.chumma();
		o.ReverseString3D();
	}
}
