package lab5Ramirez;
import javax.swing.*;
import java.text.*;
public class PayrollDemo {

	public static void main (String[] args) {
		String names;
		int job,id;
		double hours;
		JTextArea myArea = new JTextArea();
		DecimalFormat myFormat = new DecimalFormat("$0.00");
		//ask for name and id
		names = JOptionPane.showInputDialog("What is your name?");
		id = Integer.parseInt(JOptionPane.showInputDialog("id?"));
		//initiate instance
		Payroll worker = new Payroll(names, id); 
		//fill information of myArea
		myArea.append("Employee Payroll Date\n------------------------\n");
		myArea.append("Name: "+ worker.GetName() +"\nID Number: "+ worker.GetIdNumber() + "\n");
		//ask for PayRate
		do{
			 job = Integer.parseInt(
					 JOptionPane.showInputDialog("What is your job? " +"\n1: Programmer\n2: Sales\n3: Office Worker"));
			 if(worker.checkRate(job)==false)
					 JOptionPane.showMessageDialog(null,"Invalid, please re-enter value","Error",JOptionPane.ERROR_MESSAGE);
		}while(worker.checkRate(job)==false);
		//set PayRate
		worker.setPayRate(job);
		// append PayRate to myArea
		myArea.append("Hourly Rate: "+ myFormat.format(worker.getPayRate()) +"\n");
		//Ask for workhours
		do{
			 hours = Double.parseDouble(
					 JOptionPane.showInputDialog("Enter Number of Hours Worked:"));
			 if(worker.checkHoursWorked(hours)==false)
					 JOptionPane.showMessageDialog(null,"Invalid, please re-enter value between 0 and 80","Error",JOptionPane.ERROR_MESSAGE);
		}while(worker.checkHoursWorked(hours)==false);
		//set  Hours Worked
		worker.SetHoursWorked(hours);
		//append work hours to myArea
		myArea.append("Hours Worked: "+ worker.getHoursWorked() +"\n");
		//append GrossPay to myArea
		myArea.append("Gross Pay: "+ myFormat.format(worker.getGrossPay()) );
		//DisplayMessage
		JOptionPane.showMessageDialog(null, myArea);
		
	}
}
