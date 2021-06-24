package fullstackdev.development;

import java.util.Scanner;

import org.omg.CORBA.TRANSACTION_MODE;

public class BankProject {

	private int accountNumber;
	private int balance;
	private String customerName;
	private  int lastTransaction;

	public BankProject(int accountNumber, String customerName) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
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

	void deposit(int transactionAmount) {

		if (transactionAmount != 0) {
			balance = balance + transactionAmount;
			lastTransaction = transactionAmount;
		}
	}

	void withdraw(int transactionAmount) {
		if (transactionAmount != 0 && transactionAmount > 0 && transactionAmount < balance) {
			balance = balance - transactionAmount;
			lastTransaction = -transactionAmount;
		}else {
			System.out.println("Your balance is low");
		}
	}

	void getLastTransaction() {
		if (lastTransaction > 0) {
			System.out.println("Deposited: " + lastTransaction);
		} else if (lastTransaction < 0) {
			System.out.println("Deposited: " + -1 * (lastTransaction));
		} else {
			System.out.println("No transaction occured");
		}
	}

	void showMenu() {

		char ch = '\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome " + customerName);
		System.out.println("Your Id: " + accountNumber + "\n");
		System.out.println("A.Check balance..");
		System.out.println("B.Deposit....");
		System.out.println("C.Withdraw....");
		System.out.println("D.previous Transaction...");
		System.out.println("E. Exit...");

		do {

			System.out.println("Enter the option: ");
			ch = sc.next().charAt(0);
			switch (ch) {
			case 'A':
				System.out.println("Balance: " + getBalance());
				break;

			case 'B':
				System.out.println("Enter amount to deposit");
				int amount = sc.nextInt();
				deposit(amount);

				break;
			case 'C':
				System.out.println("Enter amount to withdraw");
				int withdraw = sc.nextInt();
				withdraw(withdraw);

				break;
			case 'D':
				System.out.println("------------------------------");
				getLastTransaction();
				System.out.println("------------------------------");
				break;
			case 'E':
				System.out.println("-------------EXIT OPTION----------------");
				break;
			default:
				System.out.println("Enter valid option");
				break;
			}
		} while (ch != 'E');

	}

	void balanceDisplay() {

	}

	public static void main(String[] args) {

		BankProject bp= new BankProject(123456, "joe");
		bp.showMenu();
	}

}
