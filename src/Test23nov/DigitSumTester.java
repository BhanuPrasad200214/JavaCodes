package Test23nov;
import java.util.Scanner;
public class DigitSumTester
{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        System.out.print("Enter the position (n): ");
	        int position = scanner.nextInt();

	        DigitSumTesterDemo digitSum = new DigitSumTesterDemo(number);

	        int result = digitSum.addFirstAndNthDigit(position);
	        if (result != 1) 
	        {
	            System.out.println("The sum of the first digit and the " + position + "th digit is: " + result);
	        }

	        scanner.close();
	    
	}

}

