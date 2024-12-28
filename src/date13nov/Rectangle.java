package date13nov;  //---------BLC------

public class Rectangle 
{
    private double width;
    private double height;
    
    {
    	this.width=0;
    	this.height=0;
    }

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getArea()
	{
		return this.width*this.height;
	}
	
	public double getPerimeter()
	{
		return 2* (this.width+this.height);
	}
    
}
