
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private long checkingBalance;
	private long savingsBalance;
	public static int numOfBankAccounts = 0;
	private static long amountInEachAccount = 0;
	
	
	public BankAccount() {
		numOfBankAccounts++; 
		accountNumber = generateAccountNumber();
	}

	
	private String generateAccountNumber(){
        
        String str = new String("1234567890");
        accountNumber = new String();
        Random r = new Random();

        for (int i=1; i<=10; i++) {
            accountNumber += str.charAt(r.nextInt(str.length()));
        }
        return accountNumber;
	}

	
	//getters
	public long getCheckingBalance() { return checkingBalance; }
	public long getSavingsBalance() { return savingsBalance; }
	public String getAccountNumber() { return accountNumber; }
	public static int getNumOfBankAccounts() { return numOfBankAccounts; }
	public static long getAmountInEachAccount() { return amountInEachAccount; }

	
	//setters
	public static void setAmountInEachAccount(long amountInEachAccount) {
		BankAccount.amountInEachAccount = amountInEachAccount;
	}

	public void setCheckingBalance(long checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public void setSavingsBalance(long savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
	//adding money
	public void addToCheckingBalance(long checkingBalance) {
		this.setCheckingBalance(this.getCheckingBalance() + checkingBalance);
		setAmountInEachAccount(this.getCheckingBalance() + this.getSavingsBalance());
		System.out.println("\nDeposite money in account: " +this.getAccountNumber());
		System.out.println("Total balance in ckecking account: " +this.getCheckingBalance());
		System.out.println("Total amount in this account: " +BankAccount.getAmountInEachAccount());
	}

	public void addToSavingsBalance(long savingsBalance) {
		this.setSavingsBalance(this.getSavingsBalance() + savingsBalance);
		setAmountInEachAccount(this.getCheckingBalance() + this.getSavingsBalance());
		System.out.println("\nDeposite money in account: " +this.getAccountNumber());
		System.out.println("Total balance in saving account: " +this.getSavingsBalance());
		System.out.println("Total amount in this account: " +BankAccount.getAmountInEachAccount());
	}
	
	
	//money withdrawal
	public void withdrawMoneyChecking(long amount){
        if(this.getCheckingBalance() - amount < 0){
            System.out.println("\nNot sufficient funds");
        }
        else{
            this.setCheckingBalance(this.getCheckingBalance() - amount);
            setAmountInEachAccount(this.getCheckingBalance() + this.getSavingsBalance());
            System.out.println("\nWithdrawal made of " +amount);
            System.out.println("Balance left in checking account: " +this.getCheckingBalance());
        }
    }
	
	public void withdrawMoneySaving(long amount){
        if(this.getSavingsBalance() - amount < 0){
            System.out.println("\nNot sufficient funds");
        }
        else{
            this.setSavingsBalance(getSavingsBalance() - amount);
            setAmountInEachAccount(this.getCheckingBalance() + this.getSavingsBalance());
            System.out.println("\nWithdrawal made of " +amount);
            System.out.println("Balance left in savings account: " +this.getSavingsBalance());
        }
    }
	
	
	//display
	public void display() {
		System.out.println("\nAccount number: " +this.getAccountNumber());
		System.out.println("Checking account: " +this.getCheckingBalance());
		System.out.println("Saving account: " +this.getSavingsBalance());
		System.out.println("Total: " +BankAccount.getAmountInEachAccount());
	}
}
