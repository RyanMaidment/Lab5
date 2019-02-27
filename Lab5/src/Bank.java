
public class Bank {

	private static BankAccount [] accounts;
	private static int numAccounts = 0;
	private int sizeBank = 100;
	
	public Bank () {
	
	}
	public Bank () {
		
	}
	public boolean addAccount() {
		if (numAccounts >= sizeBank) {
			//TODO error msg no room.
		}
		return false;
		
		System.out.println("Would you like to open a chequing or savings account? ");
		//TODO if statment.
		accounts[numAccounts] = new SavingsAccount();
		
		/*else*/ accounts[numAccounts] = new ChequingAccount();
		
		if (accounts[numAccounts].addBankAccount()) {
			numAccounts++;
		}
		else  System.out.println("Account not added");
	}
	public String displayAccount() {
		
	}
	public void printAccountDetails() {
		
	}
	public void updateAccount() {
		
	}
}
