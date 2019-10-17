package classroomprctc;

public class Encapsul {
	private int acc_number;
	private String acc_name;
	private String acc_balance;
	/*public String getAccNumber() {
		return acc_number;
	}
	public void setAccNumber(int acc_number) {
		this.acc_name = acc_number+"HDFC bank";
	}*/
	public int getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getAcc_balance() {
		if(acc_number == 123456789)
		{
			acc_balance = "5000";
		}
		else
		{
			acc_balance = "0";
		}
		return acc_balance;
	}
	public String getAcc_balance(int acc) {
		String bal = getAcc_balance(acc);
		return bal;
		
	}
	
	

}
