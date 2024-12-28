package date17dec;

public class HospitalStaff 
{
	private String name;
	private int age;
	private String role;
	
	public HospitalStaff(String name, int age, String role) 
	{
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public void work()
	{
		System.out.println(getName()+ " is a " +getRole()+ " working ");
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public int getAge() {
		return age;
	}	
}