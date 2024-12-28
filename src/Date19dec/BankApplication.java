package Date19dec;

import java.util.Scanner;

public class BankApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("3. Fixed Account");
		System.out.println("Please enter the type of account you want (1/2/3)");

		int accountType = sc.nextInt();
        sc.nextLine(); 
		
        System.out.println("Enter account Holder Name: ");
        String accountHolderName = sc.nextLine();
        
        System.out.println("Enter account Number: ");
        String accountNumber = sc.nextLine();
        
        System.out.println("Enter the Amount [For How many years you want to deposit]: ");
        double balance = sc.nextDouble();
        
        switch(accountType)
        {
        case 1:
            SavingAccount sa = new SavingAccount(accountHolderName, accountNumber, balance);
            sa.displayAccountDetails();
            sa.calculateInterest();
            break;

        
        case 2:
        	CurrentAccount ca = new CurrentAccount(accountHolderName, accountNumber, balance);
        	ca.displayAccountDetails();
        	ca.calculateInterest();
        	break;
        	
        case 3 :
        	System.out.println("Enter the deposit term :");
        	int deposit = sc.nextInt();
        	FixedDepositAccount fda = new FixedDepositAccount(accountHolderName, accountNumber, balance);
        	fda.displayAccountDetails();
        	fda.calculateInterest();
        	break;
        	
        default :
        	System.out.println("Invalid account");
        }        
        sc.close();
	}

}
