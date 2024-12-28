package date13nov;  //-------ELC-----

public class Employee1 {

	public static void main(String[] args) {
		Employee e1=new Employee("Bhanu",22,"IT",50000,"good");
		e1.updateSalary();
		Employee e2=new Employee("Om",22,"Dev",45000,"Good");
		e2.updateSalary();
		Employee e3=new Employee("Krishna",23,"Testing",20000,"average");
		e3.updateSalary();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
