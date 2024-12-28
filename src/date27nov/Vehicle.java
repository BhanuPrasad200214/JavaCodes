package date27nov;

class Vehicle
{
	protected int wheels;

	public Vehicle(int wheels)
	{
		super();
		this.wheels = wheels;
	}

	@Override
	public String toString() 
	{
		return "Vehicle [wheels=" + wheels + "]";
	}	
}
class Car extends Vehicle
{
	protected String color;
	protected double price;
	public Car(int wheels, String color, double price)
	{
		super(wheels);
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Car [wheels=" + wheels + ", color=" + color + ", price=" + price + "]";
	}
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}	
}
class Maruti extends Car
{
	protected int airbags;
	protected String modelname;
	protected int speed;
	public Maruti(int wheels, String color, double price, int airbags, String modelname, int speed)
	{
		super(wheels, color, price);
		this.airbags = airbags;
		this.modelname = modelname;
		this.speed = speed;
	}
	@Override
	public String toString()
	{
		return super.toString()+"airbags=" + airbags
				+ ", modelname=" + modelname + ", speed=" + speed + "]";
	}	
}
class Ford extends Car
{
	protected int airbags;
	protected String modelname;
	protected int speed;
	public Ford(int wheels, String color, double price, int airbags, String modelname, int speed) 
	{
		super(wheels, color, price);
		this.airbags = airbags;
		this.modelname = modelname;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return super.toString()+ "airbags=" + airbags
				+ ", modelname=" + modelname + ", speed=" + speed + "]";
	}

}

   

  

