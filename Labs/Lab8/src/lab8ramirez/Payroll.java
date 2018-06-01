package lab8ramirez;

public class Payroll {
private String name;
private double payRate;
private double hoursWorked;

public Payroll(String n){
name = n;
}
public void setName(String n){
name = n;
}
public void setPayRate(double p) {
	if (p==1)
		payRate = 40;
	else if(p==2)
		payRate = 30;
	else
		payRate = 20;
}
public void setHoursWorked(double h) {
	hoursWorked = h;
	}
public String getName() {
	return name;
}
public double getPayRate() {
	return payRate;
}
public boolean checkHoursWorked (double h) {
	if (h<0||h>80)
		return false;
	else
		return true;
}
public double getGrossPay() {
	return hoursWorked*payRate;
}
public boolean checkName (String n) {
	if(n.length()==0)
		return false;
	else 
		return true;
}
	
}

