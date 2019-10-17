package classroomprctc;
//not correct
public class CharEX {
		static char ch = 'k';
		char cr = 'k';
		 Character ch1 = new Character(ch);
		 Character ch2 = new Character(cr);
		 
		public boolean istrue() {
			 if(ch1.equals(ch2)) {
			return true;
			 }
			 else 
				 {
				 return false;
				 }}
	public static void main(String[] args) {
		 
		CharEX obb = new CharEX();
		
		System.out.println(obb.istrue());
	}

}
