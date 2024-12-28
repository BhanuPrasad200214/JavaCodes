package date20dec;

import java.util.Scanner;


class Customer 
{
    protected String name;

    public Customer(String name) 
    {
        if (name == null || name.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        this.name = name;
    }

    public void calculateBill(double... prices) 
    {
        double totalCost = 0;
        for (double price : prices) 
        {
            if (price < 0) 
            {
                System.out.println("Item price cannot be negative.");
                return;
            }
            totalCost += price;
        }
        System.out.println("Welcome to Hyderabad Mall:");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS: " + totalCost);
        System.out.println("Discount: No discount for regular customers.");
    }
}



class GeneralCustomer extends Customer {

    public GeneralCustomer(String name) {
        super(name);
    }

    @Override
    public void calculateBill(double... prices) {
        super.calculateBill(prices);
    }
}




class PrimeCustomer extends Customer {
    protected double discountRate = 10.0;

    public PrimeCustomer(String name) {
        super(name);
    }

    @Override
    public void calculateBill(double... prices) {
        double totalCost = 0;
        for (double price : prices) {
            if (price < 0) {
                System.out.println("Item price cannot be negative.");
                return;
            }
            totalCost += price;
        }
        double discount = totalCost * discountRate / 100;
        double finalAmount = totalCost - discount;
        System.out.println("Welcome to Hyderabad Mall:");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS: " + totalCost);
        System.out.println("Discount RS: " + discount);
        System.out.println("Final amount RS: " + finalAmount);
    }
}

class VIPCustomer extends Customer 
{
    protected double discountRate = 20.0;

    public VIPCustomer(String name) 
    {
        super(name);
    }

    @Override
    public void calculateBill(double... prices) 
    {
        double totalCost = 0;
        for (double price : prices) 
        {
            if (price < 0)
            {
                System.out.println("Item price cannot be negative.");
                return;
            }
            totalCost += price;
        }
        double discount = totalCost * discountRate / 100;
        double finalAmount = totalCost - discount;
        System.out.println("Welcome to  Mall:");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS: " + totalCost);
        System.out.println("Discount RS: " + discount);
        System.out.println("Final amount RS: " + finalAmount);
    }
}



public class ShoppingMall {

   
    public static void generateBill(Customer cust, double... prices) {
        cust.calculateBill(prices);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Please select the Customer Type to get additional Discount :");
        System.out.println("1) General Customer");
        System.out.println("2) Prime Customer");
        System.out.println("3) VIP Customer");
        System.out.println("Please enter Customer type: ");
        int customerType = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Please Enter your Name : ");
        String name = sc.nextLine();

       
        if (name == null || name.isEmpty()) 
        {
            System.out.println("Customer name cannot be empty.");
            return;
        }

       
        System.out.print("Enter number of Items: ");
        int itemCount = sc.nextInt();
        double[] prices = new double[itemCount];

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Please Enter the Item Name and Price:\n");
            System.out.print(i + 1 + ") Item Name : ");
            sc.nextLine(); 
            String itemName = sc.nextLine();
            System.out.print("Item Price : ");
            prices[i] = sc.nextDouble();
        }

       
        Customer customer = null;
        switch (customerType) {
            case 1:
                customer = new GeneralCustomer(name);
                break;
            case 2:
                customer = new PrimeCustomer(name);
                break;
            case 3:
                customer = new VIPCustomer(name);
                break;
            default:
                System.out.println("Invalid selection");
                return;
        }
        generateBill(customer, prices);
    }
}
