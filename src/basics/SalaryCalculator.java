package basics;

public class SalaryCalculator {

	public static void main(String[] args){
		// let's creat a variable to define our career
		String career;
		System.out.println("Program is started");
		career = "Software Developer";
		System.out.println("My career is "+career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		// Compute our annual salary
		double salary = rate * hoursPerWeek * weeksPerYear;
		System.out.println("My salary as a "+career+" at the rate of $"+rate+" is" +salary+" per year.");
	}
}
