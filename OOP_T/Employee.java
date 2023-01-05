package payrol;


//abstract class  
public abstract class Employee {
	
	
	
	//Members variable
	private String first_name;
	private String last_name;
	private String socialSecurityNumber;
	private Date birthDate; //variable of Date class
	
	
	
	
	//Constructor with four Arguments
	public Employee(String first, String last, String ssn,Date bd)
	{
		
		
		//set the value of Member variable 
		setFirstName(first);
		setLastName(last);
		setSecurityNumber(ssn);
		setBirthDate(bd);
		
		
		
	}
	
	
	
	
	//setter Method of first_name
	public void setFirstName(String f)
	{
		
		first_name=f;
	}
	
	
	//getter Method of first_name
	public String getFirstName()
	{
		//return value of first_name
		return first_name;
	}
	
	
	
	
	
	//setter Method of last_name
	public void setLastName(String l)
	{
		last_name=l;
	}
	
	
	//getter Method of last_name
	public String getLastName()
	{
		return last_name;
	}
	
	
	
	
	//setter Method of SocialSecurityNumber
	public void setSecurityNumber(String s)
	{
		socialSecurityNumber = s;
	}
	
	
	//getter Method of Social Security Number
	public String getSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	
	
	
	
	//setter Method of BirthDate 
	public void setBirthDate(Date birth)
	{
		birthDate=birth;
	}
	
	
	//getter Method of BirthDate
	public Date getBirthDate()
	{
		return birthDate;
	}
	
	
	
	
	//toString Method use to format or print value of Member Variable
	public String toString()
	{
	    return String.format("%s %s \n%s %s\n%s : %s  ", getFirstName(), getLastName(),"Social Security Number : ",getSecurityNumber(),
	    		"BirthDate",getBirthDate() );
	    
	    		
	}
	
	
	//Abstract Method 
	public abstract double earning();
	
	
	
}
