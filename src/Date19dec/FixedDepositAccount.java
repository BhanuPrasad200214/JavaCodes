package Date19dec;

public class FixedDepositAccount extends BankAccount
{
	
	    protected double interestRate = 6.5;
	    protected int depositTerm;

	    public FixedDepositAccount(String accountHolderName, String accountNumber, double balance) 
	    {
	        super(accountHolderName, accountNumber, balance);
	        
	        this.interestRate=interestRate;
	        if (depositTerm < 1) {
	        	//throw new IllegalArgumentException("Deposit term must be positive.");
	        	System.out.println("Deposit term must be positive."+depositTerm);
	        }
	        this.depositTerm = depositTerm;
	        
	    }

	    @Override
	    public void calculateInterest() 
	    {
	        System.out.println("Fixed Deposit Interest for " +balance*(interestRate/100)* depositTerm );
	    }
}


