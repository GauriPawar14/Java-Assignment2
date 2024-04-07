package assignment;

public class Account {
	
	 String accNo;
		double bal;

		
		public Account(String accNo) {
			
			this.accNo = accNo;
			bal=0;
			
		}
		public void openAccount()
		{
			System.out.println("Open Account");
		}
		public void deposite(double amt)
		{
			bal= bal+amt;
		}

		public void withdraw(double amt)
		{
			if(bal>amt)
			{
			bal= bal-amt;
			}
			else
			{
				System.out.println("Insuffiecient balance");
			}
		}
		
		public void printAccountDetails()
		{
			System.out.println("Account No" +accNo) ;
			System.out.println("Balance "+bal); 
			
			
		}

}
