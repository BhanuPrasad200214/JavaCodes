package date17dec;

public class Triangle extends Shape
{
	Triangle(){}
	@Override
	public void draw()
	{
		System.out.println("Triangle Draw");
	}
	@Override
	public void erase()
	{
		System.out.println("Triangle Erase");
	}

}