package date27nov;

public class VechileTest 
{

	public static void main(String[] args) 
	{
		Car1 c1 = new Car1("Toyata", "C-HR", 2018, 4);
        System.out.println("Car Details:");
        c1.displayDetails();
        
        Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
        System.out.println("\nBike Details:");
        bike.displayDetails();
		
	}
}

