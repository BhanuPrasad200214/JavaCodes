package Test23nov;

public class DigitSumTesterDemo 
{
	    private int num;

	    public DigitSumTesterDemo(int num)
	    {
	        this.num = num;
	    }
	    public int addFirstAndNthDigit(int position) 
	    {
	        String numStr = Integer.toString(num);
	        if (position > numStr.length() || position <= 0) 
	        {
	            System.out.println("Invalid position!");
	            return -1; 
	        }
	        int firstDigit = Character.getNumericValue(numStr.charAt(0));
	        int nthDigit = Character.getNumericValue(numStr.charAt(position + 1));
	        return firstDigit + nthDigit;
	    }
	}



