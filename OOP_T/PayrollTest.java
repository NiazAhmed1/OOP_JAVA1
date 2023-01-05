package payrol;

import java.util.Calendar;


//test class or main Class
public class PayrollTest {
	
	
	//main Method
	public static void main(String[] args)
	{
		
		//objects of Date class
		Date birth1=new Date(29,4,2020);
		Date birth2=new Date(18,10,2003);
		Date birth3=new Date(8,5,2000);
		Date birth4=new Date(8,10,1999);
		Date birth5=new Date(17,11,2006);
		
		
		
	    //Object of SalariedEmployee class
		SalariedEmployee employee1=new SalariedEmployee("Adnan","Khan","11111-11-1",birth1,800.00 );
		
		
		//Object of hourlyEmployee class
		hourlyEmployee employee2=new hourlyEmployee("Arif","Memon","22222-22-2",birth2,40,16.75);
		
		
		//Object of commisionEmployee class
		commisionEmployee employee3=new commisionEmployee("Anus","Aziz","33333-33-3",birth3,10000,0.06);
		
		
		//Object of BasePlusCommisionEmployee class
		BasePlusCommisionEmployee employee4=new BasePlusCommisionEmployee("Rafay","Ahmed","44444-44-1",birth4,5000,0.04,300);
		
		
		//Object of PieceWorker class
		PieceWorker employee5=new PieceWorker("Yaqoob","Ismail","555-5-55",birth5,500.00,34.00);
		
		
	
		//Array 
		//to store reference of objects of various Employee class
		Employee[] employee=new Employee[5];
		
		//employee1 is an Object of SalariedEmployee class  
		employee [0]=employee1;
		
		
		//employee2 is an Object of hourlyEmployee class
		employee [1]=employee2;
		
		//employee3  is an Object of commisionEmployee class
		employee [2]=employee3;
		
		
		//employee4 is an Object of BasePlusCommisionEmployee class
		employee [3]=employee4;
		
		
		//employee5 is an Object of PieceWorker class
		employee [4]=employee5;
				
		
		
		
		//to find the CurrentMonth from calendar
		int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);
		
		
		
		
		
		//for each loop
		for(Employee currentEmployee : employee)
		{
			
			
			
			//print detail of each Employee
			System.out.printf("%s\n%s : $%,.2f\n", currentEmployee,"Earned : ",currentEmployee.earning());
			
			
			
			System.out.println("ADD bonus :");
			
			
			// Store earning of each employee in earned variable
			double earned=currentEmployee.earning();
			
			
			
			//variable of Date class which store birthDate of each employee 
	    	Date birthDay=currentEmployee.getBirthDate();
	    	
	    	
	    	
	    	
	    	//condition : if currentMonth is birthday Month of any Employee than add 100.00 in its earned 
		    if(currentMonth==birthDay.getMonth())
		      {
		    	
		    	earned=earned + 100.00;
			    System.out.printf("Earned  with bonus : $%.2f " , earned);
		      
			    
		      }
		
		else
			System.out.printf("Earned with bonus : $%.2f " , earned);
		
		    
		    System.out.println("\n..............................................\n");
		
		}
		
		
		
	}
	
}

