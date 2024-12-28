package date11dec;  // ELC

public class TaxCalculation {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"Bhanu Prasad",50000,25000,25000);
		//Manger m1 = new Manger(2,"Harshit",50000,25000,25000,100000);
		//Trainer t1 = new Trainer(3,"Nardhra",50000,25000,25000,1000,2000);
		//Sourcing s1 = new Sourcing(4,"Chaitanya",50000,25000,25000);
		
		TaxUtil t1 =new TaxUtil();
		System.out.println("EmployeeTax :" +t1.calculateTax(e1));
	}

}
