package date9dec;

public class MathsTest1 {

	public static void main(String[] args) 
	{	
		Mathstest m1 = new Mathstest();
		
        double doubleSum = m1.add(10.5,20.3);
        System.out.println("Sum of doubles: " + doubleSum);
        
        int intSum = m1.multiply(10,20);
        System.out.println("Sum of Multiply integer : " + intSum); 
	}
}

