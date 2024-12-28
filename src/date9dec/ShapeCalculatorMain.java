package date9dec;

class ShapeCalculator //BLC
{
	public double calculateArea(int sideLength)
	{
		if(sideLength < 0)
		{
			System.out.println("Error : Side Length must be Non- negative");
		    return -1;
		}
		return sideLength * sideLength;
	}
	public double calculateArea(int length, int width)
	{
		if(length < 0 || width < 0)
		{
			System.out.println("Error : Length & width must be Non- negative");
			return -1;
		}
		return length * width;
	}
	public double calculateArea(double radius)
	{
		if(radius < 0)
		{
			System.out.println("Error : Radius must be Non- negative");
		     return -1;
	    }
	return Math.PI * radius * radius;
}
}

public class ShapeCalculatorMain //ElC
{

	public static void main(String[] args) {
		ShapeCalculator c1 = new ShapeCalculator();
		
		double circleArea = c1.calculateArea(7.0);
		if(circleArea != -1)
		{
			System.out.println("Area of circle with radius 7.0 :"+circleArea);
		}
		
		double squareArea = c1.calculateArea(-5);
		if(squareArea != -1)
		{
			System.out.println("Area of square with side length -5 :"+squareArea);
		}
	}

}
