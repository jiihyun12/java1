package synchtonizedTest;

public class CU {
	public static void main(String[] args) {
		
	ATM atm = new ATM();
	
	Thread jh = new Thread(atm, "지현");
	Thread gd = new Thread(atm, "길동");
	
	jh.start();
	gd.start();
	

	
	}

}
