
public class BankAccount {
	private String ownerName;
	private int accountNumber;
	private int balance;
	private double rate;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate() {
this.rate=rate;
	}

	public BankAccount() {
	}

	public BankAccount(String n, int a, int b, double r) {
		ownerName = n;
		accountNumber = a;
		balance = b;
		rate = r;
	}
}
