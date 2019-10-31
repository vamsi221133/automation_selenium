package classroomprctc;

public class loops {
	
	public void testing() {
		String[] n = {"vamsi","manju","mourya"};
		int[] v = {1,2,3,4,5,6};
		/*for(int i = 0;i<5;i++)
		{
			System.out.println("numbers are "+i);
		}
		for(int i = 0;i<v.length;i++)
		{
			System.out.println("numbers are... "+i);
		}
		for(int i = 0;i<n.length;i++)
		{
			System.out.println("numbers are........ "+i);
		}
		for(String va : n) {
			System.out.println("string are\t"+va);
	}
	for(int ve : v) {
		System.out.println("string are\t"+ve);
	}
	*/aa:for(int i =0;i<5;i++) {
		System.out.println("the i value is"+i);
		bb:for(int j =0;j<5;j++) {
		if(i==4&&j==4) {
			System.out.println("j values are "+j);
			break bb;
		}
		}
		continue;
	}
		
}
	public static void main(String[] args) {
	loops lo = new loops();
	lo.testing();
	
}

}
