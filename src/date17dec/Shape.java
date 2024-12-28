package date17dec;

public class Shape 
{
  Shape(){}
  
  public void draw()
  {
	  System.out.println("Shape draw");
  }
  
  public void erase()
  {
	  System.out.println("Shape Erase");
  }
  
  public static Shape randshape() 
  {
	 switch ((int) (Math.random()*4)) 
	  {
	  case 0 : return new Circle();
	  case 1 : return new Square();
	  case 2 : return new Triangle();
	  default :
		   System.out.println("default");
		   return new Shape();
	  }
  }
  
}
