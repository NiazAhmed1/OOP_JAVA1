package payrol;


//PieceWorker class Extend from Employee class
public class PieceWorker extends Employee {
	
	
	
	//Member variables
	private double wage;
	private double pieces;

	
	
	//constructor 
	public PieceWorker(String first, String last, String ssn, Date bd,double wagePerPiece,double numberOfPieces)
	{
		
		
		//constructor of Super class Employee
		super(first, last, ssn, bd);
		
		
		//set the value of Member variable 
		setWage(wagePerPiece);
		setPieces(numberOfPieces);
	
		
	}
	
	
	
	//Setter Method of wage
	public void setWage(double w)
	{
		
		
		//set Wage per Piece must be greater or equal to zero
		if(w>=0.0)
		{
			wage=w;
		}
		
		
		//Exception
		else
			throw new IllegalArgumentException("Wage per Piece is must be greater than or equal to 0");
	
	}
	
	
	
	//Getter Method of wage return the value of wage
	public double getWage()
	{
		return wage;
	}
	
	
	
	//Setter Method of pieces 
	public void setPieces(double p)
	{
		
		//set pieces must be greater of equal to one
		if(p>=0)
		{
			pieces=p;
		}
		
		
		//Exception
		else
			throw new IllegalArgumentException("number of pieces must be greater than or equal to zero 0");
	
	}
	
	
	//Getter Method return the Value pieces or number of pieces 
	public double getPieces()
	{
		return pieces;
	}
	
	
	
	
	//Override earning Method 
	@Override
	public double earning()
	{
		
		return getWage()*getPieces();
	
	}
	
	
	
	
	
	//Override toString method
	@Override
	public String toString()
	{
		
		return String.format("PieceWorker Employee : %s\n%s : $%.2f\n%s : $%.2f", super.toString(),"Wage per piece",getWage(),"Number of piece",
				getPieces());
	
	}
	

}
