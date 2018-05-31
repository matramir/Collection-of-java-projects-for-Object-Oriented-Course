package lab2Ramirez;
import javax.swing.*;
import java.text.DecimalFormat;
public class Lab2Ramirez {
	public static void main(String[] args) {
		final double PACKAGE_A = 9.95, // Package A base charge
					 PACKAGE_B = 13.95, // Package B base charge
					 PACKAGE_C = 19.95, // Package C base charge
					 PACKAGE_A_HOURS = 10.0, // Package A hour threshold
					 PACKAGE_B_HOURS = 20.0; // Package B hour threshold
		char isPackage; // Customer package
		double hours, // Hours used
			   charges = 0.0, // Calculated charges
			   compCharges, // Comparison charges
			   savings; // Amount saved under another package
		String input;
		DecimalFormat myFormat = new DecimalFormat ("0.00"); // formating outputs
	input = JOptionPane.showInputDialog("Enter the customer's package (A, B or C) ");
	
	hours = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours Used:"));
	
	isPackage = input.charAt(0);
	
	if (isPackage < 'A' || isPackage > 'C')
		JOptionPane.showMessageDialog(null, "Error, try again.");
	
	else
			{	
				switch (isPackage) {
				case 'A':
					if(hours <= PACKAGE_A_HOURS)
						{
						JOptionPane.showMessageDialog(null, "The charges are: "+ PACKAGE_A);
						break;
						}
					else {
						charges = PACKAGE_A + (hours - PACKAGE_A_HOURS)*2; //Calculate the charge for package A
						JOptionPane.showMessageDialog(null, "The charges are $" + myFormat.format(charges));
						compCharges = PACKAGE_B;
						if (hours > PACKAGE_B_HOURS )
							compCharges += (hours-PACKAGE_B_HOURS);
						savings = charges - compCharges;
						if (savings > 0)
							JOptionPane.showMessageDialog(null, "With package B you would have saved $" + myFormat.format(savings));
						if (charges > PACKAGE_C)
						{
							savings = charges - PACKAGE_C;
							JOptionPane.showMessageDialog(null, "With package C you would have saved $" + myFormat.format(savings));
							}
						break;
					}
								
				case 'B':
					if(hours <= PACKAGE_B_HOURS)
					{
						JOptionPane.showMessageDialog(null, "The charges are: "+ PACKAGE_B);
						break;
					}
					else
					{
						charges = PACKAGE_B + (hours - PACKAGE_B_HOURS);
						JOptionPane.showMessageDialog(null, "The charges are: "+ myFormat.format(charges));
						compCharges = PACKAGE_C;
						savings = charges -compCharges;
						if(savings > 0)
							JOptionPane.showMessageDialog(null, "With package C you would have saved $" + myFormat.format(savings));
						break;
					}		
				case 'C':
					JOptionPane.showMessageDialog(null, "The charges are: "+ PACKAGE_C);
					break;
			
						  }
			}
		}
	}

