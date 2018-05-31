package lab4Ramirez;
import javax.swing.*;
import java.text.*;
public class Payroll {

	public static void main(String[] args) {
		String name;
		double hours, rate, gross, tax, net;
		final double TAX_RATE = 0.15; 
		
		//all Input statements
		name = JOptionPane.showInputDialog("Enter Employee Name: ");
		hours = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours Worked: "));
		rate = Double.parseDouble(JOptionPane.showInputDialog("Enter Hourly Rate: "));
		
		//Call calculateGrossSalary
		gross = calculateGrossSalary(hours, rate);
		
		//Call calculateTax
		tax = calculateTax(gross, TAX_RATE);
		
		// call callculateNetSalary
		net = calculateNetSalary(gross, tax);
		
		//call displayMethod
		displayMethod(name, hours, rate, gross, tax, net);
		
	}
	public static double calculateGrossSalary (double h, double r) {
		double total = h*r;
		return total;
	}
	//Define calculate tax method
	public static double calculateTax(double g, double tr) {
		double total = g*tr;
		return total;
	}
	// Define calculate net salary
	public static double calculateNetSalary(double g, double t) {
		double total = g-t;
		return total;
	}
	//Define displayMethod
	public static void displayMethod(String nm, double h, double r, double g, double t, double n)
	{
		JTextArea report = new JTextArea();
		DecimalFormat money = new DecimalFormat("0.00");
		// First JTextArea Row
		report.append("Employee Name\t\tHours Worked\tHourly Rate\tGross Salary\tTax\tNet Salary");
				
		// Report Content
		report.append("\n"+nm+"\t\t\t"+h+"\t"+money.format(r)+"\t"+money.format(g)+"\t"+money.format(t)+"\t"+money.format(n));
				
		//Display Message
		JOptionPane.showMessageDialog(null, report,"Salary Report",JOptionPane.PLAIN_MESSAGE);
	}
	
	

}
