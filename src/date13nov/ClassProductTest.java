package date13nov;

public class ClassProductTest {

	
	    public static void main(String[] args) {
	       
	        System.out.println("Test Case 1:");
	        ClassProduct dp = new ClassProduct();
	        dp.displayinfo();

	        
	        System.out.println("\nTest Case 2:");
	        ClassProduct up = new ClassProduct("Laptop", 101, 75000.0);
	        up.displayinfo();

	        
	        System.out.println("\nTest Case 3:");
	        ClassProduct inp = new ClassProduct(null, -1, -500.0);
	        inp.displayinfo();
	    }
	}

