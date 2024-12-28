package date27nov;

class Car1 extends Vehicle1 
{
    protected int numberOfDoors;

    public Car1(String make, String model, int year, int numberOfDoors) 
    {
        super(make, model, year); 
        this.numberOfDoors = numberOfDoors;
    }

    
    @Override
    public void displayDetails() 
    {
        super.displayDetails(); 
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
