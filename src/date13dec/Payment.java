package date13dec;

public class Payment 
{
	
	public void makepayment(double amount) 
	{
		System.out.println("Processing payment via cash");
		if(validateAmount(amount))
		{
			System.out.print("Payment successfull");
		}
	}
	
	public void makepayment(String cardHolderName, String creditCardNumber,double amount)
	{
		if (validateAmount(amount) && validateCardNumber(creditCardNumber))
		{
			System.out.println(amount);
			System.out.print("Payment successfull");
		}
	}
	
	
	public void makepayment(String debitCardNumber, double amount)
	{
		if(validateAmount(amount) && validateCardNumber(debitCardNumber))
		{
			System.out.println("Amount paid RS :" +amount);
			System.out.print("Payment successfull");
		}
	}
	
	private boolean validateAmount(double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Enter the correct");
			return false;
		}
		else {
			return true;
		}
	}
	
	private boolean validateCardNumber(String cardNumber)
	{
		if(cardNumber.length()==16)
		{
			System.out.println();
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean maskCardNumber(String cardNumber)
	{
		String mc = cardNumber.substring(12,12);
		System.out.println("****-****-****"+mc);
		return true;
	}
	
}
