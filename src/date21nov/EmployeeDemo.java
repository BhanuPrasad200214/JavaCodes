package date21nov;

import java.util.Scanner;

import date20nov.Student;
public class EmployeeDemo {

	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many objects do u want?");
		int objects=sc.nextInt();
		
		for(int i=1;i<=objects;i++)
		{
			System.out.println("Enter Employee Id:");
			int id=sc.nextInt();
			
			if(id<0)
			{
			    System.out.println("Error");
			    return;
			}
			
			System.out.println("Enter Employee Name:");
			String name=sc.nextLine();
			name=sc.nextLine();
			
			System.out.println("Enter Employee Salary:");
			double salary=sc.nextDouble();
			
			if(salary<0)
			{
			    System.out.println("Error");
			    return;
			}
			Employee e1=new Employee(id,name,salary);
			System.out.println(e1);
		}
		
	}

}
