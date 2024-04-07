package assignment;

public class TestAccount {
	
	public static void main(String[] args) {
		savingAccount sa =new savingAccount("SA2024", 0.5);
		sa.printAccountDetails();
		
		sa.deposite(5000);
		
		sa.addInterset();
		sa.printAccountDetails();
		
		System.out.println("========================================");
		Housingloan hl = new Housingloan("HL2023", 5000, 10);
		hl.payEMI(1500);
		hl.extendTenure(10);
	
	}

}
