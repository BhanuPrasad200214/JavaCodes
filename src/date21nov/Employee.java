package date21nov;

public class Employee 
{
  private int employeeId;
  private String employeeName;
  private double employeeSal;
  
    public Employee(int employeeId, String employeeName, double employeeSal)
	{
		super();
		if(employeeId>0)
		{
			this.employeeId = employeeId;
		}
		else
		{
			System.out.println("Employee ID must be a positive integer");
		}
		
		this.employeeName = employeeName;
		if(employeeSal>0)
		{
			this.employeeSal = employeeSal;
		}
		else 
		{
			System.out.println("Employee Salary must be a positive integer");
		}
	}	
   
	public static Employee getEmployeeObject(int employeeId, String employeeName, double employeeSal)
	{
		return  new Employee(employeeId,employeeName,employeeSal);
	}

	@Override
	public String toString()
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSal=" + employeeSal
				+ "]";
	}
	
}
