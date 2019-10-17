package classroomprctc;

public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsul obb = new Encapsul();
		obb.setAcc_name("vamsikrishna");
		obb.setAcc_number(123456789);
		System.out.println(obb.getAcc_name());
		System.out.println(obb.getAcc_number());
		System.out.println(obb.getAcc_balance());
	}
}
