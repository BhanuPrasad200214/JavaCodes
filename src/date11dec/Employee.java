package date11dec;   //BLC

public class Employee 
{
   int employeeId;
   String employeeName;
   double basicsalary;
   double HRAPer;
   double DAPer;
  
public Employee(int employeeId, String employeeName, double basicsalary, double hRAPer, double dAPer) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.basicsalary = basicsalary;
	this.HRAPer = hRAPer;
	this.DAPer = dAPer;
}

public double calculateGrossSalary()
{
	return basicsalary+HRAPer +DAPer;
}
}

class Manger
{
	int mangerID;
	String mangerName;
	double basicsalary;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	
	public Manger(int mangerID, String mangerName, double basicsalary, double hRAPer, double dAPer,
			double projectAllowance) {
		super();
		this.mangerID = mangerID;
		this.mangerName = mangerName;
		this.basicsalary = basicsalary;
		this.HRAPer = hRAPer;
		this.DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}
	public double calculateGrossSalary()
	{
		return  basicsalary +HRAPer +DAPer + projectAllowance;

	}
}
class Trainer
{
	int TrainerId;
	String TrainerName;
	double basicsalary;
	double HRAPer;
	double DAPer;
	int batchCount;
	double perkPerBatch;
	public Trainer(int trainerId, String trainerName, double basicsalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		TrainerId = trainerId;
		TrainerName = trainerName;
		this.basicsalary = basicsalary;
		this.HRAPer = hRAPer;
		this.DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
 public double calculateGrossSalary()
 {
	 return  basicsalary +HRAPer +DAPer +(batchCount * perkPerBatch);
 }
		
}

class Sourcing
{
	int sourcingId;
	String sourcename;
	double basicsalary;
	double HRAPer;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	public Sourcing(int sourcingId, String sourcename, double basicsalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkEnrollment) {
		super();
		this.sourcingId = sourcingId;
		this.sourcename = sourcename;
		this.basicsalary = basicsalary;
		this.HRAPer = hRAPer;
		this.DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	public double  calculateGrossSalary()
	{
		return basicsalary +HRAPer +DAPer
				+(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
}

class TaxUtil
{
	public static double calculateTax(Employee e1)
	{
		double grossSalary = e1.calculateGrossSalary();
	
		if (grossSalary > 50000) 
		{
            return grossSalary * 0.20;
        } 
		else 
        {
            return grossSalary * 0.05;
        }

	}
}

