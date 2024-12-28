package date27dec;

abstract class Cake 
{
  private String shape;
  private String flavour;
  private int qty;
  private double price=400;
  
  
public Cake(String shape, String flavour, int qty)
 {
	super();
	this.shape = shape;
	this.flavour = flavour;
	this.qty = qty;
	this.price = qty*price;
 }


public String getShape() 
 {
	return shape;
 }


public void setShape(String shape) {
	this.shape = shape;
}


public String getFlavour() {
	return flavour;
}


public void setFlavour(String flavour) 
 {
	this.flavour = flavour;
 }


public int getQty() 
 {
	return qty;
 }


public void setQty(int qty) 
 {
	this.qty = qty;
 }


public double getPrice() 
 {
	return price;
 }


public void setPrice(double price) 
 {
	this.price = price;
 }
  
protected  void showCake()
 {
	System.out.println(" A " + shape + "" + flavour + "Cake of" + qty + "Kg/Kg's is Ready Rs."+ price + "/-");
 }
}
