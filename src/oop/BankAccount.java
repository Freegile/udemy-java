package oop;

public class BankAccount {
	String accountNumber;
	
	// static >> belong to the CLASS not the object
	// final >> constant often final
	static final String routingNumber = "01234";
	String name;
	String ssn;
	String accountType;
	
	// Constructor definitions: unique methods
	// 1. They are used to define / setup / initialize properties of a object
	// 2. Constructors are IMPLICITLY called upon INISTANTIATION
	// 3. The same name as the class itself
	// 4. Constructors have NO return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");	
	}
	
	// Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
		this.accountType = accountType; 
	}
	
	BankAccount(String accountType, double initDeposit){ 
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);
		this.accountType = accountType; 
	}
	
	// Define methods
	void deposit(){}
	
	void withDraw(){}
	
	void checkBalance(){}
	
	void getStatus(){}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public static String getRoutingnumber() {
		return routingNumber;
	}
	
	
}
