---------------------------- TASK 1 ----------------------------------


(Payroll System Modification) Modify the payroll system to include private instance variable 
birthDate in class Employee. Use class Date to represent an employee’s birthday. Add get 
methods to class Date. Assume that payroll is processed once per month. Create an array of 
Employee variables to store references to the various employee objects. In a loop, calculate the 
payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s payroll 
amount if the current month is the one in which the Employee’s birthday occurs. Note: To get 
the current Month from Calendar, follow these two steps.
import java.util.Calendar;
int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);



---------------------------- TASK 2 ----------------------------------


(Payroll System Modification) Modify the payroll system to include an additional Employee subclass 
PieceWorker that represents an employee whose pay is based on the number of pieces of merchandise 
produced. Class PieceWorker should contain private instance variables wage (to store the employee’s 
wage per piece) and pieces (to store the number of pieces produced). Provide a concrete 
implementation of method earnings in class PieceWorker that calculates the employee’s earnings by 
multiplying the number of pieces produced by the wage per piece. Create an array of Employee 
variables to store references to objects of each concrete class in the new Employee hierarchy. For each 
Employee, display its String representation and earnings.
