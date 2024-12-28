package date13dec;

import java.util.*;
public class PaymentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Payment p = new Payment();
		System.out.println("Payment Menu");
        System.out.println("Please select any one Payment Method from the Menu :");
        System.out.println("\t\t 1) Payment by using Cash ");
        System.out.println("\t\t 2) Payment by using Credit Card ");
        System.out.println("\t\t 3) Payment by using Debit Card ");
        System.out.print("Please enter your Payment choice [1/2/3]: ");
        int ch = sc.nextInt();
 switch(ch)
 {
    case 1 : sc.nextLine();
    System.out.print("Enter the amount you want to pay through cash :: ");
    System.out.println("Processing payment via Cash...");
    p.makepayment("1234123412341234" ,15000.9);
    break;

 }
}

}
