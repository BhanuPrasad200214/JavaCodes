package date13nov;

public class Employee //--------- BLC----------
{
	String empName;
	int empAge;
	String empDepartment;
	double empSalary;
	String empPerformance;
	
	public Employee(String empName, int empAge, String empDepartment, double empSalary, String empPerformance) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
		this.empPerformance = empPerformance;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpPerformance() {
		return empPerformance;
	}
	public void setEmpPerformance(String empPerformance) {
		this.empPerformance = empPerformance;
	}
	public void updateSalary()
	{
		if(this.empPerformance=="Good")
		{
			this.empSalary+=10000;
		}
		else if(this.empPerformance=="Average")
		{
			this.empSalary+=5000;
		}
		else if(this.empPerformance=="Bad")
		{
			this.empSalary=this.empSalary;
		}
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empDepartment=" + empDepartment
				+ ", empSalary=" + empSalary + ", empPerformance=" + empPerformance + "]";
	}
}
