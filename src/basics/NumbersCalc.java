package basics;

public class NumbersCalc {
	
	public static void main(String[] args){
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println("The product of numbers "+numA+" and "+numB+" is "+multiplyNumbers(numA, numB));
	}
	
	static void printName(){
		System.out.println("My name is Johan");
	}
	
	static void addNumbers(int numbera, int numberb){
		// this function will add two  numbers
		int sum = numbera + numberb;
		System.out.println("The sum of numbers "+numbera+" and "+numberb+" is "+sum);
	}
	
	static int multiplyNumbers(int valuea, int valueb){
		int product = valuea * valueb;
		return product;
	}
}
