package Encapsulation;

public class BankAccountObj {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount(123456, "John Smith", 1000.00);
		BankAccount account2 = new BankAccount(789012, "Jane Doe", 5000.00);
		BankAccount account3 = new BankAccount(345678, "Bob Johnson", 250.00);

		// Deposit some money into account1 and withdraw some money from account2
		account1.deposit(500.00);
		account2.withdraw(1000.00);

		
//		System.out.println(account1.balance);   // Cannot access this instance variable as it is private. 
	
		
		// Print the balances of all accounts
		System.out.println("Account 1 balance: $" + account1.getBalance());
		System.out.println("Account 2 balance: $" + account2.getBalance());
		System.out.println("Account 3 balance: $" + account3.getBalance());

//		Output:
//		Account 1 balance: $1500.0
//		Account 2 balance: $4000.0
//		Account 3 balance: $250.0
		
		
		
		account1.setAccountHolderName("Adam Miran");
		System.out.println(account1.getAccountHolderName());
		


	}

}
