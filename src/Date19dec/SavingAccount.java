package Date19dec;

public class SavingAccount extends BankAccount
{
	protected double interestRate = 4.0;

	public SavingAccount(String accountHolderName, String accountNumber, double balance) 
	{
		super(accountHolderName, accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void CalculateInterest()
	{
		System.out.println(balance*(interestRate/100));
	}
}
