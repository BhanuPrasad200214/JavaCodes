package date27nov;

class Vehicle1 
{
 protected String make;
 protected String model;
 protected int year;

 
 public Vehicle1(String make, String model, int year)
 {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 
 public void displayDetails() 
 {
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
 }
}

 



