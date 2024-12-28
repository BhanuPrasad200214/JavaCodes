package date13nov;

public class RetailStore1 {

	public static void main(String[] args) 
	{
		RetailStore b1= new RetailStore("Orange",10,15);
		double totalValue=b1.calculateTotalValue();
		System.out.println("Total Value is "+b1.getItemName()+"in Stock:"+totalValue);

		
	}

}
