package Date19dec;

public class BankAccount 
{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance ;
    
    public static final String IFSC_CODE= "RBI12345668";

	public BankAccount(String accountHolderName, String accountNumber, double balance) 
	{
		super();
		if(accountHolderName.isEmpty())
		{
			System.out.println("Name can't be empty");
		}
		else {
			this.accountHolderName=accountHolderName;
		}
		
		if(accountNumber.isEmpty()) {
			System.out.println("Number can't be Empty");
		}
		
		else {
			this.accountNumber=accountNumber;
		}
		
		if(balance>0)
		{
			this.balance=balance;
		}
		else {
			System.out.println("Balance can't be Negative");
		}
	}
		
		public void calculateInterest()
		{
			System.out.println("Bank interest Calculation");
		}
	
		
		public void displayAccountDetails()
		{
			System.out.println("Account Holder Name is :" +accountHolderName);
			System.out.println("Account Number is : "+accountNumber);
			System.out.println("Amount is :"+balance);
			System.out.println("Ifsc code is "+IFSC_CODE);
		}		
  
}
