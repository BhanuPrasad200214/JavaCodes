package date20nov;

import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Your Name :");
    	String name = sc.nextLine();
    	System.out.print("Enter your marks :");
    	int marks=sc.nextInt();
    	
    	Student s1=new Student(name,marks);
    	System.out.println("Student Name: " + s1.getName());
    	System.out.println("Student Marks: " +s1.getMarks());
    	
    	StudentGrade studentGrade = CalculateStudentGrade.calculateGrade(s1);
    	System.out.println(studentGrade);
    	
        sc.close();
     
    }
}
