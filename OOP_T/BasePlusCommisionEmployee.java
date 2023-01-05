package payrol;



// class BasePlusCommisionEmployee extend from commisionEmployee class
public class BasePlusCommisionEmployee extends commisionEmployee 
{

	
	//Member variable
	private double baseSalary;
	
	
	
	//constructor
	public BasePlusCommisionEmployee(String first, String last, String ssn,Date bd, double sales,double rate,double salary)
	{
	
		
		//constructor of super class commisionEmployee
		super(first,last,ssn,bd,sales,rate);
		
		//set value of Member Variable baseSalary
		setBaseSalary(salary);
	
	
	}

	
	
	
	//setter Method of baseSalary
	public void setBaseSalary(double bs)
	{
		
		
		//condition : the value of BaseSalary must be 0 or positive
		if(bs >= 0.0)
		baseSalary=bs;
		
		//Exception
		else
			throw new IllegalArgumentException("Base Salary must be greater than or equal to 0");
	
	
	}
	
	
	
	//getter Method of baseSalary
	public double getBaseSalary()
	{
		return baseSalary;
	}
	 
	
	
	
	//Override Method of earning
	@Override
	public double earning()
	{
		return getBaseSalary() + super.earning();
	}
	
	
	
	
	//Override Method of toString
	@Override
	public String toString()
	{
		return String.format("Based Salaried Employee : %s%s : $%.2f\n",super.toString(),"Base Salary",getBaseSalary() );
	}
	

}
