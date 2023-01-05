package payrol;

public class Date {
	int day;
	int month;
	int year;
	
	
	
	private static final int[] dayPerMonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	
	public Date(int d, int m, int y)
	{
		
		
		day=checkDay(d);
		month=checkMonth(m);
		year=y;
	
	
	}
	
	
	public int checkMonth(int testMonth)
	
	{
		
		
		
		if(testMonth > 0 && testMonth <= 12)
			return testMonth;
		else
			throw new IllegalArgumentException("Month must be greater than 0 and less than or equal to 12");
	
	
	}
	
	
	public int checkDay(int testDay)
	{
		
		
		if(testDay >0 && testDay <= dayPerMonth [month])
		{
			return testDay;
		}
		
		
		if(month == 2 && testDay ==29 &&(year%400==0 ||  (year%4 == 0 && year%100 !=0)))
		{
			return testDay;
		}
		
		
		
		else
			throw new IllegalArgumentException("Day is Invalide for month");
	
	
	}
	
	
	
	public int getDay()
	{
		return day;
	}
	
	
	
	public int getMonth()
	{
		return month;
	}
	
	
	
	public int getYear()
	{
		return year;
	}
	
	
	
	public String toString()
	{
		return String.format("%d/%d/%d", getDay(),getMonth(),getYear());
	}
	
	

}
