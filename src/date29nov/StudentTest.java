package date29nov;

import java.lang.reflect.*;

public class StudentTest {

	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("Student");
		Method[] m =c.getDeclaredMethods();
		for(Method m1:m)
		{
		  System.out.println(m1);
		}
	}

}
