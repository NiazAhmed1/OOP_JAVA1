package payrol;

//class hourlyEmployee extend from abstract class Employee
public class hourlyEmployee extends Employee {
	
	
	//Member variable
	private double hour;
	private double wage;
	
	
	
	//constructor 
	public hourlyEmployee(String first, String last, String ssn,Date bd, double hours, double wages)
	
	{
	
		//constructor of super class(Employee class)
		super(first,last,ssn,bd);
		
		//set value of Member variable
		setHour(hours);
		setWage(wages);	
	
	}
	
	
	
	
	//setter Method of hour
	public void setHour(double h)
	{
		
		
		//hour must be greater than or equal to 0 and less than or equal to 168 other wise show Exception 
		if(h >= 0.0 && h <= 168)
		hour =h;
		
		
		//Exception
		else 
			throw new IllegalArgumentException("hour is greater than 0 and less than 168");
	
	
	}
	
	
	//getter Method of hour return value of hour
	 public double getHour()
	 {
		 return hour;
	 }
	
	
	 
	 
	 
	 //setter Method of wage 
	 public void setWage(double w)
	 {
		 
		//wage must be greater than or equal to 0 otherWise show exception 
		if( w >= 0.0)
		{
			wage = w;
		}
		
		
		//Exception
		else
			throw new IllegalArgumentException("wage must be greater than or equal to 0");
	
	 }
	 
	 
	 
	//getter Method of Wage return the value of Wage
	 public double getWage()
	 {
		 return wage;
	 }
	 
	 
	 
	 
	 //Override earning Method
	  @Override
	  public double earning()
	  { 
		  //condition if true than return the value of earning Method by product of hours and and wage
		  if(  getHour() <= 40)
		  { 
			  return getHour()*getWage();
		  }
		 
		  
		  //return the value of earning by perform below operations 
		  else
			  return 40*getWage() + (getHour() - 40)*getWage()*1.5;	  
	  }
	  
	  
	  
	  //override String Method
	  @Override
	  public String toString()
	  {
		  return String.format("Hourly Employee : %s\n%s: $%.2f\n%s: $%.2f\n",super.toString(),"Hour",getHour(),"Hourly wage",getWage());
		  		
	  }

}
