
public class MainBankAccount {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.addToCheckingBalance(100);
		obj.addToSavingsBalance(50);
		obj.withdrawMoneyChecking(10);
		obj.display();
		System.out.println("Number of accounts: " +BankAccount.numOfBankAccounts);

		BankAccount ba = new BankAccount();
		ba.addToCheckingBalance(50);
		ba.addToSavingsBalance(50);
		ba.withdrawMoneyChecking(20);
		ba.display();
		System.out.println("Number of accounts: " +BankAccount.numOfBankAccounts);
	}

}
