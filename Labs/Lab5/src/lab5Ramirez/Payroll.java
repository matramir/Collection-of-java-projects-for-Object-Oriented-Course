package lab5Ramirez;
public class Payroll {
	//Global Variables
	private String name;
	private int idNumber;
	private double payRate, hoursWorked;
	// Set Methods
	public Payroll(String n, int id) {
		name = n;
		idNumber = id;		
		}
	public Payroll() {	
	}
	public void setName (String na){
		name = na;
	}
	
	public void setIdNumber(int idNum) {
	idNumber = idNum;	
	}
	
	public void setPayRate(int p) {
		if(p==1)
			 payRate = 40;
		else if(p==2)
			 payRate = 30;
		else
			 payRate = 20;
	}
	
	public void SetHoursWorked(double h) {
		hoursWorked = h;
	}
	
	//get Methods
	
	public String GetName() {
		return name;
	}
	
	public int GetIdNumber() {
		return idNumber;
	}
	
	public double getHoursWorked(){
		return hoursWorked;
	}
	
	public double getPayRate(){
		return payRate;
	}
	
	public boolean checkRate (double rate) {
		if(rate<1||rate>3)
			 return false;
		else
			 return true;
	}
	public boolean checkHoursWorked (double hr) {
		if(hr<0||hr>80)
			 return false;
			 else
			 return true; 
	}
	public double getGrossPay() {
		double result;
		result = payRate * hoursWorked;
		return result;
	}
	
}
