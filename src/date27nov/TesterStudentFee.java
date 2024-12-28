package date27nov;

import java.util.Scanner;
class Student 
{
	int studentId;
	String name;
	double examFee;

	public Student(int studentId, String name, double examFee) 
	{
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	public double payFee() {
		return examFee;
	}

	public String displayDetails() {
		return toString();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
}

class DayScholar extends Student {
	double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	public String displayDetails() {
		return toString();
	}

	public double payFee(double amount) {
		double total = examFee + transportFee;
		return total - amount;
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

}

class Hosteller extends Student {
	double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	public double payFee(double amount) {
		double total = examFee + hostelFee;
		return total - amount;
	}

	public String displayDetails() {
		return toString();
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

}


public class TesterStudentFee {
	private static void validate(double total) 
	{
		if (total > 0) 
		{
			System.out.println("Extra amount to pay : " + total);
		} else if (total < 0) {
			System.out.println("You paid extra : " + (-total));
		} else {
			System.out.println("Amount is cleared..");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Student s = new Student(101, "Bhanu", 25000);
		double total = s.payFee();
		System.out.println("Total fee to pay : " + total);
		System.out.println("Enter the amount : ");
		double amt = sc.nextDouble();
		total -= amt;
		System.out.println(s);
		validate(total);

		System.out.println();
		DayScholar d = new DayScholar(102, "OM", 25000, 8000);
		System.out.println(d);
		System.out.println("Enter the amount : ");
		amt = sc.nextDouble();
		total = d.payFee(amt);
		validate(total);
		
		Hosteller h = new Hosteller(103, "SKY", 25000, 5000);
		System.out.println(h);
		System.out.println("Enter the amount : ");
		amt = sc.nextDouble();
		total = h.payFee(amt);
		validate(total);
	}
}
