package date17dec;

class Doctor extends HospitalStaff 
{
	private String specialization;
	public Doctor(String name, int age, String role, String specialization) 
	{
		super(name, age, role);
		this.specialization = specialization;
	}
	
	@Override
	public void work() 
	{
		System.out.println(getName()+" "+getRole()+" "+this.specialization+"specialization");
	}
}

