package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creting a new bankaccount >>

		BankAccount acc1 = new  BankAccount(); 
		
		BankAccount acc2 = new  BankAccount("Checking Account");
		
		BankAccount acc3 = new  BankAccount("Savings Account", 5000);
	}

}
