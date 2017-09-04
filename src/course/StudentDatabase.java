package course;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

	public static void main(String[] args) {
		Student student1 = new Student("Carol", "1234567890");
		Student student2 = new Student("Stefe", "3573658923");
		Student student3 = new Student("John",  "7348684364");

		student1.enroll("course 1");
		
		student2.enroll("course 1");
		student2.enroll("course 2");

		student3.enroll("course 1");
		student3.enroll("course 2");
		student3.enroll("course 3");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}

}

class Student{
	private final static String domain = "@course.com";
	private static int id=1000;
	private String name;
	private String ssn;
	private String email;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private double balance;
	private List<String> courses = new ArrayList<>();
	
	public Student(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		generateEmail();
		createUserId();
	} 
	
	public void enroll(String course){
		courses.add(course);
	}
	
	public void showCourses(){
		System.out.println("You have the following courses: ");
		for(String course:courses){
			System.out.println(course);
		}
	}
	
	@Override
	public String toString(){
		return "Student: name="+this.name+", userID="+this.userID+", email="+this.email;
	}
	
	public void pay(double pay){
		this.balance -= pay;
	}
	
	public void checkBalance(){
		System.out.println("Your balance is "+this.balance);
	}
	
	private void generateEmail(){
		this.email = name+domain;
	}
	
	private void createUserId(){
		this.userID = (id++) +""+ ((int)(Math.random()*8000)+1000) + ssn.substring(ssn.length()-4,ssn.length());
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}