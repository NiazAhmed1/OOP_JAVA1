package payrol;



//SalariedEmployee class extends from abstract class Employee
public class SalariedEmployee extends Employee {
	
	
	
	//Member variable of double data type
	private double weeklySalary;
	
	
	
	//constructor 
	public SalariedEmployee(String first, String last, String ssn, Date bd,double ws)
	{
	
		
		//Super class constructor 
	   super(first,last,ssn,bd);
	   
	   //set value of Weekly Salary 
	   setWeeklySalary(ws);
	
	
	}
	
	
	
	
	//Setter Method of WeeklySalary
	public void setWeeklySalary(double w)
	{
		
	
		//condition : weekly salary must be greater than or equal to 0
		if(w >= 0.0)
			weeklySalary=w;
		
		//show Exception 
		else
			throw new IllegalArgumentException(" weeklySalary must be greater than or equal to zero 0");
	
	
	}
	
	
	
	//getter Method return value of WeeklySalary
	public double getWeeklySalary()
	{
		return weeklySalary;
	}
	
	
	
	//override String Method
	@Override
	public String toString()
	{
		//super keyword  use to call toString Method of super class   	
		return String.format("Salaried Employee :  %s\n%s: $%,.2f\n",  super.toString(), " weekly Salary", getWeeklySalary());
		
	}

	//Override  earning method 
	@Override
	public double earning()
	{
		//return value of WeeklySalary
		return getWeeklySalary();
	}

}
