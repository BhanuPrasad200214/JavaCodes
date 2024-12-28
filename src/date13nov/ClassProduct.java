package date13nov;

public class ClassProduct 
{
	private String productName;
	private int productId;
	private double price;
	
	public ClassProduct()
	{
		
		this.productName = "Default Product"; 
		this.productId = 0; 
		this.price = 0.0;
	}
	public ClassProduct(String productName, int productId, double price) 
	{ 
		if (productName == null || productName.isEmpty()) 
		{
			System.out.println("Error: Product name cannot be null or empty."); 
			this.productName = "Default Product";
		} 
		else 
		{ 
			this.productName = productName; 
		} 
		if (productId < 0) 
		{ 
			System.out.println("Error: Product ID cannot be negative.");
			this.productId = 0; 
		}
		else 
		{ 
			this.productId = productId; 
		} 
		if (price < 0) 
		{
			System.out.println("Error: Price cannot be negative."); 
			this.price = 0.0; 
		}
		else 
		{ 
		  this.price = price; 
	    } 
   }  
	public void displayinfo() 
		{ 
			System.out.println("Product Name: " + this.productName);
			System.out.println("Product ID: " + this.productId); 
			System.out.println("Price: " + this.price); 
		} 
}
	


