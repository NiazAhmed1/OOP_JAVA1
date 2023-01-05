package payrol;

//commisionEmployee extend from abstract class Employee
public class commisionEmployee extends Employee {
	
	
	
	//Member variables 
	private double grossSales;
	private double commisionRate;

	
	
	//constructor
	public commisionEmployee(String first, String last, String ssn,Date bd, double sales,double rate)
	{
		
		
		//super class constructor
		super(first, last, ssn,bd);
		
		//set the value of Member variable
		setGrossSalary(sales);
		setCommisionRate(rate);	
		
		
	}
	
	
	
	
	//setter Method of grossSales variable
	public void setGrossSalary(double s)
	{
		
		
		//condition: the value of grossSales must be greater than 0
		if(s >= 0)
			grossSales=s;
	
		
		//Exception
		else
			throw new IllegalArgumentException("gross Sales must be greater than 0");
	
	
	}

	
	
	//getter Method of grossSales return the value of grossSales 
	public double getGrossSales()
	{
		return grossSales;
	}
	
	
	
	
	//setter Method of commisionRater variable
	public void setCommisionRate(double cr)
	{
		
		//condition : the value of commisionRate must be greater than 0 and less than 1
		if(cr > 0 && cr < 1)
		{
			commisionRate=cr;
		}
		
		//Exception
		else
			throw new IllegalArgumentException("commision Rate must be greater than 0");
		
		
	}
	
	
	
	//getter Method of CommisionRate 
	public double getCommisionRate()
	{
		return commisionRate;
	}
	
	
	
	
	//Override toString Method
	@Override
	public String toString()
	{
		return String.format( "Comision Employee : %s\n%s: $%.2f\n%s: $%.2f\n",super.toString(),"Gross Sales",getGrossSales(),
						"Commision Rate",getCommisionRate());
	}
	
	
	
	
	
	//Override earning Method
	@Override
	public double earning()
	{
		return getGrossSales()*getCommisionRate();
	}
	
	
	
}
