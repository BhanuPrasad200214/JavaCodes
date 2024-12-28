package date27dec;

public  class OrderedCake extends Cake
{
   private String message;
   
   protected OrderedCake()
   {
	   super("Round","Vanilla",1);
	   this.message=" ";
   }
  
   protected OrderedCake(String shape, String flavour, int qty) 
   {
	super(shape, flavour, qty);
	this.message =" ";
   }

 protected OrderedCake(String shape, String flavour, int qty, String message) 
  {
	super(shape, flavour, qty);
	this.message = message;
  }
 
 @Override
 public void showCake()
 {
	 if(message != null )
	 {
		 System.out.println(" A "+getShape()+" "+getFlavour()+" cake of "
	    +getQty()+"kgs ready "+message+" "+getPrice());
		}
		else 
		{
			super.showCake();
		}
		
	}
}
